package bk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l extends h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f9057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f9058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Rect f9059m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f9061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private StaticLayout f9062p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f9064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f9065s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Layout.Alignment f9063q = Layout.Alignment.ALIGN_CENTER;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f9066t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f9067u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f9068v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f9069w = 4.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f9070x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f9071y = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextPaint f9060n = new TextPaint(1);

    public l(Context context, String str) {
        this.f9057k = context;
        this.f9064r = str;
        this.f9061o = androidx.core.content.a.getDrawable(context, f.f9015d);
    }

    private float w(float f10) {
        return TypedValue.applyDimension(1, f10, this.f9057k.getResources().getDisplayMetrics());
    }

    private float x(float f10) {
        return f10 * this.f9057k.getResources().getDisplayMetrics().scaledDensity;
    }

    public l A(float f10) {
        this.f9067u = f10;
        return this;
    }

    public l B(float f10) {
        return y((int) (f10 * 255.0f));
    }

    public l C(int i10, float f10) {
        this.f9071y = i10;
        this.f9070x = f10;
        return this;
    }

    public l D(String str) {
        this.f9064r = str;
        return this;
    }

    public l E(Layout.Alignment alignment) {
        this.f9063q = alignment;
        return this;
    }

    public l F(int i10) {
        this.f9060n.setColor(i10);
        return this;
    }

    public l G(float f10) {
        this.f9065s = f10;
        this.f9060n.setTextSize(x(f10));
        return this;
    }

    public l H(Typeface typeface) {
        this.f9060n.setTypeface(typeface);
        return this;
    }

    public l I() {
        this.f9062p = new StaticLayout(this.f9064r, this.f9060n, p(), this.f9063q, this.f9066t, this.f9067u, true);
        this.f9058l = new Rect(0, 0, p(), i());
        this.f9059m = new Rect(0, 0, p(), i());
        return this;
    }

    @Override // bk.h
    public void e(Canvas canvas) {
        Matrix matrixM = m();
        canvas.save();
        canvas.concat(matrixM);
        Log.d("Test", "Draw matrix: " + matrixM);
        Drawable drawable = this.f9061o;
        if (drawable != null) {
            drawable.setBounds(this.f9058l);
            this.f9061o.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.concat(matrixM);
        if (this.f9059m.width() == p()) {
            canvas.translate(0.0f, (i() / 2) - (this.f9062p.getHeight() / 2));
        } else {
            Rect rect = this.f9059m;
            canvas.translate(rect.left, (rect.top + (rect.height() / 2)) - (this.f9062p.getHeight() / 2));
        }
        if (this.f9070x > 0.0f) {
            Paint.Style style = this.f9060n.getStyle();
            int color = this.f9060n.getColor();
            this.f9060n.setStyle(Paint.Style.STROKE);
            this.f9060n.setStrokeWidth(this.f9070x);
            this.f9060n.setStrokeJoin(Paint.Join.ROUND);
            this.f9060n.setStrokeCap(Paint.Cap.ROUND);
            this.f9060n.setColor(this.f9071y);
            this.f9062p.draw(canvas);
            this.f9060n.setStyle(style);
            this.f9060n.setColor(color);
        }
        this.f9062p.draw(canvas);
        canvas.restore();
    }

    @Override // bk.h
    public int i() {
        return this.f9062p.getHeight();
    }

    @Override // bk.h
    public int p() {
        int length = -1;
        String str = "";
        for (String str2 : this.f9064r.split("\\r?\\n")) {
            if (str2.length() > length) {
                length = str2.length();
                str = str2;
            }
        }
        return (int) (this.f9060n.measureText(str) + w(this.f9069w) + this.f9070x);
    }

    public l y(int i10) {
        this.f9060n.setAlpha(i10);
        return this;
    }

    public l z(float f10) {
        this.f9068v = f10;
        this.f9060n.setLetterSpacing(f10 / x(this.f9065s));
        return this;
    }
}
