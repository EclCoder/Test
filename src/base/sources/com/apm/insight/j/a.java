package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f10744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f10745b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10746c;

    a(Handler handler, long j10) {
        this.f10744a = handler;
        this.f10746c = j10;
    }

    final void a() {
        this.f10744a.post(this);
    }

    final long b() {
        return this.f10746c;
    }

    final void a(long j10) {
        if (j10 > 0) {
            this.f10744a.postDelayed(this, j10);
        } else {
            this.f10744a.post(this);
        }
    }
}
