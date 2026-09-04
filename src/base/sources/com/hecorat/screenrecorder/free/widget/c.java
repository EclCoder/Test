package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bitmap f23752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Canvas f23753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f23754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f23755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f23756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f23757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Paint f23758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f23759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f23760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f23761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList f23762o;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f23754g = new Path();
        this.f23755h = new Path();
        Paint paint = new Paint();
        this.f23756i = paint;
        Paint paint2 = new Paint();
        this.f23757j = paint2;
        this.f23758k = new Paint(4);
        this.f23760m = new ArrayList();
        this.f23761n = new ArrayList();
        this.f23762o = new ArrayList();
        this.f23759l = context;
        this.f23748a = i10;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(i10);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setColor(-16776961);
        paint2.setStyle(style);
        paint2.setStrokeJoin(Paint.Join.MITER);
        paint2.setStrokeWidth(4.0f);
        setWidth(i11);
    }

    private void c(float f10, float f11) {
        this.f23754g.reset();
        this.f23754g.moveTo(f10, f11);
        this.f23750c = f10;
        this.f23751d = f11;
    }

    private void d(float f10, float f11) {
        float fAbs = Math.abs(f10 - this.f23750c);
        float fAbs2 = Math.abs(f11 - this.f23751d);
        if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
            Path path = this.f23754g;
            float f12 = this.f23750c;
            float f13 = this.f23751d;
            path.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            this.f23750c = f10;
            this.f23751d = f11;
            this.f23755h.reset();
            this.f23755h.addCircle(this.f23750c, this.f23751d, 30.0f, Path.Direction.CW);
        }
    }

    private void e() {
        this.f23754g.lineTo(this.f23750c, this.f23751d);
        this.f23755h.reset();
        this.f23753f.drawPath(this.f23754g, this.f23756i);
        this.f23760m.add(new Path(this.f23754g));
        this.f23761n.add(Integer.valueOf(this.f23756i.getColor()));
        this.f23762o.add(Integer.valueOf(this.f23749b));
        this.f23754g.reset();
    }

    public void a() {
        this.f23752e.eraseColor(0);
        this.f23753f.drawBitmap(this.f23752e, 0.0f, 0.0f, this.f23758k);
        this.f23760m.clear();
        this.f23761n.clear();
        this.f23762o.clear();
        this.f23754g.reset();
        invalidate();
    }

    public void b() {
        if (this.f23754g != null) {
            if (this.f23760m.size() == 0) {
                return;
            }
            this.f23756i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint = this.f23756i;
            ArrayList arrayList = this.f23762o;
            paint.setStrokeWidth(((Integer) arrayList.get(arrayList.size() - 1)).intValue() + 2);
            Canvas canvas = this.f23753f;
            ArrayList arrayList2 = this.f23760m;
            canvas.drawPath((Path) arrayList2.get(arrayList2.size() - 1), this.f23756i);
            this.f23756i.setXfermode(null);
            ArrayList arrayList3 = this.f23760m;
            arrayList3.remove(arrayList3.size() - 1);
            ArrayList arrayList4 = this.f23761n;
            arrayList4.remove(arrayList4.size() - 1);
            ArrayList arrayList5 = this.f23762o;
            arrayList5.remove(arrayList5.size() - 1);
            for (int i10 = 0; i10 < this.f23760m.size(); i10++) {
                this.f23756i.setStrokeWidth(((Integer) this.f23762o.get(i10)).intValue());
                this.f23756i.setColor(((Integer) this.f23761n.get(i10)).intValue());
                this.f23753f.drawPath((Path) this.f23760m.get(i10), this.f23756i);
            }
            this.f23756i.setStrokeWidth(this.f23749b);
            this.f23756i.setColor(this.f23748a);
        }
        invalidate();
    }

    public int getColor() {
        Paint paint = this.f23756i;
        if (paint != null) {
            return paint.getColor();
        }
        return -16711936;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f23752e, 0.0f, 0.0f, this.f23758k);
        canvas.drawPath(this.f23754g, this.f23756i);
        canvas.drawPath(this.f23755h, this.f23757j);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f23753f == null) {
            this.f23752e = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f23753f = new Canvas(this.f23752e);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            c(x10, y10);
            invalidate();
        } else if (action == 1) {
            e();
            invalidate();
            performClick();
        } else if (action == 2) {
            d(x10, y10);
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setPaintColor(int i10) {
        this.f23756i.setColor(i10);
        this.f23748a = i10;
    }

    public void setWidth(int i10) {
        this.f23749b = i10;
        this.f23756i.setStrokeWidth(i10);
    }
}
