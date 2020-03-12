package com.star.design.patterns.creates.builder.base;

import java.util.ArrayList;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public abstract class CarBuilder {

  public abstract void setSequence(ArrayList sequence);

  public abstract CarModel getCarModel();
}
