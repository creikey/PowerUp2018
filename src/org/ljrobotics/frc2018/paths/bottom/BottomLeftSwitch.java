package org.ljrobotics.frc2018.paths.bottom;

import java.util.ArrayList;

import org.ljrobotics.lib.util.control.Path;
import org.ljrobotics.lib.util.control.PathBuilder;
import org.ljrobotics.lib.util.control.PathBuilder.Waypoint;
import org.ljrobotics.lib.util.control.PathContainer;
import org.ljrobotics.lib.util.math.RigidTransform2d;
import org.ljrobotics.lib.util.math.Rotation2d;
import org.ljrobotics.lib.util.math.Translation2d;

public class BottomLeftSwitch implements PathContainer {

    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(0,70,0,60));
        sWaypoints.add(new Waypoint(40,70,20,60));
        sWaypoints.add(new Waypoint(80,220,10,60));
        sWaypoints.add(new Waypoint(140,220,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }

    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(0, 70), Rotation2d.fromDegrees(180.0));
    }

    @Override
    public boolean isReversed() {
        return false;
    }
	// WAYPOINT_DATA: [{"position":{"x":0,"y":70},"speed":60,"radius":0,"comment":""},{"position":{"x":40,"y":70},"speed":60,"radius":20,"comment":""},{"position":{"x":80,"y":220},"speed":60,"radius":10,"comment":""},{"position":{"x":140,"y":220},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: ShortRightSwitch
}