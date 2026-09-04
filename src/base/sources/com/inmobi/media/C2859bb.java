package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2859bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f26256b;

    public C2859bb(int i10) {
        this.f26255a = i10;
        this.f26256b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2859bb)) {
            return false;
        }
        C2859bb c2859bb = (C2859bb) obj;
        return this.f26255a == c2859bb.f26255a && kotlin.jvm.internal.s.c(this.f26256b, c2859bb.f26256b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f26255a) * 31;
        Integer num = this.f26256b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f26255a + ", errorCode=" + this.f26256b + ")";
    }

    public C2859bb(int i10, Integer num) {
        this.f26255a = i10;
        this.f26256b = num;
    }
}
