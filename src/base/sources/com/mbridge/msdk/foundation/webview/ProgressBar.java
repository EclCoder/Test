package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f31005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f31009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f31010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f31011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f31012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f31013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f31017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f31018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f31019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f31020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f31021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f31022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f31023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f31025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f31026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f31027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f31028x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f31005a = new a();
        this.f31011g = 25L;
        this.f31012h = new Handler(Looper.getMainLooper());
        this.f31015k = false;
        this.f31018n = 0.95f;
        this.f31019o = false;
        this.f31021q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f31024t) {
            return this.f31016l ? 1.0f : 0.4f;
        }
        if (this.f31028x < 2000) {
            if (this.f31026v == 1) {
                return this.f31016l ? 1.0f : 0.4f;
            }
            if (this.f31025u == 1) {
                return this.f31016l ? 0.4f : 0.2f;
            }
            if (this.f31016l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f31015k) {
            this.f31015k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f31019o ? 0L : jCurrentTimeMillis - this.f31017m;
        this.f31008d = Math.abs(j10 / 1000.0f);
        this.f31017m = jCurrentTimeMillis;
        this.f31028x += j10;
        float velocity = getVelocity();
        this.f31007c = velocity;
        float f10 = this.f31006b + (velocity * this.f31008d);
        this.f31006b = f10;
        if (!this.f31024t) {
            float f11 = this.f31018n;
            if (f10 > f11) {
                this.f31006b = f11;
            }
        }
        this.f31021q.right = (int) (this.f31006b * this.f31023s);
        this.f31012h.removeCallbacksAndMessages(null);
        this.f31012h.postDelayed(this.f31005a, this.f31011g);
        super.draw(canvas);
        a(canvas, this.f31008d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f31006b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f31013i == null && this.f31020p == null && this.f31022r == null && this.f31009e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f31013i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f31013i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f31020p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f31020p.getIntrinsicHeight());
            }
            this.f31022r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f31009e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f31023s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f31015k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f31013i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f31020p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f31019o = z10;
        if (z10) {
            return;
        }
        this.f31017m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f31025u = 1;
            this.f31026v = 0;
            this.f31027w = 0;
            this.f31028x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f31026v = 1;
            if (this.f31027w == 1) {
                startEndAnimation();
            }
            this.f31028x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f31027w = 1;
            if (this.f31026v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f31016l = true;
        this.f31017m = System.currentTimeMillis();
        this.f31008d = 0.0f;
        this.f31028x = 0L;
        this.f31024t = false;
        this.f31010f = 0.0f;
        this.f31006b = 0.0f;
        this.f31023s = getMeasuredWidth();
        this.f31019o = false;
        this.f31025u = 0;
        this.f31026v = 0;
        this.f31027w = 0;
        Drawable drawable = this.f31013i;
        if (drawable != null) {
            this.f31014j = -drawable.getIntrinsicWidth();
        } else {
            this.f31014j = 0;
        }
        Drawable drawable2 = this.f31022r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f31009e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f31020p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f31024t) {
            return;
        }
        this.f31024t = true;
        this.f31010f = 0.0f;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f31024t) {
            float f11 = this.f31010f;
            float f12 = this.f31023s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f31022r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f31009e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f31020p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f31010f, 0.0f);
        }
        if (this.f31022r != null && this.f31020p != null) {
            int iWidth = (int) (this.f31021q.width() - (this.f31020p.getIntrinsicWidth() * 0.05f));
            Drawable drawable6 = this.f31022r;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.f31022r.draw(canvas);
        }
        if (this.f31024t && (drawable2 = this.f31009e) != null && this.f31020p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f31009e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f31009e.draw(canvas);
            canvas.restore();
        }
        if (this.f31020p != null) {
            canvas.save();
            canvas.translate(this.f31021q.width() - getWidth(), 0.0f);
            this.f31020p.draw(canvas);
            canvas.restore();
        }
        if (!this.f31024t && Math.abs(this.f31006b - this.f31018n) < 1.0E-5f && (drawable = this.f31013i) != null) {
            int i11 = (int) (this.f31014j + (f10 * 0.2f * this.f31023s));
            this.f31014j = i11;
            if (i11 + drawable.getIntrinsicWidth() >= this.f31021q.width()) {
                this.f31014j = -this.f31013i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f31014j, 0.0f);
            this.f31013i.draw(canvas);
            canvas.restore();
        }
        if (this.f31024t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31005a = new a();
        this.f31011g = 25L;
        this.f31012h = new Handler(Looper.getMainLooper());
        this.f31015k = false;
        this.f31018n = 0.95f;
        this.f31019o = false;
        this.f31021q = new Rect();
        a(context);
    }

    public void setProgressBarListener(c cVar) {
    }
}
