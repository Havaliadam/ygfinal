package ygfinalpartiler;

public class parti {//parti sinifi oluþturduk
	private String isim;
	private int oy;// parti isimi ve oy olarak tanýmlardýk


public parti(String isim,int oy) {
	this.isim=isim;// 
	this.oy=0;
}
public String getisim() {
	return isim;//get ve set methodlarý yaptýk
}

public int getoy() {
	return oy;
}
public void oyarrtýr() {
	oy++;// oy artýrma fonkisyonu tanýmladýk
}
public void oyazalt() {
	if(oy>0) {
		oy--;//oy azaltna yaptýk
	}
}



}
