package com.bytedance.adsdk.hn.dkl;

import android.view.Choreographer;
import com.bytedance.adsdk.hn.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends hnj implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private dse f11933ta;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f11931hn = 1.0f;
    private boolean qor = false;
    private long gjv = 0;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f11932sk = 0.0f;
    private float dkl = 0.0f;
    private int dse = 0;
    private float aq = -2.14748365E9f;
    private float ojm = 2.14748365E9f;
    protected boolean hnj = false;
    private boolean dnm = false;

    private boolean apu() {
        return ta() < 0.0f;
    }

    private void eum() {
        if (this.f11933ta == null) {
            return;
        }
        float f10 = this.dkl;
        if (f10 < this.aq || f10 > this.ojm) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.aq), Float.valueOf(this.ojm), Float.valueOf(this.dkl)));
        }
    }

    private float xn() {
        dse dseVar = this.f11933ta;
        if (dseVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dseVar.bug()) / Math.abs(this.f11931hn);
    }

    public void aq() {
        this.f11933ta = null;
        this.aq = -2.14748365E9f;
        this.ojm = 2.14748365E9f;
    }

    public void bug() {
        oj();
        hn(apu());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        hn();
        oj();
    }

    public float dkl() {
        dse dseVar = this.f11933ta;
        if (dseVar == null) {
            return 0.0f;
        }
        return (this.dkl - dseVar.dkl()) / (this.f11933ta.dse() - this.f11933ta.dkl());
    }

    public void dnm() {
        this.hnj = true;
        hnj(apu());
        hnj((int) (apu() ? jip() : fc()));
        this.gjv = 0L;
        this.dse = 0;
        uua();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        uua();
        if (this.f11933ta == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.hn.sk.hnj("LottieValueAnimator#doFrame");
        long j11 = this.gjv;
        float fXn = (j11 != 0 ? j10 - j11 : 0L) / xn();
        float f10 = this.f11932sk;
        if (apu()) {
            fXn = -fXn;
        }
        float f11 = f10 + fXn;
        boolean zQor = sk.qor(f11, fc(), jip());
        float f12 = this.f11932sk;
        float fHn = sk.hn(f11, fc(), jip());
        this.f11932sk = fHn;
        if (this.dnm) {
            fHn = (float) Math.floor(fHn);
        }
        this.dkl = fHn;
        this.gjv = j10;
        if (!this.dnm || this.f11932sk != f12) {
            qor();
        }
        if (!zQor) {
            if (getRepeatCount() == -1 || this.dse < getRepeatCount()) {
                hnj();
                this.dse++;
                if (getRepeatMode() == 2) {
                    this.qor = !this.qor;
                    ojm();
                } else {
                    float fJip = apu() ? jip() : fc();
                    this.f11932sk = fJip;
                    this.dkl = fJip;
                }
                this.gjv = j10;
            } else {
                float fFc = this.f11931hn < 0.0f ? fc() : jip();
                this.f11932sk = fFc;
                this.dkl = fFc;
                oj();
                hn(apu());
            }
        }
        eum();
        com.bytedance.adsdk.hn.sk.hn("LottieValueAnimator#doFrame");
    }

    public float dse() {
        return this.dkl;
    }

    public float fc() {
        dse dseVar = this.f11933ta;
        if (dseVar == null) {
            return 0.0f;
        }
        float f10 = this.aq;
        return f10 == -2.14748365E9f ? dseVar.dkl() : f10;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fFc;
        float fJip;
        float fFc2;
        if (this.f11933ta == null) {
            return 0.0f;
        }
        if (apu()) {
            fFc = jip() - this.dkl;
            fJip = jip();
            fFc2 = fc();
        } else {
            fFc = this.dkl - fc();
            fJip = jip();
            fFc2 = fc();
        }
        return fFc / (fJip - fFc2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(dkl());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        dse dseVar = this.f11933ta;
        if (dseVar == null) {
            return 0L;
        }
        return (long) dseVar.sk();
    }

    protected void gjv(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.hnj = false;
        }
    }

    public void hn(float f10) {
        hnj(this.aq, f10);
    }

    public void hnj(dse dseVar) {
        boolean z10 = this.f11933ta == null;
        this.f11933ta = dseVar;
        if (z10) {
            hnj(Math.max(this.aq, dseVar.dkl()), Math.min(this.ojm, dseVar.dse()));
        } else {
            hnj((int) dseVar.dkl(), (int) dseVar.dse());
        }
        float f10 = this.dkl;
        this.dkl = 0.0f;
        this.f11932sk = 0.0f;
        hnj((int) f10);
        qor();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.hnj;
    }

    public float jip() {
        dse dseVar = this.f11933ta;
        if (dseVar == null) {
            return 0.0f;
        }
        float f10 = this.ojm;
        return f10 == 2.14748365E9f ? dseVar.dse() : f10;
    }

    public void mjg() {
        this.hnj = true;
        uua();
        this.gjv = 0L;
        if (apu() && dse() == fc()) {
            hnj(jip());
        } else if (!apu() && dse() == jip()) {
            hnj(fc());
        }
        sk();
    }

    protected void oj() {
        gjv(true);
    }

    public void ojm() {
        qor(-ta());
    }

    public void orl() {
        oj();
        gjv();
    }

    public void qor(boolean z10) {
        this.dnm = z10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.qor) {
            return;
        }
        this.qor = false;
        ojm();
    }

    public float ta() {
        return this.f11931hn;
    }

    protected void uua() {
        if (isRunning()) {
            gjv(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // com.bytedance.adsdk.hn.dkl.hnj
    void hn() {
        super.hn();
        hn(apu());
    }

    public void qor(float f10) {
        this.f11931hn = f10;
    }

    public void hnj(float f10) {
        if (this.f11932sk == f10) {
            return;
        }
        float fHn = sk.hn(f10, fc(), jip());
        this.f11932sk = fHn;
        if (this.dnm) {
            fHn = (float) Math.floor(fHn);
        }
        this.dkl = fHn;
        this.gjv = 0L;
        qor();
    }

    public void hnj(int i10) {
        hnj(i10, (int) this.ojm);
    }

    public void hnj(float f10, float f11) {
        if (f10 <= f11) {
            dse dseVar = this.f11933ta;
            float fDkl = dseVar == null ? -3.4028235E38f : dseVar.dkl();
            dse dseVar2 = this.f11933ta;
            float fDse = dseVar2 == null ? Float.MAX_VALUE : dseVar2.dse();
            float fHn = sk.hn(f10, fDkl, fDse);
            float fHn2 = sk.hn(f11, fDkl, fDse);
            if (fHn == this.aq && fHn2 == this.ojm) {
                return;
            }
            this.aq = fHn;
            this.ojm = fHn2;
            hnj((int) sk.hn(this.dkl, fHn, fHn2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
