package com.yama.dto;

public class JobEntryFormDto {
  private String maNV;
  private String hoTen;
  private String gioiTinh;
  private int capBac;
  private String maVL;
  private int soNgayCong;
  private int tongTien;

  public JobEntryFormDto() {}

  public JobEntryFormDto(String maNV, String hoTen, String gioiTinh, int capBac, String maVL, int soNgayCong, int tongTien) {
    this.maNV = maNV;
    this.hoTen = hoTen;
    this.gioiTinh = gioiTinh;
    this.capBac = capBac;
    this.maVL = maVL;
    this.soNgayCong = soNgayCong;
    this.tongTien = tongTien;
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

  public String getMaVL() {
    return maVL;
  }

  public void setMaVL(String maVL) {
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
    return "JobEntryFormDto{" +
            "maNV='" + maNV + '\'' +
            ", hoTen='" + hoTen + '\'' +
            ", gioiTinh='" + gioiTinh + '\'' +
            ", capBac=" + capBac +
            ", maVL='" + maVL + '\'' +
            ", soNgayCong=" + soNgayCong +
            ", tongTien=" + tongTien +
            '}';
  }
}
