package com.example;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.jboss.logging.Logger;

@ApplicationScoped
public class KafkaConsumerProducer {
    private static final Logger LOG = Logger.getLogger(KafkaConsumerProducer.class);


    @Incoming("input") 
    @Outgoing("output") 
    public String receive(String input) throws InterruptedException {
        LOG.info("Received input="+input);
        return input;
    }

}