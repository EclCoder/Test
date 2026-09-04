package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.aj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2841aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26225c;

    public C2841aj(int i10, int i11, int i12) {
        this.f26223a = i10;
        this.f26224b = i11;
        this.f26225c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2841aj)) {
            return false;
        }
        C2841aj c2841aj = (C2841aj) obj;
        return this.f26223a == c2841aj.f26223a && this.f26224b == c2841aj.f26224b && this.f26225c == c2841aj.f26225c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26225c) + AbstractC3305si.a(this.f26224b, Integer.hashCode(this.f26223a) * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.f26223a + ", minor=" + this.f26224b + ", patch=" + this.f26225c + ")";
    }
}
