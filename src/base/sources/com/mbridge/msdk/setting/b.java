package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static int f32386h1 = 1500;
    private boolean E0;
    private long F;
    private JSONArray G0;
    private ArrayList<Integer> H;
    private JSONObject H0;
    private d I;
    private C0444b J;
    private long J0;
    private HashMap<String, String> O;
    private long O0;
    private String P;
    private boolean P0;
    private int U;
    private String V0;
    private String X;
    private Map<String, String> Y;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f32392b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f32395c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f32398d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private String f32401e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f32404f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private String f32407g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f32409h0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f32415k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32416l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private String f32417l0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f32420n;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f32423o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f32424p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f32425p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.setting.a f32426q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f32427q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f32428r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f32429r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, a> f32430s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f32431s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32432t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f32434u;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f32437v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f32439w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32387a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f32390b = new JSONArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f32393c = new JSONArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32396d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32399e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32402f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32405g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32408h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32410i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32412j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32414k = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32418m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32422o = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32436v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f32438w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f32440x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f32442y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f32444z = "";
    private String A = "";
    private String B = "";
    private int C = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
    private String D = com.mbridge.msdk.foundation.same.net.utils.d.h().f30626i;
    private String E = com.mbridge.msdk.foundation.same.net.utils.d.h().f30630m;
    private int G = f32386h1;
    private int K = 0;
    private long L = 86400;
    private int M = 0;
    private int N = 3;
    private boolean Q = true;
    private int R = 0;
    private boolean S = false;
    private boolean T = false;
    private int V = 0;
    private int W = 0;
    private String Z = "1.0";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f32388a0 = 30;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f32391b0 = 9377;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f32394c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f32397d0 = 5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f32400e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f32403f0 = 8000;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private String f32406g0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f32411i0 = 10;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f32413j0 = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f32419m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private String f32421n0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private String f32433t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f32435u0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private List<Integer> f32441x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f32443y0 = 3;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f32445z0 = 0;
    private int A0 = 3;
    private int B0 = 0;
    private int C0 = 10;
    private int D0 = Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE;
    private int F0 = 0;
    private String I0 = "";
    private int K0 = 8000;
    private int L0 = 1;
    private long M0 = 10;
    private int N0 = 3;
    private int Q0 = 1;
    private int R0 = 1;
    private int S0 = 1;
    private int T0 = 1;
    private String U0 = "";
    private int W0 = 1300;
    private int X0 = 0;
    private int Y0 = 0;
    private long Z0 = 3600;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private String f32389a1 = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f32446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f32447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f32448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f32449d;

        public List<String> a() {
            return this.f32446a;
        }

        public List<String> b() {
            return this.f32447b;
        }

        public List<String> c() {
            return this.f32448c;
        }

        public List<String> d() {
            return this.f32449d;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f32448c = d0.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f32449d = d0.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f32447b = d0.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f32446a = d0.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF != null && gVarF.H() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = gVarF.H().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = gVarF.H().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.g.d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public C0444b A() {
        return this.J;
    }

    public String A0() {
        return this.V0;
    }

    public long B() {
        return this.L;
    }

    public int B0() {
        return this.W0;
    }

    public int C() {
        return this.N;
    }

    public int C0() {
        return this.X0;
    }

    public HashMap<String, String> D() {
        return this.O;
    }

    public int D0() {
        return this.Y0;
    }

    public void E(int i10) {
        this.f32392b1 = i10;
    }

    public boolean E0() {
        return this.Q;
    }

    public int F() {
        return this.U;
    }

    public boolean F0() {
        return this.f32432t;
    }

    public int G() {
        return this.V;
    }

    public boolean G0() {
        return this.f32438w;
    }

    public Map<String, String> H() {
        return this.Y;
    }

    public boolean H0() {
        return this.S;
    }

    public JSONArray I() {
        return this.f32390b;
    }

    public boolean I0() {
        return this.f32387a;
    }

    public JSONArray J() {
        return this.f32393c;
    }

    public boolean J0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f32444z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f32440x)) ? false : true;
    }

    public String K() {
        return this.Z;
    }

    public boolean K0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f32444z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f32442y)) ? false : true;
    }

    public int L() {
        return this.f32400e0;
    }

    public boolean L0() {
        return this.T;
    }

    public int M() {
        return this.f32403f0;
    }

    public boolean M0() {
        return this.E0;
    }

    public int N() {
        return this.f32409h0;
    }

    public boolean N0() {
        return this.P0;
    }

    public int O() {
        return this.f32413j0;
    }

    public void O0() {
        String language = Locale.getDefault().getLanguage();
        if (!K0()) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.B = "Confirm to close? ";
                this.f32444z = "You will not be rewarded after closing the window";
                this.A = "Close it";
                this.f32442y = "Continue";
            } else {
                this.B = "确认关闭？";
                this.f32444z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f32442y = "继续观看";
            }
        }
        if (J0()) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.B = "Confirm to close? ";
            this.f32444z = "You will not be rewarded after closing the window";
            this.A = "Close it";
            this.f32440x = "Continue";
            return;
        }
        this.B = "确认关闭？";
        this.f32444z = "关闭后您将不会获得任何奖励噢~ ";
        this.A = "确认关闭";
        this.f32440x = "继续试玩";
    }

    public String P() {
        return this.f32415k0;
    }

    public String Q() {
        return this.f32417l0;
    }

    public String R() {
        return this.f32389a1;
    }

    public long S() {
        return this.Z0;
    }

    public int T() {
        return this.f32392b1;
    }

    public String U() {
        return this.f32419m0;
    }

    public String V() {
        return this.f32421n0;
    }

    public int W() {
        return this.f32423o0;
    }

    public int X() {
        return this.f32425p0;
    }

    public int Y() {
        return this.f32429r0;
    }

    public int Z() {
        return this.f32431s0;
    }

    public void a0(int i10) {
        this.W0 = i10;
    }

    public void b(Map<String, String> map) {
        this.Y = map;
    }

    public long b0() {
        return this.f32437v0;
    }

    public void c(int i10) {
        this.f32399e = i10;
    }

    public long c0() {
        if (this.f32439w0 <= 0) {
            this.f32439w0 = 7200L;
        }
        return this.f32439w0;
    }

    public void d(long j10) {
        this.Z0 = j10;
    }

    public String d0() {
        return this.f32401e1;
    }

    public void e(int i10) {
        this.f32405g = i10;
    }

    public int e0() {
        return this.f32398d1;
    }

    public void f(int i10) {
        this.f32408h = i10;
    }

    public int f0() {
        return this.f32443y0;
    }

    public void g(int i10) {
        this.f32416l = i10;
    }

    public int g0() {
        return this.f32445z0;
    }

    public void h(int i10) {
        this.f32418m = i10;
    }

    public int h0() {
        return this.A0;
    }

    public void i(int i10) {
        this.f32422o = i10;
    }

    public int i0() {
        return this.B0;
    }

    public com.mbridge.msdk.setting.a j() {
        return this.f32426q;
    }

    public int j0() {
        return this.C0;
    }

    public String k() {
        return this.f32428r;
    }

    public int k0() {
        return this.D0;
    }

    public Map<String, a> l() {
        return this.f32430s;
    }

    public int l0() {
        return this.F0;
    }

    public int m() {
        return this.f32434u;
    }

    public JSONArray m0() {
        return this.G0;
    }

    public int n() {
        return this.f32436v;
    }

    public JSONObject n0() {
        return this.H0;
    }

    public void o(int i10) {
        this.K = i10;
    }

    public String o0() {
        return this.I0;
    }

    public String p() {
        return this.f32440x;
    }

    public long p0() {
        return this.J0;
    }

    public String q() {
        return this.f32442y;
    }

    public int q0() {
        return this.K0;
    }

    public String r() {
        return this.f32444z;
    }

    public int r0() {
        return this.L0;
    }

    public String s() {
        return this.A;
    }

    public long s0() {
        return this.M0 * 1000;
    }

    public void t(String str) {
        this.f32389a1 = str;
    }

    public int t0() {
        return this.N0;
    }

    public String toString() {
        return " cfc=" + this.f32434u + " getpf=" + this.L + " rurl=" + this.E0;
    }

    public int u() {
        return this.C;
    }

    public long u0() {
        return this.O0;
    }

    public String v() {
        return this.D;
    }

    public int v0() {
        return this.Q0;
    }

    public String w() {
        return this.E;
    }

    public int w0() {
        return this.R0;
    }

    public long x() {
        return this.F;
    }

    public int x0() {
        return this.S0;
    }

    public ArrayList<Integer> y() {
        return this.H;
    }

    public int y0() {
        return this.T0;
    }

    public d z() {
        return this.I;
    }

    public String z0() {
        return this.U0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03e4 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:121:0x04be  */
    /* JADX WARN: Code duplicated, block: B:122:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:130:0x050e A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0515 A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Code duplicated, block: B:136:0x051c A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0523 A[Catch: Exception -> 0x0576, TryCatch #6 {Exception -> 0x0576, blocks: (B:128:0x04ec, B:130:0x050e, B:131:0x0510, B:133:0x0515, B:134:0x0517, B:136:0x051c, B:137:0x051e, B:139:0x0523, B:140:0x0525, B:143:0x0531), top: B:221:0x04ec }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0530  */
    /* JADX WARN: Code duplicated, block: B:150:0x059b  */
    /* JADX WARN: Code duplicated, block: B:151:0x059d  */
    /* JADX WARN: Code duplicated, block: B:165:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:166:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:176:0x05ed A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0604 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0615 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0622 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x062f A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x063c A[Catch: Exception -> 0x02b4, TRY_LEAVE, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0368 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x02ae A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x02b7 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x02d4 A[Catch: Exception -> 0x02b4, LOOP:5: B:51:0x02ce->B:53:0x02d4, LOOP_END, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x030b  */
    /* JADX WARN: Code duplicated, block: B:66:0x033c A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0342 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0352 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0380 A[Catch: Exception -> 0x03ac, TryCatch #1 {Exception -> 0x03ac, blocks: (B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4), top: B:211:0x0368, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x03b4 A[Catch: Exception -> 0x03ac, TRY_LEAVE, TryCatch #1 {Exception -> 0x03ac, blocks: (B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4), top: B:211:0x0368, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x03d6 A[Catch: Exception -> 0x02b4, TryCatch #7 {Exception -> 0x02b4, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019b, B:41:0x019e, B:43:0x02ae, B:55:0x02ed, B:59:0x030c, B:61:0x032a, B:63:0x0330, B:64:0x0336, B:66:0x033c, B:68:0x0342, B:69:0x0349, B:70:0x034c, B:72:0x0352, B:73:0x035c, B:92:0x03c1, B:94:0x03c9, B:97:0x03d0, B:99:0x03d6, B:100:0x03de, B:102:0x03e4, B:104:0x03f0, B:106:0x03f6, B:114:0x0487, B:127:0x04d5, B:145:0x057f, B:156:0x05a6, B:174:0x05e1, B:176:0x05ed, B:177:0x05f8, B:179:0x0604, B:180:0x060f, B:182:0x0615, B:183:0x061c, B:185:0x0622, B:186:0x0629, B:188:0x062f, B:189:0x0636, B:191:0x063c, B:173:0x05de, B:169:0x05d6, B:162:0x05c4, B:155:0x05a3, B:126:0x04cc, B:91:0x03b8, B:46:0x02b7, B:48:0x02c2, B:50:0x02c8, B:51:0x02ce, B:53:0x02d4, B:54:0x02ea, B:16:0x00da, B:75:0x0368, B:76:0x037a, B:78:0x0380, B:80:0x038c, B:82:0x0396, B:84:0x03a4, B:87:0x03ae, B:89:0x03b4, B:115:0x04a3, B:119:0x04b6, B:123:0x04c1, B:163:0x05c7, B:167:0x05d2, B:170:0x05d9), top: B:223:0x0080, inners: #1, #2, #5, #10 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static g b(JSONObject jSONObject) {
        g gVar;
        g gVar2;
        long jOptLong;
        int i10;
        long jOptLong2;
        JSONArray jSONArrayOptJSONArray;
        HashMap map;
        int i11;
        int iOptInt;
        JSONArray jSONArrayOptJSONArray2;
        String strOptString;
        Iterator<String> itKeys;
        HashMap<String, String> map2;
        String next;
        JSONArray jSONArrayOptJSONArray3;
        String strOptString2;
        String strOptString3;
        boolean z10;
        boolean z11;
        int iOptInt2;
        int iOptInt3;
        int iOptInt4;
        int iOptInt5;
        int iOptInt6;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        Iterator<String> itKeys2;
        String next2;
        ArrayList<Integer> arrayList;
        int i14;
        int iOptInt7;
        ArrayList arrayList2;
        if (jSONObject == null) {
            return null;
        }
        try {
            g gVar3 = new g();
            try {
                gVar3.c(jSONObject);
                gVar3.f(jSONObject.optString("cc"));
                gVar3.s(jSONObject.optString("mv_wildcard", "<mvpackage>mbridge</mvpackage>"));
                gVar3.j(jSONObject.optInt("cfc"));
                gVar3.c(jSONObject.optLong("getpf"));
                gVar3.b(jSONObject.optLong("current_time"));
                gVar3.b(jSONObject.optBoolean("cfb"));
                gVar3.a(jSONObject.optLong("awct"));
                if (jSONObject.optLong(CampaignEx.JSON_KEY_PLCT) == 0) {
                    jOptLong = 3600;
                } else {
                    try {
                        jOptLong = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT);
                    } catch (Exception e10) {
                        e = e10;
                        gVar2 = gVar3;
                        gVar = gVar2;
                        e.printStackTrace();
                        return gVar;
                    }
                }
                gVar2 = gVar3;
                try {
                    gVar2.e(jOptLong);
                    gVar2.g(jSONObject.optBoolean("rurl"));
                    gVar2.i(jSONObject.optLong("uct"));
                    gVar2.h(jSONObject.optBoolean("ujds"));
                    gVar2.I(jSONObject.optInt("n2"));
                    gVar2.J(jSONObject.optInt("n3"));
                    gVar2.s(jSONObject.optInt("is_startup_crashsystem", 1));
                    gVar2.H(jSONObject.optInt("pcrn"));
                    gVar2.G(jSONObject.optInt("pcon", 0));
                    gVar2.f(jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB) == r15 ? 7200L : jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB));
                    gVar2.H(jSONObject.optInt("pcrn", 100));
                    gVar2.F(jSONObject.optInt("opent", 1));
                    gVar2.g(jSONObject.optLong("sfct", 1800L));
                    gVar2.Y(jSONObject.optInt("upgd", 1));
                    gVar2.Z(jSONObject.optInt("upsrl", 1));
                    gVar2.X(jSONObject.optInt("updevid", 1));
                    gVar2.S(jSONObject.optInt("sc", 0));
                    gVar2.W(jSONObject.optInt("up_tips", 1));
                    int i15 = -1;
                    gVar2.t(jSONObject.optInt("iseu", -1));
                    gVar2.p(jSONObject.optString("jm_unit"));
                    try {
                        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("atf");
                        if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                            i10 = -1;
                            arrayList2 = null;
                        } else {
                            arrayList2 = new ArrayList();
                            int i16 = 0;
                            while (i16 < jSONArrayOptJSONArray4.length()) {
                                String strOptString4 = jSONArrayOptJSONArray4.optString(i16);
                                if (a1.b(strOptString4)) {
                                    i10 = i15;
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(strOptString4);
                                        arrayList2.add(new com.mbridge.msdk.foundation.entity.a(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                                    } catch (Exception e11) {
                                        e = e11;
                                        e.printStackTrace();
                                        gVar2.g(jSONObject.optInt("adct", 259200));
                                        gVar2.k(jSONObject.optString("confirm_title", ""));
                                        gVar2.i(jSONObject.optString("confirm_description", ""));
                                        gVar2.j(jSONObject.optString("confirm_t", ""));
                                        gVar2.h(jSONObject.optString("confirm_c_rv", ""));
                                        gVar2.g(jSONObject.optString("confirm_c_play", ""));
                                        gVar2.c(jSONObject.optString("adchoice_icon", ""));
                                        gVar2.d(jSONObject.optString("adchoice_link", ""));
                                        gVar2.e(jSONObject.optString("adchoice_size", ""));
                                        gVar2.w(jSONObject.optString("platform_logo", ""));
                                        gVar2.x(jSONObject.optString("platform_name", ""));
                                        gVar2.a(a(jSONObject.optString("cdnate_cfg", "")));
                                        gVar2.i(jSONObject.optInt("atrqt", 0));
                                        gVar2.u(jSONObject.optInt("iupdid", 0));
                                        gVar2.D(jSONObject.optInt("mcs", AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
                                        gVar2.b(jSONObject.optString("ab_id", ""));
                                        gVar2.z(jSONObject.optString("rid", ""));
                                        gVar2.q(jSONObject.optString("log_rate", "-1"));
                                        gVar2.v(jSONObject.optString("omsdkjs_url", ""));
                                        gVar2.u(jSONObject.optString("omsdkjs_h5_url", ""));
                                        gVar2.N(jSONObject.optInt("rty_tk_clk", 0));
                                        gVar2.P(jSONObject.optInt("rty_tk_imp", 0));
                                        gVar2.O(jSONObject.optInt("rty_cnt", 3));
                                        gVar2.R(jSONObject.optInt("rty_to", Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE));
                                        gVar2.Q(jSONObject.optInt("rty_inr", 10));
                                        gVar2.n(jSONObject.optString("dns"));
                                        gVar2.v(jSONObject.optString("omsdkjs_url", ""));
                                        gVar2.u(jSONObject.optString("omsdkjs_h5_url", ""));
                                        jOptLong2 = jSONObject.optLong("tcto");
                                        if (jOptLong2 == 0) {
                                            gVar2.h(10L);
                                        } else {
                                            gVar2.h(jOptLong2);
                                            jSONArrayOptJSONArray = jSONObject.optJSONArray("jt");
                                            if (jSONArrayOptJSONArray != null) {
                                                map = new HashMap();
                                                for (i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                                                    map.put(jSONObjectOptJSONObject.optString("domain"), jSONObjectOptJSONObject.optString("format"));
                                                }
                                                gVar2.b(map);
                                            }
                                        }
                                        gVar2.r(jSONObject.optString("mraid_js"));
                                        gVar2.C(jSONObject.optString("web_env_url"));
                                        iOptInt = jSONObject.optInt("alrbs", 0);
                                        if (iOptInt <= 2) {
                                            iOptInt = 0;
                                        } else {
                                            iOptInt = 0;
                                        }
                                        gVar2.h(iOptInt);
                                        gVar2.e(jSONObject.optBoolean("GDPR_area", false));
                                        gVar2.m(jSONObject.optInt("ct", AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
                                        jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ercd");
                                        if (jSONArrayOptJSONArray2 != null) {
                                            arrayList = new ArrayList<>();
                                            for (i14 = 0; i14 < jSONArrayOptJSONArray2.length(); i14++) {
                                                iOptInt7 = jSONArrayOptJSONArray2.optInt(i14);
                                                if (iOptInt7 != 0) {
                                                    arrayList.add(Integer.valueOf(iOptInt7));
                                                }
                                            }
                                            if (arrayList.size() > 0) {
                                                arrayList.add(Integer.valueOf(i10));
                                                gVar2.a(arrayList);
                                            }
                                        }
                                        strOptString = jSONObject.optString("hst");
                                        if (!TextUtils.isEmpty(strOptString)) {
                                            try {
                                                JSONObject jSONObject3 = new JSONObject(k0.a(strOptString));
                                                itKeys = jSONObject3.keys();
                                                map2 = new HashMap<>();
                                                while (itKeys.hasNext()) {
                                                    next = itKeys.next();
                                                    if (TextUtils.isEmpty(next)) {
                                                    }
                                                }
                                                if (map2.size() > 0) {
                                                    gVar2.a(map2);
                                                }
                                            } catch (Exception e12) {
                                                q0.b("SETTING", e12.getMessage());
                                            }
                                        }
                                        jSONArrayOptJSONArray3 = jSONObject.optJSONArray("refactor_switch");
                                        if (jSONArrayOptJSONArray3 != null) {
                                            for (i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                                                JSONObject jSONObject4 = jSONArrayOptJSONArray3.getJSONObject(i13);
                                                itKeys2 = jSONObject4.keys();
                                                while (itKeys2.hasNext()) {
                                                    next2 = itKeys2.next();
                                                    if (TextUtils.isEmpty(next2)) {
                                                    }
                                                }
                                            }
                                        }
                                        int iOptInt8 = jSONObject.optInt("lqcnt", 30);
                                        int iOptInt9 = jSONObject.optInt("lqto", 5);
                                        int iOptInt10 = jSONObject.optInt("lqswt", 0);
                                        int iOptInt11 = jSONObject.optInt("lqtype", 1);
                                        gVar2.y(iOptInt9);
                                        gVar2.v(iOptInt8);
                                        gVar2.x(iOptInt10);
                                        gVar2.z(iOptInt11);
                                        gVar2.a(jSONObject.optJSONArray("lg_bl"));
                                        gVar2.b(jSONObject.optJSONArray("lg_wl"));
                                        gVar2.b0(jSONObject.optInt("lg_wl_rt"));
                                        gVar2.T(jSONObject.optInt("srml", 8000));
                                        gVar2.A(jSONObject.optInt("lrml", 8000));
                                        gVar2.a0(jSONObject.optInt("wgl_d_ms", 1300));
                                        gVar2.n(jSONObject.optInt("dp_ct", f32386h1));
                                        i12 = Integer.parseInt(k0.a(jSONObject.optString("lqpt")));
                                        if (i12 > 0) {
                                            gVar2.w(i12);
                                        }
                                        gVar2.c0(jSONObject.optInt("wvddt", 0));
                                        gVar2.l(jSONObject.optString("hst_st", ""));
                                        gVar2.m(jSONObject.optString("hst_st_t", ""));
                                        int iOptInt12 = jSONObject.optInt("l", 3);
                                        if (jSONObject.optInt(CampaignEx.JSON_KEY_AD_K, 0) == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (jSONObject.optInt("m", 1) == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        gVar2.M(iOptInt12);
                                        gVar2.f(z12);
                                        gVar2.a(z13);
                                        gVar2.o(jSONObject.optInt("fbk_swt", 0));
                                        gVar2.a(C0444b.a(jSONObject.optJSONObject("fbk")));
                                        iOptInt2 = jSONObject.optInt("ad_connection_timeout", com.mbridge.msdk.foundation.same.a.f30493o);
                                        iOptInt3 = jSONObject.optInt("ad_read_timeout", com.mbridge.msdk.foundation.same.a.f30495q);
                                        iOptInt4 = jSONObject.optInt("ad_write_timeout", com.mbridge.msdk.foundation.same.a.f30497s);
                                        iOptInt5 = jSONObject.optInt("ad_retry_count", com.mbridge.msdk.foundation.same.a.f30496r);
                                        if (iOptInt2 <= 0) {
                                            iOptInt2 = com.mbridge.msdk.foundation.same.a.f30493o;
                                        }
                                        gVar2.c(iOptInt2);
                                        if (iOptInt3 <= 0) {
                                            iOptInt3 = com.mbridge.msdk.foundation.same.a.f30495q;
                                        }
                                        gVar2.d(iOptInt3);
                                        if (iOptInt4 <= 0) {
                                            iOptInt4 = com.mbridge.msdk.foundation.same.a.f30497s;
                                        }
                                        gVar2.f(iOptInt4);
                                        if (iOptInt5 < 0) {
                                            iOptInt5 = com.mbridge.msdk.foundation.same.a.f30496r;
                                        }
                                        gVar2.e(iOptInt5);
                                        iOptInt6 = jSONObject.optInt("max_download_task_size", 10);
                                        if (iOptInt6 <= 0) {
                                            iOptInt6 = 10;
                                        }
                                        gVar2.C(iOptInt6);
                                        gVar2.B(jSONObject.optInt("max_bitmap_cache_size", 10));
                                        gVar2.V(jSONObject.optInt("t_t", 3));
                                        gVar2.q(jSONObject.optInt("h_t", 3));
                                        gVar2.p(jSONObject.optInt("gtp"));
                                        gVar2.d(jSONObject.optLong("i_i_t", 3600L));
                                        gVar2.t(jSONObject.optString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, ""));
                                        gVar2.E(jSONObject.optInt("n_c_u_p", 0));
                                        gVar2.o(jSONObject.optString("http_track_url", ""));
                                        gVar2.U(jSONObject.optInt("st_net", 1));
                                        gVar2.B(jSONObject.optString("vtag", ""));
                                        if (jSONObject.optInt("check_webview", 0) == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        gVar2.c(z11);
                                        gVar2.A(jSONObject.optString("swxid"));
                                        gVar2.c(jSONObject.optJSONArray("sdk_filters"));
                                        gVar2.k(jSONObject.optInt("ch_nv_im_cb", 1));
                                        if (jSONObject.optInt("do_us_fi_re", 1) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        gVar2.d(z10);
                                        a(jSONObject);
                                        strOptString2 = jSONObject.optString("bcp");
                                        if (!TextUtils.isEmpty(strOptString2)) {
                                            gVar2.a(com.mbridge.msdk.setting.a.a(k0.a(strOptString2)));
                                        }
                                        strOptString3 = jSONObject.optString("monitor");
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            gVar2.a(d.a(k0.a(strOptString3)));
                                        }
                                        if (jSONObject.has("new_pipeline_id")) {
                                            gVar2.K(jSONObject.optInt("new_pipeline_id"));
                                        }
                                        if (jSONObject.has("p_p_c_id")) {
                                            gVar2.L(jSONObject.optInt("p_p_c_id"));
                                        }
                                        if (jSONObject.has("p_p_c")) {
                                            gVar2.y(jSONObject.optString("p_p_c"));
                                        }
                                        if (jSONObject.has("c_m_l_id")) {
                                            gVar2.l(jSONObject.optInt("c_m_l_id"));
                                        }
                                        return gVar2;
                                    }
                                } else {
                                    i10 = i15;
                                }
                                i16++;
                                i15 = i10;
                            }
                            i10 = i15;
                        }
                        if (arrayList2 != null) {
                            gVar2.a((List<com.mbridge.msdk.foundation.entity.a>) arrayList2);
                        }
                    } catch (Exception e13) {
                        e = e13;
                        i10 = i15;
                    }
                    gVar2.g(jSONObject.optInt("adct", 259200));
                    gVar2.k(jSONObject.optString("confirm_title", ""));
                    gVar2.i(jSONObject.optString("confirm_description", ""));
                    gVar2.j(jSONObject.optString("confirm_t", ""));
                    gVar2.h(jSONObject.optString("confirm_c_rv", ""));
                    gVar2.g(jSONObject.optString("confirm_c_play", ""));
                    gVar2.c(jSONObject.optString("adchoice_icon", ""));
                    gVar2.d(jSONObject.optString("adchoice_link", ""));
                    gVar2.e(jSONObject.optString("adchoice_size", ""));
                    gVar2.w(jSONObject.optString("platform_logo", ""));
                    gVar2.x(jSONObject.optString("platform_name", ""));
                    gVar2.a(a(jSONObject.optString("cdnate_cfg", "")));
                    gVar2.i(jSONObject.optInt("atrqt", 0));
                    gVar2.u(jSONObject.optInt("iupdid", 0));
                    gVar2.D(jSONObject.optInt("mcs", AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
                    gVar2.b(jSONObject.optString("ab_id", ""));
                    gVar2.z(jSONObject.optString("rid", ""));
                    gVar2.q(jSONObject.optString("log_rate", "-1"));
                    gVar2.v(jSONObject.optString("omsdkjs_url", ""));
                    gVar2.u(jSONObject.optString("omsdkjs_h5_url", ""));
                    gVar2.N(jSONObject.optInt("rty_tk_clk", 0));
                    gVar2.P(jSONObject.optInt("rty_tk_imp", 0));
                    gVar2.O(jSONObject.optInt("rty_cnt", 3));
                    gVar2.R(jSONObject.optInt("rty_to", Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE));
                    gVar2.Q(jSONObject.optInt("rty_inr", 10));
                    gVar2.n(jSONObject.optString("dns"));
                    gVar2.v(jSONObject.optString("omsdkjs_url", ""));
                    gVar2.u(jSONObject.optString("omsdkjs_h5_url", ""));
                    jOptLong2 = jSONObject.optLong("tcto");
                    if (jOptLong2 == 0) {
                        gVar2.h(10L);
                    } else {
                        gVar2.h(jOptLong2);
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("jt");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            map = new HashMap();
                            while (i11 < jSONArrayOptJSONArray.length()) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i11);
                                map.put(jSONObjectOptJSONObject2.optString("domain"), jSONObjectOptJSONObject2.optString("format"));
                            }
                            gVar2.b(map);
                        }
                    }
                    gVar2.r(jSONObject.optString("mraid_js"));
                    gVar2.C(jSONObject.optString("web_env_url"));
                    iOptInt = jSONObject.optInt("alrbs", 0);
                    if (iOptInt <= 2 || iOptInt < 0) {
                        iOptInt = 0;
                    }
                    gVar2.h(iOptInt);
                    gVar2.e(jSONObject.optBoolean("GDPR_area", false));
                    gVar2.m(jSONObject.optInt("ct", AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ercd");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        arrayList = new ArrayList<>();
                        while (i14 < jSONArrayOptJSONArray2.length()) {
                            iOptInt7 = jSONArrayOptJSONArray2.optInt(i14);
                            if (iOptInt7 != 0) {
                                arrayList.add(Integer.valueOf(iOptInt7));
                            }
                        }
                        if (arrayList.size() > 0) {
                            arrayList.add(Integer.valueOf(i10));
                            gVar2.a(arrayList);
                        }
                    }
                    strOptString = jSONObject.optString("hst");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject(k0.a(strOptString));
                        itKeys = jSONObject5.keys();
                        map2 = new HashMap<>();
                        while (itKeys.hasNext()) {
                            next = itKeys.next();
                            if (TextUtils.isEmpty(next) && !TextUtils.isEmpty(jSONObject5.optString(next)) && !TextUtils.isEmpty(k0.a(jSONObject5.optString(next)))) {
                                map2.put(next, jSONObject5.optString(next));
                            }
                        }
                        if (map2.size() > 0) {
                            gVar2.a(map2);
                        }
                    }
                    jSONArrayOptJSONArray3 = jSONObject.optJSONArray("refactor_switch");
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        while (i13 < jSONArrayOptJSONArray3.length()) {
                            JSONObject jSONObject6 = jSONArrayOptJSONArray3.getJSONObject(i13);
                            itKeys2 = jSONObject6.keys();
                            while (itKeys2.hasNext()) {
                                next2 = itKeys2.next();
                                if (TextUtils.isEmpty(next2) && jSONObject6.getBoolean(next2)) {
                                    gVar2.a(Integer.parseInt(next2));
                                }
                            }
                        }
                    }
                    try {
                        int iOptInt13 = jSONObject.optInt("lqcnt", 30);
                        int iOptInt14 = jSONObject.optInt("lqto", 5);
                        int iOptInt15 = jSONObject.optInt("lqswt", 0);
                        int iOptInt16 = jSONObject.optInt("lqtype", 1);
                        gVar2.y(iOptInt14);
                        gVar2.v(iOptInt13);
                        gVar2.x(iOptInt15);
                        gVar2.z(iOptInt16);
                        gVar2.a(jSONObject.optJSONArray("lg_bl"));
                        gVar2.b(jSONObject.optJSONArray("lg_wl"));
                        gVar2.b0(jSONObject.optInt("lg_wl_rt"));
                        gVar2.T(jSONObject.optInt("srml", 8000));
                        gVar2.A(jSONObject.optInt("lrml", 8000));
                        gVar2.a0(jSONObject.optInt("wgl_d_ms", 1300));
                        gVar2.n(jSONObject.optInt("dp_ct", f32386h1));
                        i12 = Integer.parseInt(k0.a(jSONObject.optString("lqpt")));
                        if (i12 > 0 && i12 < 65535) {
                            gVar2.w(i12);
                        }
                    } catch (Exception unused) {
                    }
                    gVar2.c0(jSONObject.optInt("wvddt", 0));
                    gVar2.l(jSONObject.optString("hst_st", ""));
                    gVar2.m(jSONObject.optString("hst_st_t", ""));
                    try {
                        int iOptInt17 = jSONObject.optInt("l", 3);
                        if (jSONObject.optInt(CampaignEx.JSON_KEY_AD_K, 0) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (jSONObject.optInt("m", 1) == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        gVar2.M(iOptInt17);
                        gVar2.f(z12);
                        gVar2.a(z13);
                    } catch (Exception e14) {
                        q0.b("Setting", e14.getMessage());
                    }
                    gVar2.o(jSONObject.optInt("fbk_swt", 0));
                    gVar2.a(C0444b.a(jSONObject.optJSONObject("fbk")));
                    try {
                        iOptInt2 = jSONObject.optInt("ad_connection_timeout", com.mbridge.msdk.foundation.same.a.f30493o);
                        iOptInt3 = jSONObject.optInt("ad_read_timeout", com.mbridge.msdk.foundation.same.a.f30495q);
                        iOptInt4 = jSONObject.optInt("ad_write_timeout", com.mbridge.msdk.foundation.same.a.f30497s);
                        iOptInt5 = jSONObject.optInt("ad_retry_count", com.mbridge.msdk.foundation.same.a.f30496r);
                        if (iOptInt2 <= 0) {
                            iOptInt2 = com.mbridge.msdk.foundation.same.a.f30493o;
                        }
                        gVar2.c(iOptInt2);
                        if (iOptInt3 <= 0) {
                            iOptInt3 = com.mbridge.msdk.foundation.same.a.f30495q;
                        }
                        gVar2.d(iOptInt3);
                        if (iOptInt4 <= 0) {
                            iOptInt4 = com.mbridge.msdk.foundation.same.a.f30497s;
                        }
                        gVar2.f(iOptInt4);
                        if (iOptInt5 < 0) {
                            iOptInt5 = com.mbridge.msdk.foundation.same.a.f30496r;
                        }
                        gVar2.e(iOptInt5);
                        iOptInt6 = jSONObject.optInt("max_download_task_size", 10);
                        if (iOptInt6 <= 0) {
                            iOptInt6 = 10;
                        }
                        gVar2.C(iOptInt6);
                        gVar2.B(jSONObject.optInt("max_bitmap_cache_size", 10));
                        gVar2.V(jSONObject.optInt("t_t", 3));
                        gVar2.q(jSONObject.optInt("h_t", 3));
                        gVar2.p(jSONObject.optInt("gtp"));
                        gVar2.d(jSONObject.optLong("i_i_t", 3600L));
                        gVar2.t(jSONObject.optString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, ""));
                        gVar2.E(jSONObject.optInt("n_c_u_p", 0));
                    } catch (Exception unused2) {
                    }
                    try {
                        gVar2.o(jSONObject.optString("http_track_url", ""));
                    } catch (Exception unused3) {
                    }
                    gVar2.U(jSONObject.optInt("st_net", 1));
                    gVar2.B(jSONObject.optString("vtag", ""));
                    try {
                        if (jSONObject.optInt("check_webview", 0) == 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        gVar2.c(z11);
                    } catch (Exception unused4) {
                        gVar2.c(false);
                    }
                    gVar2.A(jSONObject.optString("swxid"));
                    gVar2.c(jSONObject.optJSONArray("sdk_filters"));
                    try {
                        gVar2.k(jSONObject.optInt("ch_nv_im_cb", 1));
                    } catch (Exception unused5) {
                        gVar2.k(1);
                    }
                    try {
                        if (jSONObject.optInt("do_us_fi_re", 1) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        gVar2.d(z10);
                    } catch (Exception unused6) {
                        gVar2.d(true);
                    }
                    try {
                        a(jSONObject);
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                    strOptString2 = jSONObject.optString("bcp");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        gVar2.a(com.mbridge.msdk.setting.a.a(k0.a(strOptString2)));
                    }
                    strOptString3 = jSONObject.optString("monitor");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        gVar2.a(d.a(k0.a(strOptString3)));
                    }
                    if (jSONObject.has("new_pipeline_id")) {
                        gVar2.K(jSONObject.optInt("new_pipeline_id"));
                    }
                    if (jSONObject.has("p_p_c_id")) {
                        gVar2.L(jSONObject.optInt("p_p_c_id"));
                    }
                    if (jSONObject.has("p_p_c")) {
                        gVar2.y(jSONObject.optString("p_p_c"));
                    }
                    if (jSONObject.has("c_m_l_id")) {
                        gVar2.l(jSONObject.optInt("c_m_l_id"));
                    }
                    return gVar2;
                } catch (Exception e16) {
                    e = e16;
                    gVar = gVar2;
                    e.printStackTrace();
                    return gVar;
                }
            } catch (Exception e17) {
                e = e17;
                gVar2 = gVar3;
            }
        } catch (Exception e18) {
            e = e18;
            gVar = null;
        }
    }

    public void A(int i10) {
        this.f32403f0 = i10;
    }

    public void B(int i10) {
        if (i10 > 0) {
            this.f32411i0 = i10;
        }
    }

    public void C(int i10) {
        this.f32409h0 = i10;
    }

    public void D(int i10) {
        this.f32413j0 = i10;
    }

    public int E() {
        return this.R;
    }

    public void F(int i10) {
        this.f32423o0 = i10;
    }

    public void G(int i10) {
        this.f32427q0 = i10;
    }

    public void H(int i10) {
        this.f32425p0 = i10;
    }

    public void I(int i10) {
        this.f32429r0 = i10;
    }

    public void J(int i10) {
        this.f32431s0 = i10;
    }

    public void K(int i10) {
        this.f32395c1 = i10;
    }

    public void L(int i10) {
        this.f32398d1 = i10;
    }

    public void M(int i10) {
        this.f32443y0 = i10;
    }

    public void N(int i10) {
        this.f32445z0 = i10;
    }

    public void O(int i10) {
        this.A0 = i10;
    }

    public void P(int i10) {
        this.B0 = i10;
    }

    public void Q(int i10) {
        this.C0 = i10;
    }

    public void R(int i10) {
        this.D0 = i10;
    }

    public void S(int i10) {
        this.F0 = i10;
    }

    public void T(int i10) {
        this.K0 = i10;
    }

    public void U(int i10) {
        this.L0 = i10;
    }

    public void V(int i10) {
        this.N0 = i10;
    }

    public void W(int i10) {
        this.Q0 = i10;
    }

    public void X(int i10) {
        this.R0 = i10;
    }

    public void Y(int i10) {
        this.S0 = i10;
    }

    public void Z(int i10) {
        this.T0 = i10;
    }

    public int a0() {
        return this.f32395c1;
    }

    public void b0(int i10) {
        this.X0 = i10;
    }

    public void c(String str) {
        this.f32410i = str;
    }

    public void d(int i10) {
        this.f32402f = i10;
    }

    public void e(String str) {
        this.f32414k = str;
    }

    public int f() {
        return this.f32418m;
    }

    public List<com.mbridge.msdk.foundation.entity.a> g() {
        return this.f32420n;
    }

    public int h() {
        return this.f32422o;
    }

    public long i() {
        return this.f32424p;
    }

    public void j(int i10) {
        this.f32434u = i10;
    }

    public void k(int i10) {
        this.f32436v = i10;
    }

    public void l(String str) {
        this.D = str;
    }

    public void m(int i10) {
        this.C = i10;
    }

    public void n(int i10) {
        this.G = i10;
        com.mbridge.msdk.click.utils.a.f28509d = i10;
    }

    public void o(String str) {
        this.P = str;
    }

    public void p(int i10) {
        this.M = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().d(i10);
    }

    public void q(int i10) {
        this.N = i10;
    }

    public void r(int i10) {
        this.R = i10;
    }

    public void s(int i10) {
        this.U = i10;
    }

    public String t() {
        return this.B;
    }

    public void u(int i10) {
        this.W = i10;
    }

    public void v(int i10) {
        this.f32388a0 = i10;
    }

    public void w(int i10) {
        this.f32391b0 = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().b(i10);
        com.mbridge.msdk.foundation.same.net.utils.d.h().c(i10);
    }

    public void x(int i10) {
        this.f32394c0 = i10;
    }

    public void y(int i10) {
        this.f32397d0 = i10;
    }

    public void z(int i10) {
        this.f32400e0 = i10;
    }

    public void A(String str) {
        if (TextUtils.isEmpty(this.f32406g0)) {
            return;
        }
        this.f32406g0 = str;
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.n().j())) {
            com.mbridge.msdk.foundation.controller.c.n().d(this.f32406g0);
        }
    }

    public void B(String str) {
        this.U0 = str;
    }

    public void C(String str) {
        this.V0 = str;
    }

    public String c() {
        return this.f32412j;
    }

    public void d(String str) {
        this.f32412j = str;
    }

    public int e() {
        return this.f32416l;
    }

    public void f(String str) {
        this.f32428r = str;
    }

    public void g(String str) {
        this.f32440x = str;
    }

    public void h(String str) {
        this.f32442y = str;
    }

    public void i(String str) {
        this.f32444z = str;
    }

    public void j(String str) {
        this.A = str;
    }

    public void k(String str) {
        this.B = str;
    }

    public void l(int i10) {
        this.f32404f1 = i10;
    }

    public void m(String str) {
        this.E = str;
    }

    public int o() {
        return this.f32404f1;
    }

    public void q(String str) {
        this.Z = str;
    }

    public void r(String str) {
        this.f32415k0 = str;
    }

    public void s(String str) {
        this.f32417l0 = str;
    }

    public void t(int i10) {
        this.V = i10;
    }

    public void u(String str) {
        this.f32419m0 = str;
    }

    public void v(String str) {
        this.f32421n0 = str;
    }

    public void x(String str) {
        this.f32435u0 = str;
    }

    public void y(String str) {
        this.f32401e1 = str;
    }

    public void z(String str) {
        this.I0 = str;
    }

    public void c(long j10) {
        this.L = j10;
    }

    public void c0(int i10) {
        this.Y0 = i10;
    }

    public String d() {
        return this.f32414k;
    }

    public void e(long j10) {
        this.f32437v0 = j10;
    }

    public void f(long j10) {
        this.f32439w0 = j10;
    }

    public void g(long j10) {
        this.J0 = j10;
    }

    public void h(long j10) {
        this.M0 = j10;
    }

    public void i(long j10) {
        this.O0 = j10;
    }

    public void n(String str) {
        this.f32407g1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a().b(k0.a(str));
    }

    public void p(String str) {
        this.X = str;
    }

    public void c(JSONArray jSONArray) {
        this.G0 = jSONArray;
    }

    public void d(boolean z10) {
        this.S = z10;
    }

    public void e(boolean z10) {
        this.f32387a = z10;
    }

    public void f(boolean z10) {
        this.T = z10;
    }

    public void g(boolean z10) {
        this.E0 = z10;
    }

    public void h(boolean z10) {
        this.P0 = z10;
    }

    public void w(String str) {
        this.f32433t0 = str;
    }

    public void c(JSONObject jSONObject) {
        this.H0 = jSONObject;
    }

    public void c(boolean z10) {
        this.f32438w = z10;
    }

    public static Map<String, a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0444b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONArray f32451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f32455f;

        public static C0444b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0444b c0444b = new C0444b();
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            c0444b.f32455f = jSONObject.optString(CampaignEx.JSON_KEY_TITLE, contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_title", "string")));
            c0444b.f32450a = jSONObject.optString("cancel", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_close", "string")));
            c0444b.f32453d = jSONObject.optString("submit", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_submit", "string")));
            c0444b.f32454e = jSONObject.optString("submit_notice", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_submit_notice", "string")));
            c0444b.f32452c = jSONObject.optString("privacy", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_privacy_des", "string")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0444b.f32451b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0444b.f32451b = jSONArray;
                jSONArray.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_not_play", "string")));
                c0444b.f32451b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_sound_problems", "string")));
                c0444b.f32451b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_misleading", "string")));
                c0444b.f32451b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_fraud", "string")));
                c0444b.f32451b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_por_violence", "string")));
                c0444b.f32451b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return c0444b;
        }

        public JSONArray b() {
            return this.f32451b;
        }

        public String c() {
            return this.f32452c;
        }

        public String d() {
            return this.f32453d;
        }

        public String e() {
            return this.f32454e;
        }

        public String f() {
            return this.f32455f;
        }

        public String a() {
            return this.f32450a;
        }
    }

    public void a(int i10) {
        this.f32441x0.add(Integer.valueOf(i10));
    }

    private static void a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        String strOptString2 = jSONObject.optString("c");
        if (fastKVBuild != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                        com.mbridge.msdk.foundation.same.a.V = strOptString;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                        try {
                            fastKVBuild.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                        } catch (Exception unused2) {
                        }
                    }
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f30485g, strOptString2)) {
                        com.mbridge.msdk.foundation.same.a.f30485g = strOptString2;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f30485g);
                        try {
                            fastKVBuild.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f30485g);
                        } catch (Exception unused3) {
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                        com.mbridge.msdk.foundation.same.a.V = strOptString;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                        SharedPreferences sharedPreferences = contextD.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                            editorEdit.apply();
                        }
                    }
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f30485g, strOptString2)) {
                        com.mbridge.msdk.foundation.same.a.f30485g = strOptString2;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f30485g);
                        SharedPreferences sharedPreferences2 = contextD.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                        if (sharedPreferences2 != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            editorEdit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f30485g);
                            editorEdit2.apply();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        try {
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                return;
            }
            new com.mbridge.msdk.config.component.common.util.d().a(strOptString, strOptString2);
        } catch (Throwable th2) {
            q0.b("BaseSetting", th2.getMessage());
        }
    }

    public String a() {
        return this.f32396d;
    }

    public void a(List<com.mbridge.msdk.foundation.entity.a> list) {
        this.f32420n = list;
    }

    public void a(long j10) {
        this.f32424p = j10;
    }

    public void a(com.mbridge.msdk.setting.a aVar) {
        this.f32426q = aVar;
    }

    public void a(Map<String, a> map) {
        this.f32430s = map;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.H = arrayList;
    }

    public void a(d dVar) {
        this.I = dVar;
    }

    public void a(C0444b c0444b) {
        this.J = c0444b;
    }

    public void a(HashMap<String, String> map) {
        this.O = map;
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f32390b = jSONArray;
    }

    public void a(boolean z10) {
        this.Q = z10;
    }

    public void b(String str) {
        this.f32396d = str;
    }

    public String b() {
        return this.f32410i;
    }

    public void b(long j10) {
        this.F = j10;
    }

    public void b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f32393c = jSONArray;
    }

    public void b(boolean z10) {
        this.f32432t = z10;
    }

    public boolean b(int i10) {
        return this.f32441x0.contains(Integer.valueOf(i10));
    }
}
