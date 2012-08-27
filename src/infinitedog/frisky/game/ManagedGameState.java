package infinitedog.frisky.game;

import infinitedog.frisky.entities.EntityManager;
import infinitedog.frisky.events.EventManager;
import infinitedog.frisky.physics.PhysicsManager;
import infinitedog.frisky.sounds.SoundManager;
import infinitedog.frisky.textures.TextureManager;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class ManagedGameState extends BasicGameState {
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

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
