package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.Motor;

public class XArm {
    private Motor slideMotor;

    public double MAX_POS;
    public double MIN_POS;
    public double FORWARD_MAX_POWER;

    public XArm(Motor slideMotor) {
        this.slideMotor = slideMotor;
        // code
    }

    public void setPower(double pwr) {
        // code
    }
}
