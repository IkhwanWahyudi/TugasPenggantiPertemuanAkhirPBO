package javaapplication15;

public class JavaApplication15 {

    public static void main(String[] args) {
        String KalimatAwal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        System.out.println("0=====================================================================================0");
        System.out.println("  Manipulasi String \""+ KalimatAwal +"\"");
        System.out.println("0=====================================================================================0");
        
        // mengambil kata pertama sampai kata sebelum "tingkat"
        String kalimat1 = KalimatAwal.substring(0, KalimatAwal.indexOf("tingkat") - 1);
        
        // mengubah kalimat1 menjadi LowerCase (Huruf kecil semua)
        String kalimatLowerCase = kalimat1.toLowerCase();
        
        // mengubah kalimat1 menjadi UpperCase (Huruf besar semua)
        String kalimatUpperCase = kalimat1.toUpperCase();
        
        // mengambil semua kata (spasi tidak masuk) menjadi array
        String[] kata = KalimatAwal.split(" ");
        
        // variabel untuk menampung kata "pemrograman"
        String kataPemrograman = "";

        // mengambil kata "pemrograman" menggunakan perulangan for
        // yang menjelajahi array kata apakah terdapat kata "pemrograman"
        // jika iya makan perulangan berhenti
        for (String kataString : kata) {
            if (kataString.contains("pemrograman")) {
                kataPemrograman = kataString;
                break;
            }
        }
        
        // Mengambil kalimat dimulai dari "tingkat" hingga akhir kalimat
        String KalimatTingkatTinggiDanDinamis = KalimatAwal.substring(KalimatAwal.indexOf("tingkat"), KalimatAwal.length());
        
        // Menampilkan hasil manipulasi string
        System.out.println("  1. " + kalimat1);
        System.out.println("  2. " + kalimatLowerCase);
        System.out.println("  3. " + kalimatUpperCase);
        System.out.println("  4. " + kataPemrograman);
        System.out.println("  5. " + KalimatTingkatTinggiDanDinamis);
    }
}
