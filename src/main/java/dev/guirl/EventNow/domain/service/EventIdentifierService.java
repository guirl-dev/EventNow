package dev.guirl.EventNow.domain.service;

import dev.guirl.EventNow.domain.model.event.EventModel;

import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class EventIdentifierService {

    private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("MMdd");

    public String generate(EventModel eventModel) {

        String nameChar = eventModel.eventName().substring(0, 1).toUpperCase();
        String randonChar1 = randomUpperLetter();
        String descChar = eventModel.eventDescription().substring(0, 1).toUpperCase();
        String randonChar2 = randomUpperLetter();

        String datePart = eventModel.eventInitialDate().toLocalDate().format(DATE_FMT);
        String uuidPart = UUID.randomUUID().toString().replace("-", "").substring(0, 8);

        return String.format("%s%s%s%s%s-%s", nameChar, randonChar1, descChar, randonChar2, datePart, uuidPart);
    }

    private String randomUpperLetter() {
        int random = ThreadLocalRandom.current().nextInt(0, 26);
        char randomChar = (char) ('A' + random);
        return String.valueOf(randomChar);
    }
}




