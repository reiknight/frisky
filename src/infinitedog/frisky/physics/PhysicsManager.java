package infinitedog.frisky.physics;

import infinitedog.frisky.entities.Entity;
import org.newdawn.slick.geom.Shape;

/**
 * Singleton for the phisics management.
 * @author InfiniteDog
 */
public class PhysicsManager {
    
    //Static instance from PhysicsManager
    private static PhysicsManager pm;
    
    //Private constructor
    private PhysicsManager() {
        
    }
    
    //Getter
    public static PhysicsManager getInstance() {
        if(pm == null) {
            pm = new PhysicsManager();
        }
        return pm;
    }
    
    //TestCollisions
    public boolean testCollisionsEntity(Entity x, Entity y) {
        return x.getR().intersects(y.getR());
    }
    
    public boolean testCollisionPolygon(Entity x, Shape s) {
        return x.getR().intersects(s);  
    }
    
    public double distance(Entity x, Entity y, int tileSize) {
        return Math.abs(Math.pow(x.getX()/tileSize - y.getX()/tileSize,2) + Math.pow(x.getY()/tileSize - y.getY()/tileSize,2));
    }
}
