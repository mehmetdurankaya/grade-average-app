package dersortalamasiapp;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArithmeticMean aritmetikOrtalama=new ArithmeticMean();//instance alındı
        Scanner scan=new Scanner(System.in);//kullanıcıdan veri almak için import edildi.
        int matematik,fizik,kimya,turkce,tarih,muzik,result;//variables declare edildi

        System.out.println("Bu uygulama kullanıcı tarafından girilen \n" +
                           "Matematik-Fizik-Kimya-Türkçe-Tarih-Müzik derslerine ait notların\n"+
                           "aritmetik ortalamasını hesaplar.\n" +
                           "Lütfen Matematik notunuzu giriniz.");
        //kullanıcı bilgilendirildi
         matematik=scan.nextInt();//Kullanıcıdan gelen veri variable assigment işlemi yapıldı
         //--------------------------------------------
        System.out.println("Lütfen Fizik notunuzu giriniz.");
        fizik=scan.nextInt();
        //--------------------------------------------------
        System.out.println("Lütfen Kimya notunuzu giriniz.");
        kimya=scan.nextInt();
        //-----------------------------------------------------
        System.out.println("Lütfen Türkçe notunuzu giriniz.");
        turkce=scan.nextInt();
        //-----------------------------------------------------
        System.out.println("Lütfen Tarih notunuzu giriniz.");
        tarih=scan.nextInt();
        //------------------------------------------------------
        System.out.println("Lütfen Müzik notunuzu giriniz.");
        muzik=scan.nextInt();
        //------------------------------------------------------
        result=aritmetikOrtalama.ortalamaHesapla(matematik,kimya,fizik,turkce,tarih,muzik);

        System.out.println("Sayıların aritmetik ortalaması " + result);

        String isPas=(result>=50 && result<=100)? "Sınıf Geçti" : "Sınıfta Kaldı";
        System.out.println(isPas);

    }
}
