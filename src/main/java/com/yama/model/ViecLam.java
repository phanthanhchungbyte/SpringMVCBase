package com.yama.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

public class ViecLam {
  private String maVL;
  private String moTa;
  private String duAn;
  private String ngonNgu;
  private LocalDate ngayBD;
  private LocalDate ngayKT;
  private int tongNgayCong;
  private String trangThai;

  public ViecLam() {
  }

  public ViecLam(String maVL, String moTa, String duAn, String ngonNgu, LocalDate ngayBD, LocalDate ngayKT, int tongNgayCong, String trangThai) {
    this.maVL = maVL;
    this.moTa = moTa;
    this.duAn = duAn;
    this.ngonNgu = ngonNgu;
    this.ngayBD = ngayBD;
    this.ngayKT = ngayKT;
    this.tongNgayCong = tongNgayCong;
    this.trangThai = trangThai;
  }

  public String getMaVL() {
    return maVL;
  }

  public void setMaVL(String maVL) {
    this.maVL = maVL;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }

  public String getDuAn() {
    return duAn;
  }

  public void setDuAn(String duAn) {
    this.duAn = duAn;
  }

  public String getNgonNgu() {
    return ngonNgu;
  }

  public void setNgonNgu(String ngonNgu) {
    this.ngonNgu = ngonNgu;
  }

  public LocalDate getNgayBD() {
    return ngayBD;
  }

  public void setNgayBD(LocalDate ngayBD) {
    this.ngayBD = ngayBD;
  }

  public LocalDate getNgayKT() {
    return ngayKT;
  }

  public void setNgayKT(LocalDate ngayKT) {
    this.ngayKT = ngayKT;
  }

  public int getTongNgayCong() {
    return tongNgayCong;
  }

  public void setTongNgayCong(int tongNgayCong) {
    this.tongNgayCong = tongNgayCong;
  }

  public String getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(String trangThai) {
    this.trangThai = trangThai;
  }

  @Override
  public String toString() {
    return "ViecLam{" +
            "maVL='" + maVL + '\'' +
            ", moTa='" + moTa + '\'' +
            ", duAn='" + duAn + '\'' +
            ", ngonNgu='" + ngonNgu + '\'' +
            ", ngayBD=" + ngayBD +
            ", ngayKT=" + ngayKT +
            ", tongNgayCong=" + tongNgayCong +
            ", trangThai='" + trangThai + '\'' +
            '}';
  }
}
