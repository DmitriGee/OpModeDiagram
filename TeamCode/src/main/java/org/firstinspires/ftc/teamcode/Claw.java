package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;


public class Claw {
    public static final double WRIST_MAX_POS = 0.8;
    public static final double WRIST_MIN_POS = -0.5;
    public static final double CLAW_OPEN_POS = 0.5;
    public static final double CLAW_CLOSED_POS = 0.1;

    private final Servo wristServo;
    private final Servo clawServo;

    Helpers helpers = new Helpers();

    public Claw(Servo wristServo, Servo clawServo) {
        this.wristServo = wristServo;
        this.clawServo = clawServo;
    }

    public void setWristPos(double pos) {
        this.wristServo.setPosition(helpers.limit(pos, WRIST_MIN_POS, WRIST_MAX_POS));
    }

    public void setClawPos(double pos) {
        this.clawServo.setPosition(helpers.limit(pos, CLAW_CLOSED_POS, CLAW_OPEN_POS));
    }
}
