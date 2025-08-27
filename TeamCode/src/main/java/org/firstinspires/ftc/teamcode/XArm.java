package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.Motor;

public class XArm {
    public static final double MAX_POS = 4.0;
    public static final double MIN_POS = 0.0;
    public static final double MAX_PWR = 1.0;
    public static final double MIN_PWR = -1.0;

    private final Motor slideMotor;

    Helpers helpers = new Helpers();

    public XArm(Motor motor) {
        slideMotor = motor;
        slideMotor.setRunMode(Motor.RunMode.RawPower);
        slideMotor.resetEncoder();
    }

    public void setPower(double pwr) {
        double currentPos = slideMotor.getCurrentPosition();
        if (
            (pwr > 0 && currentPos < MAX_POS) // We want to move up IF we are not at the top
                ||                            //  OR
            (pwr < 0 && currentPos > MIN_POS) // We want to move down IF we are not at the bottom
        ) {
            slideMotor.set(helpers.limit(pwr, MIN_PWR, MAX_PWR));
        } else return;
    }
}
