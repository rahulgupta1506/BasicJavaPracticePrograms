package com.pratice.programs;

public class RemoveJunkCharacters {

	public static void main(String[] args) {

		String s = "@$$%Rah*(&ul G$#%up@$$%><?:ta";
		
		s = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
