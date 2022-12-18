package com.project.dm.global.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomUtil {

    Random random = new Random();

    public int random(Long count) {
        return (int)(random.nextLong(count) + 2);
    }

}
