public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String bidangStudi;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String bidangstudi) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.bidangStudi = bidangstudi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setBidangStudi(String bidangStudi) { this.bidangStudi = bidangStudi;}

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getBidangStudi() { return this.bidangStudi;}
}
