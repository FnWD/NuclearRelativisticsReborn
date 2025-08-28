package com.fnwd.nrreborn.util;

public final class ConfigurationTypes {
    private ConfigurationTypes() {}

    public static final int DISABLE_ALL = 0;
    public static final int INPUT_ITEM_SLOT_1 = 1;
    public static final int INPUT_ITEM_SLOT_2 = 2;
    public static final int INPUT_ITEM_SLOT_3 = 3;
    public static final int INPUT_ITEM_SLOT_4 = 4;
    public static final int OUTPUT_ITEM_SLOT_1 = 5;
    public static final int OUTPUT_ITEM_SLOT_2 = 6;
    public static final int OUTPUT_ITEM_SLOT_3 = 7;
    public static final int OUTPUT_ITEM_SLOT_4 = 8;

    public static int getNext(int index) {
        if (index == 8) return 0;
        else return ++index;
    }
}
