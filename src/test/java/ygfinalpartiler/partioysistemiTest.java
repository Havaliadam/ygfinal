package ygfinalpartiler;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import ygfinalpartiler.parti;
import ygfinalpartiler.partiartisoyu;
import ygfinalpartiler.partiazalisoyu;
import ygfinalpartiler.partioyhesapla;

import org.junit.Assert;
import org.junit.Test;

public class partioysistemiTest {

	 int partiAoy = 500;
 	 int partiBoy = 400;
 	     int partiCoy = 250;
 	     	
	
	private partioyhesapla partioysistemi;

	   @Before
	   	    public void yükle() {
	   	        partioysistemi = new partioyhesapla();
	   	    }

	   	   

	   	    @Test
	   	    public void testGetpartioylistele() {
	   		 int partiAoy = 500;
	   	 	 int partiBoy = 400;
	   	 	     int partiCoy = 250;
	   	     partioyhesapla.partilistele("Parti A");
	   	        partioyhesapla.partilistele("Parti B");
	   	        partioyhesapla.partilistele("Parti C");
	   	        
	   	   
	   	     
	   	        
	   	    
	   	    }
	   	@Test
	   	public void testpartioyhesapla() {
	   	
	   		String oyoranlarý="PartiA: /n"+
	   						"PartiB: /n"+
	   						"PartiC:";
	   				
	   	String sonuc=ygfinalpartiler.partioyhesapla.Partilistele();
	   	Assert.assertEquals(oyoranlarý,sonuc);
	   
	   	}



}
