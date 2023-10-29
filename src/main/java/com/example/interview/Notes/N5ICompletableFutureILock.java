package com.example.interview.Notes;

public class N5ICompletableFutureILock {
    /*

        CompletableFuture:
            sync need wait
            async no wait. old sht booking
            CompletableFuture<Void> name = CompletableFuture.runAsync(()->{
            try {
            }catch (Exception e){            }
        });  ------------------//can be chained after   .exceptionally()||.handle()for e

     lock:
            parallel : thread no crossing resource
            concurrent: they DO
                use keyword: synchronized (lock object) , static + synchronized(lock class) ,  violate
                                public void run(){
                                    synchronized(fieldname){
                                    somthing;}
                                    }
                wait() and notify()/notifyAll()
                or interfaces : ReentrantLock
            fair lock : all get chance long waiting time access (ReentrantLock)
            unfairlock: compete

     */
    public static void test() {

    }




}
