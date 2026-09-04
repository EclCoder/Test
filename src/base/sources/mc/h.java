package mc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f45573a;

    public h(float f10) {
        this.f45573a = f10 - 0.001f;
    }

    @Override // mc.g
    boolean b() {
        return true;
    }

    @Override // mc.g
    public void c(float f10, float f11, float f12, r rVar) {
        float fSqrt = (float) ((((double) this.f45573a) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f45573a, 2.0d) - Math.pow(fSqrt, 2.0d));
        rVar.n(f11 - fSqrt, ((float) (-((((double) this.f45573a) * Math.sqrt(2.0d)) - ((double) this.f45573a)))) + fSqrt2);
        rVar.m(f11, (float) (-((((double) this.f45573a) * Math.sqrt(2.0d)) - ((double) this.f45573a))));
        rVar.m(f11 + fSqrt, ((float) (-((((double) this.f45573a) * Math.sqrt(2.0d)) - ((double) this.f45573a)))) + fSqrt2);
    }
}
