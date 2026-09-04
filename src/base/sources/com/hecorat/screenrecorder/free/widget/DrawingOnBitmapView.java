package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DrawingOnBitmapView extends AppCompatImageView implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f23673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Canvas f23674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f23675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f23676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f23677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f23678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f23679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f23680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f23681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f23682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f23683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f23686s;

    public DrawingOnBitmapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23675h = new Path();
        this.f23676i = new Paint();
        this.f23678k = new ArrayList();
        this.f23679l = new ArrayList();
        this.f23680m = new ArrayList();
        this.f23681n = new ArrayList();
        this.f23677j = context;
        setOnTouchListener(this);
        this.f23682o = getMaxWidth();
        this.f23683p = getMaxHeight();
    }

    private void f(float f10, float f11) {
        this.f23675h.reset();
        this.f23675h.moveTo(f10, f11);
        this.f23670c = f10;
        this.f23671d = f11;
    }

    private void g(float f10, float f11) {
        float fAbs = Math.abs(f10 - this.f23670c);
        float fAbs2 = Math.abs(f11 - this.f23671d);
        if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
            Path path = this.f23675h;
            float f12 = this.f23670c;
            float f13 = this.f23671d;
            path.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            this.f23670c = f10;
            this.f23671d = f11;
        }
        this.f23674g.drawPath(this.f23675h, this.f23676i);
    }

    private void h() {
        this.f23675h.lineTo(this.f23670c, this.f23671d);
        this.f23674g.drawPath(this.f23675h, this.f23676i);
        this.f23678k.add(new Path(this.f23675h));
        this.f23679l.add(Integer.valueOf(this.f23676i.getColor()));
        this.f23680m.add(Integer.valueOf(this.f23669b));
        this.f23681n.add(Integer.valueOf(this.f23672e));
        this.f23675h.reset();
    }

    private void setPaintByType(int i10) {
        if (i10 == 1) {
            this.f23676i.setStrokeJoin(Paint.Join.ROUND);
            this.f23676i.setStrokeCap(Paint.Cap.ROUND);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f23676i.setStrokeJoin(Paint.Join.MITER);
            this.f23676i.setStrokeCap(Paint.Cap.SQUARE);
        }
    }

    public void c() {
        this.f23674g.drawBitmap(this.f23673f, 0.0f, 0.0f, this.f23676i);
        this.f23678k.clear();
        this.f23679l.clear();
        this.f23680m.clear();
        this.f23681n.clear();
        this.f23675h.reset();
        invalidate();
    }

    public void d(Bitmap bitmap, Bitmap bitmap2) {
        this.f23673f = bitmap;
        this.f23684q = bitmap.getWidth();
        this.f23685r = this.f23673f.getHeight();
        this.f23674g = new Canvas(bitmap2);
        this.f23676i.setColor(-16776961);
        this.f23676i.setStyle(Paint.Style.STROKE);
        this.f23676i.setStrokeJoin(Paint.Join.ROUND);
        this.f23676i.setStrokeCap(Paint.Cap.ROUND);
        this.f23674g.drawBitmap(this.f23673f, 0.0f, 0.0f, this.f23676i);
        setImageBitmap(bitmap2);
    }

    public void e(int i10, int i11) {
        this.f23672e = i11;
        if (i11 == 1) {
            this.f23669b = nh.b.a(this.f23677j, (i10 * 2) + 2);
        } else if (i11 == 2) {
            this.f23669b = i10;
        }
        this.f23676i.setStyle(Paint.Style.STROKE);
        this.f23676i.setStrokeWidth(this.f23669b);
        setPaintByType(this.f23672e);
    }

    public int getColor() {
        Paint paint = this.f23676i;
        if (paint != null) {
            return paint.getColor();
        }
        return -16711936;
    }

    public void i() {
        if (this.f23675h != null) {
            if (this.f23678k.size() == 0) {
                return;
            }
            this.f23674g.drawBitmap(this.f23673f, 0.0f, 0.0f, this.f23676i);
            ArrayList arrayList = this.f23678k;
            arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = this.f23679l;
            arrayList2.remove(arrayList2.size() - 1);
            ArrayList arrayList3 = this.f23680m;
            arrayList3.remove(arrayList3.size() - 1);
            ArrayList arrayList4 = this.f23681n;
            arrayList4.remove(arrayList4.size() - 1);
            for (int i10 = 0; i10 < this.f23678k.size(); i10++) {
                this.f23676i.setStrokeWidth(((Integer) this.f23680m.get(i10)).intValue());
                this.f23676i.setColor(((Integer) this.f23679l.get(i10)).intValue());
                setPaintByType(((Integer) this.f23681n.get(i10)).intValue());
                this.f23674g.drawPath((Path) this.f23678k.get(i10), this.f23676i);
            }
            this.f23676i.setColor(this.f23668a);
            this.f23676i.setStrokeWidth(this.f23669b);
            setPaintByType(this.f23672e);
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f23673f != null) {
            super.onMeasure(i10, i11);
            float fMin = Math.min(View.MeasureSpec.getMode(i11) != 0 ? View.MeasureSpec.getSize(i11) / this.f23685r : 1.0f, View.MeasureSpec.getMode(i10) != 0 ? View.MeasureSpec.getSize(i10) / this.f23684q : 1.0f);
            this.f23686s = fMin;
            setMeasuredDimension((int) (this.f23684q * fMin), (int) (this.f23685r * fMin));
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            float f10 = this.f23686s;
            f(x10 / f10, y10 / f10);
            invalidate();
        } else if (action == 1) {
            h();
            invalidate();
            performClick();
        } else if (action == 2) {
            float f11 = this.f23686s;
            g(x10 / f11, y10 / f11);
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setColor(int i10) {
        this.f23676i.setColor(i10);
        this.f23668a = i10;
    }

    public DrawingOnBitmapView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23675h = new Path();
        this.f23676i = new Paint();
        this.f23678k = new ArrayList();
        this.f23679l = new ArrayList();
        this.f23680m = new ArrayList();
        this.f23681n = new ArrayList();
        this.f23677j = context;
        this.f23682o = getMaxWidth();
        this.f23683p = getMaxHeight();
        setOnTouchListener(this);
    }
}
