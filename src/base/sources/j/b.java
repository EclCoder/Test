package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import h.i;
import h.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f41862m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f41863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f41864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f41865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f41866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f41867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f41869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f41872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f41873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41874l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f41863a = paint;
        this.f41869g = new Path();
        this.f41871i = false;
        this.f41874l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.f40003b1, h.a.f39873z, i.f39986b);
        d(typedArrayObtainStyledAttributes.getColor(j.f40027f1, 0));
        c(typedArrayObtainStyledAttributes.getDimension(j.f40050j1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(j.f40045i1, true));
        e(Math.round(typedArrayObtainStyledAttributes.getDimension(j.f40039h1, 0.0f)));
        this.f41870h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f40033g1, 0);
        this.f41865c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.f40021e1, 0.0f));
        this.f41864b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.f40009c1, 0.0f));
        this.f41866d = typedArrayObtainStyledAttributes.getDimension(j.f40015d1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float a() {
        return this.f41872j;
    }

    public void c(float f10) {
        if (this.f41863a.getStrokeWidth() != f10) {
            this.f41863a.setStrokeWidth(f10);
            this.f41873k = (float) (((double) (f10 / 2.0f)) * Math.cos(f41862m));
            invalidateSelf();
        }
    }

    public void d(int i10) {
        if (i10 != this.f41863a.getColor()) {
            this.f41863a.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f41874l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? f0.a.f(this) == 0 : f0.a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f41864b;
        float fB = b(this.f41865c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f41872j);
        float fB2 = b(this.f41865c, this.f41866d, this.f41872j);
        float fRound = Math.round(b(0.0f, this.f41873k, this.f41872j));
        float fB3 = b(0.0f, f41862m, this.f41872j);
        float fB4 = b(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f41872j);
        double d10 = fB;
        double d11 = fB3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f41869g.rewind();
        float fB5 = b(this.f41867e + this.f41863a.getStrokeWidth(), -this.f41873k, this.f41872j);
        float f11 = (-fB2) / 2.0f;
        this.f41869g.moveTo(f11 + fRound, 0.0f);
        this.f41869g.rLineTo(fB2 - (fRound * 2.0f), 0.0f);
        this.f41869g.moveTo(f11, fB5);
        this.f41869g.rLineTo(fRound2, fRound3);
        this.f41869g.moveTo(f11, -fB5);
        this.f41869g.rLineTo(fRound2, -fRound3);
        this.f41869g.close();
        canvas.save();
        float strokeWidth = this.f41863a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f12 = this.f41867e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f12 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f12);
        if (this.f41868f) {
            canvas.rotate(fB4 * (this.f41871i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f41869g, this.f41863a);
        canvas.restore();
    }

    public void e(float f10) {
        if (f10 != this.f41867e) {
            this.f41867e = f10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f41868f != z10) {
            this.f41868f = z10;
            invalidateSelf();
        }
    }

    public void g(boolean z10) {
        if (this.f41871i != z10) {
            this.f41871i = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41870h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41870h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f41863a.getAlpha()) {
            this.f41863a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f41863a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f41872j != f10) {
            this.f41872j = f10;
            invalidateSelf();
        }
    }
}
