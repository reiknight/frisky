package infinitedog.frisky.events;

import infinitedog.frisky.exceptions.EventException;
import infinitedog.frisky.log.ManagerLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.newdawn.slick.GameContainer;

/**
 * Singleton for events management.
 * @author InfiniteDog
 */
public class EventManager {
    
    //Static instance from EventManager
    private static EventManager evm;
    
    private HashMap<String,Event> events;
    
    private EventManager() {
      events = new HashMap<String,Event>() {};
    }
    
    //Getter of the instance
    public static EventManager getInstance() {
        if(evm == null) {
            evm = new EventManager();
        }
        return evm;
    }
            
    public HashMap<String,Event> getEvents() {
        return events;
    }

    public void clear() {
        events.clear();
    }
    
    public void addEvent(String name, Event event) {
        events.put(name, event);
    }
    
    public Event getEvent(String name) {
        return events.get(name);
    }

    public boolean removeEvent(String name) {
        if(events.containsKey(name)) {
            events.remove(name);
            return true;
        }
        return false;
    }
    
    public boolean isHappening(String name, GameContainer gc) {
        try {
            return events.get(name).isHappening(gc);
        } catch(EventException ee) {
            ManagerLog.warning(ee);
            return false;
        }
    }
    
    public void update(GameContainer gc, int delta) {
        Collection c = events.values();
        Iterator itr = c.iterator();
        while(itr.hasNext()) {
            ((Event) itr.next()).update(gc, delta);
        }
    }
}
