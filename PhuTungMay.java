package qlptoto;

import java.util.Date;

public class PhuTungMay extends PhuTung {
    private int soLuong;
    private int giaTien;

    public PhuTungMay(String maPT, String tenPT, String hangSX, String loaiXe, String chatLuong, int soLuong, int giaTien) {
        super(maPT, tenPT, hangSX, loaiXe, chatLuong);
        this.soLuong = soLuong;
        this.giaTien = giaTien;

    }

    public PhuTungMay() {

    }

    public PhuTungMay(String maPT) {
        super(maPT);
    }



    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }


    @Override
    public String toString() {
        return "PhuTungMay{" + "maPT=" + maPT + ", tenPT=" + tenPT + ", hangSX=" + hangSX + ", loaiXe=" + loaiXe + ", chatLuong=" + chatLuong + ",soLuong=" + soLuong + ", giaTien=" + giaTien +  '}';
    }
    public void capNhat(int soLuongMoi, int giaTienMoi) {
        this.soLuong = soLuongMoi;
        this.giaTien = giaTienMoi;
    }
}


