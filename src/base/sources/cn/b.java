package cn;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f10138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10141d;

    public b(float f10, float f11, float f12, float f13) {
        this.f10138a = f10;
        this.f10139b = f11;
        this.f10140c = f12;
        this.f10141d = f13;
    }

    @Override // cn.a
    public void a(float f10) {
        this.f10139b = f10;
    }

    @Override // cn.a
    public void b(float f10) {
        this.f10138a = f10;
    }

    @Override // cn.a
    public float c() {
        return this.f10138a;
    }

    @Override // cn.a
    public float d() {
        return this.f10139b;
    }

    @Override // cn.a
    public boolean e(int i10, int i11) {
        return a.C0140a.a(this, i10, i11);
    }

    @Override // cn.a
    public void f(float f10) {
        this.f10141d = f10;
    }

    @Override // cn.a
    public void g(float f10) {
        this.f10140c = f10;
    }

    @Override // cn.a
    public float getHeight() {
        return this.f10141d;
    }

    @Override // cn.a
    public float getWidth() {
        return this.f10140c;
    }

    public void h(float f10, float f11, float f12, float f13) {
        a.C0140a.b(this, f10, f11, f12, f13);
    }

    public /* synthetic */ b(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }
}
