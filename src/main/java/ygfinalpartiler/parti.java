package ygfinalpartiler;

public class parti {//parti sinifi olu�turduk
	private String isim;
	private int oy;// parti isimi ve oy olarak tan�mlard�k


public parti(String isim,int oy) {
	this.isim=isim;// 
	this.oy=0;
}
public String getisim() {
	return isim;//get ve set methodlar� yapt�k
}

public int getoy() {
	return oy;
}
public void oyarrt�r() {
	oy++;// oy art�rma fonkisyonu tan�mlad�k
}
public void oyazalt() {
	if(oy>0) {
		oy--;//oy azaltna yapt�k
	}
}



}
