package com.bytedance.adsdk.ugeno.hnj.hnj;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends hnj {
    private boolean aq;
    private Path bug;
    private float dkl;
    private Path dnm;
    private String dse;
    private float gjv;
    private boolean ojm;
    private PorterDuffXfermode orl;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Paint f12329sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Path f12330ta;

    public sk(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
        super(qorVar, jSONObject);
        this.aq = true;
        this.ojm = true;
        Paint paint = new Paint();
        this.f12329sk = paint;
        paint.setAntiAlias(true);
        this.f12326hn.dnm().setLayerType(2, null);
        this.orl = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f12330ta = new Path();
        this.dnm = new Path();
        this.bug = new Path();
        this.f12329sk.setXfermode(this.orl);
    }

    private void qor(Canvas canvas) {
        if (this.f12326hn.xo() <= 0.0f) {
            this.f12329sk.setXfermode(this.orl);
            canvas.drawRect(0.0f, 0.0f, this.qor, this.gjv, this.f12329sk);
            return;
        }
        int iXo = (int) (this.qor * this.f12326hn.xo());
        int iXo2 = (int) (this.gjv * this.f12326hn.xo());
        this.f12329sk.setXfermode(this.orl);
        String str = this.dse;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(0.0f, iXo2, this.qor, this.gjv, this.f12329sk);
                break;
            case "center":
                this.f12330ta.reset();
                this.dnm.reset();
                this.bug.reset();
                Path.Direction direction = Path.Direction.CW;
                this.f12330ta.addCircle(this.qor / 2.0f, this.gjv / 2.0f, iXo, direction);
                Path path = this.dnm;
                float f10 = this.qor;
                path.addRect(f10 / 2.0f, 0.0f, f10, this.gjv, direction);
                Path path2 = this.dnm;
                Path path3 = this.f12330ta;
                Path.Op op2 = Path.Op.DIFFERENCE;
                path2.op(path3, op2);
                this.bug.addRect(0.0f, 0.0f, this.qor / 2.0f, this.gjv, direction);
                this.bug.op(this.f12330ta, op2);
                canvas.drawPath(this.dnm, this.f12329sk);
                canvas.drawPath(this.bug, this.f12329sk);
                break;
            case "top":
                canvas.drawRect(0.0f, 0.0f, this.qor, this.gjv - iXo2, this.f12329sk);
                break;
            case "left":
                canvas.drawRect(0.0f, 0.0f, this.qor - iXo, this.gjv, this.f12329sk);
                break;
            case "right":
                canvas.drawRect(iXo, 0.0f, this.qor, this.gjv, this.f12329sk);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn() {
        this.dkl = (float) this.hnj.optDouble("start", 0.0d);
        this.dse = this.hnj.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hnj(Canvas canvas) {
        qor(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hnj(int i10, int i11) {
        if (i10 > 0 && this.aq) {
            this.qor = i10;
            this.aq = false;
        }
        if (i11 <= 0 || !this.ojm) {
            return;
        }
        this.gjv = i11;
        this.ojm = false;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn(Canvas canvas) {
        qor(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public List<PropertyValuesHolder> qor() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(gjv(), this.dkl, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
