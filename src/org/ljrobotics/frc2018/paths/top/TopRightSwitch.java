package org.ljrobotics.frc2018.paths.top;

import java.util.ArrayList;

import org.ljrobotics.lib.util.control.Path;
import org.ljrobotics.lib.util.control.PathBuilder;
import org.ljrobotics.lib.util.control.PathBuilder.Waypoint;
import org.ljrobotics.lib.util.control.PathContainer;
import org.ljrobotics.lib.util.math.RigidTransform2d;
import org.ljrobotics.lib.util.math.Rotation2d;
import org.ljrobotics.lib.util.math.Translation2d;

public class TopRightSwitch implements PathContainer {

    @Override
    public Path buildPath() {
        ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
        sWaypoints.add(new Waypoint(20,250,0,30));
        sWaypoints.add(new Waypoint(50,250,20,30));
        sWaypoints.add(new Waypoint(80,110,10,30));
        sWaypoints.add(new Waypoint(140,110,0,60));

        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }

    @Override
    public RigidTransform2d getStartPose() {
        return new RigidTransform2d(new Translation2d(20, 250), Rotation2d.fromDegrees(180.0));
    }

    @Override
    public boolean isReversed() {
        return false;
    }
	// WAYPOINT_DATA: [{"position":{"x":20,"y":250},"speed":30,"radius":20,"comment":""},{"position":{"x":50,"y":250},"speed":30,"radius":20,"comment":""},{"position":{"x":50,"y":220},"speed":30,"radius":20,"comment":""},{"position":{"x":130,"y":220},"speed":60,"radius":0,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: Top Left Switch
}