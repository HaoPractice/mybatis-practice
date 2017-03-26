/**
 * 
 */
package com.sf.mapper.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.sf.strategy.mapper.TableSplitStrategy;

@Retention(CLASS)
@Target(METHOD)
/**
 * @author hao19
 *
 */
public @interface TableSplit {

  @SuppressWarnings("rawtypes")
  Class<? extends TableSplitStrategy> splitStrategy = TableSplitStrategy.class;
  String paramName = null;
}
