package com.example.retrofit.entity;

public class Message {
    private String id;
    private String title;
    private String original_title;
    private String original_title_romanised;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOriginal_title_romanised() {
        return original_title_romanised;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", original_title='" + original_title + '\'' +
                ", original_title_romanised='" + original_title_romanised + '\'' +
                '}';
    }
}
