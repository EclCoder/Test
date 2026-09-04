package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3249qd implements InterfaceC3408wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3274rd f27335a;

    public C3249qd(C3274rd c3274rd) {
        this.f27335a = c3274rd;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final boolean a() {
        long userTouchResetTime = this.f27335a.f27390a.f27460b.f24811a.f27160b.getRendering().getUserTouchResetTime();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27335a.f27391b;
        return j10 != 0 && jElapsedRealtime - j10 < userTouchResetTime;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final boolean c() {
        return !this.f27335a.f27390a.f27460b.f24811a.f27160b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final long getViewTouchTimestamp() {
        return this.f27335a.f27391b;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final void a(String api) {
        kotlin.jvm.internal.s.h(api, "api");
        Map mapA = AbstractC3487zk.a(this.f27335a.f27390a.f27463e.f25200a);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("BlockAutoRedirection", mapA, EnumC3281rk.SDK);
    }
}
