package com.thebrodyaga.vkobjects.app.widgets;

public enum ImageType implements EnumParam {


    WIDTH_160_HEIGHT_160("160x160"),


    WIDTH_160_HEIGHT_240("160x240"),


    WIDTH_24_HEIGHT_24("24x24"),


    WIDTH_510_HEIGHT_128("510x128"),


    WIDTH_50_HEIGHT_50("50x50");

    private String value;

    ImageType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }
}
