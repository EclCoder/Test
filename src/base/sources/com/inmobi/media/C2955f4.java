package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2955f4 extends AbstractC3317t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26533c;

    public C2955f4(int i10, long j10, String configType) {
        kotlin.jvm.internal.s.h(configType, "configType");
        this.f26531a = configType;
        this.f26532b = i10;
        this.f26533c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2955f4)) {
            return false;
        }
        C2955f4 c2955f4 = (C2955f4) obj;
        return kotlin.jvm.internal.s.c(this.f26531a, c2955f4.f26531a) && this.f26532b == c2955f4.f26532b && this.f26533c == c2955f4.f26533c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26533c) + AbstractC3305si.a(this.f26532b, this.f26531a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.f26531a + ", errorCode=" + this.f26532b + ", lastUpdatedTimestamp=" + this.f26533c + ")";
    }
}
