public class MobilSport {
    private String nama;

    public MobilSport (String nama){
        this.nama = nama;
    }
    public void gigi(int g){
        System.out.println(this.nama + "Mobil Masuk Gigi ke-" + g);
    }

    public void gigi(int g, int t){
        System.out.println(this.nama + "Mobil Masuk Gigi ke-" + g + "Dengan Turbo" + t);
    }
}