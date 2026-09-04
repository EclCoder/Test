package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.f;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements c {
    private float A;
    private float B;
    private float C;
    private Drawable D;
    Matrix E;
    private Bitmap F;
    private BitmapShader G;
    private Matrix H;
    private float I;
    private float J;
    private float K;
    private float L;
    Paint M;
    private int N;
    Rect O;
    Paint P;
    float Q;
    float R;
    float S;
    float T;
    float U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextPaint f2501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Path f2502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f2506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewOutlineProvider f2508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    RectF f2509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f2515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f2516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f2517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2520t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2521u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f2522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Layout f2523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f2524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2525y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2526z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f2506f) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f2507g);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2501a = new TextPaint();
        this.f2502b = new Path();
        this.f2503c = 65535;
        this.f2504d = 65535;
        this.f2505e = false;
        this.f2506f = 0.0f;
        this.f2507g = Float.NaN;
        this.f2510j = 48.0f;
        this.f2511k = Float.NaN;
        this.f2514n = 0.0f;
        this.f2515o = "Hello World";
        this.f2516p = true;
        this.f2517q = new Rect();
        this.f2518r = 1;
        this.f2519s = 1;
        this.f2520t = 1;
        this.f2521u = 1;
        this.f2524x = 8388659;
        this.f2525y = 0;
        this.f2526z = false;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        g(context, attributeSet);
    }

    private void d(float f10, float f11, float f12, float f13) {
        if (this.H == null) {
            return;
        }
        this.B = f12 - f10;
        this.C = f13 - f11;
        k();
    }

    private void g(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f3009q9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f3087w9) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == f.f3100x9) {
                    this.f2522v = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.B9) {
                    this.f2511k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2511k);
                } else if (index == f.f3022r9) {
                    this.f2510j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2510j);
                } else if (index == f.f3048t9) {
                    this.f2512l = typedArrayObtainStyledAttributes.getInt(index, this.f2512l);
                } else if (index == f.f3035s9) {
                    this.f2513m = typedArrayObtainStyledAttributes.getInt(index, this.f2513m);
                } else if (index == f.f3061u9) {
                    this.f2503c = typedArrayObtainStyledAttributes.getColor(index, this.f2503c);
                } else if (index == f.f3126z9) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f2507g);
                    this.f2507g = dimension;
                    setRound(dimension);
                } else if (index == f.A9) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f2506f);
                    this.f2506f = f10;
                    setRoundPercent(f10);
                } else if (index == f.f3074v9) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == f.f3113y9) {
                    this.f2525y = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == f.H9) {
                    this.f2504d = typedArrayObtainStyledAttributes.getInt(index, this.f2504d);
                    this.f2505e = true;
                } else if (index == f.I9) {
                    this.f2514n = typedArrayObtainStyledAttributes.getDimension(index, this.f2514n);
                    this.f2505e = true;
                } else if (index == f.C9) {
                    this.D = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f2505e = true;
                } else if (index == f.D9) {
                    this.R = typedArrayObtainStyledAttributes.getFloat(index, this.R);
                } else if (index == f.E9) {
                    this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                } else if (index == f.J9) {
                    this.K = typedArrayObtainStyledAttributes.getFloat(index, this.K);
                } else if (index == f.K9) {
                    this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                } else if (index == f.F9) {
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                } else if (index == f.G9) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                } else if (index == f.M9) {
                    this.I = typedArrayObtainStyledAttributes.getDimension(index, this.I);
                } else if (index == f.N9) {
                    this.J = typedArrayObtainStyledAttributes.getDimension(index, this.J);
                } else if (index == f.L9) {
                    this.N = typedArrayObtainStyledAttributes.getInt(index, this.N);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        j();
        i();
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.f2511k) ? 1.0f : this.f2510j / this.f2511k;
        TextPaint textPaint = this.f2501a;
        String str = this.f2515o;
        return (((((Float.isNaN(this.B) ? getMeasuredWidth() : this.B) - getPaddingLeft()) - getPaddingRight()) - (f10 * textPaint.measureText(str, 0, str.length()))) * (this.K + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.f2511k) ? 1.0f : this.f2510j / this.f2511k;
        Paint.FontMetrics fontMetrics = this.f2501a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.C) ? getMeasuredHeight() : this.C) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((measuredHeight - ((f11 - f12) * f10)) * (1.0f - this.L)) / 2.0f) - (f10 * f12);
    }

    private void h(String str, int i10, int i11) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i11);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i10 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i10 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i10 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i11 <= 0) {
            this.f2501a.setFakeBoldText(false);
            this.f2501a.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typefaceCreate, i11);
            setTypeface(typefaceDefaultFromStyle);
            int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
            this.f2501a.setFakeBoldText((i12 & 1) != 0);
            this.f2501a.setTextSkewX((i12 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    private void j() {
        if (this.D != null) {
            this.H = new Matrix();
            int intrinsicWidth = this.D.getIntrinsicWidth();
            int intrinsicHeight = this.D.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.J) ? 128 : (int) this.J;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.I) ? 128 : (int) this.I;
            }
            if (this.N != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.F = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.F);
            this.D.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.D.setFilterBitmap(true);
            this.D.draw(canvas);
            if (this.N != 0) {
                this.F = e(this.F, 4);
            }
            Bitmap bitmap = this.F;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.G = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void k() {
        float f10 = Float.isNaN(this.R) ? 0.0f : this.R;
        float f11 = Float.isNaN(this.S) ? 0.0f : this.S;
        float f12 = Float.isNaN(this.T) ? 1.0f : this.T;
        float f13 = Float.isNaN(this.U) ? 0.0f : this.U;
        this.H.reset();
        float width = this.F.getWidth();
        float height = this.F.getHeight();
        float f14 = Float.isNaN(this.J) ? this.B : this.J;
        float f15 = Float.isNaN(this.I) ? this.C : this.I;
        float f16 = f12 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.H.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.I)) {
            f20 = this.I / 2.0f;
        }
        if (!Float.isNaN(this.J)) {
            f18 = this.J / 2.0f;
        }
        this.H.postTranslate((((f10 * f18) + f14) - f17) * 0.5f, (((f11 * f20) + f15) - f19) * 0.5f);
        this.H.postRotate(f13, f14 / 2.0f, f15 / 2.0f);
        this.G.setLocalMatrix(this.H);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f39870w, typedValue, true);
        TextPaint textPaint = this.f2501a;
        int i10 = typedValue.data;
        this.f2503c = i10;
        textPaint.setColor(i10);
    }

    @Override // androidx.constraintlayout.motion.widget.c
    public void a(float f10, float f11, float f12, float f13) {
        int i10 = (int) (f10 + 0.5f);
        this.A = f10 - i10;
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f14 = f12 - f10;
        this.B = f14;
        float f15 = f13 - f11;
        this.C = f15;
        d(f10, f11, f12, f13);
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.f2526z) {
            if (this.O == null) {
                this.P = new Paint();
                this.O = new Rect();
                this.P.set(this.f2501a);
                this.Q = this.P.getTextSize();
            }
            this.B = f14;
            this.C = f15;
            Paint paint = this.P;
            String str = this.f2515o;
            paint.getTextBounds(str, 0, str.length(), this.O);
            int iWidth = this.O.width();
            float fHeight = this.O.height() * 1.3f;
            float f16 = (f14 - this.f2519s) - this.f2518r;
            float f17 = (f15 - this.f2521u) - this.f2520t;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                this.f2501a.setTextSize((this.Q * f16) / f18);
            } else {
                this.f2501a.setTextSize((this.Q * f17) / fHeight);
            }
            if (this.f2505e || !Float.isNaN(this.f2511k)) {
                f(Float.isNaN(this.f2511k) ? 1.0f : this.f2510j / this.f2511k);
            }
        }
    }

    Bitmap e(Bitmap bitmap, int i10) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i11 = 0; i11 < i10 && width >= 32 && height >= 32; i11++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    void f(float f10) {
        if (this.f2505e || f10 != 1.0f) {
            this.f2502b.reset();
            String str = this.f2515o;
            int length = str.length();
            this.f2501a.getTextBounds(str, 0, length, this.f2517q);
            this.f2501a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f2502b);
            if (f10 != 1.0f) {
                Log.v("MotionLabel", androidx.constraintlayout.motion.widget.a.a() + " scale " + f10);
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f2502b.transform(matrix);
            }
            Rect rect = this.f2517q;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f2516p = false;
        }
    }

    public float getRound() {
        return this.f2507g;
    }

    public float getRoundPercent() {
        return this.f2506f;
    }

    public float getScaleFromTextSize() {
        return this.f2511k;
    }

    public float getTextBackgroundPanX() {
        return this.R;
    }

    public float getTextBackgroundPanY() {
        return this.S;
    }

    public float getTextBackgroundRotate() {
        return this.U;
    }

    public float getTextBackgroundZoom() {
        return this.T;
    }

    public int getTextOutlineColor() {
        return this.f2504d;
    }

    public float getTextPanX() {
        return this.K;
    }

    public float getTextPanY() {
        return this.L;
    }

    public float getTextureHeight() {
        return this.I;
    }

    public float getTextureWidth() {
        return this.J;
    }

    public Typeface getTypeface() {
        return this.f2501a.getTypeface();
    }

    void i() {
        this.f2518r = getPaddingLeft();
        this.f2519s = getPaddingRight();
        this.f2520t = getPaddingTop();
        this.f2521u = getPaddingBottom();
        h(this.f2522v, this.f2513m, this.f2512l);
        this.f2501a.setColor(this.f2503c);
        this.f2501a.setStrokeWidth(this.f2514n);
        this.f2501a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f2501a.setFlags(128);
        setTextSize(this.f2510j);
        this.f2501a.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        boolean zIsNaN = Float.isNaN(this.f2511k);
        float f10 = zIsNaN ? 1.0f : this.f2510j / this.f2511k;
        this.B = i12 - i10;
        this.C = i13 - i11;
        if (this.f2526z) {
            if (this.O == null) {
                this.P = new Paint();
                this.O = new Rect();
                this.P.set(this.f2501a);
                this.Q = this.P.getTextSize();
            }
            Paint paint = this.P;
            String str = this.f2515o;
            paint.getTextBounds(str, 0, str.length(), this.O);
            int iWidth = this.O.width();
            int iHeight = (int) (this.O.height() * 1.3f);
            float f11 = (this.B - this.f2519s) - this.f2518r;
            float f12 = (this.C - this.f2521u) - this.f2520t;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    this.f2501a.setTextSize((this.Q * f11) / f13);
                } else {
                    this.f2501a.setTextSize((this.Q * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f2505e || !zIsNaN) {
            d(i10, i11, i12, i13);
            f(f10);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f10 = Float.isNaN(this.f2511k) ? 1.0f : this.f2510j / this.f2511k;
        super.onDraw(canvas);
        if (!this.f2505e && f10 == 1.0f) {
            canvas.drawText(this.f2515o, this.A + this.f2518r + getHorizontalOffset(), this.f2520t + getVerticalOffset(), this.f2501a);
            return;
        }
        if (this.f2516p) {
            f(f10);
        }
        if (this.E == null) {
            this.E = new Matrix();
        }
        if (!this.f2505e) {
            float horizontalOffset = this.f2518r + getHorizontalOffset();
            float verticalOffset = this.f2520t + getVerticalOffset();
            this.E.reset();
            this.E.preTranslate(horizontalOffset, verticalOffset);
            this.f2502b.transform(this.E);
            this.f2501a.setColor(this.f2503c);
            this.f2501a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f2501a.setStrokeWidth(this.f2514n);
            canvas.drawPath(this.f2502b, this.f2501a);
            this.E.reset();
            this.E.preTranslate(-horizontalOffset, -verticalOffset);
            this.f2502b.transform(this.E);
            return;
        }
        this.M.set(this.f2501a);
        this.E.reset();
        float horizontalOffset2 = this.f2518r + getHorizontalOffset();
        float verticalOffset2 = this.f2520t + getVerticalOffset();
        this.E.postTranslate(horizontalOffset2, verticalOffset2);
        this.E.preScale(f10, f10);
        this.f2502b.transform(this.E);
        if (this.G != null) {
            this.f2501a.setFilterBitmap(true);
            this.f2501a.setShader(this.G);
        } else {
            this.f2501a.setColor(this.f2503c);
        }
        this.f2501a.setStyle(Paint.Style.FILL);
        this.f2501a.setStrokeWidth(this.f2514n);
        canvas.drawPath(this.f2502b, this.f2501a);
        if (this.G != null) {
            this.f2501a.setShader(null);
        }
        this.f2501a.setColor(this.f2504d);
        this.f2501a.setStyle(Paint.Style.STROKE);
        this.f2501a.setStrokeWidth(this.f2514n);
        canvas.drawPath(this.f2502b, this.f2501a);
        this.E.reset();
        this.E.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f2502b.transform(this.E);
        this.f2501a.set(this.M);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f2526z = false;
        this.f2518r = getPaddingLeft();
        this.f2519s = getPaddingRight();
        this.f2520t = getPaddingTop();
        this.f2521u = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f2501a;
            String str = this.f2515o;
            textPaint.getTextBounds(str, 0, str.length(), this.f2517q);
            if (mode != 1073741824) {
                size = (int) (this.f2517q.width() + 0.99999f);
            }
            size += this.f2518r + this.f2519s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f2501a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f2520t + this.f2521u + fontMetricsInt;
            }
        } else if (this.f2525y != 0) {
            this.f2526z = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i10) {
        if ((i10 & 8388615) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) == 0) {
            i10 |= 48;
        }
        if (i10 != this.f2524x) {
            invalidate();
        }
        this.f2524x = i10;
        int i11 = i10 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (i11 == 48) {
            this.L = -1.0f;
        } else if (i11 != 80) {
            this.L = 0.0f;
        } else {
            this.L = 1.0f;
        }
        int i12 = i10 & 8388615;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.K = 0.0f;
                        return;
                    }
                }
            }
            this.K = 1.0f;
            return;
        }
        this.K = -1.0f;
    }

    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f2507g = f10;
            float f11 = this.f2506f;
            this.f2506f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f2507g != f10;
        this.f2507g = f10;
        if (f10 != 0.0f) {
            if (this.f2502b == null) {
                this.f2502b = new Path();
            }
            if (this.f2509i == null) {
                this.f2509i = new RectF();
            }
            if (this.f2508h == null) {
                b bVar = new b();
                this.f2508h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2509i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2502b.reset();
            Path path = this.f2502b;
            RectF rectF = this.f2509i;
            float f12 = this.f2507g;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10 = this.f2506f != f10;
        this.f2506f = f10;
        if (f10 != 0.0f) {
            if (this.f2502b == null) {
                this.f2502b = new Path();
            }
            if (this.f2509i == null) {
                this.f2509i = new RectF();
            }
            if (this.f2508h == null) {
                a aVar = new a();
                this.f2508h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2506f) / 2.0f;
            this.f2509i.set(0.0f, 0.0f, width, height);
            this.f2502b.reset();
            this.f2502b.addRoundRect(this.f2509i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f2511k = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f2515o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.R = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.S = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.U = f10;
        k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.T = f10;
        k();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f2503c = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f2504d = i10;
        this.f2505e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f2514n = f10;
        this.f2505e = true;
        if (Float.isNaN(f10)) {
            this.f2514n = 1.0f;
            this.f2505e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.K = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.L = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f2510j = f10;
        TextPaint textPaint = this.f2501a;
        if (!Float.isNaN(this.f2511k)) {
            f10 = this.f2511k;
        }
        textPaint.setTextSize(f10);
        f(Float.isNaN(this.f2511k) ? 1.0f : this.f2510j / this.f2511k);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.I = f10;
        k();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.J = f10;
        k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.f2501a.getTypeface(), typeface)) {
            return;
        }
        this.f2501a.setTypeface(typeface);
        if (this.f2523w != null) {
            this.f2523w = null;
            requestLayout();
            invalidate();
        }
    }
}
