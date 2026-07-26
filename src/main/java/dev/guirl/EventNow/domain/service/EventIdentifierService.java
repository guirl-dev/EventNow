package dev.guirl.EventNow.domain.service;

import java.util.UUID;

public class EventIdentifierService {

    public String generate(String source) {

        return UUID.randomUUID().toString().concat(source.substring(0, 2).toUpperCase());

    }
}




