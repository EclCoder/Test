package com.xiaopo.flying.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import bk.c;
import bk.e;
import bk.f;
import bk.g;
import bk.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n0.q0;
import n0.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class StickerView extends FrameLayout {
    private b A;
    private long B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f35916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f35917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f35918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f35919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f35920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f35921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f35922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f35923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f35924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float[] f35925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PointF f35926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f35927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PointF f35928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f35929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private bk.b f35930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f35931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f35932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f35933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f35934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h f35936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f35937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f35938z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f35939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35940b;

        a(h hVar, int i10) {
            this.f35939a = hVar;
            this.f35940b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            StickerView.this.e(this.f35939a, this.f35940b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);

        void d(h hVar);

        void e(h hVar);

        void f(h hVar);

        void g(h hVar);

        void h(h hVar);

        void i(h hVar);
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean A(h hVar) {
        if (!this.f35916d.contains(hVar)) {
            Log.d("StickerView", "remove: the sticker is not in this StickerView");
            return false;
        }
        this.f35916d.remove(hVar);
        b bVar = this.A;
        if (bVar != null) {
            bVar.g(hVar);
        }
        if (this.f35936x == hVar) {
            this.f35936x = null;
        }
        invalidate();
        return true;
    }

    public boolean B(String str) {
        for (h hVar : this.f35916d) {
            if (Objects.equals(hVar.j(), str)) {
                this.f35916d.remove(hVar);
                if (this.f35936x == hVar) {
                    this.f35936x = null;
                }
                invalidate();
                return true;
            }
        }
        Log.d("StickerView", "remove: the sticker is not in this StickerView");
        return false;
    }

    public boolean C() {
        return A(this.f35936x);
    }

    public StickerView D(boolean z10) {
        this.f35938z = z10;
        postInvalidate();
        return this;
    }

    public StickerView E(boolean z10) {
        this.f35937y = z10;
        invalidate();
        return this;
    }

    public StickerView F(b bVar) {
        this.A = bVar;
        return this;
    }

    protected void G(h hVar, int i10) {
        float f10;
        float f11;
        float width = getWidth();
        float height = getHeight();
        float fP = width - hVar.p();
        float fI = height - hVar.i();
        if ((i10 & 2) > 0) {
            f10 = fI / 4.0f;
        } else {
            f10 = (i10 & 16) > 0 ? fI * 0.75f : fI / 2.0f;
        }
        if ((i10 & 4) > 0) {
            f11 = fP / 4.0f;
        } else {
            f11 = (i10 & 8) > 0 ? fP * 0.75f : fP / 2.0f;
        }
        hVar.m().postTranslate(f11, f10);
    }

    public void H(MotionEvent motionEvent) {
        I(this.f35936x, motionEvent);
    }

    public void I(h hVar, MotionEvent motionEvent) {
        if (hVar != null) {
            PointF pointF = this.f35928p;
            float fG = g(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
            PointF pointF2 = this.f35928p;
            float fK = k(pointF2.x, pointF2.y, motionEvent.getX(), motionEvent.getY());
            this.f35922j.set(this.f35921i);
            Matrix matrix = this.f35922j;
            float f10 = this.f35933u;
            float f11 = fG / f10;
            float f12 = fG / f10;
            PointF pointF3 = this.f35928p;
            matrix.postScale(f11, f12, pointF3.x, pointF3.y);
            Matrix matrix2 = this.f35922j;
            float f13 = fK - this.f35934v;
            PointF pointF4 = this.f35928p;
            matrix2.postRotate(f13, pointF4.x, pointF4.y);
            this.f35936x.v(this.f35922j);
        }
    }

    public StickerView b(h hVar) {
        return c(hVar, 1);
    }

    public StickerView c(h hVar, int i10) {
        if (q0.T(this)) {
            e(hVar, i10);
            return this;
        }
        post(new a(hVar, i10));
        return this;
    }

    public void d(final h hVar, final Matrix matrix) {
        if (q0.T(this)) {
            f(hVar, matrix);
        } else {
            post(new Runnable() { // from class: bk.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9054a.f(hVar, matrix);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        q(canvas);
    }

    protected void e(h hVar, int i10) {
        G(hVar, i10);
        this.f35936x = hVar;
        this.f35916d.add(hVar);
        b bVar = this.A;
        if (bVar != null) {
            bVar.d(hVar);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(h hVar, Matrix matrix) {
        hVar.v(matrix);
        this.f35936x = hVar;
        this.f35916d.add(hVar);
        b bVar = this.A;
        if (bVar != null) {
            bVar.d(hVar);
        }
        invalidate();
    }

    protected float g(float f10, float f11, float f12, float f13) {
        double d10 = f10 - f12;
        double d11 = f11 - f13;
        return (float) Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public h getCurrentSticker() {
        return this.f35936x;
    }

    public List<bk.b> getIcons() {
        return this.f35917e;
    }

    public int getMinClickDelayTime() {
        return this.C;
    }

    public b getOnStickerOperationListener() {
        return this.A;
    }

    public int getStickerCount() {
        return this.f35916d.size();
    }

    public List<h> getStickers() {
        return this.f35916d;
    }

    protected float h(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        return g(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
    }

    protected PointF i() {
        h hVar = this.f35936x;
        if (hVar == null) {
            this.f35928p.set(0.0f, 0.0f);
            return this.f35928p;
        }
        hVar.k(this.f35928p, this.f35925m, this.f35927o);
        return this.f35928p;
    }

    protected PointF j(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getPointerCount() < 2) {
            this.f35928p.set(0.0f, 0.0f);
            return this.f35928p;
        }
        this.f35928p.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
        return this.f35928p;
    }

    protected float k(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12));
    }

    protected float l(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        return k(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
    }

    public void m() {
        bk.b bVar = new bk.b(androidx.core.content.a.getDrawable(getContext(), f.f9012a), 0);
        bVar.B(new c());
        bk.b bVar2 = new bk.b(androidx.core.content.a.getDrawable(getContext(), f.f9014c), 3);
        bVar2.B(new com.xiaopo.flying.sticker.b());
        bk.b bVar3 = new bk.b(androidx.core.content.a.getDrawable(getContext(), f.f9013b), 1);
        bVar3.B(new e());
        this.f35917e.clear();
        this.f35917e.add(bVar);
        this.f35917e.add(bVar2);
        this.f35917e.add(bVar3);
    }

    protected void n(bk.b bVar, float f10, float f11, float f12) {
        bVar.D(f10);
        bVar.E(f11);
        bVar.m().reset();
        bVar.m().postRotate(f12, bVar.p() / 2, bVar.i() / 2);
        bVar.m().postTranslate(f10 - (bVar.p() / 2), f11 - (bVar.i() / 2));
    }

    protected void o(h hVar) {
        int width = getWidth();
        int height = getHeight();
        hVar.k(this.f35926n, this.f35925m, this.f35927o);
        PointF pointF = this.f35926n;
        float f10 = pointF.x;
        float f11 = f10 < 0.0f ? -f10 : 0.0f;
        float f12 = width;
        if (f10 > f12) {
            f11 = f12 - f10;
        }
        float f13 = pointF.y;
        float f14 = f13 < 0.0f ? -f13 : 0.0f;
        float f15 = height;
        if (f13 > f15) {
            f14 = f15 - f13;
        }
        hVar.m().postTranslate(f11, f14);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f35937y) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f35931s = motionEvent.getX();
        this.f35932t = motionEvent.getY();
        return (r() == null && s() == null) ? false : true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            RectF rectF = this.f35919g;
            rectF.left = i10;
            rectF.top = i11;
            rectF.right = i12;
            rectF.bottom = i13;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h hVar;
        b bVar;
        if (this.f35937y) {
            return super.onTouchEvent(motionEvent);
        }
        int iA = v.a(motionEvent);
        if (iA != 0) {
            if (iA == 1) {
                z(motionEvent);
            } else if (iA == 2) {
                w(motionEvent);
                invalidate();
            } else if (iA == 5) {
                this.f35933u = h(motionEvent);
                this.f35934v = l(motionEvent);
                this.f35928p = j(motionEvent);
                h hVar2 = this.f35936x;
                if (hVar2 != null && x(hVar2, motionEvent.getX(1), motionEvent.getY(1)) && r() == null) {
                    this.f35935w = 2;
                }
            } else if (iA == 6) {
                if (this.f35935w == 2 && (hVar = this.f35936x) != null && (bVar = this.A) != null) {
                    bVar.b(hVar);
                }
                this.f35935w = 0;
            }
        } else if (!y(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean p(String str) {
        Iterator it = this.f35916d.iterator();
        while (it.hasNext()) {
            if (Objects.equals(((h) it.next()).j(), str)) {
                return true;
            }
        }
        return false;
    }

    protected void q(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        char c10;
        Canvas canvas2 = canvas;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f35916d.size(); i11++) {
            h hVar = (h) this.f35916d.get(i11);
            if (hVar != null) {
                hVar.e(canvas2);
            }
        }
        h hVar2 = this.f35936x;
        if (hVar2 == null || this.f35937y) {
            return;
        }
        if (this.f35914b || this.f35913a) {
            v(hVar2, this.f35923k);
            float[] fArr = this.f35923k;
            float f16 = fArr[0];
            int i12 = 1;
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            float f22 = fArr[6];
            float f23 = fArr[7];
            if (this.f35914b) {
                canvas2.drawLine(f16, f17, f18, f19, this.f35918f);
                f10 = f18;
                canvas2 = canvas;
                canvas2.drawLine(f16, f17, f20, f21, this.f35918f);
                canvas2.drawLine(f10, f19, f22, f23, this.f35918f);
                f13 = f19;
                f12 = f22;
                f15 = f23;
                f11 = f20;
                f14 = f21;
                canvas2.drawLine(f12, f15, f11, f14, this.f35918f);
            } else {
                f10 = f18;
                f11 = f20;
                f12 = f22;
                f13 = f19;
                f14 = f21;
                f15 = f23;
            }
            if (this.f35913a) {
                float fK = k(f12, f15, f11, f14);
                while (i10 < this.f35917e.size()) {
                    bk.b bVar = (bk.b) this.f35917e.get(i10);
                    int iY = bVar.y();
                    if (iY == 0) {
                        c10 = 3;
                        n(bVar, f16, f17, fK);
                    } else if (iY == i12) {
                        c10 = 3;
                        n(bVar, f10, f13, fK);
                    } else if (iY != 2) {
                        c10 = 3;
                        if (iY == 3) {
                            n(bVar, f12, f15, fK);
                        }
                    } else {
                        c10 = 3;
                        n(bVar, f11, f14, fK);
                    }
                    bVar.w(canvas2, this.f35918f);
                    i10++;
                    i12 = 1;
                }
            }
        }
    }

    protected bk.b r() {
        for (bk.b bVar : this.f35917e) {
            float fZ = bVar.z() - this.f35931s;
            float fA = bVar.A() - this.f35932t;
            if ((fZ * fZ) + (fA * fA) <= Math.pow(bVar.x() + bVar.x(), 2.0d)) {
                return bVar;
            }
        }
        return null;
    }

    protected h s() {
        for (int size = this.f35916d.size() - 1; size >= 0; size--) {
            if (x((h) this.f35916d.get(size), this.f35931s, this.f35932t)) {
                return (h) this.f35916d.get(size);
            }
        }
        return null;
    }

    public void setIcons(List<bk.b> list) {
        this.f35917e.clear();
        this.f35917e.addAll(list);
        invalidate();
    }

    public void t(h hVar, int i10) {
        if (hVar != null) {
            hVar.g(this.f35928p);
            if ((i10 & 1) > 0) {
                Matrix matrixM = hVar.m();
                PointF pointF = this.f35928p;
                matrixM.preScale(-1.0f, 1.0f, pointF.x, pointF.y);
                hVar.s(!hVar.q());
            }
            if ((i10 & 2) > 0) {
                Matrix matrixM2 = hVar.m();
                PointF pointF2 = this.f35928p;
                matrixM2.preScale(1.0f, -1.0f, pointF2.x, pointF2.y);
                hVar.t(!hVar.r());
            }
            b bVar = this.A;
            if (bVar != null) {
                bVar.f(hVar);
            }
            invalidate();
        }
    }

    public void u(int i10) {
        t(this.f35936x, i10);
    }

    public void v(h hVar, float[] fArr) {
        if (hVar == null) {
            Arrays.fill(fArr, 0.0f);
        } else {
            hVar.f(this.f35924l);
            hVar.l(fArr, this.f35924l);
        }
    }

    protected void w(MotionEvent motionEvent) {
        bk.b bVar;
        int i10 = this.f35935w;
        if (i10 == 1) {
            if (this.f35936x != null) {
                this.f35922j.set(this.f35921i);
                this.f35922j.postTranslate(motionEvent.getX() - this.f35931s, motionEvent.getY() - this.f35932t);
                this.f35936x.v(this.f35922j);
                if (this.f35938z) {
                    o(this.f35936x);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3 || this.f35936x == null || (bVar = this.f35930r) == null) {
                return;
            }
            bVar.c(this, motionEvent);
            return;
        }
        if (this.f35936x != null) {
            float fH = h(motionEvent);
            float fL = l(motionEvent);
            this.f35922j.set(this.f35921i);
            Matrix matrix = this.f35922j;
            float f10 = this.f35933u;
            float f11 = fH / f10;
            float f12 = fH / f10;
            PointF pointF = this.f35928p;
            matrix.postScale(f11, f12, pointF.x, pointF.y);
            Matrix matrix2 = this.f35922j;
            float f13 = fL - this.f35934v;
            PointF pointF2 = this.f35928p;
            matrix2.postRotate(f13, pointF2.x, pointF2.y);
            this.f35936x.v(this.f35922j);
        }
    }

    protected boolean x(h hVar, float f10, float f11) {
        float[] fArr = this.f35927o;
        fArr[0] = f10;
        fArr[1] = f11;
        return hVar.d(fArr);
    }

    protected boolean y(MotionEvent motionEvent) {
        this.f35935w = 1;
        this.f35931s = motionEvent.getX();
        this.f35932t = motionEvent.getY();
        PointF pointFI = i();
        this.f35928p = pointFI;
        this.f35933u = g(pointFI.x, pointFI.y, this.f35931s, this.f35932t);
        PointF pointF = this.f35928p;
        this.f35934v = k(pointF.x, pointF.y, this.f35931s, this.f35932t);
        bk.b bVarR = r();
        this.f35930r = bVarR;
        if (bVarR != null) {
            this.f35935w = 3;
            bVarR.a(this, motionEvent);
        } else {
            this.f35936x = s();
        }
        h hVar = this.f35936x;
        if (hVar != null) {
            this.f35921i.set(hVar.m());
            if (this.f35915c) {
                this.f35916d.remove(this.f35936x);
                this.f35916d.add(this.f35936x);
            }
            b bVar = this.A;
            if (bVar != null) {
                bVar.a(this.f35936x);
            }
        }
        if (this.f35930r == null && this.f35936x == null) {
            return false;
        }
        invalidate();
        return true;
    }

    protected void z(MotionEvent motionEvent) {
        h hVar;
        b bVar;
        h hVar2;
        b bVar2;
        bk.b bVar3;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f35935w == 3 && (bVar3 = this.f35930r) != null && this.f35936x != null) {
            bVar3.b(this, motionEvent);
        }
        if (this.f35935w == 1 && Math.abs(motionEvent.getX() - this.f35931s) < this.f35929q && Math.abs(motionEvent.getY() - this.f35932t) < this.f35929q && (hVar2 = this.f35936x) != null) {
            this.f35935w = 4;
            b bVar4 = this.A;
            if (bVar4 != null) {
                bVar4.e(hVar2);
            }
            if (jUptimeMillis - this.B < this.C && (bVar2 = this.A) != null) {
                bVar2.i(this.f35936x);
            }
        }
        if (this.f35935w == 1 && (hVar = this.f35936x) != null && (bVar = this.A) != null) {
            bVar.c(hVar);
        }
        this.f35935w = 0;
        this.B = jUptimeMillis;
    }

    public StickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35916d = new ArrayList();
        this.f35917e = new ArrayList(4);
        Paint paint = new Paint();
        this.f35918f = paint;
        this.f35919g = new RectF();
        this.f35920h = new Matrix();
        this.f35921i = new Matrix();
        this.f35922j = new Matrix();
        this.f35923k = new float[8];
        this.f35924l = new float[8];
        this.f35925m = new float[2];
        this.f35926n = new PointF();
        this.f35927o = new float[2];
        this.f35928p = new PointF();
        this.f35933u = 0.0f;
        this.f35934v = 0.0f;
        this.f35935w = 0;
        this.B = 0L;
        this.C = 200;
        this.f35929q = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.P);
            this.f35913a = typedArrayObtainStyledAttributes.getBoolean(g.V, false);
            this.f35914b = typedArrayObtainStyledAttributes.getBoolean(g.U, false);
            this.f35937y = typedArrayObtainStyledAttributes.getBoolean(g.T, false);
            this.f35915c = typedArrayObtainStyledAttributes.getBoolean(g.S, false);
            paint.setAntiAlias(true);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(g.R, -16777216));
            paint.setAlpha(typedArrayObtainStyledAttributes.getInteger(g.Q, 200));
            m();
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th2;
        }
    }
}
