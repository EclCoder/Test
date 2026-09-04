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
public class ColorPickerView extends View {
    private int A;
    private float B;
    private RectF C;
    private RectF D;
    private RectF E;
    private RectF F;
    private b G;
    private Point H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f23610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f23611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f23612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f23613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f23614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f23615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f23616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f23617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Shader f23618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Shader f23619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Shader f23620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Shader f23621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f23623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f23624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f23625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f23626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f23629z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(int i10);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Point a(int i10) {
        RectF rectF = this.F;
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
        return Math.max(Math.max(this.f23607d, this.f23608e), this.f23609f * 1.0f) * 1.5f;
    }

    private int d(int i10, int i11) {
        return (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? i11 : getPrefferedHeight();
    }

    private int e(int i10, int i11) {
        return (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? i11 : getPrefferedWidth();
    }

    private void f(Canvas canvas) {
        RectF rectF;
        if (!this.f23629z || (rectF = this.F) == null || this.G == null) {
            return;
        }
        this.f23617n.setColor(this.f23628y);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23617n);
        this.G.draw(canvas);
        float[] fArr = {this.f23623t, this.f23624u, this.f23625v};
        int iHSVToColor = Color.HSVToColor(fArr);
        int iHSVToColor2 = Color.HSVToColor(0, fArr);
        float f10 = rectF.left;
        float f11 = rectF.top;
        LinearGradient linearGradient = new LinearGradient(f10, f11, rectF.right, f11, iHSVToColor, iHSVToColor2, Shader.TileMode.CLAMP);
        this.f23621r = linearGradient;
        this.f23615l.setShader(linearGradient);
        canvas.drawRect(rectF, this.f23615l);
        String str = this.f23626w;
        if (str != null && str != "") {
            canvas.drawText(str, rectF.centerX(), rectF.centerY() + (this.f23609f * 4.0f), this.f23616m);
        }
        float f12 = (this.f23609f * 4.0f) / 2.0f;
        Point pointA = a(this.f23622s);
        RectF rectF2 = new RectF();
        int i10 = pointA.x;
        rectF2.left = i10 - f12;
        rectF2.right = i10 + f12;
        float f13 = rectF.top;
        float f14 = this.f23608e;
        rectF2.top = f13 - f14;
        rectF2.bottom = rectF.bottom + f14;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f23614k);
    }

