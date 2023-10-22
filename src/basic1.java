
import java.util.Scanner;
public class basic1 {
    public static void main(String[] args) {
        double toplam=0;
        double ort=0;
        Scanner input=new Scanner(System.in);
        System.out.println("kaç değer girmek istediğinizi giriniz");
        int girileceksayi=input.nextInt();
        for(int i=1;i<=girileceksayi;i++) {
            System.out.println(i + ".sayıyı giriniz");
            int sayi = input.nextInt();
            toplam += sayi;
            ort = (toplam / girileceksayi);
        }
    }
}