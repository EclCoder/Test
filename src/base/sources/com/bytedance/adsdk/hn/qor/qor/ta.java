package com.bytedance.adsdk.hn.qor.qor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends gjv {
    private Path aq;
    private int ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12125ta;

    public ta(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar, Context context) {
        super(ojmVar, skVar);
        this.aq = null;
        this.ojm = -1;
        this.f12125ta = -1;
        if (((gjv) this).dse != null) {
            float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
            this.ojm = (int) (((gjv) this).dse.hnj() * fHnj);
            this.f12125ta = (int) (((gjv) this).dse.hn() * fHnj);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.ojm, this.f12125ta);
            Path path = new Path();
            this.aq = path;
            float f10 = fHnj * 40.0f;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        }
    }

    private static void hnj(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.gjv, com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        View viewHnj = this.f12102hn.hnj();
        if (this.ojm <= 0 || viewHnj == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        hnj(i10);
        float fDkl = dkl();
        hnj(viewHnj, this.ojm, this.f12125ta);
        viewHnj.setAlpha(fDkl);
        canvas.clipPath(this.aq);
        viewHnj.draw(canvas);
        canvas.restore();
    }
}
