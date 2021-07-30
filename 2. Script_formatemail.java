import java.util.Scanner;

public class Script_formatemail {
    public static void main(String[] args) {
        
        System.out.println("\nHalo, selamat datang silakhan check format email ");
        System.out.println("\nSilakan buat format email ");
        format_et(args);
    }

    public static void format_et(String[] args) {
        System.out.println("\nHalo User, Masukkan @ (arroba) untuk memulai pembuatan email");
        Scanner scan = new Scanner(System.in);

        String pemilihan = scan.nextLine();
    
        if (pemilihan.equals("@")) {
            System.out.println(pemilihan.contains("@"));
            format_dot(args);
        } else { 
            System.out.println("maaf tidak disah-kan");
        }
    }

    public static void format_dot(String[] args) {
        System.out.println("\nlanjutkan dengan memakai tanda titik setelah @\n");
        Scanner scan = new Scanner(System.in);

        String pemilihan = scan.nextLine();
    
        if (pemilihan.equals("@.")) {
            System.out.println(pemilihan.contains("@."));
            format_email(args);
        } else { 
            System.out.println("maaf tidak disah-kan");
        }
    }

    public static void format_email(String[] args) {
        System.out.println("\nlanjutkan untuk check format email anda, maks 20 kata sebelum arroba \n");

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] Email = {"januari_agustina_sih","februari_sukianingsi"};
            
        Boolean logika = false;
                    
        int hasil = -1;
        for (int i=0;i<Email.length;i++) {
            if (Email[i].equals(input)) {
                    logika = true;
                    hasil = i;   
            }
        }
    
        for (Integer Run = 0; Run < 1; Run+=1) {
            if(logika == true)  {
                System.out.println("Email anda adalah\t\t\t: "+Email[hasil]+"@.");
                System.out.println("-------------------------------------------------");

                    System.out.println("Halo User, Masukkan domain anda untuk langkah terakhir");
                    String pemilihan = scan.nextLine();
                    if (pemilihan.equals(".co")) {
                        System.out.println("domain diperbolehlkan");
                        System.out.println("Email anda adalah\t\t\t: "+Email[hasil]+"@..co");
                    } 
                    else if (pemilihan.equals(".co.id")) {
                        System.out.println("domain diperbolehkan");
                        System.out.println("Email anda adalah\t\t\t: "+Email[hasil]+"@..co.id");
                    } else {
                        System.out.println("Maaf mohon domain anda belum tersedia / salah silakan masukkan kembali");
                    }
            } else {
                System.out.println("Coba periksa lagi");
            }
        }
    }
}

