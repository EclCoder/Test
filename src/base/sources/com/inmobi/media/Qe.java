package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25560d;

    public Qe(long j10, Map headers, int i10, String str) {
        kotlin.jvm.internal.s.h(headers, "headers");
        this.f25557a = j10;
        this.f25558b = headers;
        this.f25559c = i10;
        this.f25560d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qe)) {
            return false;
        }
        Qe qe2 = (Qe) obj;
        return this.f25557a == qe2.f25557a && kotlin.jvm.internal.s.c(this.f25558b, qe2.f25558b) && this.f25559c == qe2.f25559c && kotlin.jvm.internal.s.c(this.f25560d, qe2.f25560d);
    }

    public final int hashCode() {
        int iA = AbstractC3305si.a(this.f25559c, (this.f25558b.hashCode() + (Long.hashCode(this.f25557a) * 31)) * 31, 31);
        String str = this.f25560d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.f25557a + ", headers=" + this.f25558b + ", contentLength=" + this.f25559c + ", contentType=" + this.f25560d + ")";
    }
}
