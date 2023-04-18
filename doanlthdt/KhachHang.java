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
public class KhachHang extends Nguoi {
    private String maKH;
    private ArrayList<XuatKho> xk;
    XuatKho xk01;

    public KhachHang() { super(); }

    public KhachHang(String maKH, ArrayList<XuatKho> xk, XuatKho xk01, String hoTen, String diaChi, int SDT, int namSinh, int gioiTinh) {
        super(hoTen, diaChi, SDT, namSinh, gioiTinh);
        this.maKH = maKH;
        this.xk = xk;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public ArrayList<XuatKho> getXk() {
        return xk;
    }

    public void setXk(ArrayList<XuatKho> xk) {
        this.xk = xk;
    }

    public XuatKho getXk01() {
        return xk01;
    }

    public void setXk01(XuatKho xk01) {
        this.xk01 = xk01;
    }

    Scanner sc = new Scanner(System.in);
    
    public void nhapDSXK() {
        System.out.println("Nhập số đơn xuất kho cần thêm: ");
        int x = sc.nextInt();
        xk = new ArrayList<>();
        for(int i=0; i<x; i++) {
            xk01 = new XuatKho();
            xk01.NhapXK();
            xk.add(xk01);
        }
    }
    
    public void xuatDSXK() {
        for(XuatKho x: xk) { x.XuatXK(); }
    }
    
    @Override
    public void Nhap() {
        System.out.printf("Nhập mã khách hàng: "); maKH = sc.nextLine();
        super.Nhap();
        nhapDSXK();
    }
    
    @Override
    public void Xuat() {
        System.out.printf("\n Mã khách hàng là: " +getMaKH());
        super.Xuat();
    }
    
    public void XuatThongTinKH() {
        System.out.printf("\n Mã nhà cung cấp là: " +getMaKH());
        super.Xuat();
    }
}

*/