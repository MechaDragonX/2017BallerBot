package org.usfirst.frc.team2976.robot.commands;



import org.usfirst.frc.team2976.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/** Where all the great code is to drive the robot using methods set in DriveTrain subsystem
 *
 */

public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
    //no other command can call this subsystem  when DriveWithJoystick is used 	
    	requires(Robot.driveTrain);
    	
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	// stops all wheels just in case 
    	Robot.driveTrain.drive(0, 0);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//right motors will run using left axis on controller
 	double right=Robot.oi.getLeftAxis();
 	
 	//left motors will run using right axis on controller
 	double left=Robot.oi.getRightAxis();
 	
 	//this is the method put in subsystem DriveTrain
 	
 	Robot.driveTrain.drive(right, left);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// will stop on its own when false
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	
    }
}
