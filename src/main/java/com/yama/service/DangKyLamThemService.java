package com.yama.service;

import com.yama.dto.JobEntryFormDto;
import com.yama.model.DangKyLamThem;
import com.yama.repository.DangKyLamThemRepository;
import com.yama.repository.ViecLamRepository;

public class DangKyLamThemService {
  private final DangKyLamThemRepository dangKyLamThemRepository;
  private final ViecLamRepository viecLamRepository;

  public DangKyLamThemService(DangKyLamThemRepository dangKyLamThemRepository, ViecLamRepository viecLamRepository) {
    this.dangKyLamThemRepository = dangKyLamThemRepository;
    this.viecLamRepository = viecLamRepository;
  }

  public void save(JobEntryFormDto entryForm) {
    DangKyLamThem obj = convertToObj(entryForm);
    dangKyLamThemRepository.save(obj);
  }

  public DangKyLamThem convertToObj(JobEntryFormDto entryForm) {
    DangKyLamThem obj = new DangKyLamThem();
    obj.setMaNV(entryForm.getMaNV());
    obj.setHoTen(entryForm.getHoTen());
    obj.setGioiTinh(entryForm.getGioiTinh());
    obj.setCapBac(entryForm.getCapBac());
    obj.setMaVL(viecLamRepository.findById(entryForm.getMaVL()).orElse(null));
    obj.setSoNgayCong(entryForm.getSoNgayCong());
    obj.setTongTien(entryForm.getTongTien());

    return obj;
  }
}
