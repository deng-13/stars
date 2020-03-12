package com.star.design.patterns.creates.builder.base;

import java.util.ArrayList;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-01-12
 * @author： xingxingzhao
 */
public abstract class CarModel {

  private ArrayList<String> sequence = new ArrayList();

  protected abstract void start();

  protected abstract void stop();

  protected abstract void alarm();

  protected abstract void engineBoom();

  public final void run() {

    for (int i = 0; i < sequence.size(); i++) {
      String actionName = sequence.get(i);
      if (Objects.equals("start", actionName)) {
        this.start();
      } else if (Objects.equals("stop", actionName)) {
        this.stop();
      } else if (Objects.equals("alarm", actionName)) {
        this.alarm();
      } else {
        this.engineBoom();
      }
    }
  }

  public final void setSequence(ArrayList sequence) {
    this.sequence = sequence;
  }
}
