package com.icinfo.frk.business.dto;

import com.icinfo.frk.business.model.ChXzqzValid;
import com.icinfo.frk.common.utils.AESEUtil;

public class ChXzqzValidDto extends ChXzqzValid {
  private String enfrwybs;

  public String getEnfrwybs() {
    if(super.getFrwybs()!=null)
      return AESEUtil.encodeCorpid(super.getFrwybs());
    else return null;
  }

  public void setEnfrwybs(String enfrwybs) {
    this.enfrwybs = enfrwybs;
  }
}
