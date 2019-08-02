package com.cxd.deeplearning.reactor;

import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Optional;

/**
 * @Description TODO
 * @Author chenxudong
 * @Date 2019/7/27 16:15
 */
public class MonoTest {
    public static void main(String[] args) {
        //empty()：创建一个不包含任何元素，只发布结束消息的序列
        Mono.empty().subscribe(System.out::println);
        //just()：可以指定序列中包含的全部元素。创建出来的 Mono序列在发布这些元素之后会自动结束。
        Mono.just("www.baidu.com").subscribe(System.out::println);
        Mono.justOrEmpty(null).subscribe(System.out::println);
        Mono.justOrEmpty("who are you").subscribe(System.out::println);
        Mono.justOrEmpty(Optional.of("who are you")).subscribe(System.out::println);
        Mono.error(new RuntimeException("error")).subscribe(System.out::println, System.err::println);


//        Mono.defer(()->{
//            return Mono.error(new RuntimeException("ERROR"));
//        }).subscribe();

        Mono.fromCallable(()->"9999").subscribe(System.out::println);
        Mono.delay(Duration.ofSeconds(10)).doOnNext(System.out::println).block();
    }
}
