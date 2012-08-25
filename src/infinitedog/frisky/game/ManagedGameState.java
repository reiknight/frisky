package infinitedog.frisky.game;

import infinitedog.frisky.entities.EntityManager;
import infinitedog.frisky.events.EventManager;
import infinitedog.frisky.events.InputEvent;
import infinitedog.frisky.physics.PhysicsManager;
import infinitedog.frisky.sounds.SoundManager;
import infinitedog.frisky.textures.TextureManager;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public abstract class ManagedGameState extends BasicGameState {
    private int stateID = -1;
    protected EntityManager em = EntityManager.getInstance();
    protected PhysicsManager pm = PhysicsManager.getInstance();
    protected EventManager evm = EventManager.getInstance();
    protected TextureManager tm = TextureManager.getInstance();
    protected SoundManager sm = SoundManager.getInstance();
              
    public ManagedGameState(int stateID) {
        this.stateID = stateID;
    }
    
    @Override
    public int getID() {
        return this.stateID;
    }
}
