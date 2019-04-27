package org.ranju.TVApp;

public class SansuiTVImplementation implements IRemote {
	//Implementation logic
	@Override
	public void rOn()
	{
		System.out.println("SansuiTV turned on!!!");
	}
	@Override
	public void rOff()
	{
		System.out.println("SamsangTV turned off!!!");
	}


}
