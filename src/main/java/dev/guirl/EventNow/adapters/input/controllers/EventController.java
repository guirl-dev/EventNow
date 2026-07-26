package dev.guirl.EventNow.adapters.input.controllers;

import dev.guirl.EventNow.adapters.input.controllers.dto.request.CreateEventRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    @PostMapping("create")
    public String createEvent(@RequestBody CreateEventRequestDTO  createEventRequestDTO) {
        return "Created Event";
    }
}
