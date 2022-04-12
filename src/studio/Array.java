/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studio;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Array {
    ArrayList<GetSet> datainput;
    
    public Array(){
    datainput = new ArrayList<GetSet>();
    }
    public void isiData(String nama,int nohp,String noruangan,int lamanyewa,String tanggalnyewa,String jammulai,int tothar){
        datainput.add(new GetSet(nama,nohp,noruangan,lamanyewa,tanggalnyewa,jammulai,tothar));
    }
    public void tampilData(){
        for(GetSet tampil:datainput){
            System.out.println("Nama\t\t\t: "+tampil.getNama()+
                               "\nNo.HP\t\t\t: "+tampil.getNohp()+
                               "\nNo.Ruangan\t\t: "+tampil.getNoruangan()+
                               "\nLama Nyewa\t\t: "+tampil.getLamanyewa()+
                               "\nTanggal Sewa\t\t: "+tampil.getTanggalnyewa()+
                               "\nJam Mulai\t\t: "+tampil.getJammulai()+
                               "\nTotal Harga\t\t: "+tampil.getTothar()+"\n");
        }
    }
    public static void main(String[] args) throws SQLException {
        Array arr = new Array();
        java.sql.Connection kon = (Connection) studio.Koneksi.getConnection();
        java.sql.Statement line_statemen = kon.createStatement();
        java.sql.ResultSet sql= line_statemen.executeQuery("select * from daftarpelanggan");
        while(sql.next()){
            arr.isiData(sql.getString("Nama"),sql.getInt("NoHp"),sql.getString("NoRuangan"),sql.getInt("LamaNyewa"),sql.getString("TanggalSewa"),sql.getString("JamMulaiSewa"),sql.getInt("TotalHarga"));
        }
        arr.tampilData();
    }
}
