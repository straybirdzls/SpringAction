package com.hao.learning.bean.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zhanghao on 9/17/16.
 */

@Configuration
//@Profile("dev")
public class CDConfig {

    @Bean
    @Conditional(CDCondition.class)
    public CompactDisc compactDisc(){
        return new CD1();
    }
}
