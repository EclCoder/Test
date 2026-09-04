package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f33719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f33720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f33721c = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f33722d = new long[2];

    public g(c cVar, s sVar) {
        this.f33719a = cVar;
        this.f33720b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f33721c.incrementAndGet();
            this.f33722d[0] = System.currentTimeMillis();
            this.f33722d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f33719a.a(iVar);
            this.f33720b.k();
            this.f33720b.e();
            this.f33720b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f33722d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
