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
public class HoaChiet extends HoaTuoi {
    private ArrayList<HoaTuoi> hoaChiet;
    HoaTuoi hoaChiet01;

    public HoaChiet() { super(); }

    public HoaChiet(ArrayList<HoaTuoi> hoaChiet, String maHoa, String tenHoa, String mauHoa, int soNgayLuuTru, int donGia, int soLuong) {
        super(maHoa, tenHoa, mauHoa, soNgayLuuTru, donGia, soLuong);
        this.hoaChiet = hoaChiet;
    }

    public ArrayList<HoaTuoi> getHoaChiet() {
        return hoaChiet;
    }

    public void setHoaChiec(ArrayList<HoaTuoi> hoaChiet) {
        this.hoaChiet = hoaChiet;
    }

    public HoaTuoi getHoaChiet01() {
        return hoaChiet01;
    }

    public void setHoaChiet01(HoaTuoi hoaChiet01) {
        this.hoaChiet01 = hoaChiet01;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void nhapDSHoaChiet() {
        System.out.println("Nhập số hoa chiết tươi cần thêm: ");
        int x = sc.nextInt();
        hoaChiet = new ArrayList<>();
        for(int i=0; i<x; i++) {
            hoaChiet01.NhapHT();
            hoaChiet.add(hoaChiet01);
        }
    }
    
    public void xuatDSHoaChiet() {
        for(HoaTuoi x: hoaChiet) { x.XuatHT(); }
    }
    
    @Override
    public void NhapHT() {
        super.NhapHT();
        nhapDSHoaChiet();
    }
    
    @Override
    public void XuatHT() {
        super.XuatHT();
    }
    
    public void XuatThongTinHoaChiet() {
        super.XuatHT();
    }
}
