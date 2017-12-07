// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2181.Cpp2Java.subsystems;

import org.usfirst.frc2181.Cpp2Java.RobotMap;
import org.usfirst.frc2181.Cpp2Java.commands.*;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class GearLoader extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DigitalInput encoder = RobotMap.gearLoaderEncoder;
    private final DigitalInput limitSwitch = RobotMap.gearLoaderLimitSwitch;
    private final SpeedController landingMotor = RobotMap.gearLoaderLandingMotor;
    private final Counter position = new Counter(encoder);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new GearLoaderDefault());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        position.reset();
    }
    
    public void setGearLoader(double v) {
    	landingMotor.set(v);
    	//SmartDashboard::PutNumber("spinner speed", landingMotor->Get());
    	//SmartDashboard::PutNumber("spinner pos", position->Get());
    	//SmartDashboard::PutBoolean("spinner limit-bool", getLimitSwitch());
    }
    
    public boolean getLimitSwitch() {
    	return !limitSwitch.get();
    }
    
    public int getPulses() {
    	return position.get();
    }
    
    public double getDegrees() {
    	return 2.06 * position.get();
    }
    
    public void reset() {
    	position.reset();
    }
}

