package com.yama.service;

import com.yama.repository.ViecLamRepository;

public class ViecLamService {
  private final ViecLamRepository viecLamRepository;

  public ViecLamService(ViecLamRepository viecLamRepository) {
    this.viecLamRepository = viecLamRepository;
  }
}
