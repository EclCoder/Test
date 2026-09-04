package com.iab.omid.library.vungle.adsession;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
