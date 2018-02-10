package org.ljrobotics.frc2018.commands;

import org.ljrobotics.frc2018.paths.bottom.BottomRightSwitch;
import org.ljrobotics.frc2018.paths.middle.MiddleLeftScale;
import org.ljrobotics.frc2018.paths.middle.MiddleRightSwitch;
import org.ljrobotics.frc2018.paths.top.TopRightSwitch;
import org.ljrobotics.lib.util.RobotPosition;
import org.ljrobotics.lib.util.control.PathContainer;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftScaleCommand extends CommandGroup{

	public LeftScaleCommand(RobotPosition p) {
		PathContainer path;
		Command turn = new TurnToAngle(90);
		switch(p) {
		case BOTTOM:
			path = new BottomRightSwitch();
			break;
		case MIDDLE:
			path = new MiddleRightSwitch();
			break;
		case TOP:
			path = new TopRightSwitch();
			break;
		default:
				path = null;
		}
		this.addSequential(new ResetToPathHead(path));
		this.addSequential(new FollowPath(path));
		this.addSequential(new TurnToAngle(90));
		this.addSequential(turn);
	}
	
}
