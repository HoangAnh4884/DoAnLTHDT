/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanlthdt;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Collections;


/**
 *
 * @author HOME
 */
public class NhapKho implements Serializable {
    private String maHoa, maNCC, ngayNhap;
    private int maNhap, loaiHoa, soLuong, chiPhi;

    public NhapKho() {
    }

    public NhapKho(String maHoa, String maNCC, String ngayNhap, int maNhap, int loaiHoa, int soLuong, int chiPhi) {
        this.maHoa = maHoa;
        this.maNCC = maNCC;
        this.ngayNhap = ngayNhap;
        this.maNhap = maNhap;
        this.loaiHoa = loaiHoa;
        this.soLuong = soLuong;
        this.chiPhi = chiPhi;
    }

    public String getMaHoa() {
        return maHoa;
    }

    public void setMaHoa(String maHoa) {
        this.maHoa = maHoa;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getMaNhap() {
        return maNhap;
    }

    public void setMaNhap(int maNhap) {
        this.maNhap = maNhap;
    }

    public String getLoaiHoa() {
        if(loaiHoa==0) return "Hoa chậu";
        else if(loaiHoa==1) return "Hoa chiết";
        else return null;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    Scanner sc = new Scanner(System.in);
    public void NhapNK() {
        System.out.printf("Nhập mã nhập kho: "); maNhap = sc.nextInt();
        System.out.printf("Nhập mã hoa: "); maHoa = sc.nextLine();
        System.out.printf("Nhập mã nhà cung cấp: "); maNCC = sc.nextLine();
        System.out.printf("Nhập ngày nhập kho: "); ngayNhap = sc.nextLine();
        System.out.printf("Nhập số lượng Nhập: "); soLuong = sc.nextInt();
        System.out.printf("Nhập chi phí: "); chiPhi = sc.nextInt();
    }
    
    public void XuatNK() {
        System.out.printf("\n Mã nhập kho là: " +getMaNhap());
        System.out.printf("\n Mã hoa là: " +getMaHoa());
        System.out.printf("\n Mã nhà cung cấp là: " +getMaNCC());
        System.out.printf("\n Ngày nhập kho là: " +getNgayNhap());
        System.out.printf("\n Số lượng nhập là: " +getSoLuong());
        System.out.printf("\n Chi phí là: " +getChiPhi());
        System.out.printf("\n Tổng chi phí là: %s\n", chiPhi*soLuong);
    }
}