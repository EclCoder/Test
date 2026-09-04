package com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends dse {
    public dkl(Context context, com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        super(context, hnjVar);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dse, com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor
    public String hn() {
        return com.bytedance.sdk.component.dkl.hnj.dse.dkl().qor().sk();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dse
    public byte hnj() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dse
    public byte qor() {
        return (byte) 3;
    }

    public static String hnj(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
