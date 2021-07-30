import java.util.Scanner;

public class Script_konversiwaktu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHalo, selamat datang silakhan konversi waktu");
        System.out.println("\nMasukkan Format jam disini");
        String jam = scan.nextLine();

        String[] Hours = {"01","02","03","04","05","06","07","08","09","10","11","12","1","2","3","4","5","6","7","8","9"};
        
        Boolean logika = false;
        int hasil = -1;
        for (int i=0;i<Hours.length;i++) {
            if (Hours[i].equals(jam)) {
                    logika = true;
                    hasil = i;   
                } 
        }   

        for (Integer Run = 0; Run < 1; Run+=1) {
            if(logika == true)  {
                System.out.println("Waktu Format jam terpilih\t\t\t: "+Hours[hasil]);
                System.out.println("-------------------------------------------------");

//Pencarian Format menit ---------------------------------------------------------------------------------------------------------------

                    String[] Minute = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
                    
                    System.out.println("Halo User, Masukkan Format Menit disini");
                    String menit = scan.nextLine();

                    int hasil_min = -1;

                    for (int x=0;x<Minute.length;x++) {
                        if (Minute[x].equals(menit)) {
                                logika = true;
                                hasil_min = x;   
                        }
                    }

                    for (Integer Min = 0; Min < 1; Min+=1) {
                        if(logika == true)  { 
                            System.out.println("Waktu Format Menit terpilih\t\t: "+Minute[hasil_min]);
                            System.out.println("-------------------------------------------------");
                        } else {
                            System.out.print("maaf");
                        }
                    }

// format waktu detik

String[] Second = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};

                    System.out.println("Halo User, lakukan input Format detik disini");
                    String detik = scan.nextLine();

                    int hasil_sec = -1;

                    for (int y=0;y<Second.length;y++) {
                        if (Second[y].equals(detik)) {
                                logika = true;
                                hasil_sec = y;   
                        }
                    }

                    for (Integer sec = 0; sec < 1; sec+=1) {
                        if(logika == true)  { 
                            System.out.println("Waktu Format detik terpilih "+Second[hasil_sec]+"\nWaktu yang terpilih: "+Hours[hasil]+":"+Minute[hasil_min]+":"+Second[hasil_sec]);
                            System.out.println("-------------------------------------------------");

//penentuan waktu malam dan siang dari format 12 jam
                                System.out.println("Konversi waktu anda sebelumnya");
                                String time = scan.nextLine();

                                if (time.equals("PM")) {
                                    System.out.println("Waktu pukul: "+Hours[hasil]+":"+Minute[hasil_min]+" PM");
                                    if (Hours[hasil].equals("12")) {
                                        int value = 12;
                                        System.out.println("Waktu pukul: "+value+":"+Minute[hasil_min]+" PM");
                                    } else {
                                        System.out.println("");
                                    }   

                                } else if (time.equals("AM")) {
                                    System.out.println("Waktu pukul: "+Hours[hasil]+":"+Minute[hasil_min]+" AM");
                                    if (Hours[hasil].equals("12")) {
                                        String value = "00";
                                        System.out.println("Waktu pukul: "+value+":"+Minute[hasil_min]);
                                    } else {
                                        System.out.println("");
                                    }

                                } else {
                                    System.out.println("maaf");
                                }
                        } else {
                            System.out.print("maaf salah pilih detik coba lagi");
                        }
                    }
 
            } else {
                System.out.println("Maaf anda salah input, coba lagi");
            }     
        }
    }
}