package com.ykb.ping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Deneme {
	public static void runSystemCommand(String command) {
		String s="";
		try {
			Process p=Runtime.getRuntime().exec(command);
			BufferedReader inputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			//reading output stream of the command
			while((s=inputStream.readLine()) !=null) {
				System.out.println(s);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		String ip="10.61.2.16";
		runSystemCommand("ping " + ip);
		
	}

}
