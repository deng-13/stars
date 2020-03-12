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
public class Director {

  private ArrayList<String> sequence = new ArrayList<>();
  private BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
  private BaomCarBuilder baomCarBuilder = new BaomCarBuilder();

  public BenzCarModel getBenzAModel(){

    this.sequence.clear();

    this.sequence.add("start");
    this.sequence.add("alarm");
    this.sequence.add("stop");

    this.benzCarBuilder.setSequence(sequence);
    return (BenzCarModel)this.benzCarBuilder.getCarModel();
  }

  public BenzCarModel getBenzBModel(){

    this.sequence.clear();

    this.sequence.add("start");
    this.sequence.add("stop");
    this.sequence.add("alarm");

    this.benzCarBuilder.setSequence(sequence);
    return (BenzCarModel)this.benzCarBuilder.getCarModel();
  }

  public BaomCarModel getBaomModel(){

    this.sequence.clear();

    this.sequence.add("start");
    this.sequence.add("alarm");
    this.sequence.add("stop");

    this.baomCarBuilder.setSequence(sequence);
    return (BaomCarModel)this.baomCarBuilder.getCarModel();
  }
}
