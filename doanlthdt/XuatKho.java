/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanlthdt;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class XuatKho implements Serializable {
    private String maHoa, maKH, ngayXuat, loaiHoa;
    private int maXuat, soLuong, thanhTien;

    public XuatKho() {
    }

    public XuatKho(String maHoa, String maKH, String ngayXuat, int maXuat, String loaiHoa, int soLuong, int thanhTien) {
        this.maHoa = maHoa;
        this.maKH = maKH;
        this.ngayXuat = ngayXuat;
        this.maXuat = maXuat;
        this.loaiHoa = loaiHoa;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getMaHoa() {
        return maHoa;
    }

    public void setMaHoa(String maHoa) {
        this.maHoa = maHoa;
    }
    
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public int getMaXuat() {
        return maXuat;
    }

    public void setMaXuat(int maXuat) {
        this.maXuat = maXuat;
    }

    public String getLoaiHoa() {
        return loaiHoa;
    }
    
    public void setLoaiHoa(String loaiHoa) {
        this.loaiHoa = loaiHoa;
    }
    
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    Scanner sc = new Scanner(System.in);
    public void NhapXK() {
        System.out.printf("Nhập mã xuất kho là: "); maXuat = sc.nextInt();
        System.out.printf("Nhập mã hoa: "); maHoa = sc.nextLine();
        System.out.printf("Nhập mã khách hàng: "); maKH = sc.nextLine();
        System.out.printf("Nhập ngày xuất kho: "); ngayXuat = sc.nextLine();
        System.out.printf("Nhập loại hoa: "); loaiHoa = sc.nextLine();
        System.out.printf("Nhập số lượng xuất: "); soLuong = sc.nextInt();
        System.out.printf("Nhập thành tiền: "); thanhTien = sc.nextInt();
    }
    
    public void XuatXK() {
        System.out.printf("\n Mã xuất kho là: " +getMaXuat());
        System.out.printf("\n Mã hoa là: " +getMaHoa()); 
        System.out.printf("\n Mã khách hàng là: " +getMaKH()); 
        System.out.printf("\n Ngày xuất kho là: " +getNgayXuat());
        System.out.printf("\n Loại hoa là: " +getLoaiHoa()); 
        System.out.printf("\n Số lượng xuất là: " +getSoLuong());
        System.out.printf("\n Thành tiền là: " +getThanhTien());
        System.out.printf("\n Tổng thành tiền là: %s\n", thanhTien*soLuong);
    }
}