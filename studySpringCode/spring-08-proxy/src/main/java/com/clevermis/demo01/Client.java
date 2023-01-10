package com.clevermis.demo01;


public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.seeHouse();
        proxy.rent();
        proxy.hetong();
        proxy.fare();
    }

}
