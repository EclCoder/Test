package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip extends View {
    private float dkl;
    private Drawable gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f14292hn;
    private final Path hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Drawable f14293sk;

    public jip(Context context) {
        this(context, false);
    }

    private void hn() {
        int width = getWidth();
        int height = getHeight();
        if (this.dkl <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.hnj.reset();
        this.hnj.addRect(new RectF(0.0f, 0.0f, width * this.dkl, height), Path.Direction.CCW);
    }

    private void hnj() {
        Context context = getContext();
        this.gjv = wu.qor(context, this.f14292hn ? "tt_star_thick_dark" : "tt_star_thick");
        this.f14293sk = wu.qor(context, "tt_star");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.qor <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.gjv.draw(canvas);
            canvas.translate(this.qor, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.hnj);
        for (int i11 = 0; i11 < 5; i11++) {
            this.f14293sk.draw(canvas);
            canvas.translate(this.qor, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.qor * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.qor, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        hn();
    }

    public jip(Context context, boolean z10) {
        super(context);
        this.hnj = new Path();
        this.f14292hn = z10;
        hnj();
    }

    public void hnj(double d10, int i10) {
        int iHnj = (int) sq.hnj(getContext(), i10, false);
        this.qor = iHnj;
        this.gjv.setBounds(0, 0, iHnj, iHnj);
        Drawable drawable = this.f14293sk;
        int i11 = this.qor;
        drawable.setBounds(0, 0, i11, i11);
        this.dkl = ((float) d10) / 5.0f;
        hn();
        requestLayout();
    }
}
