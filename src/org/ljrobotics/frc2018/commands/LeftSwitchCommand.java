package org.ljrobotics.frc2018.commands;

import org.ljrobotics.frc2018.paths.bottom.BottomLeftSwitch;
import org.ljrobotics.frc2018.paths.middle.MiddleLeftSwitch;
import org.ljrobotics.frc2018.paths.top.TopLeftSwitch;
import org.ljrobotics.lib.util.RobotPosition;
import org.ljrobotics.lib.util.control.PathContainer;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSwitchCommand extends CommandGroup{

	/**
	 * Create a new command group that goes to the left switch
	 * @param p
	 * 		p is the robots position, bottom, middle, or top
	 */
	public LeftSwitchCommand(RobotPosition p) {
		PathContainer path;
		Command turn = new TurnToAngle(0);
		switch(p) {
		case BOTTOM:
			path = new BottomLeftSwitch();
			break;
		case MIDDLE:
			path = new MiddleLeftSwitch();
			break;
		case TOP:
			path = new TopLeftSwitch();
			break;
		default:
				path = null;
		}
		this.addSequential(new ResetToPathHead(path));
		this.addSequential(new FollowPath(path));
		// this.addSequential(new DriveForward(0.2, 1));
		this.addSequential(turn);
	}
	
}
