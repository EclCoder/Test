package v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f54998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f54999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f55000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f55001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f55002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f55003f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f55000c;
        float f17 = f13 + this.f55001d;
        float f18 = f16 + (this.f54998a * f14);
        float f19 = f17 + (this.f54999b * f15);
        float radians = (float) Math.toRadians(this.f55003f);
        float radians2 = (float) Math.toRadians(this.f55002e);
        double d10 = radians;
        double d11 = i11 * f15;
        float fSin = f18 + (((float) ((((double) ((-i10) * f14)) * Math.sin(d10)) - (Math.cos(d10) * d11))) * radians2);
        float fCos = f19 + (radians2 * ((float) ((((double) (i10 * f14)) * Math.cos(d10)) - (d11 * Math.sin(d10)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f55002e = 0.0f;
        this.f55001d = 0.0f;
        this.f55000c = 0.0f;
        this.f54999b = 0.0f;
        this.f54998a = 0.0f;
    }

    public void c(e eVar, float f10) {
        if (eVar != null) {
            this.f55002e = eVar.b(f10);
        }
    }

    public void d(j jVar, float f10) {
        if (jVar != null) {
            this.f55002e = jVar.b(f10);
            this.f55003f = jVar.a(f10);
        }
    }

    public void e(e eVar, e eVar2, float f10) {
        if (eVar != null) {
            this.f54998a = eVar.b(f10);
        }
        if (eVar2 != null) {
            this.f54999b = eVar2.b(f10);
        }
    }

    public void f(j jVar, j jVar2, float f10) {
        if (jVar != null) {
            this.f54998a = jVar.b(f10);
        }
        if (jVar2 != null) {
            this.f54999b = jVar2.b(f10);
        }
    }

    public void g(e eVar, e eVar2, float f10) {
        if (eVar != null) {
            this.f55000c = eVar.b(f10);
        }
        if (eVar2 != null) {
            this.f55001d = eVar2.b(f10);
        }
    }

    public void h(j jVar, j jVar2, float f10) {
        if (jVar != null) {
            this.f55000c = jVar.b(f10);
        }
        if (jVar2 != null) {
            this.f55001d = jVar2.b(f10);
        }
    }
}
