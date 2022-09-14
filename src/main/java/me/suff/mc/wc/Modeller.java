package me.suff.mc.wc;

public enum Modeller {
    END("End Phoenix"),
    VIOLET("Violet"),
    VESPA("Vespa"),
    JAMIE("Jamie");

    private final String modellerName;

    Modeller(String modellerName) {
        this.modellerName = modellerName; 
    }

    public String getModellerName() {
        return modellerName;
    }

}
