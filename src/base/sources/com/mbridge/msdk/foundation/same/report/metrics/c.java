package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f30747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f30748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f30749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Long> f30750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f30751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f30753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f30757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f30758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f30759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f30760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f30761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f30762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f30763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f30764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f30765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f30766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f30767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f30768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f30769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f30770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f30771z;

    public c() {
        this.f30746a = false;
        this.f30747b = new HashMap();
        this.f30748c = new HashMap();
        this.f30749d = new HashMap();
        this.f30750e = new HashMap();
        this.f30752g = "";
        this.f30753h = new CopyOnWriteArrayList<>();
        this.f30764s = -1;
        this.f30766u = false;
        this.f30768w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public int A() {
        return this.B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f30754i)) {
            return this.f30754i;
        }
        try {
            if (TextUtils.isEmpty(this.f30754i)) {
                String str = this.f30752g + this.f30763r;
                Map<String, Map<String, String>> map2 = this.f30747b;
                if (map2 != null && map2.containsKey(str) && (map = this.f30747b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f30754i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f30754i;
    }

    public String C() {
        return this.f30759n;
    }

    public boolean D() {
        return this.f30766u;
    }

    public boolean E() {
        return this.f30768w;
    }

    public boolean F() {
        return this.f30767v;
    }

    public boolean G() {
        return this.f30746a;
    }

    public void a(boolean z10) {
        this.f30766u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f30763r = str;
            eVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f30755j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a("key", str);
            }
            if (Arrays.asList(b.f30731a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a("type", Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a("type", Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f30755j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a("content_type", Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public Object clone() {
        return super.clone();
    }

    public void d(String str) {
        if (this.f30750e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f30750e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f30764s = i10;
    }

    public void f(String str) {
        this.f30762q = str;
    }

    public int g() {
        return this.f30755j;
    }

    public void h(String str) {
        this.f30761p = str;
    }

    public void i(String str) {
        this.f30752g = str;
    }

    public void j(String str) {
        this.f30763r = str;
    }

    public void k(String str) {
        this.f30757l = str;
    }

    public String l() {
        return this.f30756k;
    }

    public List<CampaignEx> m() {
        return this.f30753h;
    }

    public CampaignEx n() {
        return this.C;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.f30764s;
    }

    public int r() {
        return this.f30765t;
    }

    public String s() {
        return this.f30761p;
    }

    public String t() {
        return this.f30752g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f30751f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f30749d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f30747b;
    }

    public String x() {
        return this.f30757l;
    }

    public String y() {
        return this.f30760o;
    }

    public String z() {
        return this.f30758m;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f30753h.isEmpty()) {
                    this.f30753h.clear();
                }
                this.f30753h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f30752g + str;
            Map<String, Map<String, String>> map = this.f30747b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f30747b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f30765t = i10;
    }

    public void g(String str) {
        this.f30756k = str;
    }

    public int i() {
        return this.f30770y;
    }

    public String j() {
        return this.f30762q;
    }

    public int k() {
        return this.f30771z;
    }

    public void l(String str) {
        this.f30760o = str;
    }

    public void m(String str) {
        this.f30758m = str;
    }

    public void n(String str) {
        this.f30754i = str;
    }

    public void o(String str) {
        this.f30759n = str;
    }

    public void d(boolean z10) {
        this.f30769x = z10;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f30752g + str;
            Map<String, Map<String, String>> map2 = this.f30748c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f30748c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f30748c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                for (int i10 = 0; i10 < this.D.size(); i10++) {
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f30753h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f30753h.size(); i11++) {
                if (this.f30753h.get(i11) != null && this.f30753h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f30753h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c(boolean z10) {
        this.f30746a = false;
        this.f30747b = new HashMap();
        this.f30748c = new HashMap();
        this.f30749d = new HashMap();
        this.f30750e = new HashMap();
        this.f30752g = "";
        this.f30753h = new CopyOnWriteArrayList<>();
        this.f30764s = -1;
        this.f30766u = false;
        this.f30768w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f30746a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f30750e) != null && map.containsKey(str)) {
                Long l10 = this.f30750e.get(str);
                return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    public void a(int i10) {
        this.f30755j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f30748c.containsKey(str) ? this.f30748c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f30768w = z10;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f30752g + str;
            Map<String, Map<String, String>> map2 = this.f30747b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f30747b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f30747b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f30770y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f30763r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f30751f = bVar;
    }

    public void c(boolean z10) {
        this.f30767v = z10;
    }

    public void c(int i10) {
        this.f30771z = i10;
    }
}
