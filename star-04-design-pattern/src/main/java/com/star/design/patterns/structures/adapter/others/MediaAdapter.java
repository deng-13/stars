package com.star.design.patterns.structures.adapter.others;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2019-12-12
 * @author： xingxingzhao
 */
public class MediaAdapter implements MediaPlayer{

  private AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType){
    if(audioType.equalsIgnoreCase("vlc") ){
      advancedMediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")){
      advancedMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String fileName) {

    if(audioType.equalsIgnoreCase("vlc")){
      advancedMediaPlayer.playVlc(fileName);
    }else if(audioType.equalsIgnoreCase("mp4")){
      advancedMediaPlayer.playMp4(fileName);
    }

  }
}
