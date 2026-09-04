package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f33212c;

    public h(String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f33210a = str;
        this.f33211b = j10;
        this.f33212c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f33211b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f33210a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f33212c;
    }
}
