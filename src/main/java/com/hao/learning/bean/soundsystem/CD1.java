package com.hao.learning.bean.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by zhanghao on 9/17/16.
 */

@Component
public class CD1 implements CompactDisc {

    private String title = "QiLiXiang";
    private String artist = "Jielun";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
