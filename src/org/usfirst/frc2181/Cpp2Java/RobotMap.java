// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2181.Cpp2Java;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
//TAG import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	//TAG    public static CANTalon driveTrainMotorFL;
	//TAG    public static CANTalon driveTrainMotorFR;
	//TAG    public static CANTalon driveTrainMotorBL;
	//TAG    public static CANTalon driveTrainMotorBR;
	//TAG    public static RobotDrive driveTrainmotorControl;
	//TAG    public static CANTalon ropeSpoolSpinnerA;
	//TAG    public static CANTalon ropeSpoolSpinnerB;
    public static DigitalInput gearLoaderEncoder;
    public static DigitalInput gearLoaderLimitSwitch;
    public static SpeedController gearLoaderLandingMotor;
    public static Relay visionHeadlights;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
/*TAG   driveTrainMotorFL = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "MotorFL", driveTrainMotorFL);
        
        driveTrainMotorFR = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "MotorFR", driveTrainMotorFR);
        
        driveTrainMotorBL = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "MotorBL", driveTrainMotorBL);
        
        driveTrainMotorBR = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "MotorBR", driveTrainMotorBR);
        
        driveTrainmotorControl = new RobotDrive(driveTrainMotorFL, driveTrainMotorBL,
              driveTrainMotorFR, driveTrainMotorBR);

        driveTrainmotorControl.setSafetyEnabled(false);
        driveTrainmotorControl.setExpiration(0.1);
        driveTrainmotorControl.setSensitivity(0.5);
        driveTrainmotorControl.setMaxOutput(1.0);

        driveTrainmotorControl.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainmotorControl.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        ropeSpoolSpinnerA = new CANTalon(6);
        LiveWindow.addActuator("RopeSpool", "SpinnerA", ropeSpoolSpinnerA);
        
        ropeSpoolSpinnerB = new CANTalon(5);
        LiveWindow.addActuator("RopeSpool", "SpinnerB", ropeSpoolSpinnerB);
        *///TAG
        gearLoaderEncoder = new DigitalInput(0);
        LiveWindow.addSensor("GearLoader", "Encoder", gearLoaderEncoder);
        
        gearLoaderLimitSwitch = new DigitalInput(1);
        LiveWindow.addSensor("GearLoader", "LimitSwitch", gearLoaderLimitSwitch);
        
        gearLoaderLandingMotor = new VictorSP(0);
        LiveWindow.addActuator("GearLoader", "LandingMotor", (VictorSP) gearLoaderLandingMotor);
        
        visionHeadlights = new Relay(0);
        LiveWindow.addActuator("Vision", "Headlights", visionHeadlights);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

