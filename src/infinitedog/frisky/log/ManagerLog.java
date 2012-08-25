package infinitedog.frisky.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class for Logging.
 * @author InfiniteDog
 */
public class ManagerLog {
    
    public static void warning(Throwable e) { 
        try {
            FileWriter file = new FileWriter("warning.log",true);
            PrintWriter writer = new PrintWriter(file,true);
            writer.println(e.getMessage() + ": " + e.getStackTrace());
        } catch(IOException ioe) {
            
        }
    }
}
