package com.hao.learning.bean.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhanghao on 9/17/16.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

//    @Autowired
//    public void addCd(CompactDisc cd){
//        this.cd = cd;
//    }

    @Override
    public void play() {
        cd.play();
    }
}
