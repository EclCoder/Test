package com.bytedance.adsdk.hn.qor.qor;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends hnj {
    private final Paint aq;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<Bitmap, Bitmap> bug;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> dnm;
    protected final com.bytedance.adsdk.hn.ta dse;
    private final Rect ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Rect f12099ta;

    gjv(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar) {
        super(ojmVar, skVar);
        this.aq = new com.bytedance.adsdk.hn.hnj.hnj(3);
        this.ojm = new Rect();
        this.f12099ta = new Rect();
        this.dse = ojmVar.dkl(skVar.dse());
    }

    private Bitmap bug() {
        Bitmap bitmapDse;
        com.bytedance.adsdk.hn.hnj.hn.hnj<Bitmap, Bitmap> hnjVar = this.bug;
        if (hnjVar != null && (bitmapDse = hnjVar.dse()) != null) {
            return bitmapDse;
        }
        Bitmap bitmapSk = this.f12102hn.sk(this.qor.dse());
        if (bitmapSk != null) {
            return bitmapSk;
        }
        com.bytedance.adsdk.hn.ta taVar = this.dse;
        if (taVar != null) {
            return taVar.dnm();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        super.hn(canvas, matrix, i10);
        Bitmap bitmapBug = bug();
        if (bitmapBug == null || bitmapBug.isRecycled() || this.dse == null) {
            return;
        }
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
        this.aq.setAlpha(i10);
        com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> hnjVar = this.dnm;
        if (hnjVar != null) {
            this.aq.setColorFilter(hnjVar.dse());
        }
        canvas.save();
        canvas.concat(matrix);
        this.ojm.set(0, 0, bitmapBug.getWidth(), bitmapBug.getHeight());
        if (this.f12102hn.sk()) {
            this.f12099ta.set(0, 0, (int) (this.dse.hnj() * fHnj), (int) (this.dse.hn() * fHnj));
        } else {
            this.f12099ta.set(0, 0, (int) (bitmapBug.getWidth() * fHnj), (int) (bitmapBug.getHeight() * fHnj));
        }
        canvas.drawBitmap(bitmapBug, this.ojm, this.f12099ta, this.aq);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        super.hnj(rectF, matrix, z10);
        if (this.dse != null) {
            float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
            rectF.set(0.0f, 0.0f, this.dse.hnj() * fHnj, this.dse.hn() * fHnj);
            this.hnj.mapRect(rectF);
        }
    }
}
