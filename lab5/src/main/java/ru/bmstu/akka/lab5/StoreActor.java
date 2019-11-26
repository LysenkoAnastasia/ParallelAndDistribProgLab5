package ru.bmstu.akka.lab5;

import akka.actor.AbstractActor;

import java.util.HashMap;

public class StoreActor extends AbstractActor {

    private HashMap<TestURL, Integer> storage;


    public StoreActor() {
        this.storage = new HashMap<>();
    }


    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(ResultURL.class,this::result)
                .match(TestURL.class,this::getTest)
                .build();
    }

    private void result(ResultURL resultURL) {

    }

    private void getTest(TestURL testURL) {

    }

}
