package com.example.interview.Notes;
/*
    1.exception  happen -> check exception handler exist in same class -> check exception handler  in @ControllerAdvise
    -> check in @ResponseStatus (handle by ResponseStatusExceptionResolver)  -> default handler
    any step followed by return to user
    2.Validation
        - @NotNull, notblank, Min, Max, Email, Validated
     3.cache
        request come in , check cache, call db, store to cache  /  @enablecache @cacheable
        cache manager:
            eviction policy:
                lru: least recent used     linkedHashMap or (LinkedList + hashmap)
                lfu: least frequent used
                no-eviction: no remove
                random
                most recently used
      4.SQL , H2
          DBMS:  MySQL, postgreSQL, SQL server, oracle. filemaker
          SQL (Structured query language) select*shit
          database normalization:
            1st normal form : each table cell should contain a single value and each record should be unique
            2nd normal form: 1st + single column primary key
            3nd : 2nd + change one record shouldn't need to change other record (no dependence   EX: DoB age)
            avoid using join
       5. No-sql
            document data store: MongoDB couch
            colum family data store : cassandra, Hbase
            key value database: redis,riak
            graph data store: Neo4J, graphdb
            CAP:         cant have a and c at same time
                -consistency:
                - availability
                - partition tolerance
             AP: dynamo, cassandra, couchdb, riak, simpleDB
             CP: MongoDB , bigtable, HBase, redis, hyperbole
        6: difference :
                sql: relational data, predefined schema, vertical scaling (machine power upgrade), ACID

                nosql: no relation, dynamic schema, horizontal scaling(machine number  upgrade))
 */
public class N10IexceptionIvalidationIcacheISQLInoSQL {
    public static void main(String[] args) {

    }
}

