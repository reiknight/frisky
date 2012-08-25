package infinitedog.frisky.entities;

import infinitedog.frisky.textures.TextureManager;
import java.io.Serializable;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 * Sprite basic class. Entities with which can be drawn.
 * @author InfiniteDog
 */
public class Sprite extends Entity implements Serializable {
    protected transient Image image;
    
    public Sprite() {
        super();
        image = null;
    }
    
    public Sprite(String name) {
        this.setTexture(name);
    }
    
    public final void setTexture(String name) {
        this.image = TextureManager.getInstance().getTexture(name);
        image = TextureManager.getInstance().getTexture(name);
        // Grab image size
        setWidth(image.getWidth());
        setHeight(image.getHeight());
    }
    
    @Override
    public void update(GameContainer gc, int delta) {
        super.update(gc, delta);
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) {
        super.render(gc, g);
        if(image != null) {
            image.draw(getX(), getY());
        }
    }
    
}
