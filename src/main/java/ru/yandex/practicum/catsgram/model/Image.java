package ru.yandex.practicum.catsgram.model;

import lombok.*;

@Data
@EqualsAndHashCode(of = "id")
public class Image {
    private Long id;
    private Post postId;
    private String fileName;
    private String filePath;
}
