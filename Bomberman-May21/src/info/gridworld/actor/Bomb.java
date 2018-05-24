package info.gridworld.actor;

import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class Bomb extends Rock implements Destructable
{
	
	private int bombPower;
	private ArrayList<Location> LocsInRange;
	
	public Bomb(int power){
		bombPower = power; //number of tiles that the bomb hits in each Direction (N, S, E, W)

	}
	
	public void explode()
	{
		ArrayList<Location> LocsInRange = new ArrayList<Location>;
		
		nLoc = getLocation().getAdjacentLocation(Location.NORTH);
		eLoc = getLocation().getAdjacentLocation(Location.EAST);
		wLoc = getLocation().getAdjacentLocation(Location.WEST);
		sLoc = getLocation().getAdjacentLocation(Location.SOUTH);
		
		for (int n = 0; n < bombPower; n++)
		{
			LocsInRange.add(nLoc);
			LocsInRange.add(eLoc);
			LocsInRange.add(wLoc);
			LocsInRange.add(sLoc);
			
			nLoc = nLoc.getAdjacentLocation(Location.NORTH);
			eLoc = eLoc.getAdjacentLocation(Location.EAST);
			wLoc = wLoc.getAdjacentLocation(Location.WEST);
			sLoc = sLoc.getAdjacentLocation(Location.SOUTH);
		}
		
		for (Location loc : LocsInRange)
		{
			loc.getActor().destruct() //make it so that if instance of BLock, destruct, and then removeself from grid, also if there is a player in the range
		}
	}
	
	public void destruct()
	{
		explode();
	}
}
