package org.usfirst.frc.team2976.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2976.robot.commands.ExampleCommand;
import org.usfirst.frc.team2976.robot.commands.RollIntakeMotor;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
// the controller
	public Joystick driveStick;
	
	
	//numeric values for each button
	public static final int A = 1; 
	public static final int B = 2;
	public static final int X = 3;
	public static final int Y = 5;

	public static final int LBumper = 5;
	public static final int RBumper = 6;
//numeric values for joysticks on the controller 
	public static final int LeftYAxis = 1;

	public static final int RightYAxis = 5;
//methods to get what is happening on joysticks on the controller 
	public double getLeftAxis() {

		return driveStick.getRawAxis(LeftYAxis);

	}

	public double getRightAxis() {

		return driveStick.getRawAxis(RightYAxis);

	}

	public OI() {
//intalizing the joystick
		
		driveStick = new Joystick(0);
		new JoystickButton(driveStick, A).whileHeld(new RollIntakeMotor()); 
		

	}

}
