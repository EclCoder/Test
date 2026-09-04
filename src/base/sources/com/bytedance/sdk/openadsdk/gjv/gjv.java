package com.bytedance.sdk.openadsdk.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static String hn() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    public static String hnj() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)").toString();
    }
}
