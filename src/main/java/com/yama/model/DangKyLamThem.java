package com.yama.model;

public class DangKyLamThem {
  private String maDK;
  private String maNV;
  private String hoTen;
  private String gioiTinh;
  private int capBac;
  private ViecLam maVL;
  private int soNgayCong;
  private int tongTien;

  public DangKyLamThem() {}

  public DangKyLamThem(String maDK, String maNV, String hoTen, String gioiTinh, int capBac, ViecLam maVL, int soNgayCong, int tongTien) {
    this.maDK = maDK;
    this.maNV = maNV;
    this.hoTen = hoTen;
    this.gioiTinh = gioiTinh;
    this.capBac = capBac;
    this.maVL = maVL;
    this.soNgayCong = soNgayCong;
    this.tongTien = tongTien;
  }

  public String getMaDK() {
    return maDK;
  }

  public void setMaDK(String maDK) {
    this.maDK = maDK;
  }

  public String getMaNV() {
    return maNV;
  }

  public void setMaNV(String maNV) {
    this.maNV = maNV;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

  public int getCapBac() {
    return capBac;
  }

  public void setCapBac(int capBac) {
    this.capBac = capBac;
  }

  public ViecLam getMaVL() {
    return maVL;
  }

  public void setMaVL(ViecLam maVL) {
    this.maVL = maVL;
  }

  public int getSoNgayCong() {
    return soNgayCong;
  }

  public void setSoNgayCong(int soNgayCong) {
    this.soNgayCong = soNgayCong;
  }

  public int getTongTien() {
    return tongTien;
  }

  public void setTongTien(int tongTien) {
    this.tongTien = tongTien;
  }

  @Override
  public String toString() {
    return "DangKyLamThem{" +
            "maDK='" + maDK + '\'' +
            ", maNV='" + maNV + '\'' +
            ", hoTen='" + hoTen + '\'' +
            ", gioiTinh='" + gioiTinh + '\'' +
            ", capBac=" + capBac +
            ", maVL='" + maVL + '\'' +
            ", soNgayCong=" + soNgayCong +
            ", tongTien=" + tongTien +
            '}';
  }
}
