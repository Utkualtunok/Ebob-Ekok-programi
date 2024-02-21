import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcı veri girişi
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok = (sayi1 * sayi2);

        //Ebob'u bulma
        int i = 2;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        // Ekok formülü
        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB değeri: " + ebob);
        System.out.println("Girilen sayıların EKOK değeri: " + ekok);

    }
}
