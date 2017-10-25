package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.RobotMap; 


import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

//roller subsystem
public class Intake extends Subsystem {
	private Victor roller = new Victor(RobotMap.IntakeMotor);

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void rollMotor(double power) {

		roller.set(power);

	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.

	}
}
