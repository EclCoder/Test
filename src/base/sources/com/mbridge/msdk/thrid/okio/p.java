package com.mbridge.msdk.thrid.okio;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static o f33678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static long f33679b;

    private p() {
    }

    static o a() {
        synchronized (p.class) {
            try {
                o oVar = f33678a;
                if (oVar == null) {
                    return new o();
                }
                f33678a = oVar.f33676f;
                oVar.f33676f = null;
                f33679b -= 8192;
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void a(o oVar) {
        if (oVar.f33676f == null && oVar.f33677g == null) {
            if (oVar.f33674d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f33679b + 8192;
                    if (j10 > 65536) {
                        return;
                    }
                    f33679b = j10;
                    oVar.f33676f = f33678a;
                    oVar.f33673c = 0;
                    oVar.f33672b = 0;
                    f33678a = oVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
