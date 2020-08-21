package com.whocraft.whocosmetics;

public enum Modeller {
    END("End Phoenix"),
    VIOLET("Violet"),
    VESPA("Vespa"),
    ANGELA("ItzAngela");

    private final String modellerName;

    Modeller(String modellerName) {
        this.modellerName = modellerName; 
    }

    public String getModellerName() {
        return modellerName;
    }

}
