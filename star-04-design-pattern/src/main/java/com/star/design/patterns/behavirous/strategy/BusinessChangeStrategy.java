package com.star.design.patterns.behavirous.strategy;

import java.util.Optional;

/**
 * <p>
 * 业务信息更新 日志收集策略
 * </p>
 *
 * @created： 2019-10-29
 * @author： xingxingzhao
 */
public interface BusinessChangeStrategy {

  Optional<Long> getHotelId(Object object, ChangeLog changeLog);
}
