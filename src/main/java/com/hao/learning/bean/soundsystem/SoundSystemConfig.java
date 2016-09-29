package com.hao.learning.bean.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhanghao on 9/17/16.
 */

@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
}
