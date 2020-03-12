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
public class BaomCarBuilder extends CarBuilder {

  private BaomCarModel baomCarModel = new BaomCarModel();

  @Override
  public void setSequence(ArrayList sequence) {
    this.baomCarModel.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.baomCarModel;
  }
}
