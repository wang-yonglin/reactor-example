package org.wangyonglin.reactor.mono;

import reactor.core.publisher.Mono;

public class Demo01 {

    public static void main(String[] args) {

        Mono.just("1").subscribe(System.out::println);
    }

}
