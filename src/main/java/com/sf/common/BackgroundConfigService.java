package com.sf.common;

import java.util.Date;
import java.util.List;

public interface BackgroundConfigService {
  /**
   * 
   * @param moduleName eg. dbSplitor
   * @param configName eg. user
   * @return configuration value
   */
  List<ConfigurationDO> getConfiguration(String moduleName, String configName);
  
  String getTableSplitShardNameByDate(String tableName,Date recordDate);
  List<String> getTableSplitShards(String tableName);
}
