package com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends hnj {
    public gjv(Context context, com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        super(context, hnjVar);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor
    protected long dkl() {
        return com.bytedance.sdk.component.dkl.hnj.dse.hnj.hn();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj
    public byte gjv() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj, com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor
    public String hn() {
        com.bytedance.sdk.component.dkl.hnj.hnj.sk skVarQor = com.bytedance.sdk.component.dkl.hnj.dse.dkl().qor();
        if (skVarQor != null) {
            return skVarQor.hnj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj
    public byte qor() {
        return (byte) 1;
    }

    public static String qor(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
