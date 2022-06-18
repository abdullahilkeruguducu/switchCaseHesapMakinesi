import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz : ");
        n1 = input.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.print(n1 + n2);
                break;
            case 2:
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.print(n1 * n2);
                break;
            case 4:
                boolean kosul1 = n2 == 0;
                String sonuc = kosul1 ? "Bir sayi 0'a bolunemez." : ("Sonuc: ") + (n1 / n2);
                System.out.print(sonuc);
                break;
            default:
                System.out.print("Yanlis secim yapildi. Tekrar deneyiniz.");
                break;
        }
    }
}