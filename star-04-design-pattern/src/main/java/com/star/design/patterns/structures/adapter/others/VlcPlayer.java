package com.star.design.patterns.structures.adapter.others;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-12
 * @author： xingxingzhao
 */
public class VlcPlayer implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: "+ fileName);

  }

  @Override
  public void playMp4(String fileName) {

  }
}
