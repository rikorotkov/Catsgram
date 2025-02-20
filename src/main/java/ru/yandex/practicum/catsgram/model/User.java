package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "email")
public class User {
    private Long id;
    private String userName;
    private String email;
    private String password;
    private Instant createdAt;
}
