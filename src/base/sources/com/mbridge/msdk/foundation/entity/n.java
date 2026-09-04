package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30395c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f30402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f30404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f30405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f30406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f30407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f30409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f30410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f30411s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f30413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f30414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f30415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f30416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f30417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f30418z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f30393a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30396d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f30412t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f30409q = str;
        this.f30413u = i10;
        this.f30414v = str5;
        this.f30408p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f30415w = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f30416x = str3;
        this.C = i14;
        this.f30401i = str4;
        this.K = i15;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f30394b;
    }

    public void b(String str) {
        this.f30398f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30399g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f30398f;
    }

    public String e() {
        return this.f30399g;
    }

    public String f() {
        return this.f30400h;
    }

    public String g() {
        return this.f30401i;
    }

    public String h() {
        return this.f30402j;
    }

    public String i() {
        return this.f30403k;
    }

    public void j(String str) {
        this.f30409q = str;
    }

    public String k() {
        return this.f30405m;
    }

    public void l(String str) {
        this.f30414v = str;
    }

    public void m(String str) {
        this.f30416x = str;
    }

    public String n() {
        return this.f30409q;
    }

    public void o(String str) {
        this.f30418z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f30413u;
    }

    public String r() {
        return this.f30414v;
    }

    public String s() {
        return this.f30415w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f30416x) ? "" : this.f30416x;
    }

    public String toString() {
        return "RewardReportData [key=" + this.f30409q + ", networkType=" + this.f30413u + ", isCompleteView=" + this.f30408p + ", watchedMillis=" + this.M + ", videoLength=" + this.J + ", offerUrl=" + this.f30415w + ", reason=" + this.f30416x + ", result=" + this.C + ", duration=" + this.f30401i + ", videoSize=" + this.K + "]";
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f30418z;
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(String str) {
        this.f30394b = str;
    }

    public int b() {
        return this.f30395c;
    }

    public void d(String str) {
        this.f30400h = str;
    }

    public void e(String str) {
        this.f30401i = str;
    }

    public void f(String str) {
        this.f30402j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f30403k = URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f30404l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f30407o = URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f30404l;
    }

    public void k(String str) {
        this.f30411s = str;
    }

    public String l() {
        return this.f30407o;
    }

    public int m() {
        return this.f30408p;
    }

    public void n(String str) {
        this.f30417y = str;
    }

    public String o() {
        return this.f30410r;
    }

    public int p() {
        return this.f30412t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f30417y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f30395c = i10;
    }

    public void b(int i10) {
        this.f30412t = i10;
    }

    public void c(int i10) {
        this.f30413u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f30393a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f30393a == null) {
            this.f30393a = new HashMap();
        }
        try {
            this.f30393a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f30397e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f30409q = str;
        this.f30414v = str4;
        this.f30413u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f30415w = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f30416x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f30409q = str;
        this.f30413u = i10;
        this.f30414v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f30415w = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f30401i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f30409q = "m_download_end";
        } else if (i11 == 95) {
            this.f30409q = "2000025";
        }
        int iS = m0.s(context);
        this.f30413u = iS;
        this.f30414v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f30417y = campaignEx.getRequestId();
        this.f30418z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f30415w)) {
            try {
                this.f30415w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f30401i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f30409q = str;
        this.f30405m = str2;
        this.H = str3;
        this.f30410r = str4;
        this.I = str5;
        this.f30398f = str6;
        this.f30413u = i10;
        this.f30414v = str7;
    }

    public n(String str) {
        this.f30406n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f30409q = str;
        this.C = i10;
        this.f30401i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f30403k = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f30398f = str4;
        this.I = str5;
        this.f30416x = str6;
        this.f30402j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f30409q = str;
        this.f30398f = str2;
        this.f30417y = str3;
        this.f30418z = str4;
        this.I = str5;
        this.f30413u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f30409q = str;
        this.f30398f = str2;
        this.f30417y = str3;
        this.f30418z = str4;
        this.I = str5;
        this.f30413u = i10;
        this.f30416x = str6;
        this.f30397e = i11;
    }
}
