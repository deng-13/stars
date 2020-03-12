package com.star.design.patterns.structures.adapter.others;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-12
 * @author： xingxingzhao
 */
public class Mp4Player implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {

  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: "+ fileName);

  }
}
