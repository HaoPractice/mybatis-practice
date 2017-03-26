package com.sf.strategy.mapper;

public interface TableSplitStrategy<SplitBasis> {
  String getTableName(SplitBasis splitBasis,String tableName);
}
