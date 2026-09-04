package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends View {
    private List<Integer> aq;
    private float bug;
    private int dkl;
    private Paint dnm;
    private boolean dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12479hn;
    private int hnj;
    private int mjg;
    private List<Integer> ojm;
    private float orl;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12480sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Paint f12481ta;

    public gjv(Context context) {
        this(context, null);
    }

    private void qor() {
        Paint paint = new Paint();
        this.f12481ta = paint;
        paint.setAntiAlias(true);
        this.f12481ta.setStrokeWidth(this.mjg);
        this.aq.add(255);
        this.ojm.add(0);
        Paint paint2 = new Paint();
        this.dnm = paint2;
        paint2.setAntiAlias(true);
        this.dnm.setColor(Color.parseColor("#0FFFFFFF"));
        this.dnm.setStyle(Paint.Style.FILL);
    }

    public void hn() {
        this.dse = false;
        this.ojm.clear();
        this.aq.clear();
        this.aq.add(255);
        this.ojm.add(0);
        invalidate();
    }

    public void hnj() {
        this.dse = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f12481ta.setShader(new LinearGradient(this.bug, 0.0f, this.orl, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.aq.size()) {
                break;
            }
            Integer num = this.aq.get(i10);
            this.f12481ta.setAlpha(num.intValue());
            Integer num2 = this.ojm.get(i10);
            if (this.qor + num2.intValue() < this.f12480sk) {
                canvas.drawCircle(this.bug, this.orl, this.qor + num2.intValue(), this.f12481ta);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f12480sk) {
                this.aq.set(i10, Integer.valueOf(num.intValue() - this.dkl > 0 ? num.intValue() - (this.dkl * 3) : 1));
                this.ojm.set(i10, Integer.valueOf(num2.intValue() + this.dkl));
            }
            i10++;
        }
        List<Integer> list = this.ojm;
        if (list.get(list.size() - 1).intValue() >= this.f12480sk / this.gjv) {
            this.aq.add(255);
            this.ojm.add(0);
        }
        if (this.ojm.size() >= 3) {
            this.ojm.remove(0);
            this.aq.remove(0);
        }
        this.f12481ta.setAlpha(255);
        this.f12481ta.setColor(this.f12479hn);
        canvas.drawCircle(this.bug, this.orl, this.qor, this.dnm);
        if (this.dse) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.bug = f10;
        this.orl = i11 / 2.0f;
        float f11 = f10 - (this.mjg / 2.0f);
        this.f12480sk = f11;
        this.qor = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.hnj = i10;
    }

    public void setCoreColor(int i10) {
        this.f12479hn = i10;
    }

    public void setCoreRadius(int i10) {
        this.qor = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.dkl = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.gjv = i10;
    }

    public void setMaxWidth(int i10) {
        this.f12480sk = i10;
    }

    public gjv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public gjv(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.hnj = -1;
        this.f12479hn = -65536;
        this.qor = 18.0f;
        this.gjv = 3;
        this.f12480sk = 50.0f;
        this.dkl = 2;
        this.dse = false;
        this.aq = new ArrayList();
        this.ojm = new ArrayList();
        this.mjg = 24;
        qor();
    }
}
