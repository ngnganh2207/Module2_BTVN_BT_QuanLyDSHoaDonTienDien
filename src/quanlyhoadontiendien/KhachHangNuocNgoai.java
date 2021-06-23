package quanlyhoadontiendien;

public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuongKW, double donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuongKW, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +
                "quocTich='" + quocTich + '\'' + super.toString()+
                '}';
    }
}
