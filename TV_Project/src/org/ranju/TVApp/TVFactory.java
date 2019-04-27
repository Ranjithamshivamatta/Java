package org.ranju.TVApp;
public class TVFactory {
	//Object creation logic
		public static IRemote getTV(String type)
		{
			if(type.equalsIgnoreCase("SansuiTV"))
			{
			return new SansuiTVImplementation();
			}
			else if (type.equalsIgnoreCase("SamsangTV"))
			{
				return new Samsang();
			}
			else
			{
		System.err.println("no TV found!!!");
		}
			return null;
	}
	}



