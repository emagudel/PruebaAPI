package com.certificacion.petStore.api.helpers;

public class DTO {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
