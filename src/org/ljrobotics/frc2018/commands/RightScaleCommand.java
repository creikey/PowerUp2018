package org.ljrobotics.frc2018.commands;

import org.ljrobotics.frc2018.paths.bottom.BottomRightScale;
import org.ljrobotics.frc2018.paths.middle.MiddleRightScale;
import org.ljrobotics.frc2018.paths.top.TopRightScale;
import org.ljrobotics.lib.util.RobotPosition;
import org.ljrobotics.lib.util.control.PathContainer;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleCommand extends CommandGroup {

	/**
	 * Create a new command group that goes to the right scale
	 * @param p
	 * 		p is the robots position, bottom, middle, or top
	 */
	public RightScaleCommand(RobotPosition p) {
		PathContainer path;
		Command turn = new TurnToAngle(-90);
		switch(p) {
		case BOTTOM:
			path = new BottomRightScale();
			break;
		case MIDDLE:
			path = new MiddleRightScale();
			break;
		case TOP:
			path = new TopRightScale();
			break;
		default:
				path = null;
		}
		this.addSequential(new ResetToPathHead(path));
		this.addSequential(new FollowPath(path));
		this.addSequential(turn);
	}
	
}
