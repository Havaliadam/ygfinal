package ygfinalpartiler;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
public class partiazal�soyutest {
	    @Test
   	    public void testpartiazal�soyu() {
   	     int partiAoy = 400;
   	     int partiBoy = 500;
   	     int partiCoy = 350;
  	     int gerceksonuc=partiazalisoyu.partioyhesapla(partiAoy,partiBoy,partiCoy);
  	     
  	     Assert.assertEquals("azal�s hesaplama", 1,gerceksonuc);
   	     	 
   	   
   	    }

	
}

