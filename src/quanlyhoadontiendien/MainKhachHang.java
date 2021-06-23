package quanlyhoadontiendien;

import java.util.Scanner;

public class MainKhachHang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Manage manage= new Manage();
        do{
            System.out.println("Menu");
            System.out.println("0. Exit");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Sửa thông tin khách hàng");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Tìm khách hàng theo name");
            System.out.println("5. Tìm khách hàng theo mã KH(Chưa sử dụng dc cách tìm kiếm nhị phân");
            System.out.println("6. Sort Khách hàng");
            System.out.println("7. Tính tiền điện cho từng khách hàng");
            System.out.println("8. Hiện thị thông tin khách hàng");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    manage.addKhachHang();
                    break;
                case 2:
                    manage.changeKH();
                    break;
                case 3:
                    manage.removeKH();
                    break;
                case 4:
                    manage.findKH();
                    break;
                case 5:
                    manage.findKHMaKH();
                    break;
                case 6:
                    manage.sortKhMaKH();
                    break;
                case 7:
                    manage.tinhTienDien();
                    break;
                case 8:
                  for( KhachHang kh: manage.khachHangList){
                      System.out.println(kh);
                  }
                  break;
            }
        }while (true);
    }
}
