package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends View {
    private static final int[] hnj = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int aq;
    private final Paint dkl;
    private int dse;
    private final ArrayList<hnj> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final RectF f14256hn;
    private int ojm;
    private final RectF qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final Paint f14257sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hnj {
        float gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public float f14258hn;
        public Paint hnj;
        float qor;

        public hnj(Paint paint, float f10, float f11, float f12) {
            this.hnj = paint;
            this.f14258hn = f10;
            this.qor = f11;
            this.gjv = f12;
        }
    }

    public aq(Context context) {
        super(context);
        this.f14256hn = new RectF();
        this.qor = new RectF();
        this.gjv = new ArrayList<>();
        this.dkl = new Paint();
        Paint paint = new Paint();
        this.f14257sk = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void hnj() {
        if (this.dse <= 0) {
            return;
        }
        this.qor.right = Math.max(this.ojm, (int) (((this.aq * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f14256hn;
        int i10 = this.dse;
        canvas.drawRoundRect(rectF, i10, i10, this.f14257sk);
        RectF rectF2 = this.qor;
        int i11 = this.dse;
        canvas.drawRoundRect(rectF2, i11, i11, this.dkl);
        int iSave = canvas.save();
        canvas.translate(this.qor.right - this.ojm, 0.0f);
        ArrayList<hnj> arrayList = this.gjv;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            hnj hnjVar = arrayList.get(i12);
            i12++;
            hnj hnjVar2 = hnjVar;
            canvas.drawCircle(hnjVar2.qor, hnjVar2.gjv, hnjVar2.f14258hn, hnjVar2.hnj);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.dse = i14;
        this.ojm = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.f14256hn.set(0.0f, 0.0f, f10, f11);
        this.qor.set(0.0f, 0.0f, 0.0f, f11);
        this.dkl.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.gjv.clear();
        float f12 = this.dse / 4.0f;
        for (int i15 : hnj) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.gjv.add(new hnj(paint, this.dse / 2.0f, f12, f11 / 2.0f));
            f12 += (this.dse / 2.0f) * 3.0f;
        }
        hnj();
    }

    public void setProgress(int i10) {
        int i11 = this.aq;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.aq = i10;
        hnj();
    }
}
