package com.bytedance.sdk.component.hn.hnj.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    static long f12865hn;
    static sk hnj;

    private dkl() {
    }

    static sk hnj() {
        synchronized (dkl.class) {
            sk skVar = hnj;
            if (skVar == null) {
                return new sk();
            }
            hnj = skVar.dkl;
            skVar.dkl = null;
            f12865hn -= 8192;
            return skVar;
        }
    }

    static void hnj(sk skVar) {
        if (skVar.dkl == null && skVar.dse == null) {
            if (skVar.gjv) {
                return;
            }
            synchronized (dkl.class) {
                try {
                    long j10 = f12865hn;
                    if (j10 + 8192 > 65536) {
                        return;
                    }
                    f12865hn = j10 + 8192;
                    skVar.dkl = hnj;
                    skVar.qor = 0;
                    skVar.f12869hn = 0;
                    hnj = skVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
