package org.geeklub.hvmediaplayer.widgets.video;

import android.media.MediaPlayer;

/**
 * Created by HelloVass on 16/4/13.
 */
public interface Mediator {

  /**
   * 暂停、播放
   */
  void doPlayPause();

  /**
   * 全屏、退出全屏
   */
  void doExpandShrink();

  /**
   * 当用户拖动 SeekBar 的时候更新当前时间
   *
   * @param progress 当前的进度
   */
  void updateCurrentTimeWhenDragging(int progress);

  /**
   * 当用户停止拖动的时候改变播放的进度
   *
   * @param progress 当前的进度
   */
  void seekToStopTrackingTouchPosition(int progress);

  /**
   * 当播放器在播放的时候更新当前的时间
   *
   * @param progress 当前的进度
   * @param bufferPercentage 缓冲的进度
   */
  void updateCurrentTimeWhenPlaying(int progress, int bufferPercentage);

  void onPrepared(MediaPlayer mp);

  void onCompletion(MediaPlayer mp);

  void onError(MediaPlayer mp, int what, int extra);
}
