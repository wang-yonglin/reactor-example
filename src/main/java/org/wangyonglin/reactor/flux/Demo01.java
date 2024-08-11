package org.wangyonglin.reactor.flux;

import reactor.core.publisher.Flux;

public class Demo01 {

    public static void main(String[] args) {

        Flux.just("1", "2", "3").subscribe(System.out::println);
    }

}
