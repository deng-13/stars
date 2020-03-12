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
public class BenzCarBuilder extends CarBuilder {

  private BenzCarModel benzCarModel = new BenzCarModel();

  @Override
  public void setSequence(ArrayList sequence) {
    this.benzCarModel.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.benzCarModel;
  }
}
