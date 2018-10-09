package com.mayarafelix.thehive;

/**
 * Created by mayca on 10/8/2018.
 */

public enum ItemClickOptions {
    ADD(1, "Add"), REMOVE(2, "Remove");

    private int code;
    private String name;

    ItemClickOptions(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getName(int code) {
        for (ItemClickOptions  option : ItemClickOptions.values()) {
            if(option.getCode() == code)
                return option.getName();
        }
        return null;
    }
}
