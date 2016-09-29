package com.hao.learning.bean.soundsystem;

import org.springframework.context.annotation.*;

/**
 * Created by zhanghao on 9/17/16.
 */

@Configuration
//@ComponentScan
//@Import(CDConfig.class)
public class CDPlayerConfig {

//    @Bean
//    public CompactDisc cd(){
//        return new CD1();
//    }

//    @Bean
//    public CDPlayer cdPlayer(){
//        return new CDPlayer(cd());
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
