package org.ranju.LightApp;

public class LedLightImplementation implements ISwitch {
	//Implementation logic
		@Override
		public void sOn()
		{
			System.out.println("Ledlight turned on!!!");
		}
		@Override
		public void sOff()
		{
			System.out.println("Ledlight turned off!!!");
		}

}
