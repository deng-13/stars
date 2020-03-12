package com.star.design.patterns.behavirous.strategy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 业务信息变更 日志注解
 * </p>
 *
 * @created： 2019-10-29
 * @author： xingxingzhao
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ChangeLog {

  /**
   * 变更策略定义的 类的路径
   */
  String classPath() default "";

  /**
   * 变更策略定义的 类名
   */
  String className() default "";

  /**
   * 变更策略 传入参数的 类型，默认的类型为 paramIsId，object 若参数不确定的时候，可以传入自定义的参数，进行区分
   */
  String paramType() default "paramIsId";
}
