package com.bytedance.sdk.openadsdk.p000do;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static String hnj() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )").toString();
    }

    public static void hnj(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
    }
}
