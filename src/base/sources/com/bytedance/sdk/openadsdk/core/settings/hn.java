package com.bytedance.sdk.openadsdk.core.settings;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn {
    public int apu;
    public int aq;
    public List<String> as;
    public int bug;
    public int dkl;
    public int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public int f46do;
    public int dse;
    public boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public int f14186fc;
    public int gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    public JSONObject f14187gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public int f14188hn;
    public String hnj;
    public boolean hqh;
    public int jip;
    public int mjg;
    public boolean nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    public int f14189oj;
    public int ojm;
    public int orl;
    public int pty;
    public int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public int f14190sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public int f14191ta;
    public int tgn;
    public int tu;
    public int uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    public boolean f14192vf;
    public int wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public int f14193xn;
    public int xyo;

    public hn(JSONObject jSONObject) {
        this.f14188hn = 1;
        this.qor = 1;
        this.gjv = 2;
        this.f14190sk = 1;
        this.dkl = 100;
        this.dse = 0;
        this.aq = 2;
        this.ojm = 1;
        this.f14191ta = 3;
        this.dnm = 30;
        this.bug = 30;
        this.orl = 1;
        this.mjg = 1;
        this.f14186fc = 2;
        this.jip = 1500;
        this.uua = 2;
        this.f14189oj = 3500;
        this.f14193xn = 0;
        this.apu = 5;
        this.eum = false;
        this.wu = 0;
        this.f46do = 2;
        this.tu = 0;
        this.tgn = 0;
        this.xyo = 5;
        this.f14192vf = true;
        this.hqh = false;
        this.nyv = false;
        this.pty = -1;
        new JSONObject();
        this.f14187gm = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.hnj = jSONObject.optString("code_id");
        this.f14188hn = jSONObject.optInt("auto_play", 1);
        this.pty = jSONObject.optInt("endcard_close_time", -1);
        this.qor = jSONObject.optInt("voice_control", 1);
        this.gjv = jSONObject.optInt("rv_preload", 2);
        this.f14190sk = jSONObject.optInt("nv_preload", 1);
        this.dkl = Math.min(100, Math.max(0, jSONObject.optInt(qEagQqzJZsd.aWCFBDcfzj, 100)));
        this.dse = jSONObject.optInt("skip_time_displayed", 0);
        this.aq = jSONObject.optInt("video_skip_result", 2);
        this.ojm = jSONObject.optInt("reg_creative_control", 1);
        this.f14191ta = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.dnm = iOptInt;
        if (iOptInt < 0) {
            this.dnm = 30;
        }
        this.orl = jSONObject.optInt("voice_control", 2);
        this.mjg = jSONObject.optInt("if_show_win", 1);
        this.f14186fc = jSONObject.optInt("sp_preload", 2);
        this.jip = jSONObject.optInt("stop_time", 1500);
        this.uua = jSONObject.optInt("native_playable_delay", 2);
        this.f14189oj = jSONObject.optInt("time_out_control", -1);
        this.f14193xn = jSONObject.optInt("playable_reward_type", 0);
        this.wu = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.apu = iOptInt2;
        if (iOptInt2 < 0) {
            this.apu = 5;
        }
        hnj(jSONObject.optJSONArray("parent_tpl_ids"));
        this.f46do = jSONObject.optInt("slot_type", 2);
        this.eum = jSONObject.optBoolean("close_on_click", false);
        this.tu = jSONObject.optInt("allow_system_back", 0);
        this.tgn = jSONObject.optInt("splash_skip_time", 0);
        this.xyo = jSONObject.optInt("splash_image_count_down_time", 5);
        this.hqh = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.nyv = jSONObject.optBoolean("splash_close_on_click", false);
        this.f14192vf = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!hnj(this.qor)) {
            this.qor = 1;
        }
        if (!hnj(this.orl)) {
            this.orl = 1;
        }
        this.bug = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean hnj(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void hnj(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.as = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.as.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public hn(String str, int i10) {
        this.f14188hn = 1;
        this.qor = 1;
        this.gjv = 2;
        this.f14190sk = 1;
        this.dkl = 100;
        this.dse = 0;
        this.aq = 2;
        this.ojm = 1;
        this.f14191ta = 3;
        this.dnm = 30;
        this.bug = 30;
        this.orl = 1;
        this.mjg = 1;
        this.f14186fc = 2;
        this.jip = 1500;
        this.uua = 2;
        this.f14189oj = 3500;
        this.f14193xn = 0;
        this.apu = 5;
        this.eum = false;
        this.wu = 0;
        this.f46do = 2;
        this.tu = 0;
        this.tgn = 0;
        this.xyo = 5;
        this.f14192vf = true;
        this.hqh = false;
        this.nyv = false;
        this.pty = -1;
        this.f14187gm = new JSONObject();
        this.hnj = str;
        this.qor = i10;
    }
}
