package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f33259d = com.mbridge.msdk.thrid.okio.f.c(":");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f33260e = com.mbridge.msdk.thrid.okio.f.c(":status");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f33261f = com.mbridge.msdk.thrid.okio.f.c(":method");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f33262g = com.mbridge.msdk.thrid.okio.f.c(":path");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f33263h = com.mbridge.msdk.thrid.okio.f.c(":scheme");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f33264i = com.mbridge.msdk.thrid.okio.f.c(":authority");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f33265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f33266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f33267c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f33265a.equals(cVar.f33265a) && this.f33266b.equals(cVar.f33266b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33265a.hashCode() + 527) * 31) + this.f33266b.hashCode();
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f33265a.m(), this.f33266b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f33265a = fVar;
        this.f33266b = fVar2;
        this.f33267c = fVar.j() + 32 + fVar2.j();
    }
}
