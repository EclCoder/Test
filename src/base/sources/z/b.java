package z;

import androidx.constraintlayout.motion.widget.n;
import v.k;
import v.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v.n f58196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f58197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f58198c;

    public b() {
        v.n nVar = new v.n();
        this.f58196a = nVar;
        this.f58198c = nVar;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public float a() {
        return this.f58198c.a();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        v.n nVar = this.f58196a;
        this.f58198c = nVar;
        nVar.d(f10, f11, f12, f13, f14, f15);
    }

    public boolean c() {
        return this.f58198c.b();
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f58197b == null) {
            this.f58197b = new k();
        }
        k kVar = this.f58197b;
        this.f58198c = kVar;
        kVar.d(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f58198c.getInterpolation(f10);
    }
}
