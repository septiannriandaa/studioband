package studio;

import java.util.ArrayList;

public class GetSet {
    String nama,noruangan,tanggalnyewa,jammulai;
    int nohp,lamanyewa,tothar;
    
    public GetSet(String nama,int nohp,String noruangan,int lamanyewa,String tanggalnyewa,String jammulai,int tothar){
        this.nama = nama;
        this.noruangan = noruangan;
        this.tanggalnyewa = tanggalnyewa;
        this.jammulai = jammulai;
        this.nohp = nohp;
        this.lamanyewa = lamanyewa;
        this.tothar = tothar;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNoruangan(String noruangan){
        this.noruangan = noruangan;
    }
    public void setTanggalnyewa(String tanggalnyewa){
        this.tanggalnyewa = tanggalnyewa;
    }
    public void setJammulai(String jammulai){
        this.jammulai = jammulai;
    }
    public void setNohp(int nohp){
        this.nohp = nohp;
    }
    public void setLamanyewa(int lamanyewa){
        this.lamanyewa = lamanyewa;
    }
    public void setTothar(int tothar){
        this.tothar = tothar;
    }
    public String getNama(){
        return nama;
    }
    public String getNoruangan(){
        return noruangan;
    }
    public String getTanggalnyewa(){
        return tanggalnyewa;
    }
    public String getJammulai(){
        return jammulai;
    }
    public int getNohp(){
        return nohp;
    }
    public int getLamanyewa(){
        return lamanyewa;
    }
    public int getTothar(){
        return tothar;
    }
}
