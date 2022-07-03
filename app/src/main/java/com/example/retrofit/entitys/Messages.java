package com.example.retrofit.entitys;

public class Messages {
    private int id;
    private String name;
    private int code;
    private String fullName;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
