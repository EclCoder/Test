package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f33162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f33163b;

    public e(IOException iOException) {
        super(iOException);
        this.f33162a = iOException;
        this.f33163b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f33162a, (Throwable) iOException);
        this.f33163b = iOException;
    }

    public IOException d() {
        return this.f33162a;
    }

    public IOException g() {
        return this.f33163b;
    }
}
