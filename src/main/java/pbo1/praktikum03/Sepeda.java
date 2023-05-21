package pbo1.praktikum03;


public class Sepeda {
    String merk;
    String warna;
    Double harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                "Warna \t: "+warna+"\n"+
                "Harga \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
   
    
}
