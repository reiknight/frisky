package infinitedog.frisky.events;

import infinitedog.frisky.exceptions.EventException;
import org.newdawn.slick.GameContainer;

/**
 * Abstract class for encapsulate all the Events.
 * @author InfiniteDog
 */
public abstract class Event {
    protected int timer;
    protected int time;
    
    public abstract boolean isHappening(GameContainer gc) throws EventException;    
    
       
    public void update(GameContainer gc, int delta) {
        this.timer += delta;
    }
}
