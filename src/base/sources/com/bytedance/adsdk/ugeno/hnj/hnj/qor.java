package com.bytedance.adsdk.ugeno.hnj.hnj;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends hnj {
    private Paint aq;
    private View dkl;
    private Matrix dnm;
    private Paint dse;
    private float gjv;
    private PorterDuffXfermode ojm;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12327sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private LinearGradient f12328ta;

    public qor(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
        super(qorVar, jSONObject);
        this.dkl = this.f12326hn.dnm();
        Paint paint = new Paint();
        this.dse = paint;
        paint.setAntiAlias(true);
        this.dkl.setLayerType(2, null);
        this.ojm = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.aq = new Paint();
        this.dnm = new Matrix();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void qor(Canvas canvas) {
        try {
            if (this.f12326hn.lu() <= 0.0f) {
                this.dse.setXfermode(this.ojm);
                canvas.drawRect(0.0f, 0.0f, this.gjv, this.f12327sk, this.dse);
                return;
            }
            int iLu = (int) (this.gjv * this.f12326hn.lu());
            int iLu2 = (int) (this.f12327sk * this.f12326hn.lu());
            this.dse.setXfermode(this.ojm);
            String str = this.qor;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f10 = iLu2;
                        canvas.drawRect(0.0f, f10, this.gjv, this.f12327sk, this.dse);
                        this.dnm.setTranslate(0.0f, f10);
                        this.f12328ta.setLocalMatrix(this.dnm);
                        this.aq.setShader(this.f12328ta);
                        if (this.f12326hn.lu() <= 1.0f && this.f12326hn.lu() > 0.9f) {
                            this.aq.setAlpha((int) (255.0f - (this.f12326hn.lu() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, this.gjv, f10, this.aq);
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        float f11 = iLu2;
                        canvas.drawRect(0.0f, 0.0f, this.gjv, this.f12327sk - f11, this.dse);
                        this.dnm.setTranslate(0.0f, this.f12327sk - f11);
                        this.f12328ta.setLocalMatrix(this.dnm);
                        this.aq.setShader(this.f12328ta);
                        if (this.f12326hn.lu() <= 1.0f && this.f12326hn.lu() > 0.9f) {
                            this.aq.setAlpha((int) (255.0f - (this.f12326hn.lu() * 255.0f)));
                        }
                        float f12 = this.gjv;
                        float f13 = this.f12327sk;
                        canvas.drawRect(f12, f13, 0.0f, f13 - f11, this.aq);
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        float f14 = iLu;
                        canvas.drawRect(0.0f, 0.0f, this.gjv - f14, this.f12327sk, this.dse);
                        this.dnm.setTranslate(this.gjv - f14, 0.0f);
                        this.f12328ta.setLocalMatrix(this.dnm);
                        this.aq.setShader(this.f12328ta);
                        if (this.f12326hn.lu() <= 1.0f && this.f12326hn.lu() > 0.9f) {
                            this.aq.setAlpha((int) (255.0f - (this.f12326hn.lu() * 255.0f)));
                        }
                        float f15 = this.gjv;
                        canvas.drawRect(f15, this.f12327sk, f15 - f14, 0.0f, this.aq);
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        float f16 = iLu;
                        canvas.drawRect(f16, 0.0f, this.gjv, this.f12327sk, this.dse);
                        this.dnm.setTranslate(f16, this.f12327sk);
                        this.f12328ta.setLocalMatrix(this.dnm);
                        this.aq.setShader(this.f12328ta);
                        if (this.f12326hn.lu() <= 1.0f && this.f12326hn.lu() > 0.9f) {
                            this.aq.setAlpha((int) (255.0f - (this.f12326hn.lu() * 255.0f)));
                        }
                        canvas.drawRect(0.0f, 0.0f, f16, this.f12327sk, this.aq);
                    }
                    break;
                default:
                    break;
            }
        } catch (Throwable th2) {
            Log.e("BaseEffectWrapper", th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn() {
        this.qor = this.hnj.optString("direction", TtmlNode.LEFT);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hnj(Canvas canvas) {
        qor(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn(Canvas canvas) {
        qor(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hnj(int i10, int i11) {
        this.gjv = i10;
        this.f12327sk = i11;
        String str = this.qor;
        str.getClass();
        switch (str) {
            case "bottom":
                this.f12328ta = new LinearGradient(0.0f, -this.f12327sk, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.f12328ta = new LinearGradient(0.0f, this.f12327sk, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.f12328ta = new LinearGradient(this.gjv, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.f12328ta = new LinearGradient(-this.gjv, 0.0f, 0.0f, this.f12327sk, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public List<PropertyValuesHolder> qor() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.hnj.sk.ALPHA.hn(), 0.0f, 1.0f));
        return arrayList;
    }
}
