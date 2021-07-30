import java.util.Scanner;

public class Script_modulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHalo silakan memulai ");
        System.out.println("1. sisa hasil bagi kedua bilangan\n2. sisa hasil bagi keempat bilangan ");
        int start = input.nextInt();

        if (start == 2) {
            System.out.println("Nomor 2. terpilih");
            logika_bilangan(args);
        } else if (start == 1) {
            System.out.println("Nomor 1. terpilih");
    
            System.out.println("\nMasukkan Bilangan awal ");
            int numercial1 = input.nextInt();

            System.out.println("masukkan Bilangan kedua  ");
            int numerical2 = input.nextInt();

            int jumlah = numercial1 % numerical2;

            if (jumlah == 3) {
                System.out.println("Hello");
            } else if (jumlah == 5) {
                System.out.println("World");
            } else {
                System.out.println("maaf coba lagi");
            }
        }
    }

    
    public static void logika_bilangan(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nMasukkan kedua Bilangan sisa bagi ");
        int numercial1 = input.nextInt();
        int numerical2 = input.nextInt();

        boolean value = numercial1 % numerical2 == 5;

        System.out.println("\nmasukkan kedua Bilangan sisa bagi lagi.. ");
        int numerical3 = input.nextInt();
        int numerical4 = input.nextInt();

        boolean value1 = numerical3 % numerical4 == 3; 
        
        if (value || value1 ) {
            System.out.println("Hello world");
        } else {
            System.out.println("maaf anda salah");
        }
    }
}
