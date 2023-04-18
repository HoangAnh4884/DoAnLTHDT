/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanlthdt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class HoaChau extends HoaTuoi{
    private String loaiChau;
    private ArrayList<HoaTuoi> hoaChau;
    HoaTuoi hoaChau01;

    public HoaChau() { super(); }

    public HoaChau(String loaiChau, ArrayList<HoaTuoi> hoaChau, String maHoa, String tenHoa, String mauHoa, int soNgayLuuTru, int donGia, int soLuong) {
        super(maHoa, tenHoa, mauHoa, soNgayLuuTru, donGia, soLuong);
        this.loaiChau = loaiChau;
        this.hoaChau = hoaChau;
    }

    public String getLoaiChau() {
        return loaiChau;
    }

    public void setLoaiChau(String loaiChau) {
        this.loaiChau = loaiChau;
    }

    public ArrayList<HoaTuoi> getHoaChau() {
        return hoaChau;
    }

    public void setHoaChau(ArrayList<HoaTuoi> hoaChau) {
        this.hoaChau = hoaChau;
    }

    public HoaTuoi getHoaChau01() {
        return hoaChau01;
    }

    public void setHoaChau01(HoaTuoi hoaChau01) {
        this.hoaChau01 = hoaChau01;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void nhapDSHoaChau() {
        System.out.println("Nhập số chậu hoa tươi cần thêm: ");
        int x = sc.nextInt();
        hoaChau = new ArrayList<>();
        for(int i=0; i<x; i++) {
            hoaChau01.NhapHT();
            hoaChau.add(hoaChau01);
        }
    } 
    
    public void xuatDSHoaChau() {
        for(HoaTuoi x: hoaChau) { x.XuatHT(); }
    }
    
    @Override
    public void NhapHT() {
        System.out.printf("Nhập loại chậu: "); loaiChau = sc.nextLine();
        super.NhapHT();
    }
    
    @Override
    public void XuatHT() {
        System.out.printf("\n Loại chậu là: " +getLoaiChau());
        super.XuatHT();
    }
    
    public void XuatThongTinHoaChau() {
        System.out.printf("\n Loại chậu là: " +getLoaiChau());
        super.XuatHT();
    }
}
