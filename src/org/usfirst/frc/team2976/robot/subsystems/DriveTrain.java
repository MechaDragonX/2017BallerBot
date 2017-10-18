package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.RobotMap;
import org.usfirst.frc.team2976.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveTrain extends Subsystem {

	// where the motors for drive train are placed into code -Davin

	private SpeedController rightFrontMotor, leftFrontMotor;

	private SpeedController rightBackMotor, leftBackMotor;

	// the drive train -Davin
	public RobotDrive mDrive;

	public DriveTrain() {
		rightFrontMotor = new Victor(RobotMap.RightFrontDriveMotor);
		leftFrontMotor = new Victor(RobotMap.leftFrontDriveMotor);
		rightBackMotor = new Victor(RobotMap.RightBackDriveMotor);
		leftBackMotor = new Victor(RobotMap.leftBackDriveMotor);

		leftFrontMotor.setInverted(true);
		leftBackMotor.setInverted(true);
		/*
		 * Constructor for RobotDrive with 4 motors specified as SpeedController
		 * objects. Speed controller input version of RobotDrive (see previous
		 * comments). Parameters:frontLeftMotor The front left SpeedController
		 * object used to drive the robotrearLeftMotor The back left
		 * SpeedController object used to drive the robot.frontRightMotor The
		 * front right SpeedController object used to drive the
		 * robot.rearRightMotor The back right SpeedController object used to
		 * drive the robot.
		 * below -Davin
		 */
		mDrive = new RobotDrive(leftBackMotor, leftFrontMotor, rightBackMotor, rightFrontMotor);

	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands. -AUTO

	public void initDefaultCommand() {
		// Set the default command for a subsystem here. -AUTO
		// The defaualt command used to be commented here. We un-commented it. -Raghav
		setDefaultCommand(new DriveWithJoystick());
	}
//both methods here are to drive the one we will use right now is the bottom one -DAvin
	
	public void arcadeDrive(double x, double y) {
		mDrive.arcadeDrive(y, x);
		//I think arcadeDive means Tank Drive -Raghav
	}

	public void drive(double right, double left) {
		//when this method is called it will tell how much the robot will move -Davin
		
		rightFrontMotor.set(right);
		rightBackMotor.set(right);
		leftFrontMotor.set(left);
		leftBackMotor.set(left);
	}

}
