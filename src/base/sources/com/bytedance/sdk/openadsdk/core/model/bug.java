package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private final long aq;
    private final int bug;
    private final float dkl;
    private final int dnm;
    private final long dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final JSONObject f13941fc;
    private final float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int[] f13942hn;
    private final int[] hnj;
    private final String jip;
    private final int mjg;
    private final int ojm;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> orl;
    private final float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final float f13943sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final int f13944ta;
    private final JSONObject uua;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private JSONObject apu;
        private float aq;
        private int bug;
        private float dkl;
        private int[] dnm;
        private float dse;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> f13945fc;
        private long gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f13946hn;
        float hnj;
        private int jip;
        private int mjg;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        private int f13947oj;
        private float ojm;
        private int orl;
        float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private long f13948sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private int[] f13949ta;
        private String uua;

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        private JSONObject f13950xn;

        public hnj dkl(float f10) {
            this.ojm = f10;
            return this;
        }

        public hnj gjv(float f10) {
            this.dse = f10;
            return this;
        }

        public hnj hn(JSONObject jSONObject) {
            this.apu = jSONObject;
            return this;
        }

        public hnj hnj(int i10) {
            this.f13947oj = i10;
            return this;
        }

        public hnj qor(int i10) {
            this.f13946hn = i10;
            return this;
        }

        public hnj sk(float f10) {
            this.aq = f10;
            return this;
        }

        public hnj dkl(int i10) {
            this.mjg = i10;
            return this;
        }

        public hnj gjv(int i10) {
            this.bug = i10;
            return this;
        }

        public hnj hn(int i10) {
            this.jip = i10;
            return this;
        }

        public hnj hnj(JSONObject jSONObject) {
            this.f13950xn = jSONObject;
            return this;
        }

        public hnj qor(float f10) {
            this.dkl = f10;
            return this;
        }

        public hnj sk(int i10) {
            this.orl = i10;
            return this;
        }

        public hnj hn(float f10) {
            this.qor = f10;
            return this;
        }

        public hnj hnj(SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray) {
            this.f13945fc = sparseArray;
            return this;
        }

        public hnj hn(long j10) {
            this.f13948sk = j10;
            return this;
        }

        public hnj hnj(float f10) {
            this.hnj = f10;
            return this;
        }

        public hnj hn(int[] iArr) {
            this.dnm = iArr;
            return this;
        }

        public hnj hnj(long j10) {
            this.gjv = j10;
            return this;
        }

        public hnj hnj(int[] iArr) {
            this.f13949ta = iArr;
            return this;
        }

        public hnj hnj(String str) {
            this.uua = str;
            return this;
        }

        public bug hnj() {
            return new bug(this);
        }
    }

    public JSONObject hnj() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.uua;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.uua.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.hnj;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.hnj[1]));
            }
            int[] iArr2 = this.f13942hn;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.f13942hn[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.qor)).putOpt("down_y", Float.toString(this.gjv)).putOpt("up_x", Float.toString(this.f13943sk)).putOpt("up_y", Float.toString(this.dkl)).putOpt("down_time", Long.valueOf(this.dse)).putOpt("up_time", Long.valueOf(this.aq)).putOpt("toolType", Integer.valueOf(this.ojm)).putOpt("deviceId", Integer.valueOf(this.f13944ta)).putOpt("source", Integer.valueOf(this.dnm)).putOpt("ft", hnj(this.orl, this.bug)).putOpt("click_area_type", this.jip);
            int i10 = this.mjg;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.f13941fc;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private bug(hnj hnjVar) {
        this.hnj = hnjVar.f13949ta;
        this.f13942hn = hnjVar.dnm;
        this.qor = hnjVar.ojm;
        this.gjv = hnjVar.aq;
        this.f13943sk = hnjVar.dse;
        this.dkl = hnjVar.dkl;
        this.dse = hnjVar.f13948sk;
        this.aq = hnjVar.gjv;
        this.ojm = hnjVar.bug;
        this.f13944ta = hnjVar.orl;
        this.dnm = hnjVar.mjg;
        this.bug = hnjVar.jip;
        this.orl = hnjVar.f13945fc;
        this.jip = hnjVar.uua;
        this.mjg = hnjVar.f13947oj;
        this.f13941fc = hnjVar.f13950xn;
        this.uua = hnjVar.apu;
    }

    public static JSONObject hnj(SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.qor.qor.hnj hnjVarValueAt = sparseArray.valueAt(i11);
                    if (hnjVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(hnjVarValueAt.qor)).putOpt("mr", Double.valueOf(hnjVarValueAt.f14173hn)).putOpt("phase", Integer.valueOf(hnjVarValueAt.hnj)).putOpt(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(hnjVarValueAt.gjv));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
