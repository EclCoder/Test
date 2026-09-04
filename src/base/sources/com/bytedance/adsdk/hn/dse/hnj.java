package com.bytedance.adsdk.hn.dse;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.hn.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj<T> {
    public PointF aq;
    private float bug;
    public final float dkl;
    private float dnm;
    public Float dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private float f11945fc;
    public final Interpolator gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public T f11946hn;
    public final T hnj;
    private float jip;
    private int mjg;
    public PointF ojm;
    private int orl;
    public final Interpolator qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public final Interpolator f11947sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final dse f11948ta;

    public hnj(dse dseVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.dnm = -3987645.8f;
        this.bug = -3987645.8f;
        this.orl = 784923401;
        this.mjg = 784923401;
        this.f11945fc = Float.MIN_VALUE;
        this.jip = Float.MIN_VALUE;
        this.aq = null;
        this.ojm = null;
        this.f11948ta = dseVar;
        this.hnj = t10;
        this.f11946hn = t11;
        this.qor = interpolator;
        this.gjv = null;
        this.f11947sk = null;
        this.dkl = f10;
        this.dse = f11;
    }

    public int aq() {
        if (this.orl == 784923401) {
            this.orl = ((Integer) this.hnj).intValue();
        }
        return this.orl;
    }

    public float dkl() {
        if (this.dnm == -3987645.8f) {
            this.dnm = ((Float) this.hnj).floatValue();
        }
        return this.dnm;
    }

    public float dse() {
        if (this.bug == -3987645.8f) {
            this.bug = ((Float) this.f11946hn).floatValue();
        }
        return this.bug;
    }

    public float gjv() {
        if (this.f11948ta == null) {
            return 1.0f;
        }
        if (this.jip == Float.MIN_VALUE) {
            if (this.dse == null) {
                this.jip = 1.0f;
            } else {
                this.jip = qor() + ((this.dse.floatValue() - this.dkl) / this.f11948ta.uua());
            }
        }
        return this.jip;
    }

    public hnj<T> hnj(T t10, T t11) {
        return new hnj<>(t10, t11);
    }

    public int ojm() {
        if (this.mjg == 784923401) {
            this.mjg = ((Integer) this.f11946hn).intValue();
        }
        return this.mjg;
    }

    public float qor() {
        dse dseVar = this.f11948ta;
        if (dseVar == null) {
            return 0.0f;
        }
        if (this.f11945fc == Float.MIN_VALUE) {
            this.f11945fc = (this.dkl - dseVar.dkl()) / this.f11948ta.uua();
        }
        return this.f11945fc;
    }

    public boolean sk() {
        return this.qor == null && this.gjv == null && this.f11947sk == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.hnj + ", endValue=" + this.f11946hn + ", startFrame=" + this.dkl + ", endFrame=" + this.dse + ", interpolator=" + this.qor + '}';
    }

    public boolean hnj(float f10) {
        return f10 >= qor() && f10 < gjv();
    }

    public hnj(dse dseVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.dnm = -3987645.8f;
        this.bug = -3987645.8f;
        this.orl = 784923401;
        this.mjg = 784923401;
        this.f11945fc = Float.MIN_VALUE;
        this.jip = Float.MIN_VALUE;
        this.aq = null;
        this.ojm = null;
        this.f11948ta = dseVar;
        this.hnj = t10;
        this.f11946hn = t11;
        this.qor = null;
        this.gjv = interpolator;
        this.f11947sk = interpolator2;
        this.dkl = f10;
        this.dse = f11;
    }

    protected hnj(dse dseVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.dnm = -3987645.8f;
        this.bug = -3987645.8f;
        this.orl = 784923401;
        this.mjg = 784923401;
        this.f11945fc = Float.MIN_VALUE;
        this.jip = Float.MIN_VALUE;
        this.aq = null;
        this.ojm = null;
        this.f11948ta = dseVar;
        this.hnj = t10;
        this.f11946hn = t11;
        this.qor = interpolator;
        this.gjv = interpolator2;
        this.f11947sk = interpolator3;
        this.dkl = f10;
        this.dse = f11;
    }

    public hnj(T t10) {
        this.dnm = -3987645.8f;
        this.bug = -3987645.8f;
        this.orl = 784923401;
        this.mjg = 784923401;
        this.f11945fc = Float.MIN_VALUE;
        this.jip = Float.MIN_VALUE;
        this.aq = null;
        this.ojm = null;
        this.f11948ta = null;
        this.hnj = t10;
        this.f11946hn = t10;
        this.qor = null;
        this.gjv = null;
        this.f11947sk = null;
        this.dkl = Float.MIN_VALUE;
        this.dse = Float.valueOf(Float.MAX_VALUE);
    }

    private hnj(T t10, T t11) {
        this.dnm = -3987645.8f;
        this.bug = -3987645.8f;
        this.orl = 784923401;
        this.mjg = 784923401;
        this.f11945fc = Float.MIN_VALUE;
        this.jip = Float.MIN_VALUE;
        this.aq = null;
        this.ojm = null;
        this.f11948ta = null;
        this.hnj = t10;
        this.f11946hn = t11;
        this.qor = null;
        this.gjv = null;
        this.f11947sk = null;
        this.dkl = Float.MIN_VALUE;
        this.dse = Float.valueOf(Float.MAX_VALUE);
    }
}
