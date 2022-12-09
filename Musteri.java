package OOP_Concept.KrediCekme;

import java.util.Scanner;

public class Musteri {


    Scanner input=new Scanner(System.in);

    public double krediHesapla(double miktar){
        return miktar+miktar*0.4;
    }

    public void krediCek(){

        System.out.println("Cekmek istediğiniz kredi miktarını giriniz");
        double miktar=input.nextDouble();
        System.out.println("Çekmek İstediğiniz Kredi türünü giriniz");
        System.out.println("Ogrenci\nOgretmen\nCiftci");
        String krediTuru=input.next().toLowerCase();

        switch (krediTuru){
            case "ogrenci":{
                Ogrenci ogrenci=new Ogrenci();
                System.out.print("Geri Ödemeniz gereken miktar: ");
                System.out.println(ogrenci.krediHesapla(miktar));
                break;
            }
            case "ogretmen":{
                Ogretmen ogretmen=new Ogretmen();
                System.out.print("Geri Ödemeniz gereken miktar: ");
                System.out.println(ogretmen.krediHesapla(miktar));
                break;
            }
            case "ciftci":{
                Ciftci ciftci=new Ciftci();
                System.out.print("Geri Ödemeniz gereken miktar: ");
                System.out.println(ciftci.krediHesapla(miktar));
                break;
            }
            default:{
                System.out.println("Kredi çekme hakkınız bulunmamaktadır.");
                break;
            }
        }
    }
}
