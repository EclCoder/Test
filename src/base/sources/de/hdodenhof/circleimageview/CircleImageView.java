package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final ImageView.ScaleType f36696u = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Bitmap.Config f36697v = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f36698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f36699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f36700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f36701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f36702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f36703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Bitmap f36707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BitmapShader f36708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f36711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f36712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorFilter f36713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f36716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36717t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends ViewOutlineProvider {
        private b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (CircleImageView.this.f36717t) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            CircleImageView.this.f36699b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36698a = new RectF();
        this.f36699b = new RectF();
        this.f36700c = new Matrix();
        this.f36701d = new Paint();
        this.f36702e = new Paint();
        this.f36703f = new Paint();
        this.f36704g = -16777216;
        this.f36705h = 0;
        this.f36706i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.a.f38725a, i10, 0);
        this.f36705h = typedArrayObtainStyledAttributes.getDimensionPixelSize(fk.a.f38728d, 0);
        this.f36704g = typedArrayObtainStyledAttributes.getColor(fk.a.f38726b, -16777216);
        this.f36716s = typedArrayObtainStyledAttributes.getBoolean(fk.a.f38727c, false);
        this.f36706i = typedArrayObtainStyledAttributes.getColor(fk.a.f38729e, 0);
        typedArrayObtainStyledAttributes.recycle();
        g();
    }

    private void c() {
        Paint paint = this.f36701d;
        if (paint != null) {
            paint.setColorFilter(this.f36713p);
        }
    }

    private RectF d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = getPaddingLeft() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f10 = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f10, f10 + paddingTop);
    }

    private Bitmap e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f36697v) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f36697v);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private boolean f(float f10, float f11) {
        return this.f36699b.isEmpty() || Math.pow((double) (f10 - this.f36699b.centerX()), 2.0d) + Math.pow((double) (f11 - this.f36699b.centerY()), 2.0d) <= Math.pow((double) this.f36712o, 2.0d);
    }

    private void g() {
        super.setScaleType(f36696u);
        this.f36714q = true;
        setOutlineProvider(new b());
        if (this.f36715r) {
            i();
            this.f36715r = false;
        }
    }

    private void h() {
        if (this.f36717t) {
            this.f36707j = null;
        } else {
            this.f36707j = e(getDrawable());
        }
        i();
    }

    private void i() {
        int i10;
        if (!this.f36714q) {
            this.f36715r = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f36707j == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f36707j;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f36708k = new BitmapShader(bitmap, tileMode, tileMode);
        this.f36701d.setAntiAlias(true);
        this.f36701d.setDither(true);
        this.f36701d.setFilterBitmap(true);
        this.f36701d.setShader(this.f36708k);
        this.f36702e.setStyle(Paint.Style.STROKE);
        this.f36702e.setAntiAlias(true);
        this.f36702e.setColor(this.f36704g);
        this.f36702e.setStrokeWidth(this.f36705h);
        this.f36703f.setStyle(Paint.Style.FILL);
        this.f36703f.setAntiAlias(true);
        this.f36703f.setColor(this.f36706i);
        this.f36710m = this.f36707j.getHeight();
        this.f36709l = this.f36707j.getWidth();
        this.f36699b.set(d());
        this.f36712o = Math.min((this.f36699b.height() - this.f36705h) / 2.0f, (this.f36699b.width() - this.f36705h) / 2.0f);
        this.f36698a.set(this.f36699b);
        if (!this.f36716s && (i10 = this.f36705h) > 0) {
            this.f36698a.inset(i10 - 1.0f, i10 - 1.0f);
        }
        this.f36711n = Math.min(this.f36698a.height() / 2.0f, this.f36698a.width() / 2.0f);
        c();
        j();
        invalidate();
    }

    private void j() {
        float fWidth;
        float fHeight;
        this.f36700c.set(null);
        float fWidth2 = 0.0f;
        if (this.f36709l * this.f36698a.height() > this.f36698a.width() * this.f36710m) {
            fWidth = this.f36698a.height() / this.f36710m;
            fHeight = 0.0f;
            fWidth2 = (this.f36698a.width() - (this.f36709l * fWidth)) * 0.5f;
        } else {
            fWidth = this.f36698a.width() / this.f36709l;
            fHeight = (this.f36698a.height() - (this.f36710m * fWidth)) * 0.5f;
        }
        this.f36700c.setScale(fWidth, fWidth);
        Matrix matrix = this.f36700c;
        RectF rectF = this.f36698a;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.f36708k.setLocalMatrix(this.f36700c);
    }

    public int getBorderColor() {
        return this.f36704g;
    }

    public int getBorderWidth() {
        return this.f36705h;
    }

    public int getCircleBackgroundColor() {
        return this.f36706i;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f36713p;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f36696u;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f36717t) {
            super.onDraw(canvas);
            return;
        }
        if (this.f36707j == null) {
            return;
        }
        if (this.f36706i != 0) {
            canvas.drawCircle(this.f36698a.centerX(), this.f36698a.centerY(), this.f36711n, this.f36703f);
        }
        canvas.drawCircle(this.f36698a.centerX(), this.f36698a.centerY(), this.f36711n, this.f36701d);
        if (this.f36705h > 0) {
            canvas.drawCircle(this.f36699b.centerX(), this.f36699b.centerY(), this.f36712o, this.f36702e);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36717t) {
            return super.onTouchEvent(motionEvent);
        }
        return f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i10) {
        if (i10 == this.f36704g) {
            return;
        }
        this.f36704g = i10;
        this.f36702e.setColor(i10);
        invalidate();
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 == this.f36716s) {
            return;
        }
        this.f36716s = z10;
        i();
    }

    public void setBorderWidth(int i10) {
        if (i10 == this.f36705h) {
            return;
        }
        this.f36705h = i10;
        i();
    }

    public void setCircleBackgroundColor(int i10) {
        if (i10 == this.f36706i) {
            return;
        }
        this.f36706i = i10;
        this.f36703f.setColor(i10);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i10) {
        setCircleBackgroundColor(getContext().getResources().getColor(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f36713p) {
            return;
        }
        this.f36713p = colorFilter;
        c();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.f36717t == z10) {
            return;
        }
        this.f36717t = z10;
        h();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        i();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        i();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f36696u) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
