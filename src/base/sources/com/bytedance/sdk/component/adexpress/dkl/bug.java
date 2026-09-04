package com.bytedance.sdk.component.adexpress.dkl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends View {
    private int aq;
    private Xfermode bug;
    private int dkl;
    private Paint dnm;
    private int dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final List<hnj> f12466fc;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    Rect f12467hn;
    Rect hnj;
    private LinearGradient mjg;
    private int[] ojm;
    private PorterDuff.Mode orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12468sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Bitmap f12469ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f12470hn = 0;
        private final int hnj;

        public hnj(int i10) {
            this.hnj = i10;
        }

        public void hnj() {
            this.f12470hn += this.hnj;
        }
    }

    public bug(Context context) {
        super(context);
        this.orl = PorterDuff.Mode.DST_IN;
        this.f12466fc = new ArrayList();
        hnj();
    }

    private void hnj() {
        this.qor = com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_splash_unlock_image_arrow");
        this.gjv = Color.parseColor("#00ffffff");
        this.f12468sk = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.dkl = color;
        this.dse = 10;
        this.aq = 40;
        this.ojm = new int[]{this.gjv, this.f12468sk, color};
        setLayerType(1, null);
        this.dnm = new Paint(1);
        this.f12469ta = BitmapFactory.decodeResource(getResources(), this.qor);
        this.bug = new PorterDuffXfermode(this.orl);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f12469ta, this.hnj, this.f12467hn, this.dnm);
        canvas.save();
        Iterator<hnj> it = this.f12466fc.iterator();
        while (it.hasNext()) {
            hnj next = it.next();
            this.mjg = new LinearGradient(next.f12470hn, 0.0f, next.f12470hn + this.aq, this.dse, this.ojm, (float[]) null, Shader.TileMode.CLAMP);
            this.dnm.setColor(-1);
            this.dnm.setShader(this.mjg);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.dnm);
            this.dnm.setShader(null);
            next.hnj();
            if (next.f12470hn > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.dnm.setXfermode(this.bug);
        canvas3.drawBitmap(this.f12469ta, this.hnj, this.f12467hn, this.dnm);
        this.dnm.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f12469ta == null) {
            return;
        }
        this.hnj = new Rect(0, 0, this.f12469ta.getWidth(), this.f12469ta.getHeight());
        this.f12467hn = new Rect(0, 0, getWidth(), getHeight());
    }

    public void hnj(int i10) {
        this.f12466fc.add(new hnj(i10));
        postInvalidate();
    }
}
