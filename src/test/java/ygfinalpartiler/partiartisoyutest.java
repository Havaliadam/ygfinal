package ygfinalpartiler;

import org.junit.Assert;
import org.junit.Test;
import ygfinalpartiler.partiartisoyu;

public class partiartisoyutest {
	
	
	
	   @Test
  	    public void testpartiartisoyu() {
  	     int partiAoy = 50;
  	     int partiBoy = 40;
  	     int partiCoy = 25;
  	     	
  	     
  	     int gerceksonuc=partiartisoyu.partioyhesapla(100,250,400);
  	        
  	     Assert.assertEquals("(oy*(double)toplamoy)*100 :",1,gerceksonuc);
  	    }

 

}
