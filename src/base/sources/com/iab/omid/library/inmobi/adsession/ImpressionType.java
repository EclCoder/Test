package com.iab.omid.library.inmobi.adsession;

import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: loaded from: classes2.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL(qnwOeeQSSWa.GBXcT),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.impressionType;
    }
}
