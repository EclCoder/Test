package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class GifView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Movie f23688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputStream f23696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f23697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f23698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected GestureDetector.OnGestureListener f23700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected GestureDetector f23701o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            GifView.a(GifView.this);
            return onSingleTapConfirmed(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
    }

    public GifView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ b a(GifView gifView) {
        gifView.getClass();
        return null;
    }

    private void b(Canvas canvas) {
        this.f23688b.setTime(this.f23690d);
        canvas.save();
        float f10 = this.f23693g;
        canvas.scale(f10, f10);
        Movie movie = this.f23688b;
        float f11 = this.f23691e;
        float f12 = this.f23693g;
        movie.draw(canvas, f11 / f12, this.f23692f / f12);
        canvas.restore();
    }

    private void c() {
        this.f23688b = Movie.decodeStream(this.f23696j);
        requestLayout();
    }

    private void d() {
        if (this.f23699m) {
            postInvalidateOnAnimation();
        }
    }

    private void h(Context context, AttributeSet attributeSet, int i10) {
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ef.d.E0, i10, R.style.Widget_GifView);
        this.f23687a = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f23698l = typedArrayObtainStyledAttributes.getBoolean(4, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f23687a != -1) {
            this.f23688b = Movie.decodeStream(getResources().openRawResource(this.f23687a));
        }
    }

    private void i() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f23689c == 0) {
            this.f23689c = jUptimeMillis;
        }
        int iDuration = this.f23688b.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        this.f23690d = (int) ((jUptimeMillis - this.f23689c) % ((long) iDuration));
    }

    public boolean e() {
        return !this.f23698l;
    }

    public void f() {
        if (this.f23698l) {
            return;
        }
        this.f23698l = true;
        invalidate();
    }

    public void g() {
        if (this.f23698l) {
            this.f23698l = false;
            this.f23689c = SystemClock.uptimeMillis() - ((long) this.f23690d);
            invalidate();
        }
    }

    protected GestureDetector.OnGestureListener getGestureListener() {
        return new a();
    }

    public int getGifResource() {
        return this.f23687a;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f23688b != null) {
            if (this.f23698l) {
                b(canvas);
                return;
            }
            i();
            b(canvas);
            d();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f23691e = (getWidth() - this.f23694h) / 2.0f;
        this.f23692f = (getHeight() - this.f23695i) / 2.0f;
        this.f23699m = getVisibility() == 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Movie movie = this.f23688b;
        if (movie == null) {
            setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.f23688b.height();
        float fMin = Math.min(View.MeasureSpec.getMode(i11) != 0 ? View.MeasureSpec.getSize(i11) / iHeight : 1.0f, View.MeasureSpec.getMode(i10) != 0 ? View.MeasureSpec.getSize(i10) / iWidth : 1.0f);
        this.f23693g = fMin;
        int i12 = (int) (iWidth * fMin);
        this.f23694h = i12;
        int i13 = (int) (iHeight * fMin);
        this.f23695i = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        this.f23699m = i10 == 1;
        d();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f23699m = i10 == 0;
        d();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f23699m = i10 == 0;
        d();
    }

    public void setGifImageUri(Uri uri) {
        this.f23696j = sg.a.c(this.f23697k, uri);
        c();
    }

    public void setGifResource(int i10) {
        this.f23687a = i10;
        this.f23696j = getResources().openRawResource(this.f23687a);
        c();
    }

    public GifView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23699m = true;
        this.f23697k = context;
        h(context, attributeSet, i10);
        this.f23700n = getGestureListener();
        this.f23701o = new GestureDetector(getContext(), this.f23700n, null, true);
    }

    public void setSingleTapListener(b bVar) {
    }
}
