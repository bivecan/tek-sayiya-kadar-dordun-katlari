import java.util.Scanner;

public class TekSayiyaKadarDordunKatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;int sayi;
        do{
            System.out.println("Sayı girin");
            sayi = scan.nextInt();
            if (sayi%4==0)
               sum+=sayi;
        }
        while ( sayi %2 == 0);

        System.out.println("toplam: " + sum);
    }
}
