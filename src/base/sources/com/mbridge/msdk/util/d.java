package com.mbridge.msdk.util;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static boolean a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen() && !sQLiteDatabase.isReadOnly()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
