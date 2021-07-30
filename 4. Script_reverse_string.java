import java.util.Scanner;

public class Script_reverse_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHalo, selamat datang format reverse string ");
        System.out.println("Masukkan Huruf anda");

        String start = scan.nextLine();
        String result = "";

        int total = start.length();
        int totalalphabet = total - 1;

        for (int x = 0; x < total; x++) {
            result = result + start.charAt(totalalphabet);
            totalalphabet--;
        }

        System.out.println("\nreverse kalimat menjadi " );
        System.out.println(result);
        
    }
}