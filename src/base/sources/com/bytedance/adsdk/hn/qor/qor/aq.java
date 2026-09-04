package com.bytedance.adsdk.hn.qor.qor;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends hnj {
    private final Paint aq;
    private com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> bug;
    private final sk dnm;
    private final RectF dse;
    private final float[] ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Path f12098ta;

    aq(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar) {
        super(ojmVar, skVar);
        this.dse = new RectF();
        com.bytedance.adsdk.hn.hnj.hnj hnjVar = new com.bytedance.adsdk.hn.hnj.hnj();
        this.aq = hnjVar;
        this.ojm = new float[8];
        this.f12098ta = new Path();
        this.dnm = skVar;
        hnjVar.setAlpha(0);
        hnjVar.setStyle(Paint.Style.FILL);
        hnjVar.setColor(skVar.jip());
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        super.hn(canvas, matrix, i10);
        int iAlpha = Color.alpha(this.dnm.jip());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.gjv.hnj() == null ? 100 : this.gjv.hnj().dse().intValue())) / 100.0f) * 255.0f);
        this.aq.setAlpha(iIntValue);
        com.bytedance.adsdk.hn.hnj.hn.hnj<ColorFilter, ColorFilter> hnjVar = this.bug;
        if (hnjVar != null) {
            this.aq.setColorFilter(hnjVar.dse());
        }
        if (iIntValue > 0) {
            float[] fArr = this.ojm;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.dnm.oj();
            float[] fArr2 = this.ojm;
            fArr2[3] = 0.0f;
            fArr2[4] = this.dnm.oj();
            this.ojm[5] = this.dnm.uua();
            float[] fArr3 = this.ojm;
            fArr3[6] = 0.0f;
            fArr3[7] = this.dnm.uua();
            matrix.mapPoints(this.ojm);
            this.f12098ta.reset();
            Path path = this.f12098ta;
            float[] fArr4 = this.ojm;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f12098ta;
            float[] fArr5 = this.ojm;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f12098ta;
            float[] fArr6 = this.ojm;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f12098ta;
            float[] fArr7 = this.ojm;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f12098ta;
            float[] fArr8 = this.ojm;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f12098ta.close();
            canvas.drawPath(this.f12098ta, this.aq);
        }
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.hnj, com.bytedance.adsdk.hn.hnj.hnj.sk
    public void hnj(RectF rectF, Matrix matrix, boolean z10) {
        super.hnj(rectF, matrix, z10);
        this.dse.set(0.0f, 0.0f, this.dnm.oj(), this.dnm.uua());
        this.hnj.mapRect(this.dse);
        rectF.set(this.dse);
    }
}
