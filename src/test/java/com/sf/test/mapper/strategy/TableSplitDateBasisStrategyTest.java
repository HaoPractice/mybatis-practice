package com.sf.test.mapper.strategy;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sf.common.dao.strategy.TableSplitStrategy;
import com.sf.test.AbstractBaseTestCase;

public class TableSplitDateBasisStrategyTest extends AbstractBaseTestCase {
  @Autowired
  TableSplitStrategy<Date> tableSplitStrategy;
  @Test
  public void test() throws ParseException {
    
    System.out.println(tableSplitStrategy.getTargetTableName(new Date(), "user"));
    System.out.println(tableSplitStrategy.getTargetTableName(DateUtils.parseDate("20160101", "yyyyMMdd"), "user"));
  }

}
