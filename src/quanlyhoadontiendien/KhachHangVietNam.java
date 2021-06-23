package quanlyhoadontiendien;

public class KhachHangVietNam extends KhachHang{
    private double dinhMuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuongKW, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuongKW, donGia);
        this.dinhMuc = dinhMuc;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +
                "dinhMuc=" + dinhMuc + super.toString()+
                '}';
    }
}
