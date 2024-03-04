package com.dopamine.common.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConfigDao {

  void upsertConfig(@Param("group") String group, @Param("key") String key,
      @Param("value") String value);

  String selectConfig(@Param("group") String group, @Param("key") String key);

}
