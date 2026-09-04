package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34322a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f34324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f34325d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f34326a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f34326a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f34326a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f34326a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f34323b = j10;
        return this;
    }

    public b b(long j10) {
        this.f34322a = j10;
        return this;
    }

    public void c() {
        if (this.f34325d == null) {
            b();
        }
        this.f34325d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f34324c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f34325d;
        if (aVar != null) {
            aVar.cancel();
            this.f34325d = null;
        }
        if (this.f34323b <= 0) {
            this.f34323b = this.f34322a + 1000;
        }
        a aVar2 = new a(this.f34322a, this.f34323b);
        this.f34325d = aVar2;
        aVar2.a(this.f34324c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f34322a = j10;
        this.f34324c = aVar;
        b();
        a aVar2 = this.f34325d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f34325d;
        if (aVar != null) {
            aVar.cancel();
            this.f34325d = null;
        }
    }
}
