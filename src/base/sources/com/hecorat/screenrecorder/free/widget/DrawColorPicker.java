package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DrawColorPicker extends View {
    private float A;
    private RectF B;
    private RectF C;
    private RectF D;
    private RectF E;
    private b F;
    private Point G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f23648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f23649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f23650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f23651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f23652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f23653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f23654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Shader f23655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Shader f23656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Shader f23657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Shader f23658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f23660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f23661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f23662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f23663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f23666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23667z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    public DrawColorPicker(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23642a = 30.0f;
        this.f23643b = 20.0f;
        this.f23644c = 10.0f;
        this.f23645d = 5.0f;
        this.f23646e = 2.0f;
        this.f23647f = 1.0f;
        this.f23659r = 255;
        this.f23660s = 360.0f;
        this.f23661t = 0.0f;
        this.f23662u = 0.0f;
        this.f23663v = "";
        this.f23664w = -14935012;
        this.f23665x = -9539986;
        this.f23666y = false;
        this.f23667z = 0;
        this.G = null;
        j();
    }

    private Point a(int i10) {
        RectF rectF = this.E;
        float fWidth = rectF.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((i10 * fWidth) / 255.0f)) + rectF.left);
        point.y = (int) rectF.top;
        return point;
    }

    private int[] b() {
        int[] iArr = new int[361];
        int i10 = 360;
        int i11 = 0;
        while (i10 >= 0) {
            iArr[i11] = Color.HSVToColor(new float[]{i10, 1.0f, 1.0f});
            i10--;
            i11++;
        }
        return iArr;
    }

    private float c() {
        return Math.max(Math.max(this.f23645d, this.f23646e), this.f23647f * 1.0f) * 1.5f;
    }

    private int d(int i10, int i11) {
        return (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? i11 : getPrefferedHeight();
    }

    private int e(int i10, int i11) {
        return (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? i11 : getPrefferedWidth();
    }

    private void f(Canvas canvas) {
        RectF rectF;
        if (!this.f23666y || (rectF = this.E) == null || this.F == null) {
            return;
        }
        this.f23654m.setColor(this.f23665x);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23654m);
        this.F.draw(canvas);
        float[] fArr = {this.f23660s, this.f23661t, this.f23662u};
        int iHSVToColor = Color.HSVToColor(fArr);
        int iHSVToColor2 = Color.HSVToColor(0, fArr);
        float f10 = rectF.left;
        float f11 = rectF.top;
        LinearGradient linearGradient = new LinearGradient(f10, f11, rectF.right, f11, iHSVToColor, iHSVToColor2, Shader.TileMode.CLAMP);
        this.f23658q = linearGradient;
        this.f23652k.setShader(linearGradient);
        canvas.drawRect(rectF, this.f23652k);
        String str = this.f23663v;
        if (str != null && str != "") {
            canvas.drawText(str, rectF.centerX(), rectF.centerY() + (this.f23647f * 4.0f), this.f23653l);
        }
        float f12 = (this.f23647f * 4.0f) / 2.0f;
        Point pointA = a(this.f23659r);
        RectF rectF2 = new RectF();
        int i10 = pointA.x;
        rectF2.left = i10 - f12;
        rectF2.right = i10 + f12;
        float f13 = rectF.top;
        float f14 = this.f23646e;
        rectF2.top = f13 - f14;
        rectF2.bottom = rectF.bottom + f14;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f23651j);
    }

    private void g(Canvas canvas) {
        RectF rectF = this.D;
        this.f23654m.setColor(this.f23665x);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23654m);
        if (this.f23657p == null) {
            float f10 = rectF.left;
            LinearGradient linearGradient = new LinearGradient(f10, rectF.top, f10, rectF.bottom, b(), (float[]) null, Shader.TileMode.CLAMP);
            this.f23657p = linearGradient;
            this.f23650i.setShader(linearGradient);
        }
        canvas.drawRect(rectF, this.f23650i);
        float f11 = (this.f23647f * 4.0f) / 2.0f;
        Point pointI = i(this.f23660s);
        RectF rectF2 = new RectF();
        float f12 = rectF.left;
        float f13 = this.f23646e;
        rectF2.left = f12 - f13;
        rectF2.right = rectF.right + f13;
        int i10 = pointI.y;
        rectF2.top = i10 - f11;
        rectF2.bottom = i10 + f11;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f23651j);
    }

    private int getPrefferedHeight() {
        int i10 = (int) (this.f23647f * 200.0f);
        return this.f23666y ? (int) (i10 + this.f23644c + this.f23643b) : i10;
    }

    private int getPrefferedWidth() {
        int prefferedHeight = getPrefferedHeight();
        if (this.f23666y) {
            prefferedHeight = (int) (prefferedHeight - (this.f23644c + this.f23643b));
        }
        return (int) (prefferedHeight + this.f23642a + this.f23644c);
    }

    private void h(Canvas canvas) {
        RectF rectF = this.C;
        this.f23654m.setColor(this.f23665x);
        RectF rectF2 = this.B;
        canvas.drawRect(rectF2.left, rectF2.top, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23654m);
        if (this.f23655n == null) {
            float f10 = rectF.left;
            this.f23655n = new LinearGradient(f10, rectF.top, f10, rectF.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        int iHSVToColor = Color.HSVToColor(new float[]{this.f23660s, 1.0f, 1.0f});
        float f11 = rectF.left;
        float f12 = rectF.top;
        this.f23656o = new LinearGradient(f11, f12, rectF.right, f12, -1, iHSVToColor, Shader.TileMode.CLAMP);
        this.f23648g.setShader(new ComposeShader(this.f23655n, this.f23656o, PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(rectF, this.f23648g);
        Point pointP = p(this.f23661t, this.f23662u);
        this.f23649h.setColor(-16777216);
        canvas.drawCircle(pointP.x, pointP.y, this.f23645d - (this.f23647f * 1.0f), this.f23649h);
        this.f23649h.setColor(-2236963);
        canvas.drawCircle(pointP.x, pointP.y, this.f23645d, this.f23649h);
    }

    private Point i(float f10) {
        RectF rectF = this.D;
        float fHeight = rectF.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f10 * fHeight) / 360.0f)) + rectF.top);
        point.x = (int) rectF.left;
        return point;
    }

    private void j() {
        float f10 = getContext().getResources().getDisplayMetrics().density;
        this.f23647f = f10;
        this.f23645d *= f10;
        this.f23646e *= f10;
        this.f23642a *= f10;
        this.f23643b *= f10;
        this.f23644c *= f10;
        this.A = c();
        k();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void k() {
        this.f23648g = new Paint();
        this.f23649h = new Paint();
        this.f23650i = new Paint();
        this.f23651j = new Paint();
        this.f23652k = new Paint();
        this.f23653l = new Paint();
        this.f23654m = new Paint();
        Paint paint = this.f23649h;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f23649h.setStrokeWidth(this.f23647f * 2.0f);
        this.f23649h.setAntiAlias(true);
        this.f23651j.setColor(this.f23664w);
        this.f23651j.setStyle(style);
        this.f23651j.setStrokeWidth(this.f23647f * 2.0f);
        this.f23651j.setAntiAlias(true);
        this.f23653l.setColor(-14935012);
        this.f23653l.setTextSize(this.f23647f * 14.0f);
        this.f23653l.setAntiAlias(true);
        this.f23653l.setTextAlign(Paint.Align.CENTER);
        this.f23653l.setFakeBoldText(true);
    }

    private boolean l(MotionEvent motionEvent) {
        Point point = this.G;
        if (point == null) {
            return false;
        }
        float f10 = point.x;
        float f11 = point.y;
        if (this.D.contains(f10, f11)) {
            this.f23667z = 1;
            this.f23660s = n(motionEvent.getY());
            return true;
        }
        if (this.C.contains(f10, f11)) {
            this.f23667z = 0;
            float[] fArrO = o(motionEvent.getX(), motionEvent.getY());
            this.f23661t = fArrO[0];
            this.f23662u = fArrO[1];
            return true;
        }
        RectF rectF = this.E;
        if (rectF == null || !rectF.contains(f10, f11)) {
            return false;
        }
        this.f23667z = 2;
        this.f23659r = m((int) motionEvent.getX());
        return true;
    }

    private int m(int i10) {
        int i11;
        RectF rectF = this.E;
        int iWidth = (int) rectF.width();
        float f10 = i10;
        float f11 = rectF.left;
        if (f10 < f11) {
            i11 = 0;
        } else {
            i11 = f10 > rectF.right ? iWidth : i10 - ((int) f11);
        }
        return 255 - ((i11 * 255) / iWidth);
    }

    private float n(float f10) {
        float f11;
        RectF rectF = this.D;
        float fHeight = rectF.height();
        float f12 = rectF.top;
        if (f10 < f12) {
            f11 = 0.0f;
        } else {
            f11 = f10 > rectF.bottom ? fHeight : f10 - f12;
        }
        return 360.0f - ((f11 * 360.0f) / fHeight);
    }

    private float[] o(float f10, float f11) {
        float f12;
        RectF rectF = this.C;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f13 = rectF.left;
        float f14 = 0.0f;
        if (f10 < f13) {
            f12 = 0.0f;
        } else {
            f12 = f10 > rectF.right ? fWidth : f10 - f13;
        }
        float f15 = rectF.top;
        if (f11 >= f15) {
            f14 = f11 > rectF.bottom ? fHeight : f11 - f15;
        }
        return new float[]{(1.0f / fWidth) * f12, 1.0f - ((1.0f / fHeight) * f14)};
    }

    private Point p(float f10, float f11) {
        RectF rectF = this.C;
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rectF.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rectF.top);
        return point;
    }

    private void r() {
        if (this.f23666y) {
            RectF rectF = this.B;
            float f10 = rectF.left + 1.0f;
            float f11 = rectF.bottom;
            this.E = new RectF(f10, (f11 - this.f23643b) + 1.0f, rectF.right - 1.0f, f11 - 1.0f);
            b bVar = new b((int) (this.f23647f * 5.0f));
            this.F = bVar;
            bVar.setBounds(Math.round(this.E.left), Math.round(this.E.top), Math.round(this.E.right), Math.round(this.E.bottom));
        }
    }

    private void s() {
        RectF rectF = this.B;
        float f10 = rectF.right;
        this.D = new RectF((f10 - this.f23642a) + 1.0f, rectF.top + 1.0f, f10 - 1.0f, (rectF.bottom - 1.0f) - (this.f23666y ? this.f23644c + this.f23643b : 0.0f));
    }

    private void t() {
        RectF rectF = this.B;
        float fHeight = rectF.height() - 2.0f;
        if (this.f23666y) {
            fHeight -= this.f23644c + this.f23643b;
        }
        float f10 = rectF.left + 1.0f;
        float f11 = rectF.top + 1.0f;
        this.C = new RectF(f10, f11, fHeight + f10, f11 + fHeight);
    }

    public String getAlphaSliderText() {
        return this.f23663v;
    }

    public boolean getAlphaSliderVisible() {
        return this.f23666y;
    }

    public int getBorderColor() {
        return this.f23665x;
    }

    public int getColor() {
        return Color.HSVToColor(this.f23659r, new float[]{this.f23660s, this.f23661t, this.f23662u});
    }

    public float getDrawingOffset() {
        return this.A;
    }

    public int getSliderTrackerColor() {
        return this.f23664w;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.B.width() <= 0.0f || this.B.height() <= 0.0f) {
            return;
        }
        h(canvas);
        g(canvas);
        f(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int iE = e(mode, size);
        int iD = d(mode2, size2);
        if (this.f23666y) {
            float f10 = this.f23643b;
            float f11 = this.f23642a;
            int i12 = (int) ((iD - f10) + f11);
            if (i12 > iE) {
                iD = (int) ((iE - f11) + f10);
            } else {
                iE = i12;
            }
        } else {
            int i13 = (int) ((iE - this.f23644c) - this.f23642a);
            if (i13 > iD || getTag().equals("landscape")) {
                iD /= 2;
                iE = (int) (iD + this.f23644c + this.f23642a);
            } else {
                iD = i13;
            }
        }
        setMeasuredDimension(iE, iD);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        RectF rectF = new RectF();
        this.B = rectF;
        rectF.left = this.A + getPaddingLeft();
        this.B.right = (i10 - this.A) - getPaddingRight();
        this.B.top = this.A + getPaddingTop();
        this.B.bottom = (i11 - this.A) - getPaddingBottom();
        t();
        s();
        r();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.G = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zL = l(motionEvent);
        } else if (action != 1) {
            zL = action != 2 ? false : l(motionEvent);
        } else {
            this.G = null;
            zL = l(motionEvent);
        }
        if (!zL) {
            return super.onTouchEvent(motionEvent);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 2) {
            int i10 = this.f23667z;
            float f10 = 0.0f;
            if (i10 == 0) {
                float f11 = this.f23661t + (x10 / 50.0f);
                float f12 = this.f23662u - (y10 / 50.0f);
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (f12 >= 0.0f) {
                    f10 = f12 > 1.0f ? 1.0f : f12;
                }
                this.f23661t = f11;
                this.f23662u = f10;
            } else if (i10 == 1) {
                float f13 = this.f23660s - (y10 * 10.0f);
                if (f13 >= 0.0f) {
                    f10 = 360.0f;
                    if (f13 <= 360.0f) {
                        f10 = f13;
                    }
                }
                this.f23660s = f10;
            } else if (i10 == 2 && this.f23666y && this.E != null) {
                int i11 = (int) (this.f23659r - (x10 * 10.0f));
                if (i11 < 0) {
                    i11 = 0;
                } else if (i11 > 255) {
                    i11 = 255;
                }
                this.f23659r = i11;
            }
            invalidate();
            return true;
        }
        return super.onTrackballEvent(motionEvent);
    }

    public void q(int i10, boolean z10) {
        int iAlpha = Color.alpha(i10);
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        this.f23659r = iAlpha;
        this.f23660s = fArr[0];
        this.f23661t = fArr[1];
        this.f23662u = fArr[2];
        invalidate();
    }

    public void setAlphaSliderText(int i10) {
        setAlphaSliderText(getContext().getString(i10));
    }

    public void setAlphaSliderVisible(boolean z10) {
        if (this.f23666y != z10) {
            this.f23666y = z10;
            this.f23655n = null;
            this.f23656o = null;
            this.f23657p = null;
            this.f23658q = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i10) {
        this.f23665x = i10;
        invalidate();
    }

    public void setColor(int i10) {
        q(i10, false);
    }

    public void setSliderTrackerColor(int i10) {
        this.f23664w = i10;
        this.f23651j.setColor(i10);
        invalidate();
    }

    public void setAlphaSliderText(String str) {
        this.f23663v = str;
        invalidate();
    }

    public void setOnColorChangedListener(a aVar) {
    }
}
