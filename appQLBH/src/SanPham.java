public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;

    public SanPham(String maSP, String tenSP, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public String getMaSP(){
        return maSP;
    }
    public String getTenSP(){
        return tenSP;
    }
    public double getDonGia(){
        return donGia;
    }

    public String toString(){
        return maSP + " - " + tenSP + " - " + donGia + "đ";
    }
}
