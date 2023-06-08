package aplikasiinputnilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AplikasiInputNilai {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Nilai> nilai = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        String Nama, Matkul;
        int jumlahKehadiran, NilaiUAS, NilaiUTS;

        System.out.println("---------------------------------------------");

        System.out.println("Sistem Input Nilai Program Studi Informatika");

        System.out.println("---------------------------------------------");
        System.out.print("  Nama Mahasiswa/i : ");
        Nama = input.readLine();

        String inputlagi = "";
        while (!"n".equals(inputlagi)) {

            System.out.println("---------------------------------------------");
            System.out.print("  Mata Kuliah : ");
            Matkul = input.readLine();
            System.out.println("---------------------------------------------");
            while (true) {
                System.out.print("  UAS : ");
                NilaiUAS = Integer.parseInt(input.readLine());
                if (NilaiUAS < 0 || NilaiUAS > 100) {
                    System.out.println("Nilai maksimal 100 dan minimal 0");
                } else {
                    break;
                }
            }
            System.out.println("---------------------------------------------");

            while (true) {
                System.out.print("  UTS : ");
                NilaiUTS = Integer.parseInt(input.readLine());
                if (NilaiUTS < 0 || NilaiUTS > 100) {
                    System.out.println("Nilai maksimal 100 dan minimal 0");
                } else {
                    break;
                }
            }

            System.out.println("---------------------------------------------");
            int NilaiKehadiran;
            while (true) {
                System.out.print("  Jumlah Kehadiran (8 Pertemuan) : ");
                jumlahKehadiran = Integer.parseInt(input.readLine());
                if (jumlahKehadiran > 8 || jumlahKehadiran < 0) {
                    System.out.println("Maksimal 8 pertemuan dan minimal 0 kehadiran!");
                } else if (jumlahKehadiran < 3) {
                    NilaiKehadiran = 0;
                    break;
                } else if (jumlahKehadiran == 3 || jumlahKehadiran == 4) {
                    NilaiKehadiran = 60;
                    break;
                } else if (jumlahKehadiran == 5 || jumlahKehadiran == 6) {
                    NilaiKehadiran = 80;
                    break;
                } else if (jumlahKehadiran >= 7) {
                    NilaiKehadiran = 100;
                    break;
                }
            }

            float NilaiAkhir = (float) ((0.2 * NilaiKehadiran) + (0.3 * NilaiUTS)
                    + (0.5 * NilaiUAS));
            String Grade = "";
            if (NilaiAkhir < 50) {
                Grade = "E";
            } else if (NilaiAkhir >= 50 && NilaiAkhir <= 59) {
                Grade = "D";
            } else if (NilaiAkhir >= 60 && NilaiAkhir <= 69) {
                Grade = "C";
            } else if (NilaiAkhir >= 70 && NilaiAkhir <= 84) {
                Grade = "B";
            } else if (NilaiAkhir >= 85 && NilaiAkhir <= 100) {
                Grade = "A";
            }

            Nilai addNilai = new Nilai(Matkul, Grade, NilaiAkhir);
            nilai.add(addNilai);

            System.out.println("---------------------------------------------");

            System.out.print("  Input Mata Kuliah lain(y/n)? ");
            inputlagi = input.readLine();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("    Nilai Akhir " + Nama);
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < nilai.size(); i++) {
            System.out.println("| " + (i + 1) + ". " + nilai.get(i).getMatkul());
            System.out.println("|    Nilai Akhir : " + nilai.get(i).getNilaiAkhir());
            System.out.println("|    Grade : " + nilai.get(i).getGrade());
            System.out.println("-----------------------------------------------");
        }
    }
}
