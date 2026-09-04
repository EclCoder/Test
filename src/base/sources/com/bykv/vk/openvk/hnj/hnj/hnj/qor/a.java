package com.bykv.vk.openvk.hnj.hnj.hnj.qor;

import android.text.TextUtils;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f11641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f11642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f11643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f11645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f11646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f11647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f11648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f11651n = -1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11652o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11653p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11654q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11655r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11656s = 307200;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11657t = 1;

    public String A() {
        return this.f11642e;
    }

    public void B(int i10) {
        this.f11653p = i10;
    }

    public String C() {
        return this.f11646i;
    }

    public int D() {
        return this.f11639b;
    }

    public void E(int i10) {
        this.f11639b = i10;
    }

    public void F(String str) {
        this.f11644g = str;
    }

    public long G() {
        return this.f11640c;
    }

    public void H(int i10) {
        this.f11656s = i10;
    }

    public void I(String str) {
        this.f11646i = str;
    }

    public String J() {
        return this.f11643f;
    }

    public void K(int i10) {
        this.f11657t = Math.min(4, Math.max(1, i10));
    }

    public int L() {
        return this.f11655r;
    }

    public int M() {
        return this.f11657t;
    }

    public int N() {
        return this.f11652o;
    }

    public int a() {
        return this.f11653p;
    }

    public float b() {
        return this.f11651n;
    }

    public void c(int i10) {
        this.f11652o = i10;
    }

    public String d() {
        return this.f11645h;
    }

    public double e() {
        return this.f11641d;
    }

    public void f(int i10) {
        this.f11654q = i10;
    }

    public void g(String str) {
        this.f11647j = str;
    }

    public String h() {
        return this.f11644g;
    }

    public double i() {
        return this.f11648k;
    }

    public void j(int i10) {
        this.f11655r = i10;
    }

    public boolean k() {
        return this.f11654q == 0;
    }

    public int l() {
        if (this.f11656s < 0) {
            this.f11656s = 307200;
        }
        long j10 = this.f11656s;
        long j11 = this.f11640c;
        if (j10 > j11) {
            this.f11656s = (int) j11;
        }
        return this.f11656s;
    }

    public int m() {
        return this.f11650m;
    }

    public void n(int i10) {
        this.f11650m = i10;
    }

    public void o(String str) {
        this.f11645h = str;
    }

    public int p() {
        return this.f11638a;
    }

    public void q(int i10) {
        this.f11638a = i10;
    }

    public void r(String str) {
        this.f11643f = str;
    }

    public int s() {
        return this.f11649l;
    }

    public void t(double d10) {
        this.f11641d = d10;
    }

    public void u(int i10) {
        this.f11649l = i10;
    }

    public void v(long j10) {
        this.f11640c = j10;
    }

    public void w(String str) {
        this.f11642e = str;
    }

    public int x() {
        return this.f11654q;
    }

    public String y() {
        if (TextUtils.isEmpty(this.f11647j)) {
            this.f11647j = w6.b.a(this.f11644g);
        }
        return this.f11647j;
    }

    public JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", p());
            jSONObject.put("cover_url", J());
            jSONObject.put("cover_width", D());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, d());
            jSONObject.put(qEagQqzJZsd.ArRA, y());
            jSONObject.put("resolution", A());
            jSONObject.put("size", G());
            jSONObject.put("video_duration", e());
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, h());
            jSONObject.put("playable_download_url", C());
            jSONObject.put("if_playable_loading_show", N());
            jSONObject.put("remove_loading_page_type", a());
            jSONObject.put("fallback_endcard_judge", s());
            jSONObject.put("video_preload_size", l());
            jSONObject.put("reward_video_cached_type", x());
            jSONObject.put("execute_cached_type", L());
            jSONObject.put("endcard_render", m());
            jSONObject.put("replay_time", M());
            jSONObject.put("play_speed_ratio", b());
            if (i() > 0.0d) {
                jSONObject.put("start", i());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
