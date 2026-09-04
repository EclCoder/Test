package com.bytedance.adsdk.ugeno.hnj.hnj;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {
    private Paint dkl;
    private int gjv;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12325sk;

    public hn(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
        super(qorVar, jSONObject);
        Paint paint = new Paint();
        this.dkl = paint;
        paint.setAntiAlias(true);
    }

    private void qor(Canvas canvas) {
        try {
            if (this.f12326hn.pnz() > 0.0f) {
                this.dkl.setColor(this.qor);
                this.dkl.setAlpha((int) ((1.0f - this.f12326hn.pnz()) * 255.0f));
                ((ViewGroup) this.f12326hn.dnm().getParent()).setClipChildren(true);
                int i10 = this.gjv;
                int i11 = this.f12325sk;
                canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * this.f12326hn.pnz(), this.dkl);
            }
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public void hn() {
        this.qor = com.bytedance.adsdk.ugeno.dse.hnj.hnj(this.hnj.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
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
        this.gjv = i10 / 2;
        this.f12325sk = i11 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hnj.hnj
    public List<PropertyValuesHolder> qor() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(gjv(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
