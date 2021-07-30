import java.util.Scanner;

public class Script_palindromword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHalo, script ini validasi kata palindrom ");
        System.out.println("Masukkan Huruf anda untuk memvalidasi");

        String word_asli = scan.nextLine();
        String result = "";

        int panjang = word_asli.length();

        for (int x = panjang -1; x >= 0; x--) {
            result = result + word_asli.charAt(x);
        }

        if (word_asli.equals(result)) {
            System.out.println("\n kalimat anda palindrome, anda mengetik "+word_asli +" dengan palindrome yaitu " +result );
        } else {
            System.out.println("\nkalimat anda bukan palindrome, anda mengetik "+word_asli );
        }

        
    }
}