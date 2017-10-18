package org.usfirst.frc.team2976.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Davin, I think the commented out imports below are unnecessary according to Eclipse.
 * The error says at Button and ExampleCommand are never used in the code, and thus
 * are unnecessary -Raghav
 * Jeffrey, just ask one of us if this is issue is taken care of at a meeting. -Raghav
 * 
 * import edu.wpi.first.wpilibj.buttons.Button;
 * import org.usfirst.frc.team2976.robot.commands.ExampleCommand;
 */

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * -Davin
 */

public class OI {
// the controller
	public Joystick driveStick;
	
/**
 * From Line 29 to 43 I have written my own comments -Raghav
 */
	
	//numeric values for each face button
	public static final int A = 1;
	public static final int B = 2;
	public static final int X = 0;
	public static final int Y = 3;

	//numeric values for shoulder buttons on the joystick
	public static final int LBumper = 5;
	public static final int RBumper = 6;
 
	//numeric values for the analog shoulder buttons (triggers) on the joystick
	public static final int LeftYAxis = 1;
	public static final int RightYAxis = 3;
	
//methods to get what is happening on thumb sticks on the joystick
	public double getLeftAxis() {

		return driveStick.getRawAxis(LeftYAxis);

	}

	public double getRightAxis() {

		return driveStick.getRawAxis(RightYAxis);

	}

	public OI() {
//intalizing the joystick
		
		driveStick = new Joystick(0);

	}
	
}
