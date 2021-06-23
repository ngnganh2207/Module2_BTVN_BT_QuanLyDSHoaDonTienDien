package quanlyhoadontiendien;

import java.util.Comparator;

public class SortKhachHang implements Comparator<KhachHang> {
    @Override
    public int compare(KhachHang o1, KhachHang o2) {
        return o1.getMaKhachHang().compareTo(o2.getMaKhachHang());
    }
}
