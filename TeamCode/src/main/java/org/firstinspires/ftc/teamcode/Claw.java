package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    private Servo wristServo;
    private Servo clawServo;

    public double WRIST_MAX_POS;
    public double WRIST_MIN_POS;
    public double CLAW_OPEN_POS;
    public double CLAW_CLOSED_POS;

    public Claw(Servo wristServo, Servo clawServo) {
        this.wristServo = wristServo;
        this.clawServo = clawServo;
        // code
    }

    public void setWristPos(double pos) {
        // code
    }

    public void setClawPos(double pos) {
        // code
    }
}
