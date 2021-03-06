package org.usfirst.frc.team5492.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5492.robot.Robot;

/**
 * Calls Claw class setSetpoint method to set the claw to desired position
 */
public class SetClawSetpoint extends Command {
	private double setpoint;	
	
    public SetClawSetpoint(double setpoint) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.setpoint = setpoint;
    	requires(Robot.claw);
    	setTimeout(2.5);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.claw.enable();
    	Robot.claw.setSetpoint(setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.claw.onTarget() || isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.claw.disable();
    }
}
