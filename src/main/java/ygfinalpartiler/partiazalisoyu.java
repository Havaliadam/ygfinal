package ygfinalpartiler;

import java.util.HashMap;
import java.util.Map;

public class partiazalisoyu {
	private static int partiAoy=0;
	private static int partiBoy=0;//parti oy i�in deger girilir
	private static int partiCoy=0;
	public void partiazalisoyu(String partiisim) {{//partiazal�ioyu s�n�f� tan�mland�
		if(partiisim.equals("A")) {
			if(partiAoy>0) {
				//
			partiAoy--;
			}//her parti i�in oy azal��� yapmas�
		
			
		}else if(partiisim.equals("B")) {
			if(partiBoy>0) {
				partiBoy--;
			}
		}else if (partiisim.equals("C")) {
			if(partiCoy>0) {
			partiCoy--;
		}
		
		}
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
			double oyhesab�=(oy*(double)toplamoy)*100;
			System.out.println(partiadi+":"+oy+"oy("+oyhesab�+"%)");
		}
		
		return 1;
	}
}
