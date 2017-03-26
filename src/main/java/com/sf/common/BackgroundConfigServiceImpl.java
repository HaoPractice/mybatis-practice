package com.sf.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BackgroundConfigServiceImpl implements BackgroundConfigService {
  
  private Logger logger = LoggerFactory.getLogger(getClass());
  
  @Override
  public List<ConfigurationDO> getConfiguration(String moduleName, String configName) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getTableSplitShardNameByDate(String tableName, Date recordDate) {
    // TODO Auto-generated method stub
    logger.debug(tableName+recordDate);
    DateFormat df = new SimpleDateFormat("yyyy");
    String format = df.format(recordDate);
    return tableName+format;
  }

  @Override
  public List<String> getTableSplitShards(String tableName) {
    // TODO Auto-generated method stub
    return Lists.newArrayList("2006-01-01", "2010-01-01", "2012-01-01", "2014-01-01", "2015-01-01",
        "2016-01-01");
  }
  
  
  
  
}
