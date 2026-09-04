package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ColorPickerPanelView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f23599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f23600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RectF f23601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f23602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f23603h;

    public ColorPickerPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.f23599d = new Paint();
        this.f23600e = new Paint();
        this.f23596a = getContext().getResources().getDisplayMetrics().density;
    }

    private void b() {
        RectF rectF = this.f23601f;
        this.f23602g = new RectF(rectF.left + 1.0f, rectF.top + 1.0f, rectF.right - 1.0f, rectF.bottom - 1.0f);
        b bVar = new b((int) (this.f23596a * 5.0f));
        this.f23603h = bVar;
        bVar.setBounds(Math.round(this.f23602g.left), Math.round(this.f23602g.top), Math.round(this.f23602g.right), Math.round(this.f23602g.bottom));
    }

    public int getBorderColor() {
        return this.f23597b;
    }

    public int getColor() {
        return this.f23598c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f23602g;
        this.f23599d.setColor(this.f23597b);
        canvas.drawRect(this.f23601f, this.f23599d);
        b bVar = this.f23603h;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        this.f23600e.setColor(this.f23598c);
        canvas.drawRect(rectF, this.f23600e);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        RectF rectF = new RectF();
        this.f23601f = rectF;
        rectF.left = getPaddingLeft();
        this.f23601f.right = i10 - getPaddingRight();
        this.f23601f.top = getPaddingTop();
        this.f23601f.bottom = i11 - getPaddingBottom();
        b();
    }

    public void setBorderColor(int i10) {
        this.f23597b = i10;
        invalidate();
    }

    public void setColor(int i10) {
        this.f23598c = i10;
        invalidate();
    }

    public ColorPickerPanelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23596a = 1.0f;
        this.f23597b = -9539986;
        this.f23598c = -16777216;
        a();
    }
}
