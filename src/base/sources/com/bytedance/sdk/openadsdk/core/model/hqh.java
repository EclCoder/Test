package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hqh {
    private int aq;
    private int bug;
    private String dkl;
    private int dnm;
    private int dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f13969fc;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13970hn;
    private int hnj;
    private String jip;
    private int mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private String f13971oj;
    private int ojm;
    private int orl;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f13972sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f13973ta;
    private String uua;

    public hqh(JSONObject jSONObject) {
        this.bug = 5;
        this.orl = 5;
        this.mjg = 10;
        this.f13969fc = 20;
        this.jip = "Next Ad";
        this.uua = "Next ad in %1$ds";
        this.f13971oj = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.qor = jSONObject.optBoolean("is_playable");
        this.gjv = jSONObject.optInt("playable_type", 0);
        this.f13972sk = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.dkl = jSONObjectOptJSONObject.optString("playable_url", "");
            this.dse = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.f13970hn = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.hnj = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iHnj = hnj(this.gjv);
            this.aq = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iHnj);
            this.ojm = jSONObjectOptJSONObject.optInt("playable_js_timeout", iHnj);
            this.f13973ta = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.bug = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.orl = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.mjg = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.f13969fc = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.uua = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.jip = jSONObjectOptJSONObject.optString("next_ad_text");
            this.f13971oj = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.dnm = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.dnm = 0;
        }
    }

    public static boolean apu(as asVar) {
        hqh hqhVarVf = vf(asVar);
        return hqhVarVf != null && hqhVarVf.ta();
    }

    public static boolean aq(as asVar) {
        hqh hqhVarLhi = asVar.lhi();
        return hqhVarLhi != null && asVar.za() && hqhVarLhi.qor && hqhVarLhi.f13970hn == 1;
    }

    public static String as(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return null;
        }
        return hqhVarVf.dse();
    }

    public static String bug(as asVar) {
        if (asVar == null) {
            return null;
        }
        hqh hqhVarLhi = asVar.lhi();
        if (hqhVarLhi != null && hqhVarLhi.qor) {
            String str = hqhVarLhi.dkl;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (asVar.qb() == 20) {
            return asVar.xe();
        }
        if (asVar.pwt() != null) {
            return asVar.pwt().d();
        }
        return null;
    }

    public static String dnm(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return null;
        }
        return hqhVarVf.dkl;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static String m35do(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return null;
        }
        return hqhVarVf.dkl();
    }

    public static int eum(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.hnj();
    }

    public static int fc(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.dse;
    }

    private static int hnj(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    private static int hqh(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.gjv;
    }

    public static boolean jip(as asVar) {
        return false;
    }

    public static boolean mjg(as asVar) {
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarPwt = asVar.pwt();
        return aVarPwt != null && aVarPwt.a() == 1;
    }

    public static long oj(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 5L;
        }
        return hqhVarVf.aq();
    }

    public static int ojm(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.dnm;
    }

    public static boolean orl(as asVar) {
        return true;
    }

    public static String ta(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return null;
        }
        return hqhVarVf.f13972sk;
    }

    public static int tgn(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.qor();
    }

    public static int tu(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.hn();
    }

    public static long uua(as asVar) {
        return Math.max(oj(asVar), xn(asVar));
    }

    private static hqh vf(as asVar) {
        if (asVar == null) {
            return null;
        }
        return asVar.lhi();
    }

    public static String wu(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return null;
        }
        return hqhVarVf.sk();
    }

    public static long xn(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 5L;
        }
        return hqhVarVf.ojm();
    }

    public static int xyo(as asVar) {
        hqh hqhVarVf = vf(asVar);
        if (hqhVarVf == null) {
            return 0;
        }
        return hqhVarVf.gjv();
    }

    public String dkl() {
        return this.uua;
    }

    public String dse() {
        return this.f13971oj;
    }

    public int gjv() {
        return this.f13969fc;
    }

    public int hn() {
        return this.orl;
    }

    public int qor() {
        return this.mjg;
    }

    public String sk() {
        return this.jip;
    }

    public static boolean dkl(as asVar) {
        return sk(asVar) && hqh(asVar) == 1;
    }

    public static boolean dse(as asVar) {
        hqh hqhVarLhi = asVar.lhi();
        return hqhVarLhi != null && hqhVarLhi.qor && hqhVarLhi.f13970hn == 1;
    }

    public static boolean gjv(as asVar) {
        return qor(asVar) && !dse(asVar);
    }

    public static boolean hn(as asVar) {
        hqh hqhVarVf = vf(asVar);
        return (hqhVarVf == null || !hqhVarVf.qor || TextUtils.isEmpty(bug(asVar))) ? false : true;
    }

    public static boolean qor(as asVar) {
        return hn(asVar) && hqh(asVar) == 1;
    }

    public static boolean sk(as asVar) {
        hqh hqhVarVf = vf(asVar);
        return hqhVarVf != null && asVar.za() && hqhVarVf.qor && !TextUtils.isEmpty(bug(asVar));
    }

    public int hnj() {
        return this.bug;
    }

    public static int hnj(as asVar) {
        int i10;
        hqh hqhVarLhi = asVar.lhi();
        if (hqhVarLhi != null && (i10 = hqhVarLhi.hnj) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public int ojm() {
        return this.ojm;
    }

    public boolean ta() {
        return this.f13973ta;
    }

    public int aq() {
        return this.aq;
    }
}
