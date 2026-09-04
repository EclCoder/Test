package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private String dkl;
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12209hn;
    private String hnj;
    private List<C0165hnj> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f12210sk;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0165hnj {
        private float[] aq;
        private float dkl;
        private float dse;
        private long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private float f12211hn;
        private long hnj;
        private String ojm;
        private String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private String f12212sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private String f12213ta;

        public float[] aq() {
            return this.aq;
        }

        public float dkl() {
            return this.dkl;
        }

        public float dse() {
            return this.dse;
        }

        public long gjv() {
            return this.gjv;
        }

        public float hn() {
            return this.f12211hn;
        }

        public long hnj() {
            return this.hnj;
        }

        public String ojm() {
            return this.ojm;
        }

        public String qor() {
            return this.qor;
        }

        public String sk() {
            return this.f12212sk;
        }

        public String ta() {
            return this.f12213ta;
        }

        public void gjv(String str) {
            this.ojm = str;
        }

        public void hn(long j10) {
            this.gjv = j10;
        }

        public void hnj(long j10) {
            this.hnj = j10;
        }

        public void qor(float f10) {
            this.dse = f10;
        }

        public void hn(String str) {
            this.f12212sk = str;
        }

        public void hnj(float f10) {
            this.f12211hn = f10;
        }

        public void qor(String str) {
            this.f12213ta = str;
        }

        public void hn(float f10) {
            this.dkl = f10;
        }

        public void hnj(String str) {
            this.qor = str;
        }

        public void hnj(float[] fArr) {
            this.aq = fArr;
        }

        public static C0165hnj hnj(JSONObject jSONObject, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
            if (jSONObject == null) {
                return null;
            }
            C0165hnj c0165hnj = new C0165hnj();
            c0165hnj.hnj(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0165hnj.hnj(-1.0f);
            } else {
                try {
                    c0165hnj.hnj(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0165hnj.hnj(0.0f);
                }
            }
            c0165hnj.hnj(jSONObject.optString("loopMode"));
            c0165hnj.hn(jSONObject.optString("type"));
            if (TextUtils.equals(c0165hnj.sk(), "ripple")) {
                c0165hnj.qor(jSONObject.optString("rippleColor"));
            }
            View viewDnm = qorVar.dnm();
            Context context = viewDnm != null ? viewDnm.getContext() : null;
            if (TextUtils.equals(c0165hnj.sk(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("valueTo"), qorVar.bug());
                int iHnj = com.bytedance.adsdk.ugeno.dse.hnj.hnj(jSONObject.optString("valueFrom"));
                int iHnj2 = com.bytedance.adsdk.ugeno.dse.hnj.hnj(strHnj);
                c0165hnj.hn(iHnj);
                c0165hnj.qor(iHnj2);
            } else if ((TextUtils.equals(c0165hnj.sk(), "translateX") || TextUtils.equals(c0165hnj.sk(), "translateY")) && context != null) {
                try {
                    float fHnj = com.bytedance.adsdk.ugeno.dse.aq.hnj(context, (float) jSONObject.optDouble("valueFrom"));
                    float fHnj2 = com.bytedance.adsdk.ugeno.dse.aq.hnj(context, (float) jSONObject.optDouble("valueTo"));
                    c0165hnj.hn(fHnj);
                    c0165hnj.qor(fHnj2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0165hnj.hn((float) jSONObject.optDouble("valueFrom"));
                c0165hnj.qor((float) jSONObject.optDouble("valueTo"));
            }
            c0165hnj.gjv(jSONObject.optString("interpolator"));
            String strHnj2 = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("startDelay"), qorVar.bug());
            Log.d("TAG", "createAnimationModel: ");
            c0165hnj.hn(com.bytedance.adsdk.ugeno.dse.qor.hnj(strHnj2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0165hnj.sk(), "translateX") || TextUtils.equals(c0165hnj.sk(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.dse.aq.hnj(context, (float) hnj.hnj(jSONArrayOptJSONArray.optString(i10), qorVar.bug()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) hnj.hnj(jSONArrayOptJSONArray.optString(i10), qorVar.bug());
                        i10++;
                    }
                }
                c0165hnj.hnj(fArr);
            }
            return c0165hnj;
        }
    }

    public String dkl() {
        return this.dkl;
    }

    public long gjv() {
        return this.gjv;
    }

    public float hn() {
        return this.f12209hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public List<C0165hnj> qor() {
        return this.qor;
    }

    public long sk() {
        return this.f12210sk;
    }

    public void hn(long j10) {
        this.f12210sk = j10;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void hn(String str) {
        this.dkl = str;
    }

    public void hnj(float f10) {
        this.f12209hn = f10;
    }

    public void hnj(List<C0165hnj> list) {
        this.qor = list;
    }

    public void hnj(long j10) {
        this.gjv = j10;
    }

    public static hnj hnj(String str, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return hnj(new JSONObject(str), qorVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static hnj hnj(JSONObject jSONObject, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        return hnj(jSONObject, null, qorVar);
    }

    public static hnj hnj(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (jSONObject == null) {
            return null;
        }
        hnj hnjVar = new hnj();
        hnjVar.hnj(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            hnjVar.hnj(-1.0f);
        } else {
            try {
                hnjVar.hnj(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                hnjVar.hnj(0.0f);
            }
        }
        hnjVar.hnj(jSONObject.optLong("duration", 0L));
        hnjVar.hn(com.bytedance.adsdk.ugeno.dse.qor.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("startDelay"), qorVar.bug()), 0L));
        hnjVar.hn(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.dse.hn.hnj(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0165hnj.hnj(jSONObjectOptJSONObject, qorVar));
            }
            hnjVar.hnj(arrayList);
        }
        return hnjVar;
    }

    public static double hnj(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.dse.qor.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
