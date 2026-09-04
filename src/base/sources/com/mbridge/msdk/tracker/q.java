package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f33917a;

    public q(g gVar) {
        this.f33917a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f33917a)) {
            return;
        }
        this.f33917a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f33917a)) {
            return;
        }
        try {
            h hVarJ = eVar.j();
            if (y.a(hVarJ)) {
                eVar.a(hVarJ.a(eVar));
            }
            this.f33917a.b(eVar);
        } catch (Exception e10) {
            if (a.f33703a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f33917a)) {
            return new long[]{0, 0};
        }
        return this.f33917a.a();
    }
}
