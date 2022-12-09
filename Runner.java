package OOP_Concept.KrediCekme;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen adınızı soyadınızı giriniz:");
        String tamad=input.nextLine();
        System.out.println("Hoşgeldiniz  "+tamad);

        Musteri musteri=new Musteri();

        musteri.krediCek();

    }
}
