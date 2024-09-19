class Karyawan {
    protected String nama;
    protected String kodekaryawan;

    public Karyawan (String kodekaryawan, String nama) {
        this.kodekaryawan = kodekaryawan;
        this.nama = nama;
    }
        public void absenPagi() { 
            System.out.println(this.nama + ": absen pagi");
        
        }
        public void Kerja() { 
            System.out.println(this.nama + ": sedang bekerja");
        }
        
        public void absenPulang() {
            System.out.println(this.nama + ": absen pulang");
        }
        
        public void getinfo() {
        System.out.println("Kode Karyawan : "+this.kodekaryawan);
        System.out.println("Nama : "+this.nama);
        }

}