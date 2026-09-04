package com.bytedance.adsdk.hn;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.hn.sk.wu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends Drawable implements Animatable, Drawable.Callback {
    private com.bytedance.adsdk.hn.qor.qor.hn apu;
    private boolean aq;
    private boolean as;
    private com.bytedance.adsdk.hn.hn.hn bug;
    private boolean dkl;
    private final ValueAnimator.AnimatorUpdateListener dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f3do;
    private boolean dse;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private com.bytedance.adsdk.hn.hn.hnj f12020fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private View f12021ff;
    private RectF fvt;
    private dse gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private Paint f12022gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    qor f12023hn;
    String hnj;
    private Canvas hqh;
    private Matrix jbd;
    private Map<String, Typeface> jip;
    private gjv mjg;
    private Rect nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f12024oj;
    private hn ojm;
    private String orl;
    private RectF orp;
    private RectF pty;
    apu qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.dkl.qor f12025sk;
    private Matrix sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final ArrayList<hnj> f12026ta;
    private boolean tgn;
    private xn tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private Rect f12027ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private Rect f12028ul;
    private boolean uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private Bitmap f12029vf;
    private boolean wu;
    private boolean xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f12030xn;
    private final Matrix xyo;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum hn {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface hnj {
        void hnj(dse dseVar);
    }

    public ojm() {
        com.bytedance.adsdk.hn.dkl.qor qorVar = new com.bytedance.adsdk.hn.dkl.qor();
        this.f12025sk = qorVar;
        this.dkl = true;
        this.dse = false;
        this.aq = false;
        this.ojm = hn.NONE;
        this.f12026ta = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.hn.ojm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ojm.this.apu != null) {
                    ojm.this.apu.hnj(ojm.this.f12025sk.dkl());
                }
            }
        };
        this.dnm = animatorUpdateListener;
        this.f12024oj = false;
        this.f12030xn = true;
        this.eum = 255;
        this.tu = xn.AUTOMATIC;
        this.tgn = false;
        this.xyo = new Matrix();
        this.xad = false;
        qorVar.addUpdateListener(animatorUpdateListener);
    }

    private Context fvt() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private boolean gm() {
        return this.dkl || this.dse;
    }

    private void orp() {
        if (this.hqh != null) {
            return;
        }
        this.hqh = new Canvas();
        this.orp = new RectF();
        this.sq = new Matrix();
        this.jbd = new Matrix();
        this.nyv = new Rect();
        this.pty = new RectF();
        this.f12022gm = new com.bytedance.adsdk.hn.hnj.hnj();
        this.f12028ul = new Rect();
        this.f12027ua = new Rect();
        this.fvt = new RectF();
    }

    private void pty() {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            return;
        }
        this.tgn = this.tu.hnj(Build.VERSION.SDK_INT, dseVar.hnj(), dseVar.hn());
    }

    private boolean sq() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private com.bytedance.adsdk.hn.hn.hnj ua() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f12020fc == null) {
            com.bytedance.adsdk.hn.hn.hnj hnjVar = new com.bytedance.adsdk.hn.hn.hnj(getCallback(), this.f12023hn);
            this.f12020fc = hnjVar;
            String str = this.hnj;
            if (str != null) {
                hnjVar.hnj(str);
            }
        }
        return this.f12020fc;
    }

    private com.bytedance.adsdk.hn.hn.hn ul() {
        com.bytedance.adsdk.hn.hn.hn hnVar = this.bug;
        if (hnVar != null && !hnVar.hnj(fvt())) {
            this.bug = null;
        }
        if (this.bug == null) {
            this.bug = new com.bytedance.adsdk.hn.hn.hn(getCallback(), this.orl, this.mjg, this.gjv.jip());
        }
        return this.bug;
    }

    public int apu() {
        return this.f12025sk.getRepeatMode();
    }

    public oj aq() {
        dse dseVar = this.gjv;
        if (dseVar != null) {
            return dseVar.qor();
        }
        return null;
    }

    boolean as() {
        if (isVisible()) {
            return this.f12025sk.isRunning();
        }
        hn hnVar = this.ojm;
        return hnVar == hn.PLAY || hnVar == hn.RESUME;
    }

    public void bug() {
        this.f12026ta.clear();
        this.f12025sk.bug();
        if (isVisible()) {
            return;
        }
        this.ojm = hn.NONE;
    }

    public xn dkl() {
        return this.tgn ? xn.SOFTWARE : xn.HARDWARE;
    }

    public void dnm() {
        if (this.apu == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.6
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.dnm();
                }
            });
            return;
        }
        pty();
        if (gm() || eum() == 0) {
            if (isVisible()) {
                this.f12025sk.dnm();
                this.ojm = hn.NONE;
            } else {
                this.ojm = hn.PLAY;
            }
        }
        if (gm()) {
            return;
        }
        qor((int) (jip() < 0.0f ? mjg() : fc()));
        this.f12025sk.bug();
        if (isVisible()) {
            return;
        }
        this.ojm = hn.NONE;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public apu m1do() {
        return this.qor;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        sk.hnj("Drawable#draw");
        try {
            if (this.tgn) {
                hnj(canvas, this.apu);
            } else {
                hnj(canvas);
            }
        } catch (Throwable unused) {
        }
        this.xad = false;
        sk.hn("Drawable#draw");
    }

    public boolean dse() {
        return this.tgn;
    }

    public int eum() {
        return this.f12025sk.getRepeatCount();
    }

    public float fc() {
        return this.f12025sk.jip();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.eum;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            return -1;
        }
        return dseVar.gjv().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            return -1;
        }
        return dseVar.gjv().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public String gjv() {
        return this.orl;
    }

    public float hqh() {
        return this.f12025sk.dkl();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.xad) {
            return;
        }
        this.xad = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return wu();
    }

    public float jip() {
        return this.f12025sk.ta();
    }

    public float mjg() {
        return this.f12025sk.fc();
    }

    public RectF nyv() {
        return this.orp;
    }

    public void oj() {
        this.f12025sk.removeAllListeners();
    }

    public boolean ojm() {
        return this.f3do;
    }

    public void orl() {
        if (this.apu == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.7
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.orl();
                }
            });
            return;
        }
        pty();
        if (gm() || eum() == 0) {
            if (isVisible()) {
                this.f12025sk.mjg();
                this.ojm = hn.NONE;
            } else {
                this.ojm = hn.RESUME;
            }
        }
        if (gm()) {
            return;
        }
        qor((int) (jip() < 0.0f ? mjg() : fc()));
        this.f12025sk.bug();
        if (isVisible()) {
            return;
        }
        this.ojm = hn.NONE;
    }

    public boolean qor() {
        return this.f12030xn;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.eum = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            hn hnVar = this.ojm;
            if (hnVar == hn.PLAY) {
                dnm();
                return visible;
            }
            if (hnVar == hn.RESUME) {
                orl();
                return visible;
            }
        } else {
            if (this.f12025sk.isRunning()) {
                vf();
                this.ojm = hn.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.ojm = hn.NONE;
            }
        }
        return visible;
    }

    public boolean sk() {
        return this.f12024oj;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        dnm();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        bug();
    }

    public void ta() {
        if (this.f12025sk.isRunning()) {
            this.f12025sk.cancel();
            if (!isVisible()) {
                this.ojm = hn.NONE;
            }
        }
        this.gjv = null;
        this.apu = null;
        this.bug = null;
        this.f12025sk.aq();
        invalidateSelf();
    }

    public dse tgn() {
        return this.gjv;
    }

    public boolean tu() {
        return this.jip == null && this.qor == null && this.gjv.mjg().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void uua() {
        this.f12025sk.removeAllUpdateListeners();
        this.f12025sk.addUpdateListener(this.dnm);
    }

    public void vf() {
        this.f12026ta.clear();
        this.f12025sk.orl();
        if (isVisible()) {
            return;
        }
        this.ojm = hn.NONE;
    }

    public boolean wu() {
        com.bytedance.adsdk.hn.dkl.qor qorVar = this.f12025sk;
        if (qorVar == null) {
            return false;
        }
        return qorVar.isRunning();
    }

    public int xn() {
        return (int) this.f12025sk.dse();
    }

    public void xyo() {
        this.f12026ta.clear();
        this.f12025sk.cancel();
        if (isVisible()) {
            return;
        }
        this.ojm = hn.NONE;
    }

    public void dkl(boolean z10) {
        this.aq = z10;
    }

    public void dse(boolean z10) {
        this.dse = z10;
    }

    public void gjv(boolean z10) {
        if (this.as == z10) {
            return;
        }
        this.as = z10;
        com.bytedance.adsdk.hn.qor.qor.hn hnVar = this.apu;
        if (hnVar != null) {
            hnVar.hnj(z10);
        }
    }

    public com.bytedance.adsdk.hn.qor.qor.hn hn() {
        return this.apu;
    }

    public void hnj(View view) {
        this.f12021ff = view;
    }

    public void qor(boolean z10) {
        this.wu = z10;
        dse dseVar = this.gjv;
        if (dseVar != null) {
            dseVar.hn(z10);
        }
    }

    public void sk(boolean z10) {
        this.f3do = z10;
    }

    public void aq(boolean z10) {
        this.f12025sk.qor(z10);
    }

    public ta dkl(String str) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            return null;
        }
        return dseVar.jip().get(str);
    }

    public void dse(String str) {
        this.hnj = str;
        com.bytedance.adsdk.hn.hn.hnj hnjVarUa = ua();
        if (hnjVarUa != null) {
            hnjVarUa.hnj(str);
        }
    }

    public void hn(boolean z10) {
        this.f12024oj = z10;
    }

    public View hnj() {
        return this.f12021ff;
    }

    public void sk(int i10) {
        this.f12025sk.setRepeatCount(i10);
    }

    public void hn(final int i10) {
        if (this.gjv == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.10
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.hn(i10);
                }
            });
        } else {
            this.f12025sk.hn(i10 + 0.99f);
        }
    }

    public void hnj(boolean z10, Context context) {
        if (this.uua == z10) {
            return;
        }
        this.uua = z10;
        if (this.gjv != null) {
            hnj(context);
        }
    }

    public Bitmap sk(String str) {
        com.bytedance.adsdk.hn.hn.hn hnVarUl = ul();
        if (hnVarUl != null) {
            return hnVarUl.hnj(str);
        }
        return null;
    }

    public void qor(final String str) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.13
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar2) {
                    ojm.this.qor(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.hn.qor.dkl dklVarQor = dseVar.qor(str);
        if (dklVarQor != null) {
            hn((int) (dklVarQor.hnj + dklVarQor.f12044hn));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void gjv(final String str) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.2
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar2) {
                    ojm.this.gjv(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.hn.qor.dkl dklVarQor = dseVar.qor(str);
        if (dklVarQor != null) {
            int i10 = (int) dklVarQor.hnj;
            hnj(i10, ((int) dklVarQor.f12044hn) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void hn(final float f10) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.11
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar2) {
                    ojm.this.hn(f10);
                }
            });
        } else {
            this.f12025sk.hn(com.bytedance.adsdk.hn.dkl.sk.hnj(dseVar.dkl(), this.gjv.dse(), f10));
        }
    }

    public void hnj(boolean z10) {
        if (z10 != this.f12030xn) {
            this.f12030xn = z10;
            com.bytedance.adsdk.hn.qor.qor.hn hnVar = this.apu;
            if (hnVar != null) {
                hnVar.hn(z10);
            }
            invalidateSelf();
        }
    }

    public void hn(final String str) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.12
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar2) {
                    ojm.this.hn(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.hn.qor.dkl dklVarQor = dseVar.qor(str);
        if (dklVarQor != null) {
            hnj((int) dklVarQor.hnj);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void qor(float f10) {
        this.f12025sk.qor(f10);
    }

    public void qor(final int i10) {
        if (this.gjv == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.4
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.qor(i10);
                }
            });
        } else {
            this.f12025sk.hnj(i10);
        }
    }

    public void gjv(final float f10) {
        if (this.gjv == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.5
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.gjv(f10);
                }
            });
            return;
        }
        sk.hnj("Drawable#setProgress");
        this.f12025sk.hnj(this.gjv.hnj(f10));
        sk.hn("Drawable#setProgress");
    }

    public void hnj(String str) {
        this.orl = str;
    }

    public boolean hnj(dse dseVar, Context context) {
        if (this.gjv == dseVar) {
            return false;
        }
        this.xad = true;
        ta();
        this.gjv = dseVar;
        hnj(context);
        this.f12025sk.hnj(dseVar);
        gjv(this.f12025sk.getAnimatedFraction());
        Iterator it = new ArrayList(this.f12026ta).iterator();
        while (it.hasNext()) {
            hnj hnjVar = (hnj) it.next();
            if (hnjVar != null) {
                hnjVar.hnj(dseVar);
            }
            it.remove();
        }
        this.f12026ta.clear();
        dseVar.hn(this.wu);
        pty();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void hn(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f12025sk.removeUpdateListener(animatorUpdateListener);
    }

    public void hn(Animator.AnimatorListener animatorListener) {
        this.f12025sk.removeListener(animatorListener);
    }

    private void hn(int i10, int i11) {
        Bitmap bitmap = this.f12029vf;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.f12029vf.getHeight() >= i11) {
            if (this.f12029vf.getWidth() > i10 || this.f12029vf.getHeight() > i11) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f12029vf, 0, 0, i10, i11);
                this.f12029vf = bitmapCreateBitmap;
                this.hqh.setBitmap(bitmapCreateBitmap);
                this.xad = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.f12029vf = bitmapCreateBitmap2;
        this.hqh.setBitmap(bitmapCreateBitmap2);
        this.xad = true;
    }

    public void gjv(int i10) {
        this.f12025sk.setRepeatMode(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void hnj(xn xnVar) {
        this.tu = xnVar;
        pty();
    }

    private void hnj(Context context) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            return;
        }
        com.bytedance.adsdk.hn.qor.qor.hn hnVar = new com.bytedance.adsdk.hn.qor.qor.hn(this, wu.hnj(dseVar), dseVar.orl(), dseVar, context);
        this.apu = hnVar;
        if (this.as) {
            hnVar.hnj(true);
        }
        this.apu.hn(this.f12030xn);
    }

    public void hnj(final int i10) {
        if (this.gjv == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.8
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.hnj(i10);
                }
            });
        } else {
            this.f12025sk.hnj(i10);
        }
    }

    public void hnj(final float f10) {
        dse dseVar = this.gjv;
        if (dseVar == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.9
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar2) {
                    ojm.this.hnj(f10);
                }
            });
        } else {
            hnj((int) com.bytedance.adsdk.hn.dkl.sk.hnj(dseVar.dkl(), this.gjv.dse(), f10));
        }
    }

    public void hnj(final int i10, final int i11) {
        if (this.gjv == null) {
            this.f12026ta.add(new hnj() { // from class: com.bytedance.adsdk.hn.ojm.3
                @Override // com.bytedance.adsdk.hn.ojm.hnj
                public void hnj(dse dseVar) {
                    ojm.this.hnj(i10, i11);
                }
            });
        } else {
            this.f12025sk.hnj(i10, i11 + 0.99f);
        }
    }

    public void hnj(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f12025sk.addUpdateListener(animatorUpdateListener);
    }

    public void hnj(Animator.AnimatorListener animatorListener) {
        this.f12025sk.addListener(animatorListener);
    }

    public void hnj(Boolean bool) {
        this.dkl = bool.booleanValue();
    }

    public void hnj(gjv gjvVar) {
        this.mjg = gjvVar;
        com.bytedance.adsdk.hn.hn.hn hnVar = this.bug;
        if (hnVar != null) {
            hnVar.hnj(gjvVar);
        }
    }

    public void hnj(qor qorVar) {
        this.f12023hn = qorVar;
        com.bytedance.adsdk.hn.hn.hnj hnjVar = this.f12020fc;
        if (hnjVar != null) {
            hnjVar.hnj(qorVar);
        }
    }

    public void hnj(Map<String, Typeface> map) {
        if (map == this.jip) {
            return;
        }
        this.jip = map;
        invalidateSelf();
    }

    public void hnj(apu apuVar) {
        this.qor = apuVar;
    }

    public Bitmap hnj(String str, Bitmap bitmap) {
        com.bytedance.adsdk.hn.hn.hn hnVarUl = ul();
        if (hnVarUl == null) {
            return null;
        }
        Bitmap bitmapHnj = hnVarUl.hnj(str, bitmap);
        invalidateSelf();
        return bitmapHnj;
    }

    public Typeface hnj(com.bytedance.adsdk.hn.qor.qor qorVar) {
        Map<String, Typeface> map = this.jip;
        if (map != null) {
            String strHnj = qorVar.hnj();
            if (map.containsKey(strHnj)) {
                return map.get(strHnj);
            }
            String strHn = qorVar.hn();
            if (map.containsKey(strHn)) {
                return map.get(strHn);
            }
            String str = qorVar.hnj() + "-" + qorVar.qor();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.hn.hn.hnj hnjVarUa = ua();
        if (hnjVarUa != null) {
            return hnjVarUa.hnj(qorVar);
        }
        return null;
    }

    private void hnj(Canvas canvas) {
        com.bytedance.adsdk.hn.qor.qor.hn hnVar = this.apu;
        dse dseVar = this.gjv;
        if (hnVar == null || dseVar == null) {
            return;
        }
        this.xyo.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.xyo.preScale(bounds.width() / dseVar.gjv().width(), bounds.height() / dseVar.gjv().height());
            this.xyo.preTranslate(bounds.left, bounds.top);
        }
        hnVar.hnj(canvas, this.xyo, this.eum);
    }

    private void hnj(Canvas canvas, com.bytedance.adsdk.hn.qor.qor.hn hnVar) {
        if (this.gjv == null || hnVar == null) {
            return;
        }
        orp();
        canvas.getMatrix(this.sq);
        canvas.getClipBounds(this.nyv);
        hnj(this.nyv, this.pty);
        this.sq.mapRect(this.pty);
        hnj(this.pty, this.nyv);
        if (this.f12030xn) {
            this.orp.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            hnVar.hnj(this.orp, (Matrix) null, false);
        }
        this.sq.mapRect(this.orp);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        hnj(this.orp, fWidth, fHeight);
        if (!sq()) {
            RectF rectF = this.orp;
            Rect rect = this.nyv;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.orp.width());
        int iCeil2 = (int) Math.ceil(this.orp.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        hn(iCeil, iCeil2);
        if (this.xad) {
            this.xyo.set(this.sq);
            this.xyo.preScale(fWidth, fHeight);
            Matrix matrix = this.xyo;
            RectF rectF2 = this.orp;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f12029vf.eraseColor(0);
            hnVar.hnj(this.hqh, this.xyo, this.eum);
            this.sq.invert(this.jbd);
            this.jbd.mapRect(this.fvt, this.orp);
            hnj(this.fvt, this.f12027ua);
        }
        this.f12028ul.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f12029vf, this.f12028ul, this.f12027ua, this.f12022gm);
    }

    private void hnj(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void hnj(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void hnj(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
