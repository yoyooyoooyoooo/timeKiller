package com.example.interview.Notes;

import java.util.concurrent.ExecutorService;

public class N4 {
    /*lazy vs eager loading: lazy  load when needed,   eager load all before run(default)
    stream:intermediate operation   |  terminal operation

    1 lambada -- 频率统计
     Character[] array = new Character[]{'a','a','b'};
     Map<Character,Integer> map = Arrays.stream(array).collect(Collectors.groupingBy(c->c,Collectors.summingInt(e->1)));

    2 multi-threading
        thread vs process
            Thread: independent stack, pc register
            process: independent memory space, stack , heap, os resource
        runnable use run() no ret, callable use call() have return

        Threadpool:
          core thread handle request, queue for no left core. if queue is full , create new thread for NEWEST coming in task,
           if MAX thread created, rejection handler work
                    rejection handler policy:
                            abort: default abort task, throw exception(rejected)
                            CallRun: do task with caller
                            Discard: Discard thats it
                            Discard oldest: new into queue fuck the first come
                    predefined Thread pool(popular):
                             just defined ur own shit plz

    */
     public static void test() {

     }
}
