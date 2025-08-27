package org.firstinspires.ftc.teamcode;

public class Helpers {
    /* This class exists to provide miscellaneous helper functions to other classes. It prevents
     * repetitive code across multiple files. If you want to use it, you will need to initialize
     * this class into a new variable.
     */
    public double limit(double value, double min, double max) {
        return Math.min(Math.max(value, min), max); // The variables are backwards because math.
    }
}
