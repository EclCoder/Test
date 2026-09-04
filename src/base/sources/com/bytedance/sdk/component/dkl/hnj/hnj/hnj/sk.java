package com.bytedance.sdk.component.dkl.hnj.hnj.hnj;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements com.bytedance.sdk.component.dkl.hnj.hnj.sk {
    public static final sk hnj = new sk();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private volatile SQLiteDatabase f12817hn;

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
        if (this.f12817hn == null) {
            synchronized (this) {
                try {
                    if (this.f12817hn == null) {
                        this.f12817hn = new gjv(context).getWritableDatabase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12817hn;
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
