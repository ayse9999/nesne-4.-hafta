package araysss;

import java.util.Scanner;

public class dderss4 {

	public static void main(String[] args) {
		 
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("kuresel isinma sorulari:");
		int dogru=0;
		
		String []cevaplar =new String[5];
		String []dogrucevaplar= {"A","B","C","C","C"};
		
		System.out.println("1.soru = Hangi ulke en cok sera gazi yaymaktadir?");
		System.out.println("A)cin");
		System.out.println("B)Hindistan");
		System.out.println("C)Amerika");
		System.out.println("D) Japonya");
		
		System.out.println("cevabi giriniz:");
		String cevap1= input.next();
		cevaplar[0]=cevap1;
		
		System.out.println("2.soru=Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir?");
		System.out.println("A)jupiter");
		System.out.println("B)venus");
		System.out.println("C)mars");
		System.out.println("D)merkur");
		
		System.out.println("cevabi giriniz:");
		String cevap2=input.next();
		cevaplar[1]=cevap2;
		
		System.out.println("Hangi tur ampul en az enerjiyi tüketir?");
		System.out.println("A)akkor ampul");
		System.out.println("B)holojen ampul");
		System.out.println("C)kompakt floresan ampul");
		System.out.println("D) dıger ampuller");
		
		System.out.println("cevabi giriniz:");
		String cevap3=input.next();
		cevaplar[2]=cevap3;
		
		System.out.println(" İklim değişikliği nedeniyle yilda kaç kisi olmektedir?");
		System.out.println("A)1500");
		System.out.println("B)100.000");
		System.out.println("C)150.000");
		System.out.println("D) 500.000");
		
		System.out.println("cevabi giriniz:");
		String cevap4=input.next();
		cevaplar[3]=cevap4;
		
		System.out.println(" Kuresel isinmaya karsi en savunmasiz hayvan hangisidir?");
		System.out.println("A)kar leopari");
		System.out.println("B)kutup ayisi");
		System.out.println("C)deniz gergedani");
		System.out.println("D) tukan");

		System.out.println("cevabi giriniz:");
		String cevap5=input.next();
		cevaplar[4]=cevap5;
		
		for(int i=0;i<cevaplar.length;i++) {
			if(cevaplar[i].equals(dogrucevaplar[i])) dogru+=1;
				dogru+=i;
		}
		
		if (dogru==5)
			System.out.println("mukemmel");
		else if(dogru==4)
			
			System.out.println("cok ıyı");
		else 
			System.out.println("bİlgİlerinizi tazeleme vakti geldi");
		for(String cevap:cevaplar) {
			System.out.println(cevap);
		}
		
		
		

	}

}
