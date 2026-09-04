package f1;

import android.util.AndroidRuntimeException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {
    private i B;
    private float C;
    private boolean D;

    public h(Object obj, f fVar) {
        super(obj, fVar);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    private void w() {
        i iVar = this.B;
        if (iVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = iVar.b();
        if (dB > this.f38199g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f38200h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // f1.e
    public void c() {
        super.c();
        float f10 = this.C;
        if (f10 != Float.MAX_VALUE) {
            i iVar = this.B;
            if (iVar == null) {
                this.B = new i(f10);
            } else {
                iVar.g(f10);
            }
            this.C = Float.MAX_VALUE;
        }
    }

    @Override // f1.e
    public void p() {
        w();
        this.B.i(g());
        super.p();
    }

    @Override // f1.e
    boolean r(long j10) {
        if (this.D) {
            float f10 = this.C;
            if (f10 != Float.MAX_VALUE) {
                this.B.g(f10);
                this.C = Float.MAX_VALUE;
            }
            this.f38194b = this.B.b();
            this.f38193a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            e.o oVarJ = this.B.j(this.f38194b, this.f38193a, j11);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            e.o oVarJ2 = this.B.j(oVarJ.f38206a, oVarJ.f38207b, j11);
            this.f38194b = oVarJ2.f38206a;
            this.f38193a = oVarJ2.f38207b;
        } else {
            e.o oVarJ3 = this.B.j(this.f38194b, this.f38193a, j10);
            this.f38194b = oVarJ3.f38206a;
            this.f38193a = oVarJ3.f38207b;
        }
        float fMax = Math.max(this.f38194b, this.f38200h);
        this.f38194b = fMax;
        float fMin = Math.min(fMax, this.f38199g);
        this.f38194b = fMin;
        if (!v(fMin, this.f38193a)) {
            return false;
        }
        this.f38194b = this.B.b();
        this.f38193a = 0.0f;
        return true;
    }

    public void s(float f10) {
        if (h()) {
            this.C = f10;
            return;
        }
        if (this.B == null) {
            this.B = new i(f10);
        }
        this.B.g(f10);
        p();
    }

    public boolean t() {
        return this.B.f38210b > 0.0d;
    }

    public i u() {
        return this.B;
    }

    boolean v(float f10, float f11) {
        return this.B.e(f10, f11);
    }

    public h x(i iVar) {
        this.B = iVar;
        return this;
    }

    public void y() {
        if (!t()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f38198f) {
            this.D = true;
        }
    }

    @Override // f1.e
    void o(float f10) {
    }
}
