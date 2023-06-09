package ygfinalpartiler;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
public class partiazalýsoyutest {
	    @Test
   	    public void testpartiazalýsoyu() {
   	     int partiAoy = 400;
   	     int partiBoy = 500;
   	     int partiCoy = 350;
  	     int gerceksonuc=partiazalisoyu.partioyhesapla(partiAoy,partiBoy,partiCoy);
  	     
  	     Assert.assertEquals("azalýs hesaplama", 1,gerceksonuc);
   	     	 
   	   
   	    }

	
}

