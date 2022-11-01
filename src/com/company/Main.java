package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    int mat,fizik,kimya,turkce,tarih,muzik;
    System.out.println("mat notunu giriniz:");
    mat=scan.nextInt();
    System.out.println("fizik notunu giriniz:");
    fizik=scan.nextInt();
    System.out.println("kimya notunu giriniz:");
    kimya=scan.nextInt();
    System.out.println("turkce notunu giriniz:");
    turkce=scan.nextInt();
    System.out.println("tarih notunu giriniz:");
    tarih=scan.nextInt();
    System.out.println("muzik notunu giriniz:");
    muzik=scan.nextInt();
    Double sonuc= Double.valueOf((mat+fizik+kimya+turkce+tarih+muzik)/6);
    if(sonuc>60){
        System.out.println("sinifi gecti");
    }
    else{
        System.out.println("sinifta kaldi");
    }
    }
}
