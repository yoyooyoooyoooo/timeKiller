package com.example.interview.Notes;
/*
1 design pattern
    23 total
        -creational pattern
            singleton / factory / prototype ...
        -structural pattern
            decorator / static / dynamic
        -behavioral pattern
            observer / interpreter / iterator

        singleton: only one object (see exp)

        builder: see exp

        proxy: middle man
            static: 1:1
            dynamic 1:n

 2. reflection
    change code without compile (runtime change)
    make possible for @ modfiy code

 */
public class N6 {
    public static void main(String[] args) {
        N6builderExample b = N6builderExample.builder().setOne(" ").build();
    }


}

class SingletonLazyLoad{ //thread not safe
    private static volatile SingletonLazyLoad instance ;
    //volatile cancel jvm reorder steps
    private SingletonLazyLoad(){}
    public static SingletonLazyLoad getInstance() {
        if (instance == null){
            synchronized (SingletonLazyLoad.class) {
                if (instance == null) instance = new SingletonLazyLoad();
            }
        }
        return instance;
    }
}
class SingletonEagerLoad{
    private static final SingletonEagerLoad instance = new SingletonEagerLoad();
    private SingletonEagerLoad(){}
    public static SingletonEagerLoad getInstance() {
        return instance;
    }
}

