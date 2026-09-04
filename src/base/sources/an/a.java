package an;

import kotlin.jvm.internal.s;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final cn.c f464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f465i;

    public final int a() {
        return this.f461e;
    }

    public final float b() {
        return this.f462f;
    }

    public final float c() {
        return this.f463g;
    }

    public final cn.c d() {
        return this.f464h;
    }

    public final float e() {
        return this.f459c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f457a, aVar.f457a) == 0 && Float.compare(this.f458b, aVar.f458b) == 0 && Float.compare(this.f459c, aVar.f459c) == 0 && Float.compare(this.f460d, aVar.f460d) == 0 && this.f461e == aVar.f461e && Float.compare(this.f462f, aVar.f462f) == 0 && Float.compare(this.f463g, aVar.f463g) == 0 && s.c(this.f464h, aVar.f464h) && this.f465i == aVar.f465i;
    }

    public final float f() {
        return this.f457a;
    }

    public final float g() {
        return this.f458b;
    }

    public int hashCode() {
        return (((((((((((((((Float.hashCode(this.f457a) * 31) + Float.hashCode(this.f458b)) * 31) + Float.hashCode(this.f459c)) * 31) + Float.hashCode(this.f460d)) * 31) + Integer.hashCode(this.f461e)) * 31) + Float.hashCode(this.f462f)) * 31) + Float.hashCode(this.f463g)) * 31) + this.f464h.hashCode()) * 31) + Integer.hashCode(this.f465i);
    }

    public String toString() {
        return "Particle(x=" + this.f457a + ", y=" + this.f458b + ", width=" + this.f459c + ", height=" + this.f460d + ", color=" + this.f461e + ", rotation=" + this.f462f + ", scaleX=" + this.f463g + ", shape=" + this.f464h + ", alpha=" + this.f465i + ")";
    }

    public a(float f10, float f11, float f12, float f13, int i10, float f14, float f15, cn.c cVar, int i11) {
        s.h(cVar, WwUgngZLNA.GqpcIDixMOl);
        this.f457a = f10;
        this.f458b = f11;
        this.f459c = f12;
        this.f460d = f13;
        this.f461e = i10;
        this.f462f = f14;
        this.f463g = f15;
        this.f464h = cVar;
        this.f465i = i11;
    }
}
