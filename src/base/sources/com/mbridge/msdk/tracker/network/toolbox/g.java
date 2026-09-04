package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f33863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f33865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f33866e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f33865d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f33866e != null) {
            return new ByteArrayInputStream(this.f33866e);
        }
        return null;
    }

    public final int b() {
        return this.f33864c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f33863b);
    }

    public final int d() {
        return this.f33862a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f33862a = i10;
        this.f33863b = list;
        this.f33864c = i11;
        this.f33865d = inputStream;
        this.f33866e = null;
    }
}
