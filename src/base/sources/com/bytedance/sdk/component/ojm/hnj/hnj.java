package com.bytedance.sdk.component.ojm.hnj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile hnj f12936hn;
    private volatile hn hnj;

    private hnj() {
    }

    public static hnj hnj() {
        if (f12936hn == null) {
            synchronized (hnj.class) {
                try {
                    if (f12936hn == null) {
                        f12936hn = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f12936hn;
    }

    public hn hn() {
        return this.hnj;
    }

    public void hnj(hn hnVar) {
        this.hnj = hnVar;
    }
}
