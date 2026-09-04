package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f33425a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f33425a = bVar;
    }
}
