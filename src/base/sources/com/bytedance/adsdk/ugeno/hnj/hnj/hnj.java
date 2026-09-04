package com.bytedance.adsdk.ugeno.hnj.hnj;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.hn.qor f12326hn;
    protected JSONObject hnj;
    private String qor;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.hnj.hnj.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0171hnj {
        public static hnj hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
            if (qorVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new sk(qorVar, jSONObject);
                case "ripple":
                    return new hn(qorVar, jSONObject);
                case "rub_in":
                    return new qor(qorVar, jSONObject);
                case "shine":
                    return new gjv(qorVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject) {
        this.hnj = jSONObject;
        this.f12326hn = qorVar;
        hnj();
    }

    public String gjv() {
        return this.qor;
    }

    public abstract void hn();

    public abstract void hn(Canvas canvas);

    public void hnj() {
        this.qor = this.hnj.optString("type");
        hn();
    }

    public abstract void hnj(int i10, int i11);

    public abstract void hnj(Canvas canvas);

    public abstract List<PropertyValuesHolder> qor();
}
