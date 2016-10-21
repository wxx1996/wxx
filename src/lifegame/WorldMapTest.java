package lifegame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldMapTest {
	private static WorldMap worldmap=new WorldMap();

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void tset_changeCellStatus(){
		worldmap.changeCellStatus();
	}
	
	@Test
	public void test_neighborsCount(){
		worldmap.neighborsCount(15,15);
	}
	
	@Test
	public void test_copyWorldMap(){
		worldmap.copyWorldMap();
	}

	@Test
	public void testWorldMap() {
		fail("ипн╢й╣ож");
	}

}
