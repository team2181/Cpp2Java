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

// TAG import org.usfirst.frc2181.Cpp2Java.RobotMap;
import org.usfirst.frc2181.Cpp2Java.commands.*;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class RopeSpool extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//TAG    private final CANTalon spinnerA = RobotMap.ropeSpoolSpinnerA;
//TAG    private final CANTalon spinnerB = RobotMap.ropeSpoolSpinnerB;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new RopeSpoolDefault());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        //SmartDashboard::PutNumber("RopeSpool max current", 0);
        //SmartDashboard::PutNumber("Spinner A Current", 0);
        //SmartDashboard::PutNumber("Spinner B Current", 0);
    }
    
    public void setSpinner(double v) {
    	//SmartDashboard::PutNumber("Spinner A Current", spinnerA->GetOutputCurrent());
    	//SmartDashboard::PutNumber("Spinner B Current", spinnerA->GetOutputCurrent());
//TAG    	spinnerA.set(v);
//TAG    	spinnerB.set(v);
    }
}

