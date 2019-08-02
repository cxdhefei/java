package com.cxd.deeplearning.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description TODO
 * @Author chenxudong
 * @Date 2019/7/8 9:25
 */
public class Java8Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list,(o1,o2) -> {
            if (o1 < o2){
                return 1;
            }
            return -1;
        });
        System.out.println(list);

        new Thread(() -> System.out.println("test")).start();

        list.replaceAll(s -> s+10);
        System.out.println(list);


    }
}
