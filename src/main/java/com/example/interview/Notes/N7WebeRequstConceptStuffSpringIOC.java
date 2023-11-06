package com.example.interview.Notes;

import org.springframework.stereotype.Component;

/*

OSI   TCP/IP
osi(old timer)
    open system interconnection
        -application layer       app -> app
        - presentation layer    encryp decrryp
        - session layer           connection between user-server
        - transport                prototypical tcp/ip
        - network                 ip pathing
        -data link                 format data
        - physical                  raw bit
tcp/ip
    application layer     123
    transport           4
    internet            5
    network access   67

http(hypertext transfer protocol)
    - client-server model
    - http request
        header/body
    - http response
        header/body
      - http method
        get, post, put , deleted, patch
      - 100 information
      - 200 success        200 ok, 201 created, 202 accepted 204 no content
      - 300 redirection    301 permanently 307 temporary redirect,
      - 400 client error    400 bad req   401 unauthorized 403 forbidden 404 not found
      - 500 server error   500internal server error

       safe:           safe to server         // get
       idempotent: result always same  // get put delete   (patch depend)
       cacheable:    cacheable              // get

tcp / udp
    tcp
    - send pack and resend missing pack /
            3 way handshake for connection
            4 way handshake for terminate connection
    udp
    - speedy but missing pack/ no handshake

session : server side client info storage
cookie: client side server info storage

java web app architecture
-tomcat/ jboss/ jetty / apache tomEE

Three tier architecture
    - controller/ server / DAO

--------------------------------------------
Spring IOC
    inversion of control:  create bean object manage by ioc container
 */
public class N7WebeRequstConceptStuffSpringIOC {
    public static void main(String[] args) {

    }
}

@Component
class  ComponentExp{
    String s;
    public ComponentExp(String s) {
        this.s=s;
    }
}
