package org.usfirst.frc.team5492.robot.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team5492.robot.commands.*;
/**
 *
 */
public class RobotToAuto extends CommandGroup {
    
    public  RobotToAuto() {
    	addSequential(new TimeDrive(1.7, -.4));
    }
}
