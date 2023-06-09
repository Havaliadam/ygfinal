package ygfinalpartiler;

import java.util.HashMap;
import java.util.Map;

public class partiartisoyu {
	private static int partiAoy=0;
	private static int partiBoy=0;
	private static int partiCoy=0;

	public static void partiartisoyu(String partiisim) {
		if(partiisim.equals("A")) {
			partiAoy++;
			
		}else if(partiisim.equals("B")) {
			partiBoy++;
		}else if (partiisim.equals("C")) {
			partiCoy++;
		}
	}

	public static int partioyhesapla(int partiAoy, int partiBoy, int partiCoy) {
		// TODO Auto-generated method stub
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
		
		return 1;
	}
}
