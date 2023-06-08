import java.util.Scanner;

public class Baslangic2 {
    public static void main(String[] args) {

        // değişkenleri oluştur.
        int mat , fizik , kimya , turkce , tarih , muzik ;

        // Scanner sınıfımızı tanımlıyoruz.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri alıyoruz.
        System.out.print(" Matematik Notunuz . ");
        mat = inp.nextInt();

        System.out.print(" Fizik Notunuz . ");
        fizik = inp.nextInt();

        System.out.print(" Kimya Notunuz . ");
        kimya = inp.nextInt();

        System.out.print(" Türkçe Notunuz . ");
        turkce = inp.nextInt();

        System.out.print(" Tarih Notunuz . ");
        tarih = inp.nextInt();

        System.out.print(" Müzik Notunuz . ");
        muzik = inp.nextInt();

        double sonuc = (double) (mat + fizik + kimya + turkce + tarih + muzik) / 6 ;

        System.out.println( " Not ortolamanız : " + sonuc);

        String SonucMesaji = ( sonuc >= 60 ? "Geçtiniz " : " Kaldınız ") ;

        System.out.println(SonucMesaji);


            }
}
