/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doanlthdt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class DoAnLTHDT {
  
// !!! Class này chỉ dùng để code thử !!!

/*  
Xuất thông tin hoa theo maHoa (không phải xuất hết)
Xuất kho thì trừ số lượng trong kho (không đủ thì báo lỗi)
*/

    Scanner sc = new Scanner(System.in);
    
    
    public void menuXuat() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("0: Kết thúc");
        System.out.println("1: Xuất thông tin hoa chậu");
        System.out.println("2: Xuất thông tin hoa chiết");
        System.out.println("3: Xuất xuất kho");
        System.out.println("4: Xuất nhập kho");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Chọn chức năng: "); 
    }
    
    public void SuaDoi() {
        int n;
        do {
            menuXuat();
            System.out.println("Chọn ");
            n=sc.nextInt();
            switch(n) {
                case 0: System.out.println("Kết thúc"); break;
                case 1: {
                    String maHoa;
                    System.out.println("Nhập mã hoa chậu cần xuất thông tin: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();
                    // Xuất thông tin theo maHoa...??
                    break;
                }
                case 2: {
                    String maHoa;
                    System.out.println("Nhập mã hoa chiết cần xuất thông tin: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();

                    break;
                }
                case 3: {
                    String maHoa;
                    System.out.println("Nhập mã hoa cần xuất kho: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();

                    break;
                }
                case 4: {
                    String maHoa;
                    System.out.println("Nhập mã hoa cần xuất nhập: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();

                    break;
                }
                default: 
                    System.out.println("\nXin lỗi, Không có lựa chọn này\n"); 
                    break;
            }
        } while(n!=0);
    }
    
    
    
    
// Sửa 1 private thôi, không phải sửa hết!!!   
        
    ArrayList<HoaTuoi> hoa;
    ArrayList<NhapKho> nk;
    ArrayList<XuatKho> xk;

    public DoAnLTHDT() {
        hoa = new ArrayList<>();
        nk = new ArrayList<>();
        xk = new ArrayList<>();
    }
    
    public void menuSuaDoi() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("0: Kết thúc");
        System.out.println("11: Sửa thông tin hoa chậu");
        System.out.println("10: Xóa hoa chậu");
        System.out.println("21: Sửa thông tin hoa chiết");
        System.out.println("20: Xóa hoa chiết");
        System.out.println("31: Sửa xuất kho");
        System.out.println("30: Xóa xuất kho");
        System.out.println("41: Sửa nhập kho");
        System.out.println("40: Xóa nhập kho");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Chọn chức năng: "); 
    }
    
    public void SuaXoa() {
        int n;
        do {
            menuSuaDoi();
            System.out.println("Chọn ");
            n=sc.nextInt();
            switch(n) {
                case 0: System.out.println("Kết thúc sửa đổi"); break;
                case 11: {
                    String maHoa;
                    System.out.println("Nhập mã hoa chậu cần sửa: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();
                    suaHoaChau(maHoa);
                    break;
                }
                case 10: {
                    String maHoa;
                    System.out.println("Nhập mã hoa chậu cần xóa: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();
                    xoaHoaChau(maHoa);
                    break;
                }
                case 21: {
                    String maHoa;
                    System.out.println("Nhập mã hoa chiết cần sửa: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();
                    suaHoaChiet(maHoa);
                    break;
                }
                case 20: {
                    String maHoa;
                    System.out.println("Nhập mã hoa chiết cần xóa: ");
                    sc.nextLine();
                    maHoa=sc.nextLine();
                    xoaHoaChau(maHoa);
                    break;
                }
                case 31: {
                    String maXuat;
                    System.out.println("Nhập mã xuất kho cần sửa: ");
                    sc.nextLine();
                    maXuat=sc.nextLine();
                    suaXuatKho(maXuat);
                    break;
                }
                case 30: {
                    String maXuat;
                    System.out.println("Nhập mã xuất kho cần xóa: ");
                    sc.nextLine();
                    maXuat=sc.nextLine();
                    xoaXuatKho(maXuat);
                    break;
                }
                case 41: {
                    String maNhap;
                    System.out.println("Nhập mã nhập kho cần sửa: ");
                    sc.nextLine();
                    maNhap=sc.nextLine();
                    suaNhapKho(maNhap);
                    break;
                }
                case 40: {
                    String maNhap;
                    System.out.println("Nhập mã nhập kho cần xóa: ");
                    sc.nextLine();
                    maNhap=sc.nextLine();
                    xoaNhapKho(maNhap);
                    break;
                }
                default: 
                    System.out.println("\nXin lỗi, Không có lựa chọn này\n"); 
                    break;
            }
        } while(n!=0);
    }

    public void suaHoaChau(String maHoa) {
        for(HoaTuoi x: hoa) {
            if(x instanceof HoaChau) {
                if(((HoaChau)x).getMaHoa().compareTo(maHoa)==0) {
                    x.NhapHT();
                }
            }
        }
    }
    
    public void xoaHoaChau(String maHoa) {
        for(HoaTuoi x: hoa) {
            if(x instanceof HoaChau) {
                if(((HoaChau)x).getMaHoa().compareTo(maHoa)==0) {
                    hoa.remove(x);
                }
            }
        }
    }
    
    public void suaHoaChiet(String maHoa) {
        for(HoaTuoi x: hoa) {
            if(x instanceof HoaChiet) {
                if(((HoaChiet)x).getMaHoa().compareTo(maHoa)==0) {
                    x.NhapHT();
                }
            }
        }
    }
    
    public void xoaHoaChiet(String maHoa) {
        for(HoaTuoi x: hoa) {
            if(x instanceof HoaChiet) {
                if(((HoaChiet)x).getMaHoa().compareTo(maHoa)==0) {
                    hoa.remove(x);
                }
            }
        }
    }
    
    public void suaXuatKho(String maXuat) {
        for(XuatKho x: xk) {
            if(x instanceof XuatKho) {
                x.NhapXK();
            }
        }
    }
    
    public void xoaXuatKho(String maXuat) {
        for(XuatKho x: xk) {
            if(x instanceof XuatKho) {
                xk.remove(x);
            }
        }
    }
    
    public void suaNhapKho(String maNhap) {
        for(NhapKho x: nk) {
            if(x instanceof NhapKho) {
                x.NhapNK();
            }
        }
    }
    
    public void xoaNhapKho(String maNhap) {
        for(NhapKho x: nk) {
            if(x instanceof NhapKho) {
                nk.remove(x);
            }
        }
    }
}