package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.fg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2967fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zf f26556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26559d;

    public C2967fg(Zf ping, int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kotlin.jvm.internal.s.h(ping, "ping");
        this.f26556a = ping;
        this.f26557b = i10;
        this.f26558c = str;
        this.f26559d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2967fg)) {
            return false;
        }
        C2967fg c2967fg = (C2967fg) obj;
        return kotlin.jvm.internal.s.c(this.f26556a, c2967fg.f26556a) && this.f26557b == c2967fg.f26557b && kotlin.jvm.internal.s.c(this.f26558c, c2967fg.f26558c) && this.f26559d == c2967fg.f26559d;
    }

    public final int hashCode() {
        int iA = AbstractC3305si.a(this.f26557b, this.f26556a.hashCode() * 31, 31);
        String str = this.f26558c;
        return Long.hashCode(this.f26559d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.f26556a + ", statusCode=" + this.f26557b + ", error=" + this.f26558c + ", timestamp=" + this.f26559d + ")";
    }
}
