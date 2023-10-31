import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginLab {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    private Integer threshold = 0;

    public LogginLab() {
        this.threshold = 0;
    }

    public static void main(String[] args) {// public Static mean you can pull from it and use it else where.

        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");

        logger.log(Level.INFO, "****\n\tAt ZipCode, \n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");

    }

    public Integer getThreshold() {// gets the threshold.
        return threshold;
    }

    public void setThreshold(Integer threshold) {  // this sets a string into an int.
        this.threshold = threshold;
    }

    public boolean thresholdExceeds(Integer limit) { //this measures the int to the limit set for the limit.
        if (this.threshold > limit) // if else statement.
          return true; // this imply that it over the limit.
        else
            return false; // this imply that it not over the limit.
    }

    /**Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    // use thresholdExceeds for a pattern.
    // Write a test for the method in the Test class.
    */
    public void thresholdReached( ){
        // need to get the threshold and
    }

}
