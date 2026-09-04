package cn;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f10152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10153b;

    public e(float f10, float f11) {
        this.f10152a = f10;
        this.f10153b = f11;
    }

    public final void a(e v10) {
        s.h(v10, "v");
        this.f10152a += v10.f10152a;
        this.f10153b += v10.f10153b;
    }

    public final void b(e v10, float f10) {
        s.h(v10, "v");
        this.f10152a += v10.f10152a * f10;
        this.f10153b += v10.f10153b * f10;
    }

    public final float c() {
        return this.f10152a;
    }

    public final float d() {
        return this.f10153b;
    }

    public final void e(float f10) {
        this.f10152a *= f10;
        this.f10153b *= f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f10152a, eVar.f10152a) == 0 && Float.compare(this.f10153b, eVar.f10153b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f10152a) * 31) + Float.hashCode(this.f10153b);
    }

    public String toString() {
        return "Vector(x=" + this.f10152a + ", y=" + this.f10153b + ")";
    }

    public /* synthetic */ e(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
