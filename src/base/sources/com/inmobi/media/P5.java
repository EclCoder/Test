package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class P5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25465c;

    public P5(int i10, int i11, float f10) {
        this.f25463a = i10;
        this.f25464b = i11;
        this.f25465c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P5)) {
            return false;
        }
        P5 p10 = (P5) obj;
        return this.f25463a == p10.f25463a && this.f25464b == p10.f25464b && Float.compare(this.f25465c, p10.f25465c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25465c) + AbstractC3305si.a(this.f25464b, Integer.hashCode(this.f25463a) * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f25463a + ", height=" + this.f25464b + ", density=" + this.f25465c + ")";
    }
}
