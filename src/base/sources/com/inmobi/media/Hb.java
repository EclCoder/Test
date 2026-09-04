package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Hb {
    public static final ContentValues a(C3453yb c3453yb) {
        kotlin.jvm.internal.s.h(c3453yb, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c3453yb.f27931a);
        contentValues.put("saveTimestamp", Long.valueOf(c3453yb.f27932b));
        contentValues.put("retryCount", Integer.valueOf(c3453yb.f27933c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c3453yb.f27934d));
        contentValues.put("checkpoints", Integer.valueOf(c3453yb.f27936f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c3453yb.f27935e ? 1 : 0));
        return contentValues;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x005a  */
    public static final C3453yb a(ContentValues contentValues) {
        boolean z10;
        kotlin.jvm.internal.s.h(contentValues, "<this>");
        String asString = contentValues.getAsString("filename");
        kotlin.jvm.internal.s.g(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        kotlin.jvm.internal.s.g(asLong, "getAsLong(...)");
        long jLongValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        kotlin.jvm.internal.s.g(asInteger, "getAsInteger(...)");
        int iIntValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        kotlin.jvm.internal.s.g(asLong2, "getAsLong(...)");
        long jLongValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        kotlin.jvm.internal.s.g(asInteger2, "getAsInteger(...)");
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        if (asInteger3 != null) {
            z10 = asInteger3.intValue() == 1;
        }
        return new C3453yb(asString, jLongValue, iIntValue, jLongValue2, z10, iIntValue2);
    }
}
