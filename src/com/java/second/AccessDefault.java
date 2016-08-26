package com.java.second;

import com.java.myfirstproject.Default;

public class AccessDefault {
	
	public static void main(String args[]){
		Default defaultObj = new Default();
		//defaultObj.getName(); Error since it cannot be accessed outside the package: DEFAULT
		//defaultObj.name; Error since it cannot be accessed outside the package: DEFAULT
		
	}

}


