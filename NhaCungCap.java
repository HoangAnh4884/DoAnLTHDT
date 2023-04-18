

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


/*
public class NhaCungCap extends Nguoi {
    private String maNCC;
    private ArrayList<NhapKho> nk;
    NhapKho nk01;

    public NhaCungCap() { super(); }

    public NhaCungCap(String maNCC, ArrayList<NhapKho> nk, String hoTen, String diaChi, int SDT, int namSinh, int gioiTinh) {
        super(hoTen, diaChi, SDT, namSinh, gioiTinh);
        this.maNCC = maNCC;
        this.nk= nk;
    }
 
    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public ArrayList<NhapKho> getNk() {
        return nk;
    }

    public void setNk(ArrayList<NhapKho> xk) {
        this.nk = xk;
    }

    public NhapKho getNk01() {
        return nk01;
    }

    public void setNk01(NhapKho nk01) {
        this.nk01 = nk01;
    }

    Scanner sc = new Scanner(System.in);
    
    public void nhapDSNK() {
        System.out.println("Nhập số đơn nhập kho cần thêm: ");
        int x = sc.nextInt();
        nk = new ArrayList<>();
        for(int i=0; i<x; i++) {
            nk01.NhapNK();
            nk.add(nk01);
        }
    }
    
    public void xuatDSNK() {
        for(NhapKho x: nk) { x.XuatNK(); }
    }
    
    @Override
    public void Nhap() {
        System.out.printf("Nhập mã nhà cung cấp: "); maNCC = sc.nextLine();
        super.Nhap();
        nhapDSNK();
    }
    
    @Override
    public void Xuat() {
        System.out.printf("\n Mã nhà cung cấp là: " +getMaNCC());
        super.Xuat();
        xuatDSNK();
    }
    
    public void XuatThongTinNCC() {
        System.out.printf("\n Mã nhà cung cấp là: " +getMaNCC());
        super.Xuat();
    }
}

*/