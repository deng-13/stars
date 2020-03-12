package com.star.conc.java9.chapter7.scene7_4;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-09
 * @author： xingxingzhao
 */
public class Event implements Comparable<Event> {

  private final int thread;

  private final int priority;

  public Event(int thread, int priority) {
    this.thread = thread;
    this.priority = priority;
  }

  @Override
  public int compareTo(Event o) {
    if (this.priority > this.getPriority()) {
      return -1;
    } else if (this.priority < this.getPriority()) {
      return 1;
    } else {
      return 0;
    }
  }

  public int getThread() {
    return thread;
  }

  public int getPriority() {
    return priority;
  }
}
