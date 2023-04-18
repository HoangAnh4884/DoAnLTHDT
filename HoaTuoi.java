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

public class HoaTuoi implements Serializable{
    private String maHoa, tenHoa, mauHoa;
    private int soNgayLuuTru, donGia, soLuong;

    public HoaTuoi() {
    }

    public HoaTuoi(String maHoa, String tenHoa, String mauHoa, int soNgayLuuTru, int donGia, int soLuong) {
        this.maHoa = maHoa;
        this.tenHoa = tenHoa;
        this.mauHoa = mauHoa;
        this.soNgayLuuTru = soNgayLuuTru;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHoa() {
        return maHoa;
    }

    public void setMaHoa(String maHoa) {
        this.maHoa = maHoa;
    }

    public String getTenHoa() {
        return tenHoa;
    }

    public void setTenHoa(String tenHoa) {
        this.tenHoa = tenHoa;
    }

    public String getMauHoa() {
        return mauHoa;
    }

    public void setMauHoa(String mauHoa) {
        this.mauHoa = mauHoa;
    }

    public int getSoNgayLuuTru() {
        return soNgayLuuTru;
    }

    public void setSoNgayLuuTru(int soNgayLuuTru) {
        this.soNgayLuuTru = soNgayLuuTru;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public int getTongDonGia() {
        int tongDonGia;
        tongDonGia=donGia*soLuong;
        return tongDonGia;
    }

    Scanner sc = new Scanner(System.in);
    public void NhapHT() {
        System.out.printf("Nhập mã hoa: "); maHoa = sc.nextLine();
        System.out.printf("Nhập tên hoa: "); tenHoa = sc.nextLine();
        System.out.printf("Nhập màu hoa: "); mauHoa = sc.nextLine();
        System.out.printf("Nhập số ngày lưu trữ hoa: "); soNgayLuuTru = sc.nextInt();
        System.out.printf("Nhập đơn giá hoa: "); donGia = sc.nextInt();
        System.out.printf("Nhập số lượng hoa: "); soLuong = sc.nextInt();
    }
    
    public void XuatHT() {
        System.out.printf("\n Mã hoa là: " +getMaHoa());
        System.out.printf("\n Tên hoa là: " +getTenHoa());
        System.out.printf("\n Màu hoa là: " +getMauHoa());
        System.out.printf("\n Số ngày lưu trữ được là: " +getSoNgayLuuTru());
        System.out.printf("\n Giá tiền là: " +getDonGia());
        System.out.printf("\n Số lượng: " +getSoLuong());
        System.out.printf("\n Tổng đơn giá: " +getTongDonGia() +"\n");     
    }
}