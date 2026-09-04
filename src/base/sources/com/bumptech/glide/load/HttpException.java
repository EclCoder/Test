package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11214a;

    public HttpException(int i10) {
        this("Http request failed", i10);
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f11214a = i10;
    }
}
