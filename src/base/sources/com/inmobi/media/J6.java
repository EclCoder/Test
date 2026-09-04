package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25050d;

    public J6(float f10, float f11, int i10, int i11) {
        this.f25047a = f10;
        this.f25048b = f11;
        this.f25049c = i10;
        this.f25050d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J6)) {
            return false;
        }
        J6 j10 = (J6) obj;
        return Float.compare(this.f25047a, j10.f25047a) == 0 && Float.compare(this.f25048b, j10.f25048b) == 0 && this.f25049c == j10.f25049c && this.f25050d == j10.f25050d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25050d) + AbstractC3305si.a(this.f25049c, (Float.hashCode(this.f25048b) + (Float.hashCode(this.f25047a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.f25047a + ", y=" + this.f25048b + ", width=" + this.f25049c + ", height=" + this.f25050d + ")";
    }
}
