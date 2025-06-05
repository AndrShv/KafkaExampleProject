package org.example.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class UserRegisteredEvent {
    private String userId;
    private String email;

    public UserRegisteredEvent() {}

    public UserRegisteredEvent(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }
    }
