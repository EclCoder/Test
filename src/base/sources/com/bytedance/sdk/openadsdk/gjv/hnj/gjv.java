package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements com.bytedance.sdk.component.dkl.hnj.hnj.sk {
    public static final gjv hnj = new gjv();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private volatile SQLiteDatabase f14370hn;

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public String dkl() {
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public String gjv() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public String hn() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public SQLiteDatabase hnj(Context context) {
        if (this.f14370hn == null) {
            synchronized (this) {
                try {
                    if (this.f14370hn == null) {
                        this.f14370hn = com.bytedance.sdk.openadsdk.core.dkl.hnj(context).hnj().hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f14370hn;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public String qor() {
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public String sk() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.sk
    public String hnj() {
        return "loghighpriority";
    }
}
