package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f33972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f33974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33975d = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f33976a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f33976a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f33976a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f33976a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f33974c;
        if (aVar != null) {
            aVar.cancel();
            this.f33974c = null;
        }
    }

    public b b(long j10) {
        this.f33975d = j10;
        return this;
    }

    public void c() {
        if (this.f33974c == null) {
            b();
        }
        this.f33974c.start();
    }

    public void b() {
        a aVar = this.f33974c;
        if (aVar != null) {
            aVar.cancel();
            this.f33974c = null;
        }
        if (this.f33973b <= 0) {
            this.f33973b = this.f33975d + 1000;
        }
        a aVar2 = new a(this.f33975d, this.f33973b);
        this.f33974c = aVar2;
        aVar2.a(this.f33972a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f33973b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f33972a = aVar;
        return this;
    }
}
