package infinitedog.frisky.events;

import infinitedog.frisky.exceptions.InputEventException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;

/**
 * Class which represent keyboard and mouse events.
 * @author InfiniteDog
 */
public class InputEvent extends Event {

    public static final int KEYBOARD = 0;
    public static final int MOUSE_CLICK = 1;
    public static final int MOUSE_MOVE = 2;
    
    private int type;
    private Object data;
    private Input input;
    
    public InputEvent(int type, Object data) {
        this.timer = 0;
        this.time = 0;
        this.type = type;
        this.data = data;
        this.input = null;
    }
    
    public InputEvent(int type, Object data, int time) {
        this.timer = 0;
        this.time = time;
        this.type = type;
        this.data = data;
        this.input = null;
    }
 
    @Override
    public boolean isHappening(GameContainer gc) throws InputEventException {
        //Check if is a timed event and timer is triggered
        boolean timed = (this.time == 0 || this.timer > this.time);
        
        this.input = gc.getInput();
        
        switch(type) {
            case KEYBOARD:
                if(input.isKeyDown((Integer) data) && timed) {
                    this.timer = 0;
                    return true;
                }
            case MOUSE_CLICK:
                if(input.isMouseButtonDown((Integer) data) && timed) {
                    this.timer = 0;
                    return true;
                }
                return false;
            case MOUSE_MOVE:
                Rectangle r = new Rectangle(input.getMouseX(), input.getMouseY(), 1, 1);
                return r.intersects((Rectangle) data) && timed;
            default:
                throw new InputEventException();
        }
    }
    
    public Input getInput() {
        return input;
    }
}
