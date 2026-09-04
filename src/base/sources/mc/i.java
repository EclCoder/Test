package mc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class i extends Drawable implements s {
    private static final String F = "i";
    static final p G = p.g().q(0, 0.0f).m();
    private static final Paint H;
    private static final e[] I;
    private f1.i A;
    f1.h[] B;
    private float[] C;
    private float[] D;
    private d E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p.c f45574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f45575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r.g[] f45576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.g[] f45577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitSet f45578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f45581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Path f45582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f45583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f45584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f45585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Region f45586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Region f45587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f45588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f45589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final lc.a f45590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q.b f45591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final q f45592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f45593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuffColorFilter f45594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f45595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RectF f45596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f45597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f45598y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p f45599z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements p.c {
        a() {
        }

        @Override // mc.p.c
        public mc.d a(mc.d dVar) {
            return dVar instanceof m ? dVar : new mc.b(-i.this.O(), dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements q.b {
        b() {
        }

        @Override // mc.q.b
        public void a(r rVar, Matrix matrix, int i10) {
            i.this.f45578e.set(i10, rVar.e());
            i.this.f45576c[i10] = rVar.f(matrix);
        }

        @Override // mc.q.b
        public void b(r rVar, Matrix matrix, int i10) {
            i.this.f45578e.set(i10 + 4, rVar.e());
            i.this.f45577d[i10] = rVar.f(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class e extends f1.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45624b;

        e(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f45624b = i10;
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(i iVar) {
            if (iVar.C != null) {
                return iVar.C[this.f45624b];
            }
            return 0.0f;
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(i iVar, float f10) {
            if (iVar.C == null || iVar.C[this.f45624b] == f10) {
                return;
            }
            iVar.C[this.f45624b] = f10;
            if (iVar.E != null) {
                iVar.E.a(iVar.C());
            }
            iVar.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I = new e[4];
        while (true) {
            e[] eVarArr = I;
            if (i10 >= eVarArr.length) {
                return;
            }
            eVarArr[i10] = new e(i10);
            i10++;
        }
    }

    public i() {
        this(new p());
    }

    private RectF B() {
        this.f45585l.set(A());
        float fO = O();
        this.f45585l.inset(fO, fO);
        return this.f45585l;
    }

    private boolean B0() {
        return V() || !c0();
    }

    private boolean C0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f45575b.f45605d == null || color2 == (colorForState2 = this.f45575b.f45605d.getColorForState(iArr, (color2 = this.f45588o.getColor())))) {
            z10 = false;
        } else {
            this.f45588o.setColor(colorForState2);
            z10 = true;
        }
        if (this.f45575b.f45606e == null || color == (colorForState = this.f45575b.f45606e.getColorForState(iArr, (color = this.f45589p.getColor())))) {
            return z10;
        }
        this.f45589p.setColor(colorForState);
        return true;
    }

    private void D0(int[] iArr) {
        E0(iArr, false);
    }

    private void E0(int[] iArr, boolean z10) {
        RectF rectFA = A();
        if (!this.f45575b.f45602a.f() || rectFA.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        p pVarB = this.f45575b.f45602a.b(iArr);
        boolean z12 = fc.a.a(this.C) && pVarB.E(A());
        this.f45598y = z12;
        if (!z12) {
            this.f45579f = true;
            this.f45580g = true;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            float fA = this.f45592s.h(i10, pVarB).a(rectFA);
            if (z11) {
                this.C[i10] = fA;
            }
            f1.h hVar = this.B[i10];
            if (hVar != null) {
                hVar.s(fA);
                if (z11) {
                    this.B[i10].y();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    private void F0() {
        this.f45599z = M().G(this.f45574a);
        float[] fArr = this.C;
        if (fArr == null) {
            this.D = null;
            return;
        }
        if (this.D == null) {
            this.D = new float[fArr.length];
        }
        float fO = O();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.C;
            if (i10 >= fArr2.length) {
                return;
            }
            this.D[i10] = Math.max(0.0f, fArr2[i10] - fO);
            i10++;
        }
    }

    private boolean G0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f45593t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f45594u;
        c cVar = this.f45575b;
        this.f45593t = q(cVar.f45608g, cVar.f45609h, this.f45588o, true);
        c cVar2 = this.f45575b;
        this.f45594u = q(cVar2.f45607f, cVar2.f45609h, this.f45589p, false);
        c cVar3 = this.f45575b;
        if (cVar3.f45622u) {
            this.f45590q.d(cVar3.f45608g.getColorForState(getState(), 0));
        }
        return (m0.b.a(porterDuffColorFilter, this.f45593t) && m0.b.a(porterDuffColorFilter2, this.f45594u)) ? false : true;
    }

    private void H0() {
        float fU = U();
        this.f45575b.f45619r = (int) Math.ceil(0.75f * fU);
        this.f45575b.f45620s = (int) Math.ceil(fU * 0.25f);
        G0();
        if (B0()) {
            invalidateSelf();
        } else {
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float O() {
        if (X()) {
            return this.f45589p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean V() {
        c cVar = this.f45575b;
        int i10 = cVar.f45618q;
        if (i10 == 1 || cVar.f45619r <= 0) {
            return false;
        }
        return i10 == 2 || g0();
    }

    private boolean W() {
        Paint.Style style = this.f45575b.f45623v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean X() {
        Paint.Style style = this.f45575b.f45623v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f45589p.getStrokeWidth() > 0.0f;
    }

    private void Z() {
        super.invalidateSelf();
    }

    private boolean a0() {
        for (f1.h hVar : this.B) {
            if (hVar != null && hVar.h()) {
                return true;
            }
        }
        return false;
    }

    private void d0(Canvas canvas) {
        if (V()) {
            canvas.save();
            f0(canvas);
            if (!this.f45597x) {
                t(canvas);
                canvas.restore();
                return;
            }
            Rect bounds = getBounds();
            int iWidth = (int) (this.f45596w.width() - bounds.width());
            int iHeight = (int) (this.f45596w.height() - bounds.height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + iWidth + " extra height: " + iHeight + " path bounds: " + this.f45596w);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f45596w.width()) + (this.f45575b.f45619r * 2) + iWidth, ((int) this.f45596w.height()) + (this.f45575b.f45619r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            int i10 = bounds.left;
            int i11 = this.f45575b.f45619r;
            float f10 = (i10 - i11) - iWidth;
            float f11 = (bounds.top - i11) - iHeight;
            canvas2.translate(-f10, -f11);
            t(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int e0(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void f0(Canvas canvas) {
        canvas.translate(J(), K());
    }

    private PorterDuffColorFilter j(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iR = r(color);
        this.f45595v = iR;
        if (iR != color) {
            return new PorterDuffColorFilter(iR, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f45575b.f45611j != 1.0f) {
            this.f45581h.reset();
            Matrix matrix = this.f45581h;
            float f10 = this.f45575b.f45611j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f45581h);
        }
        path.computeBounds(this.f45596w, true);
    }

    private float n(RectF rectF, p pVar, float[] fArr) {
        if (fArr == null) {
            if (pVar.E(rectF)) {
                return pVar.A().a(rectF);
            }
            return -1.0f;
        }
        if (this.f45598y) {
            return fArr[0];
        }
        return -1.0f;
    }

    private void o() {
        this.f45592s.f(this.f45599z, this.D, this.f45575b.f45612k, B(), null, this.f45583j);
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = r(colorForState);
        }
        this.f45595v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter q(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? j(paint, z10) : p(colorStateList, mode, z10);
    }

    public static i s(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ac.a.c(context, sb.c.f51620m, i.class.getSimpleName()));
        }
        i iVar = new i();
        iVar.Y(context);
        iVar.l0(colorStateList);
        iVar.k0(f10);
        return iVar;
    }

    private void t(Canvas canvas) {
        if (this.f45578e.cardinality() > 0) {
            Log.w(F, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f45575b.f45620s != 0) {
            canvas.drawPath(this.f45582i, this.f45590q.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f45576c[i10].b(this.f45590q, this.f45575b.f45619r, canvas);
            this.f45577d[i10].b(this.f45590q, this.f45575b.f45619r, canvas);
        }
        if (this.f45597x) {
            int iJ = J();
            int iK = K();
            canvas.translate(-iJ, -iK);
            canvas.drawPath(this.f45582i, H);
            canvas.translate(iJ, iK);
        }
    }

    private void u(Canvas canvas) {
        w(canvas, this.f45588o, this.f45582i, this.f45575b.f45602a.e(), this.C, A());
    }

    private void v0(x xVar) {
        c cVar = this.f45575b;
        if (cVar.f45602a != xVar) {
            cVar.f45602a = xVar;
            E0(getState(), true);
            invalidateSelf();
        }
    }

    private void w(Canvas canvas, Paint paint, Path path, p pVar, float[] fArr, RectF rectF) {
        float fN = n(rectF, pVar, fArr);
        if (fN < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fN * this.f45575b.f45612k;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    protected RectF A() {
        this.f45584k.set(getBounds());
        return this.f45584k;
    }

    public void A0(float f10) {
        this.f45575b.f45613l = f10;
        invalidateSelf();
    }

    public float C() {
        float fA;
        float fA2;
        float[] fArr = this.C;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFA = A();
            fA = (this.f45592s.h(3, M()).a(rectFA) + this.f45592s.h(2, M()).a(rectFA)) - this.f45592s.h(1, M()).a(rectFA);
            fA2 = this.f45592s.h(0, M()).a(rectFA);
        }
        return (fA - fA2) / 2.0f;
    }

    public float D() {
        return this.f45575b.f45616o;
    }

    public ColorStateList E() {
        return this.f45575b.f45605d;
    }

    public float F() {
        return this.f45575b.f45612k;
    }

    public float G() {
        return this.f45575b.f45615n;
    }

    public Path H() {
        return this.f45582i;
    }

    public int I() {
        return this.f45595v;
    }

    public int J() {
        c cVar = this.f45575b;
        return (int) (((double) cVar.f45620s) * Math.sin(Math.toRadians(cVar.f45621t)));
    }

    public int K() {
        c cVar = this.f45575b;
        return (int) (((double) cVar.f45620s) * Math.cos(Math.toRadians(cVar.f45621t)));
    }

    public int L() {
        return this.f45575b.f45619r;
    }

    public p M() {
        return this.f45575b.f45602a.e();
    }

    public ColorStateList N() {
        return this.f45575b.f45606e;
    }

    public float P() {
        return this.f45575b.f45613l;
    }

    public ColorStateList Q() {
        return this.f45575b.f45608g;
    }

    public float R() {
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.f45575b.f45602a.e().A().a(A());
    }

    public float S() {
        float[] fArr = this.C;
        return fArr != null ? fArr[0] : this.f45575b.f45602a.e().C().a(A());
    }

    public float T() {
        return this.f45575b.f45617p;
    }

    public float U() {
        return D() + T();
    }

    public void Y(Context context) {
        this.f45575b.f45603b = new cc.a(context);
        H0();
    }

    public boolean b0() {
        cc.a aVar = this.f45575b.f45603b;
        return aVar != null && aVar.e();
    }

    public boolean c0() {
        if (this.f45575b.f45602a.b(getState()).E(A())) {
            return this.C == null || this.f45598y;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f45588o.setColorFilter(this.f45593t);
        int alpha = this.f45588o.getAlpha();
        this.f45588o.setAlpha(e0(alpha, this.f45575b.f45614m));
        this.f45589p.setColorFilter(this.f45594u);
        this.f45589p.setStrokeWidth(this.f45575b.f45613l);
        int alpha2 = this.f45589p.getAlpha();
        this.f45589p.setAlpha(e0(alpha2, this.f45575b.f45614m));
        boolean zB0 = B0();
        if (W()) {
            if (this.f45579f) {
                if (zB0) {
                    k(A(), this.f45582i);
                }
                this.f45579f = false;
            }
            d0(canvas);
            u(canvas);
        }
        if (X()) {
            if (this.f45580g) {
                F0();
                if (zB0) {
                    o();
                }
                this.f45580g = false;
            }
            x(canvas);
        }
        this.f45588o.setAlpha(alpha);
        this.f45589p.setAlpha(alpha2);
    }

    public boolean g0() {
        return (c0() || this.f45582i.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45575b.f45614m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f45575b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f45575b.f45618q == 2) {
            return;
        }
        RectF rectFA = A();
        if (rectFA.isEmpty()) {
            return;
        }
        float fN = n(rectFA, this.f45575b.f45602a.e(), this.C);
        if (fN >= 0.0f) {
            outline.setRoundRect(getBounds(), fN * this.f45575b.f45612k);
            return;
        }
        if (this.f45579f) {
            k(rectFA, this.f45582i);
            this.f45579f = false;
        }
        com.google.android.material.drawable.c.l(outline, this.f45582i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f45575b.f45610i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f45586m.set(getBounds());
        k(A(), this.f45582i);
        this.f45587n.setPath(this.f45582i, this.f45586m);
        this.f45586m.op(this.f45587n, Region.Op.DIFFERENCE);
        return this.f45586m;
    }

    public void h0(float f10) {
        setShapeAppearanceModel(this.f45575b.f45602a.a(f10));
    }

    public void i0(mc.d dVar) {
        setShapeAppearanceModel(this.f45575b.f45602a.c(dVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f45579f = true;
        this.f45580g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f45575b.f45608g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f45575b.f45607f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f45575b.f45606e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f45575b.f45605d;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.f45575b.f45602a.f();
    }

    public void j0(f1.i iVar) {
        if (this.A == iVar) {
            return;
        }
        this.A = iVar;
        int i10 = 0;
        while (true) {
            f1.h[] hVarArr = this.B;
            if (i10 >= hVarArr.length) {
                E0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (hVarArr[i10] == null) {
                    hVarArr[i10] = new f1.h(this, I[i10]);
                }
                this.B[i10].x(new f1.i().f(iVar.a()).h(iVar.c()));
                i10++;
            }
        }
    }

    public void k0(float f10) {
        c cVar = this.f45575b;
        if (cVar.f45616o != f10) {
            cVar.f45616o = f10;
            H0();
        }
    }

    protected final void l(RectF rectF, Path path) {
        this.f45592s.f(this.f45575b.f45602a.e(), this.C, this.f45575b.f45612k, rectF, this.f45591r, path);
    }

    public void l0(ColorStateList colorStateList) {
        c cVar = this.f45575b;
        if (cVar.f45605d != colorStateList) {
            cVar.f45605d = colorStateList;
            onStateChange(getState());
        }
    }

    public float m() {
        float fN = n(A(), this.f45575b.f45602a.e(), this.C);
        return fN >= 0.0f ? fN * this.f45575b.f45612k : fN;
    }

    public void m0(float f10) {
        c cVar = this.f45575b;
        if (cVar.f45612k != f10) {
            cVar.f45612k = f10;
            this.f45579f = true;
            this.f45580g = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f45575b = new c(this.f45575b);
        return this;
    }

    public void n0(d dVar) {
        this.E = dVar;
    }

    public void o0(int i10, int i11, int i12, int i13) {
        c cVar = this.f45575b;
        if (cVar.f45610i == null) {
            cVar.f45610i = new Rect();
        }
        this.f45575b.f45610i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f45579f = true;
        this.f45580g = true;
        super.onBoundsChange(rect);
        if (!this.f45575b.f45602a.f() || rect.isEmpty()) {
            return;
        }
        E0(getState(), true ^ a0());
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.w.b
    protected boolean onStateChange(int[] iArr) {
        if (this.f45575b.f45602a.f()) {
            D0(iArr);
        }
        boolean z10 = C0(iArr) || G0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p0(Paint.Style style) {
        this.f45575b.f45623v = style;
        Z();
    }

    public void q0(float f10) {
        c cVar = this.f45575b;
        if (cVar.f45615n != f10) {
            cVar.f45615n = f10;
            H0();
        }
    }

    protected int r(int i10) {
        float fU = U() + G();
        cc.a aVar = this.f45575b.f45603b;
        return aVar != null ? aVar.c(i10, fU) : i10;
    }

    public void r0(boolean z10) {
        this.f45597x = z10;
    }

    public void s0(int i10) {
        this.f45590q.d(i10);
        this.f45575b.f45622u = false;
        Z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f45575b;
        if (cVar.f45614m != i10) {
            cVar.f45614m = i10;
            Z();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45575b.f45604c = colorFilter;
        Z();
    }

    @Override // mc.s
    public void setShapeAppearanceModel(p pVar) {
        this.f45575b.f45602a = pVar;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f45575b.f45608g = colorStateList;
        G0();
        Z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f45575b;
        if (cVar.f45609h != mode) {
            cVar.f45609h = mode;
            G0();
            Z();
        }
    }

    public void t0(int i10) {
        c cVar = this.f45575b;
        if (cVar.f45618q != i10) {
            cVar.f45618q = i10;
            Z();
        }
    }

    public void u0(o oVar) {
        if (oVar instanceof p) {
            setShapeAppearanceModel((p) oVar);
        } else {
            v0((x) oVar);
        }
    }

    protected void v(Canvas canvas, Paint paint, Path path, RectF rectF) {
        w(canvas, paint, path, this.f45575b.f45602a.e(), this.C, rectF);
    }

    public void w0(float f10, int i10) {
        A0(f10);
        y0(ColorStateList.valueOf(i10));
    }

    protected void x(Canvas canvas) {
        w(canvas, this.f45589p, this.f45583j, this.f45599z, this.D, B());
    }

    public void x0(float f10, ColorStateList colorStateList) {
        A0(f10);
        y0(colorStateList);
    }

    public float y() {
        float[] fArr = this.C;
        return fArr != null ? fArr[2] : this.f45575b.f45602a.e().s().a(A());
    }

    public void y0(ColorStateList colorStateList) {
        c cVar = this.f45575b;
        if (cVar.f45606e != colorStateList) {
            cVar.f45606e = colorStateList;
            onStateChange(getState());
        }
    }

    public float z() {
        float[] fArr = this.C;
        return fArr != null ? fArr[1] : this.f45575b.f45602a.e().u().a(A());
    }

    public void z0(ColorStateList colorStateList) {
        this.f45575b.f45607f = colorStateList;
        G0();
        Z();
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(p.k(context, attributeSet, i10, i11).m());
    }

    public i(p pVar) {
        this(new c(pVar, null));
    }

    public i(o oVar) {
        this(new c(oVar, null));
    }

    protected i(c cVar) {
        this.f45574a = new a();
        this.f45576c = new r.g[4];
        this.f45577d = new r.g[4];
        this.f45578e = new BitSet(8);
        this.f45581h = new Matrix();
        this.f45582i = new Path();
        this.f45583j = new Path();
        this.f45584k = new RectF();
        this.f45585l = new RectF();
        this.f45586m = new Region();
        this.f45587n = new Region();
        Paint paint = new Paint(1);
        this.f45588o = paint;
        Paint paint2 = new Paint(1);
        this.f45589p = paint2;
        this.f45590q = new lc.a();
        this.f45592s = q.m();
        this.f45596w = new RectF();
        this.f45597x = true;
        this.f45598y = true;
        this.B = new f1.h[4];
        this.f45575b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        G0();
        C0(getState());
        this.f45591r = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        o f45602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        cc.a f45603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorFilter f45604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorStateList f45605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f45606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f45607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f45608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f45609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Rect f45610i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f45611j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f45612k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f45613l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f45614m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f45615n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f45616o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f45617p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f45618q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f45619r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45620s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f45621t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f45622u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f45623v;

        public c(o oVar, cc.a aVar) {
            this.f45605d = null;
            this.f45606e = null;
            this.f45607f = null;
            this.f45608g = null;
            this.f45609h = PorterDuff.Mode.SRC_IN;
            this.f45610i = null;
            this.f45611j = 1.0f;
            this.f45612k = 1.0f;
            this.f45614m = 255;
            this.f45615n = 0.0f;
            this.f45616o = 0.0f;
            this.f45617p = 0.0f;
            this.f45618q = 0;
            this.f45619r = 0;
            this.f45620s = 0;
            this.f45621t = 0;
            this.f45622u = false;
            this.f45623v = Paint.Style.FILL_AND_STROKE;
            this.f45602a = oVar;
            this.f45603b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i(this);
            iVar.f45579f = true;
            iVar.f45580g = true;
            return iVar;
        }

        public c(c cVar) {
            this.f45605d = null;
            this.f45606e = null;
            this.f45607f = null;
            this.f45608g = null;
            this.f45609h = PorterDuff.Mode.SRC_IN;
            this.f45610i = null;
            this.f45611j = 1.0f;
            this.f45612k = 1.0f;
            this.f45614m = 255;
            this.f45615n = 0.0f;
            this.f45616o = 0.0f;
            this.f45617p = 0.0f;
            this.f45618q = 0;
            this.f45619r = 0;
            this.f45620s = 0;
            this.f45621t = 0;
            this.f45622u = false;
            this.f45623v = Paint.Style.FILL_AND_STROKE;
            this.f45602a = cVar.f45602a;
            this.f45603b = cVar.f45603b;
            this.f45613l = cVar.f45613l;
            this.f45604c = cVar.f45604c;
            this.f45605d = cVar.f45605d;
            this.f45606e = cVar.f45606e;
            this.f45609h = cVar.f45609h;
            this.f45608g = cVar.f45608g;
            this.f45614m = cVar.f45614m;
            this.f45611j = cVar.f45611j;
            this.f45620s = cVar.f45620s;
            this.f45618q = cVar.f45618q;
            this.f45622u = cVar.f45622u;
            this.f45612k = cVar.f45612k;
            this.f45615n = cVar.f45615n;
            this.f45616o = cVar.f45616o;
            this.f45617p = cVar.f45617p;
            this.f45619r = cVar.f45619r;
            this.f45621t = cVar.f45621t;
            this.f45607f = cVar.f45607f;
            this.f45623v = cVar.f45623v;
            if (cVar.f45610i != null) {
                this.f45610i = new Rect(cVar.f45610i);
            }
        }
    }
}
