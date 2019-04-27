package org.ranju.LightApp;

public class TubeLightImplementation implements ISwitch {
	//Implementation logic
	@Override
	public void sOn()
	{
		System.out.println("Tubelight turned on!!!");
	}
	@Override
	public void sOff()
	{
		System.out.println("TubeLight turned off!!!");
	}

}
