package com.yama.service;

import com.yama.repository.DangKyLamThemRepository;

public class DangKyLamThemService {
  private final DangKyLamThemRepository dangKyLamThemRepository;

  public DangKyLamThemService(DangKyLamThemRepository dangKyLamThemRepository) {
    this.dangKyLamThemRepository = dangKyLamThemRepository;
  }
}
