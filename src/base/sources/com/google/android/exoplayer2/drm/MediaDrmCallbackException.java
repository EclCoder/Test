package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f16838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f16839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f16840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16841d;

    public MediaDrmCallbackException(com.google.android.exoplayer2.upstream.a aVar, Uri uri, Map map, long j10, Throwable th2) {
        super(th2);
        this.f16838a = aVar;
        this.f16839b = uri;
        this.f16840c = map;
        this.f16841d = j10;
    }
}
