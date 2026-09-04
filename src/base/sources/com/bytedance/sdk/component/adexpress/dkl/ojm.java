package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends View {
    private int aq;
    private int dkl;
    private Paint dse;
    private Paint gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12496hn;
    private int hnj;
    private final RectF qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Paint f12497sk;

    public ojm(Context context) {
        super(context);
        this.qor = new RectF();
        hnj();
    }

    private void hnj() {
        Paint paint = new Paint();
        this.gjv = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.dse = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f12497sk = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.qor;
        int i10 = this.dkl;
        canvas.drawRoundRect(rectF, i10, i10, this.f12497sk);
        RectF rectF2 = this.qor;
        int i11 = this.dkl;
        canvas.drawRoundRect(rectF2, i11, i11, this.gjv);
        int i12 = this.hnj;
        int i13 = this.f12496hn;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.dse);
        int i14 = this.hnj;
        int i15 = this.f12496hn;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.dse);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.hnj = i10;
        this.f12496hn = i11;
        RectF rectF = this.qor;
        int i14 = this.aq;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.f12497sk.setStyle(Paint.Style.FILL);
        this.f12497sk.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.dse.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.dse.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.dkl = i10;
    }

    public void setStrokeColor(int i10) {
        this.gjv.setStyle(Paint.Style.STROKE);
        this.gjv.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.gjv.setStrokeWidth(i10);
        this.aq = i10;
    }
}