    private void g(Canvas canvas) {
        RectF rectF = this.E;
        this.f23617n.setColor(this.f23628y);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23617n);
        if (this.f23620q == null) {
            float f10 = rectF.left;
            LinearGradient linearGradient = new LinearGradient(f10, rectF.top, f10, rectF.bottom, b(), (float[]) null, Shader.TileMode.CLAMP);
            this.f23620q = linearGradient;
            this.f23613j.setShader(linearGradient);
        }
        canvas.drawRect(rectF, this.f23613j);
        float f11 = (this.f23609f * 4.0f) / 2.0f;
        Point pointI = i(this.f23623t);
        RectF rectF2 = new RectF();
        float f12 = rectF.left;
        float f13 = this.f23608e;
        rectF2.left = f12 - f13;
        rectF2.right = rectF.right + f13;
        int i10 = pointI.y;
        rectF2.top = i10 - f11;
        rectF2.bottom = i10 + f11;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f23614k);
    }

    private int getPrefferedHeight() {
        int i10 = (int) (this.f23609f * 200.0f);
        return this.f23629z ? (int) (i10 + this.f23606c + this.f23605b) : i10;
    }

    private int getPrefferedWidth() {
        int prefferedHeight = getPrefferedHeight();
        if (this.f23629z) {
            prefferedHeight = (int) (prefferedHeight - (this.f23606c + this.f23605b));
        }
        return (int) (prefferedHeight + this.f23604a + this.f23606c);
    }

    private void h(Canvas canvas) {
        RectF rectF = this.D;
        this.f23617n.setColor(this.f23628y);
        RectF rectF2 = this.C;
        canvas.drawRect(rectF2.left, rectF2.top, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23617n);
        if (this.f23618o == null) {
            float f10 = rectF.left;
            this.f23618o = new LinearGradient(f10, rectF.top, f10, rectF.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        int iHSVToColor = Color.HSVToColor(new float[]{this.f23623t, 1.0f, 1.0f});
        float f11 = rectF.left;
        float f12 = rectF.top;
        this.f23619p = new LinearGradient(f11, f12, rectF.right, f12, -1, iHSVToColor, Shader.TileMode.CLAMP);
        this.f23611h.setShader(new ComposeShader(this.f23618o, this.f23619p, PorterDuff.Mode.MULTIPLY));
        canvas.drawRect(rectF, this.f23611h);
        Point pointP = p(this.f23624u, this.f23625v);
        this.f23612i.setColor(-16777216);
        canvas.drawCircle(pointP.x, pointP.y, this.f23607d - (this.f23609f * 1.0f), this.f23612i);
        this.f23612i.setColor(-2236963);
        canvas.drawCircle(pointP.x, pointP.y, this.f23607d, this.f23612i);
    }

    private Point i(float f10) {
        RectF rectF = this.E;
        float fHeight = rectF.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f10 * fHeight) / 360.0f)) + rectF.top);
        point.x = (int) rectF.left;
        return point;
    }

    private void j() {
        float f10 = getContext().getResources().getDisplayMetrics().density;
        this.f23609f = f10;
        this.f23607d *= f10;
        this.f23608e *= f10;
        this.f23604a *= f10;
        this.f23605b *= f10;
        this.f23606c *= f10;
        this.B = c();
        k();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void k() {
        this.f23611h = new Paint();
        this.f23612i = new Paint();
        this.f23613j = new Paint();
        this.f23614k = new Paint();
        this.f23615l = new Paint();
        this.f23616m = new Paint();
        this.f23617n = new Paint();
        Paint paint = this.f23612i;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f23612i.setStrokeWidth(this.f23609f * 2.0f);
        this.f23612i.setAntiAlias(true);
        this.f23614k.setColor(this.f23627x);
        this.f23614k.setStyle(style);
        this.f23614k.setStrokeWidth(this.f23609f * 2.0f);
        this.f23614k.setAntiAlias(true);
        this.f23616m.setColor(-14935012);
        this.f23616m.setTextSize(this.f23609f * 14.0f);
        this.f23616m.setAntiAlias(true);
        this.f23616m.setTextAlign(Paint.Align.CENTER);
        this.f23616m.setFakeBoldText(true);
    }

    private boolean l(MotionEvent motionEvent) {
        Point point = this.H;
        if (point == null) {
            return false;
        }
        float f10 = point.x;
        float f11 = point.y;
        if (this.E.contains(f10, f11)) {
            this.A = 1;
            this.f23623t = n(motionEvent.getY());
            return true;
        }
        if (this.D.contains(f10, f11)) {
            this.A = 0;
            float[] fArrO = o(motionEvent.getX(), motionEvent.getY());
            this.f23624u = fArrO[0];
            this.f23625v = fArrO[1];
            return true;
        }
        RectF rectF = this.F;
        if (rectF == null || !rectF.contains(f10, f11)) {
            return false;
        }
        this.A = 2;
        this.f23622s = m((int) motionEvent.getX());
        return true;
    }

    private int m(int i10) {
        int i11;
        RectF rectF = this.F;
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
        RectF rectF = this.E;
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
        RectF rectF = this.D;
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
        RectF rectF = this.D;
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rectF.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rectF.top);
        return point;
    }

    private void r() {
        if (this.f23629z) {
            RectF rectF = this.C;
            float f10 = rectF.left + 1.0f;
            float f11 = rectF.bottom;
            this.F = new RectF(f10, (f11 - this.f23605b) + 1.0f, rectF.right - 1.0f, f11 - 1.0f);
            b bVar = new b((int) (this.f23609f * 5.0f));
            this.G = bVar;
            bVar.setBounds(Math.round(this.F.left), Math.round(this.F.top), Math.round(this.F.right), Math.round(this.F.bottom));
        }
    }

    private void s() {
        RectF rectF = this.C;
        float f10 = rectF.right;
        this.E = new RectF((f10 - this.f23604a) + 1.0f, rectF.top + 1.0f, f10 - 1.0f, (rectF.bottom - 1.0f) - (this.f23629z ? this.f23606c + this.f23605b : 0.0f));
    }

    private void t() {
        RectF rectF = this.C;
        float fHeight = rectF.height() - 2.0f;
        if (this.f23629z) {
            fHeight -= this.f23606c + this.f23605b;
        }
        float f10 = rectF.left + 1.0f;
        float f11 = rectF.top + 1.0f;
        this.D = new RectF(f10, f11, fHeight + f10, f11 + fHeight);
    }

    public String getAlphaSliderText() {
        return this.f23626w;
    }

    public boolean getAlphaSliderVisible() {
        return this.f23629z;
    }

    public int getBorderColor() {
        return this.f23628y;
    }

    public int getColor() {
        return Color.HSVToColor(this.f23622s, new float[]{this.f23623t, this.f23624u, this.f23625v});
    }

    public float getDrawingOffset() {
        return this.B;
    }

    public int getSliderTrackerColor() {
        return this.f23627x;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.C.width() <= 0.0f || this.C.height() <= 0.0f) {
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
        if (this.f23629z) {
            float f10 = this.f23605b;
            float f11 = this.f23604a;
            int i12 = (int) ((iD - f10) + f11);
            if (i12 > iE) {
                iD = (int) ((iE - f11) + f10);
            } else {
                iE = i12;
            }
        } else {
            int i13 = (int) ((iE - this.f23606c) - this.f23604a);
            if (i13 > iD || getTag().equals("landscape")) {
                iD /= 2;
                iE = (int) (iD + this.f23606c + this.f23604a);
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
        this.C = rectF;
        rectF.left = this.B + getPaddingLeft();
        this.C.right = (i10 - this.B) - getPaddingRight();
        this.C.top = this.B + getPaddingTop();
        this.C.bottom = (i11 - this.B) - getPaddingBottom();
        t();
        s();
        r();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.H = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zL = l(motionEvent);
        } else if (action != 1) {
            zL = action != 2 ? false : l(motionEvent);
        } else {
            this.H = null;
            zL = l(motionEvent);
        }
        if (!zL) {
            return super.onTouchEvent(motionEvent);
        }
        a aVar = this.f23610g;
        if (aVar != null) {
            aVar.a(Color.HSVToColor(this.f23622s, new float[]{this.f23623t, this.f23624u, this.f23625v}));
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 2) {
            int i10 = this.A;
            float f10 = 0.0f;
            if (i10 == 0) {
                float f11 = this.f23624u + (x10 / 50.0f);
                float f12 = this.f23625v - (y10 / 50.0f);
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (f12 >= 0.0f) {
                    f10 = f12 > 1.0f ? 1.0f : f12;
                }
                this.f23624u = f11;
                this.f23625v = f10;
            } else if (i10 == 1) {
                float f13 = this.f23623t - (y10 * 10.0f);
                if (f13 >= 0.0f) {
                    f10 = 360.0f;
                    if (f13 <= 360.0f) {
                        f10 = f13;
                    }
                }
                this.f23623t = f10;
            } else if (i10 == 2 && this.f23629z && this.F != null) {
                int i11 = (int) (this.f23622s - (x10 * 10.0f));
                if (i11 < 0) {
                    i11 = 0;
                } else if (i11 > 255) {
                    i11 = 255;
                }
                this.f23622s = i11;
            }
            a aVar = this.f23610g;
            if (aVar != null) {
                aVar.a(Color.HSVToColor(this.f23622s, new float[]{this.f23623t, this.f23624u, this.f23625v}));
            }
            invalidate();
            return true;
        }
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void q(int i10, boolean z10) {
        a aVar;
        int iAlpha = Color.alpha(i10);
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        this.f23622s = iAlpha;
        float f10 = fArr[0];
        this.f23623t = f10;
        float f11 = fArr[1];
        this.f23624u = f11;
        float f12 = fArr[2];
        this.f23625v = f12;
        if (z10 && (aVar = this.f23610g) != null) {
            aVar.a(Color.HSVToColor(iAlpha, new float[]{f10, f11, f12}));
        }
        invalidate();
    }

    public void setAlphaSliderText(int i10) {
        setAlphaSliderText(getContext().getString(i10));
    }

    public void setAlphaSliderVisible(boolean z10) {
        if (this.f23629z != z10) {
            this.f23629z = z10;
            this.f23618o = null;
            this.f23619p = null;
            this.f23620q = null;
            this.f23621r = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i10) {
        this.f23628y = i10;
        invalidate();
    }

    public void setColor(int i10) {
        q(i10, false);
    }

    public void setOnColorChangedListener(a aVar) {
        this.f23610g = aVar;
    }

    public void setSliderTrackerColor(int i10) {
        this.f23627x = i10;
        this.f23614k.setColor(i10);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23604a = 30.0f;
        this.f23605b = 20.0f;
        this.f23606c = 10.0f;
        this.f23607d = 5.0f;
        this.f23608e = 2.0f;
        this.f23609f = 1.0f;
        this.f23622s = 255;
        this.f23623t = 360.0f;
        this.f23624u = 0.0f;
        this.f23625v = 0.0f;
        this.f23626w = "";
        this.f23627x = -14935012;
        this.f23628y = -9539986;
        this.f23629z = false;
        this.A = 0;
        this.H = null;
        j();
    }

    public void setAlphaSliderText(String str) {
        this.f23626w = str;
        invalidate();
    }
}
