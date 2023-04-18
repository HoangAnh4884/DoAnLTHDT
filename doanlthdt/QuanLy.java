/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanlthdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class QuanLy {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<HoaTuoi> hoa;
    ArrayList<NhapKho> nk;
    ArrayList<XuatKho> xk;

    public QuanLy() {
        hoa = new ArrayList<>();
        nk = new ArrayList<>();
        xk = new ArrayList<>();
    }
    
    public void themDSHoaTuoi(HoaTuoi a) {
        System.out.println("Nhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Lần nhập thứ " +(i+1)+ ": ");
            if(a instanceof HoaChau) {
                a=new HoaChau();
                a.NhapHT();
            } else if (a instanceof HoaChiet) {
                a=new HoaChiet();
                a.NhapHT();
            }
            hoa.add(a);
        }
    }
    
    public void themDSNhapKho(NhapKho a) {
        System.out.println("Nhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Lần nhập thứ " +(i+1)+ ": ");
                a=new NhapKho();
                a.NhapNK(); 
            nk.add(a);
        }
    }
    
    public void themDSXuatKho(XuatKho a) {
        System.out.println("Nhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Lần nhập thứ " +(i+1)+ ": ");
                a=new XuatKho();
                a.NhapXK();
            xk.add(a);
        }
    }
    
    public void XuatDSHoaChau() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(HoaTuoi x: hoa) {
            if(x instanceof HoaChau) {
                x.XuatHT();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void XuatDSHoaChiet() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(HoaTuoi x: hoa) {
            if(x instanceof HoaChiet) {
                x.XuatHT();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void XuatDSNhapKho() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(NhapKho x: nk) {
            if(x instanceof NhapKho) {
                x.XuatNK();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void XuatDSXuatKho() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(XuatKho x: xk) {
            if(x instanceof XuatKho) {
                x.XuatXK();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
    
    public void SuaDoi() {
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
    
    public void ghiFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(hoa);
            objOut.writeObject(nk);
            objOut.writeObject(xk);
            objOut.close();
            fileOut.close();
            System.out.println("Lưu file thành công, tên file là: " +fileName);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void docFile(String fileName) {
        try {
            hoa = new ArrayList<>();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin);
            hoa = (ArrayList) fout.readObject();
            XuatDSHoaChau();
            XuatDSHoaChiet();
            XuatDSNhapKho();
            XuatDSXuatKho();
            fin.close();
            fout.close();
        } catch(FileNotFoundException e) {
            System.out.println("\n Không tìm thấy file \n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void menuChinh() {
        System.out.println("________Chương Trình Quản Lý Kho Hoa Tươi________");
        System.out.println("0: Kết thúc chương trình");
        System.out.println("11: Nhập danh sách hoa chậu");
        System.out.println("\t12: Xuất danh sách hoa chậu");
        System.out.println("21: Nhập danh sách hoa chiết");
        System.out.println("\t22: Xuất danh sách hoa chiết");
        System.out.println("31: Nhập xuất kho");
        System.out.println("\t32: Xuất xuất kho");
        System.out.println("41: Nhập nhập kho");
        System.out.println("\t42: Xuất nhập kho");
        System.out.println("5: Chỉnh sửa thông tin");
        System.out.println("6: Lưu file");
        System.out.println("7: Đọc file đã lưu");
    }
}