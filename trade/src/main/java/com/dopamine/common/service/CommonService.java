package com.dopamine.common.service;

import com.dopamine.common.dao.ConfigDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommonService {

  private final ConfigDao configDao;

  public String getConfig(String group, String key) {
    return configDao.selectConfig(group, key);
  }

  public void setConfig(String group, String key, String value) {
    setConfig(group, key, value);
  }


}
