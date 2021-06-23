package quanlyhoadontiendien;

public class KhachHang {
    private String maKhachHang;
    private String hoTen;
    private String ngayRaHoaDon;
    private double soLuongKW;
    private double donGia;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuongKW, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuongKW = soLuongKW;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuongKW() {
        return soLuongKW;
    }

    public void setSoLuongKW(double soLuongKW) {
        this.soLuongKW = soLuongKW;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return " : + Thông tin chung của KhachHang { " +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuongKW=" + soLuongKW +
                ", donGia=" + donGia +
                '}';
    }
}
