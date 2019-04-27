package org.ranju.LightApp;

public class LightFactory {
	//Object creation logic
	public static ISwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("TubeLight"))
		{
			return new TubeLightImplementation();
		}
		else if (type.equalsIgnoreCase("LedLight"))
		{
			return new LedLightImplementation();
		}
		else
		{
	System.err.println("no light found!!!");
	}
		return null;
}
}
