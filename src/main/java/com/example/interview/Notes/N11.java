package com.example.interview.Notes;
/*
    JDBC: (low lv thing)
        connect -> statement -> sql query > process sql > close
        sql injection
    2 hibernate:
        object relational mapping
        JPA : java persistence API, specification
        Hib: implementation of JPA

        entity lifecycle
            transient
            persistent
            detached
            removed

            mapping (table)
                1v1   husb - wife
                1vm: person - > account
                mv1   emplyee to manager
                mvm : reader - subscription

             cascade type:
                persist
                merge
                refresh
                remove
                detach
                all

                Fetch type
                1v1   mv1  eager
                 1vm  mvm  lazy

                 first level cache each session
                 2nd level

                 query:
                 criteria q
                 HQL
                 native (defalut database sht)

           spring data jpa / db frame work
 */
public class N11 {
    public static void main(String[] args) {

    }
}

