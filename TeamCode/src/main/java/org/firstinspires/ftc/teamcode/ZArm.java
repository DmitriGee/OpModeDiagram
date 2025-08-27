package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.hardware.motors.Motor;

public class ZArm {
    public static final double MAX_POS = 4.0;
    public static final double MIN_POS = 0.0;
    public static final double PID_P = 0.001;
    public static final double PID_I = 0.0001;
    public static final double PID_D = 0.004;

    private final Motor slideMotor;
    private final PIDController slideMotorPID = new PIDController(PID_P, PID_I, PID_D);

    Helpers helpers = new Helpers();

    public ZArm(Motor motor) {
        slideMotor = motor;
        slideMotor.setRunMode(Motor.RunMode.RawPower);
        slideMotor.resetEncoder();
    }

    public void setPosition(double pos) {
        slideMotorPID.setSetPoint(helpers.limit(pos, MIN_POS, MAX_POS));
    }

    public void tickPID() {
        double currentPos = slideMotor.getCurrentPosition();
        double output = helpers.limit(slideMotorPID.calculate(currentPos), -1.0, 1.0);
        slideMotor.set(output);
    }
}
