package quanlyhoadontiendien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<KhachHang> khachHangList= new ArrayList<>();
    Scanner scanner= new Scanner(System.in);
    public void addKhachHang(){
        System.out.println("Chọn loại khách hàng cần thêm");
        System.out.println("1. Khách hàng việt nam");
        System.out.println("2. Khách hàng nước ngoài");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                khachHangList.add(creatKHVN());
                break;
            case 2:
                khachHangList.add(creatKHNN());
                break;
        }
    }
    public KhachHangVietNam creatKHVN(){
        //(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuongKW, double donGia, double dinhMuc)
        System.out.println("Nhập thông tin khách hàng việt nam");
        System.out.println(" Mã Khách Hàng");
        String maKhachHang= scanner.nextLine();
        System.out.println("Họ Tên");
        String hoTen= scanner.nextLine();
        System.out.println("Ngày ra hóa đơn");
        String ngayRaHoaDon= scanner.nextLine();
        System.out.println(" Số lượng KW (double) ");
        double soLuongKW= Double.parseDouble(scanner.nextLine());
        System.out.println("Đơn giá (double)");
        double donGia= Double.parseDouble(scanner.nextLine());
        System.out.println("Định mức (double)");
        double dinhMuc= Double.parseDouble(scanner.nextLine());
        KhachHangVietNam khachHangVN= new KhachHangVietNam(maKhachHang,hoTen,ngayRaHoaDon,soLuongKW,donGia,dinhMuc);
        return khachHangVN;
    }
    public KhachHangNuocNgoai creatKHNN(){
        //(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuongKW, double donGia, String quocTich)
        System.out.println("Nhập thông tin khách hàng Nước Ngoài");
        System.out.println(" Mã Khách Hàng");
        String maKhachHang= scanner.nextLine();
        System.out.println("Họ Tên");
        String hoTen= scanner.nextLine();
        System.out.println("Ngày ra hóa đơn");
        String ngayRaHoaDon= scanner.nextLine();
        System.out.println(" Số lượng KW (double) ");
        double soLuongKW= Double.parseDouble(scanner.nextLine());
        System.out.println("Đơn giá (double)");
        double donGia= Double.parseDouble(scanner.nextLine());
        System.out.println("Quốc Tịch (String)");
        String quocTich= scanner.nextLine();
        KhachHangNuocNgoai khachHangNN= new KhachHangNuocNgoai(maKhachHang,hoTen,ngayRaHoaDon,soLuongKW,donGia,quocTich);
        return khachHangNN;
    }
    public void changeKH(){
        //VN (maKhachHang,hoTen,ngayRaHoaDon,soLuongKW,donGia,dinhMuc)
        System.out.println("Nhập mã khách hàng cần sửa thông tin");
        String maKhachHang= scanner.nextLine();
        for( KhachHang kh: khachHangList){
            if(kh instanceof KhachHangVietNam && kh.getMaKhachHang().equals(maKhachHang)){
                System.out.println(" Mã Khách Hàng");
                String maKhachHang1= scanner.nextLine();
                System.out.println("Họ Tên");
                String hoTen= scanner.nextLine();
                System.out.println("Ngày ra hóa đơn");
                String ngayRaHoaDon= scanner.nextLine();
                System.out.println(" Số lượng KW (double) ");
                double soLuongKW= Double.parseDouble(scanner.nextLine());
                System.out.println("Đơn giá (double)");
                double donGia= Double.parseDouble(scanner.nextLine());
                System.out.println("Định mức (double)");
                double dinhMuc= Double.parseDouble(scanner.nextLine());
                kh.setMaKhachHang(maKhachHang1);
                kh.setHoTen(hoTen);
                kh.setNgayRaHoaDon(ngayRaHoaDon);
                kh.setSoLuongKW(soLuongKW);
                kh.setDonGia(donGia);
                ((KhachHangVietNam) kh).setDinhMuc(dinhMuc);
                break;
            }

            if((kh instanceof KhachHangNuocNgoai) && kh.getMaKhachHang().equals(maKhachHang)){
                //NN (maKhachHang,hoTen,ngayRaHoaDon,soLuongKW,donGia,quocTich)
                System.out.println(" Mã Khách Hàng");
                String maKhachHang2 = scanner.nextLine();
                System.out.println("Họ Tên");
                String hoTen = scanner.nextLine();
                System.out.println("Ngày ra hóa đơn");
                String ngayRaHoaDon = scanner.nextLine();
                System.out.println(" Số lượng KW (double) ");
                double soLuongKW = Double.parseDouble(scanner.nextLine());
                System.out.println("Đơn giá (double)");
                double donGia = Double.parseDouble(scanner.nextLine());
                System.out.println("Quốc Tịch (String)");
                String quocTich = scanner.nextLine();
                kh.setMaKhachHang(maKhachHang2);
                kh.setHoTen(hoTen);
                kh.setNgayRaHoaDon(ngayRaHoaDon);
                kh.setSoLuongKW(soLuongKW);
                kh.setDonGia(donGia);
                ((KhachHangNuocNgoai) kh).setQuocTich(quocTich);
                break;
            }
        }

    }
    public void removeKH(){
        System.out.println("Nhập mã khách hàng cần xóa");
        String maKhacHang= scanner.nextLine();
        for(KhachHang kh: khachHangList){
            if(kh.getMaKhachHang().equals(maKhacHang)){
                khachHangList.remove(kh);
                break;
            }
        }
    }
    public void findKH(){
        System.out.println(" Nhập tên cần tìm kiếm");
        String hoTen= scanner.nextLine();
        for (KhachHang kh: khachHangList){
            if(kh.getHoTen().equals(hoTen)){
                System.out.println(kh);
                break;
            }
        }
    }
    public void findKHMaKH(){
        System.out.println(" Nhập mã cần tìm kiếm");
        String maKH= scanner.nextLine();
        for (KhachHang kh: khachHangList){
            if(kh.getMaKhachHang().equals(maKH)){
                System.out.println(kh);
                break;
            }
        }
    }
    public void sortKhMaKH(){
        SortKhachHang sortKhachHang= new SortKhachHang();
        khachHangList.sort(sortKhachHang);
    }
    public double tinhtienDienKHVN(KhachHangVietNam kh){
        if(kh.getSoLuongKW()<= kh.getDinhMuc()){
            return kh.getSoLuongKW()*kh.getDonGia();
        }else {
            return kh.getSoLuongKW()*kh.getDonGia()*kh.getDinhMuc()+(kh.getSoLuongKW()-kh.getDinhMuc())*kh.getDonGia()*2.5;
        }
    }
    public double tinhtienDienKHNN(KhachHangNuocNgoai kh){
        return kh.getSoLuongKW()*kh.getDonGia();
    }
    public void tinhTienDien(){
        for (KhachHang kh: khachHangList){
            if(kh instanceof KhachHangVietNam){
                System.out.println("Tiền điện Khách hàng mã: "+kh.getMaKhachHang()+" là "+tinhtienDienKHVN((KhachHangVietNam) kh));
            }else {
                System.out.println("Tiền điện Khách hàng mã: "+kh.getMaKhachHang()+" là "+tinhtienDienKHNN((KhachHangNuocNgoai) kh));
            }
        }
    }
}
