/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanlthdt;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        HoaChau hChau = new HoaChau();
        HoaChiet hChiet = new HoaChiet();
        NhapKho nK = new NhapKho();
        XuatKho xK = new XuatKho();
    
    int Chon;
    do {
        ql.menuChinh();
        System.out.println("Chọn chức năng: ");
        Chon=sc.nextInt();     
        
        switch(Chon) {
            case 0: System.out.println("Kết thúc chương trình"); break;
            case 11: { ql.themDSHoaTuoi(hChau);       break; }
            case 12: { ql.XuatDSHoaChau();              break; }
            case 21: { ql.themDSHoaTuoi(hChiet);      break; }
            case 22: { ql.XuatDSHoaChiet();             break; }
            case 31: { ql.themDSXuatKho(xK);          break; }
            case 32: { ql.XuatDSXuatKho();              break; }
            case 41: { ql.themDSNhapKho(nK);          break; }
            case 42: { ql.XuatDSNhapKho();              break; }
            case 5: { ql.SuaDoi();                      break; } 
            case 6: { 
                String fileName;
                System.out.println("Nhập tên file muốn lưu: ");
                sc.nextLine();
                fileName=sc.nextLine(); 
                ql.ghiFile(fileName);      
                break; }
            case 7: { 
                String fileName;
                System.out.println("Nhập tên file muốn đọc: ");
                sc.nextLine();
                fileName=sc.nextLine();
                ql.docFile(fileName);      
                break; }
            default: System.out.println("\nKhông có lựa chọn này\n"); break;       
        }
    }while(Chon!=0);
        System.out.println("\n\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}
