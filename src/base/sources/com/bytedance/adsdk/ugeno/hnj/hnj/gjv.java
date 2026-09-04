package com.bytedance.adsdk.ugeno.hnj.hnj;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends hnj {

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private static final float f12321fc;
    private static final float jip;
    private static final float mjg;
    private static final float uua;
    private int aq;
    private boolean bug;
    private com.bytedance.adsdk.ugeno.dse.hnj.C0167hnj dkl;
    private int dnm;
    private int dse;
    private Paint gjv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private float f12322oj;
    private float ojm;
    private Path orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private Path f12323sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12324ta;

    static {
        float radians = (float) Math.toRadians(30.0d);
        mjg = radians;
        f12321fc = (float) Math.tan(radians);
        jip = (float) Math.cos(radians);
        uua = (float) Math.sin(radians);
    }

    public gjv(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
        super(qorVar, jSONObject);
        this.bug = true;
        Paint paint = new Paint();
        this.gjv = paint;
        paint.setAntiAlias(true);
        this.f12323sk = new Path();
        this.ojm = this.f12326hn.as();
        this.orl = new Path();
    }

    private void qor(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.f12326hn.pv() > 0.0f) {
                int i10 = this.f12324ta;
                float f10 = f12321fc;
                float fPv = (i10 + (i10 * f10)) * this.f12326hn.pv();
                this.orl.reset();
                this.orl.moveTo(fPv, 0.0f);
                int i11 = this.dnm;
                float f11 = fPv - (i11 * f10);
                this.orl.lineTo(f11, i11);
                this.orl.lineTo(f11 + this.qor, this.dnm);
                this.orl.lineTo(this.qor + fPv, 0.0f);
                this.orl.close();
                float f12 = this.f12322oj;
                float f13 = jip * f12;
                float f14 = f12 * uua;
                if (!this.bug || this.dkl == null) {
                    int i12 = this.aq;
                    linearGradient = new LinearGradient(fPv, 0.0f, fPv + f13, f14, new int[]{i12, this.dse, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fPv, 0.0f, fPv + f13, f14, this.dkl.f12238hn, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.gjv.setShader(linearGradient);
                Path path = this.f12323sk;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.orl, this.gjv);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn() {
        this.qor = (int) aq.hnj(this.f12326hn.dnm().getContext(), this.hnj.optInt("shineWidth", 30));
        String strOptString = this.hnj.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.dkl = com.bytedance.adsdk.ugeno.dse.hnj.hn(str);
        } else {
            int iHnj = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str);
            this.dse = iHnj;
            this.aq = com.bytedance.adsdk.ugeno.dse.hnj.hnj(iHnj, 32);
            this.bug = false;
        }
        this.f12322oj = jip * this.qor;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hnj(Canvas canvas) {
        qor(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hnj(int i10, int i11) {
        this.f12324ta = i10;
        this.dnm = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.f12323sk;
            float f10 = this.ojm;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn(Canvas canvas) {
        qor(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public List<PropertyValuesHolder> qor() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(gjv(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
