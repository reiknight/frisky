package infinitedog.frisky.physics;

import infinitedog.frisky.entities.Entity;

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
    
}
