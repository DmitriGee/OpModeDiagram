package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.Motor;

public class ZArm {
    private Motor slideMotor;
    private PIDController slideMotorPID;

    public double MAX_POS;
    public double MIN_POS;
    public double FORWARD_MAX_POWER;

    public ZArm(Motor slideMotor, PIDController slideMotorPID) {
        this.slideMotor = slideMotor;
        this.slideMotorPID = slideMotorPID;
        // code
    }

    public void setPosition(double pwr) {
        // code
    }

    public void tickPID() {
        // code
    }
}
