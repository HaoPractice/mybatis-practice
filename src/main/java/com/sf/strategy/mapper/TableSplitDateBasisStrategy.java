package com.sf.strategy.mapper;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sf.common.BackgroundConfigService;

@Component
public class TableSplitDateBasisStrategy implements TableSplitStrategy<Date> {
  
//  private static final String TABLE_SPLIT = "tableSplit";
  
  @Autowired
  BackgroundConfigService backgroundConfigService;
  
  @Override
  public String getTableName(Date splitBasis,String tableName) {
    String tableSplitShardNameByDate = backgroundConfigService.getTableSplitShardNameByDate(tableName, splitBasis);
    return tableSplitShardNameByDate;
  }
  
}
