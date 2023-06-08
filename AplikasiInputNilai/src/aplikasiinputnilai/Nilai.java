package aplikasiinputnilai;

public class Nilai {
    private String Matkul, Grade;
    private float NilaiAkhir;

    public Nilai(String Matkul, String Grade, float NilaiAkhir) {
        this.Matkul = Matkul;
        this.Grade = Grade;
        this.NilaiAkhir = NilaiAkhir;
    }

    public String getMatkul() {
        return Matkul;
    }

    public String getGrade() {
        return Grade;
    }

    public float getNilaiAkhir() {
        return NilaiAkhir;
    }

    public void setMatkul(String Matkul) {
        this.Matkul = Matkul;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setNilaiAkhir(int NilaiAkhir) {
        this.NilaiAkhir = NilaiAkhir;
    }
}
