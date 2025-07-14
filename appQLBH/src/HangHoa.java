public class HangHoa {
    private String maHangHoa;
    private String tenHangHoa;
    private double donGia;

    public HangHoa(String maHH, String tenHH, double donGia) {
        this.maHangHoa = maHH;
        this.tenHangHoa = tenHH;
        this.donGia = donGia;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }
}