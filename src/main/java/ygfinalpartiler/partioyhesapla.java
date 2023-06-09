package ygfinalpartiler;

import java.util.HashMap;
import java.util.Map;

public class partioyhesapla  {

		// TODO Auto-generated constructor stub
	

	public static void main(String[]args) {
		Map<String,Integer>partioy=new HashMap<>();
		
	

		int toplamoy=0;
		for(int oy:partioy.values()) {
			toplamoy+=oy;
		}
		for(Map.Entry<String,Integer>entry:partioy.entrySet()) {
			String partiadi=entry.getKey();
			int oy=entry.getValue();
			double oyhesabý=(oy*(double)toplamoy)*100;
			System.out.println(partiadi+":"+oy+"oy("+oyhesabý+"%)");
		}

		}




	public static String Partilistele() {
		// TODO Auto-generated method stub
		return null;
	}




	public static void partiartisoy(String string) {
		// TODO Auto-generated method stub
		
	}




	public static void partilistele(String string) {
		// TODO Auto-generated method stub
		
	}


	

}

