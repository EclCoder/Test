package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3123lh extends AbstractC3175nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26951b;

    public C3123lh(String message, int i10) {
        kotlin.jvm.internal.s.h(message, "message");
        this.f26950a = i10;
        this.f26951b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3123lh)) {
            return false;
        }
        C3123lh c3123lh = (C3123lh) obj;
        return this.f26950a == c3123lh.f26950a && kotlin.jvm.internal.s.c(this.f26951b, c3123lh.f26951b);
    }

    public final int hashCode() {
        return this.f26951b.hashCode() + (Integer.hashCode(this.f26950a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.f26950a + ", message=" + this.f26951b + ")";
    }
}
