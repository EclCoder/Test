package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f31502r = "d";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f31503s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f31504t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Map<String, k> f31505u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f31506v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f31507w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static d f31508x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f31509y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f31510z = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f31511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f31512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f31513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31514e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f31518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f31519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected List<Integer> f31520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Integer> f31521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31525p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Queue<Integer> f31515f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Queue<Long> f31516g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31517h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f31526q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f31528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f31529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f31530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f31531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f31532g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f31535j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f31537l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f31533h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f31534i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f31536k = true;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f31539a;

            a(CampaignUnit campaignUnit) {
                this.f31539a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f31535j != null) {
                    b bVar = b.this;
                    d.this.f31490a.removeCallbacks(bVar.f31535j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f31539a);
                }
                if (d.f31503s.containsKey("0_" + b.this.unitId)) {
                    d.f31503s.remove("0_" + b.this.unitId);
                }
                if (b.this.f31532g > 0) {
                    if (this.f31539a.ads.size() > b.this.f31532g) {
                        b bVar2 = b.this;
                        bVar2.f31529d = bVar2.f31532g;
                    } else {
                        b.this.f31529d = this.f31539a.ads.size();
                    }
                } else if (b.this.f31532g == -1) {
                    b.this.f31529d = 0;
                } else if (b.this.f31532g == -3) {
                    b.this.f31529d = this.f31539a.ads.size();
                } else if (b.this.f31532g == -2) {
                    if (this.f31539a.getTemplate() == 3) {
                        if (b.this.f31531f != 0) {
                            b bVar3 = b.this;
                            bVar3.f31529d = bVar3.f31531f;
                        }
                    } else if (b.this.f31530e != 0) {
                        b bVar4 = b.this;
                        bVar4.f31529d = bVar4.f31530e;
                    }
                    if (b.this.f31529d <= 0) {
                        b.this.f31529d = ((Integer) d.f31506v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f31539a.ads.size() < b.this.f31529d) {
                    b.this.f31529d = this.f31539a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f31539a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f31539a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f31539a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.f31529d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f30502x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f31522m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f31539a.getAds().get(0) != null ? this.f31539a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a(b.this.unitId, arrayList);
                }
                d.a(b.this.f31528c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f31539a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31539a.getAds().get(0).getMaitve(), this.f31539a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0417b extends com.mbridge.msdk.foundation.same.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f31541a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f31542b;

            C0417b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f31541a = campaignEx;
                this.f31542b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f31541a, this.f31542b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f31544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f31545b;

            c(String str, int i10) {
                this.f31544a = str;
                this.f31545b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f31534i) {
                    if (b.this.f31535j != null) {
                        b bVar = b.this;
                        d.this.f31490a.removeCallbacks(bVar.f31535j);
                    }
                    if (b.this.a() == 1 || b.this.f31536k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f31544a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.f31537l);
                    }
                } else if (b.this.f31536k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f31544a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.f31537l);
                }
                if (this.f31545b == -1) {
                    d.b(b.this.f31528c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0418d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f31547a;

            RunnableC0418d(List list) {
                this.f31547a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f31534i && b.this.f31535j != null) {
                    b bVar = b.this;
                    d.this.f31490a.removeCallbacks(bVar.f31535j);
                }
                List list = this.f31547a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f31547a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f31522m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f31547a);
                    if (d.f31503s.containsKey("1_" + b.this.unitId)) {
                        d.f31503s.remove("1_" + b.this.unitId);
                    }
                    d.f31503s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f31528c = i10;
        }

        public void b(List<String> list) {
            this.f31533h = list;
        }

        public void c(int i10) {
            this.f31530e = i10;
        }

        public void d(int i10) {
            this.f31529d = i10;
        }

        public void e(int i10) {
            this.f31531f = i10;
        }

        public void b(int i10) {
            this.f31532g = i10;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f31537l = aVar;
        }

        public void b(boolean z10) {
            this.f31536k = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f31534i = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.f31523n = true;
            d.this.a(true, this.f31537l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0417b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(Runnable runnable) {
            this.f31535j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0418d(list)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f31550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f31551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f31552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f31553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f31554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f31555g = false;

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f31549a = i10;
            this.f31550b = dVar;
            this.f31551c = i11;
            this.f31552d = str;
            this.f31553e = str2;
        }

        public void a(boolean z10) {
            this.f31555g = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31550b.a(true);
            int i10 = this.f31549a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f31551c, this.f31552d, this.f31553e, this.f31554f);
            } else {
                d.this.f31523n = true;
                if (this.f31555g || this.f31551c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f31551c, this.f31552d, this.f31553e, this.f31554f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f31554f = aVar;
        }

        public void a(String str) {
            this.f31552d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f31490a = new a();
    }

    public static Map<String, Integer> c() {
        return f31506v;
    }

    public static Map<String, Integer> d() {
        return f31507w;
    }

    public static Map<String, k> e() {
        return f31505u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f31503s;
    }

    public static Map<String, Boolean> g() {
        return f31504t;
    }

    public static void b(int i10, String str) {
        if (f31505u.containsKey(str)) {
            k kVar = f31505u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f31505u.put(str, kVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    public void a(Map<String, Object> map, int i10) {
        String str;
        String str2;
        int i11;
        int i12;
        com.mbridge.msdk.preload.listenter.a aVar;
        Object obj;
        String str3 = CIdIVqKnNZ.lBox;
        try {
            this.f31518i = map;
            this.f31523n = false;
            if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                String str4 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                if (f31503s.containsKey(((i10 + 1) % 2) + "_" + str4)) {
                    if (!f31503s.containsKey(i10 + "_" + str4)) {
                        return;
                    }
                }
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                    this.f31522m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
                }
                com.mbridge.msdk.click.a aVar2 = this.f31512c;
                if (aVar2 == null) {
                    this.f31512c = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), str4);
                } else {
                    aVar2.a(str4);
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.f31517h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                    this.f31514e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                if (f31504t.containsKey(str4) && f31504t.get(str4).booleanValue()) {
                    Map<String, Map<Long, Object>> mapF = f();
                    Map<Long, Object> map2 = mapF.get(i10 + "_" + str4);
                    com.mbridge.msdk.setting.g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                    if (map2 != null && map2.size() > 0) {
                        Long next = map2.keySet().iterator().next();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (gVarF == null) {
                            gVarF = h.b().a();
                        }
                        if (jCurrentTimeMillis - next.longValue() >= gVarF.b0() * 1000) {
                            mapF.remove(str4);
                        } else if (i10 == 1) {
                            return;
                        }
                    }
                }
                f31504t.put(str4, Boolean.TRUE);
                this.f31525p = 1;
                try {
                    if (map.containsKey("ad_num")) {
                        int iIntValue = ((Integer) map.get("ad_num")).intValue();
                        this.f31525p = iIntValue;
                        if (iIntValue < 1) {
                            this.f31525p = 1;
                        }
                        if (this.f31525p > 10) {
                            this.f31525p = 10;
                        }
                    }
                } catch (Exception unused) {
                    q0.b(f31502r, "ADNUM MUST BE INTEGER");
                }
                f31506v.put(str4, Integer.valueOf(this.f31525p));
                com.mbridge.msdk.preload.listenter.a aVar3 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new com.mbridge.msdk.preload.listenter.a((PreloadListener) obj);
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                String strC = com.mbridge.msdk.foundation.controller.c.n().c();
                if (map.containsKey(MBridgeConstans.APP_ID) && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                    strB = (String) map.get(MBridgeConstans.APP_ID);
                    strC = (String) map.get(MBridgeConstans.APP_KEY);
                }
                a(strB, strC, str4);
                l lVarE = h.b().e(strB, str4);
                this.f31513d = lVarE;
                if (lVarE == null) {
                    this.f31513d = l.i(str4);
                }
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                String str5 = str;
                this.f31519j = this.f31513d.b();
                this.f31520k = this.f31513d.c();
                this.f31521l = this.f31513d.c();
                List<Integer> list = this.f31519j;
                if (list == null || list.size() <= 0) {
                    com.mbridge.msdk.preload.listenter.a aVar4 = aVar3;
                    if (aVar4 != null) {
                        aVar4.onPreloadFaild("do not have sorceList");
                        return;
                    }
                    return;
                }
                this.f31515f = new LinkedList();
                Iterator<Integer> it = this.f31519j.iterator();
                while (it.hasNext()) {
                    this.f31515f.add(it.next());
                }
                List<Integer> list2 = this.f31521l;
                if (list2 != null && list2.size() > 0) {
                    this.f31516g = new LinkedList();
                    Iterator<Integer> it2 = this.f31521l.iterator();
                    while (it2.hasNext()) {
                        this.f31516g.add(Long.valueOf(it2.next().intValue() * 1000));
                    }
                }
                if (this.f31519j.contains(1) && i10 == 0) {
                    try {
                        str2 = str4;
                        aVar = aVar3;
                        try {
                            try {
                                a(1, this.f31520k.get(this.f31519j.indexOf(1)).intValue() * 1000, i10, this.f31513d, str2, str5, false, aVar);
                                str5 = str5;
                                i11 = 1;
                                try {
                                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(1);
                                    if (bVarA != null) {
                                        i12 = 0;
                                        try {
                                            List<Campaign> listA = bVarA.a(str2, 0);
                                            if (listA != null && listA.size() > 0) {
                                                a(true, aVar, (String) null);
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                } catch (Exception unused3) {
                                }
                            } catch (Exception unused4) {
                                str5 = str5;
                                i11 = 1;
                            }
                        } catch (Exception unused5) {
                        }
                    } catch (Exception unused6) {
                        str2 = str4;
                        i11 = 1;
                        i12 = 0;
                        aVar = aVar3;
                    }
                } else {
                    str2 = str4;
                    i11 = 1;
                    i12 = 0;
                    aVar = aVar3;
                }
                String str6 = str2;
                a(i10, this.f31513d, str6, str5, aVar);
                l lVar = this.f31513d;
                d().put(str6, Integer.valueOf(lVar != null ? lVar.y() * this.f31525p : i11));
                try {
                    int i13 = MBMediaView.f31815p0;
                    e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str6);
                    o0.a();
                    if (TextUtils.isEmpty(str6)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
                    int iA = a(map.containsKey(str3) ? (String) map.get(str3) : null);
                    if (iA <= 0) {
                        iA = this.f31525p;
                    }
                    List<Campaign> listA2 = a(str6, iA);
                    if (listA2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i14 = i12; i14 < listA2.size(); i14++) {
                            CampaignEx campaignEx = (CampaignEx) listA2.get(i14);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", null).invoke(null, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str6, new CopyOnWriteArrayList(arrayList), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod(TrackLoadSettingsAtom.TYPE, String.class).invoke(objInvoke, str6);
                        }
                    }
                } catch (Throwable unused7) {
                    q0.b(f31502r, "init cam cache failed");
                }
            }
        } catch (Exception e10) {
            q0.b(f31502r, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
            return 0;
        } catch (Exception e10) {
            q0.b(f31502r, com.mbridge.msdk.mbnative.common.a.a(e10));
            return 0;
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = h.b().e("", str);
        this.f31513d = lVarE;
        if (lVarE == null) {
            this.f31513d = l.i(str);
        }
        List<Integer> listB = this.f31513d.b();
        this.f31519j = listB;
        if (listB == null || listB.size() <= 0 || !this.f31519j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    public void a(int i10, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f31515f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f31515f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f31516g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f31516g.poll().longValue();
            }
            q0.c(f31502r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f31518i, i10, lVar, aVar);
        } catch (Throwable unused) {
            q0.b(f31502r, "queue poll exception");
        }
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, l lVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        List<Campaign> listA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null && (listA = bVarA.a(str, this.f31525p)) != null && listA.size() > 0) {
            a(true, aVar, (String) null);
            return;
        }
        if (i10 == 1) {
            a(i10, j10, i11, lVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, lVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, lVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0297 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02a6 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02b8 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02cc A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f9 A[Catch: Exception -> 0x0092, TRY_ENTER, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x030e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0311 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0360 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x036d A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x039f A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x03fa A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0429 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x043d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0446 A[Catch: Exception -> 0x0092, TryCatch #3 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e6, B:84:0x01f7, B:86:0x01fd, B:88:0x0211, B:90:0x0217, B:95:0x0220, B:97:0x0226, B:102:0x0236, B:109:0x0258, B:117:0x026e, B:119:0x0297, B:120:0x029e, B:122:0x02a6, B:124:0x02b8, B:125:0x02c1, B:127:0x02cc, B:133:0x02dc, B:137:0x02ec, B:142:0x02f9, B:146:0x0325, B:148:0x0360, B:149:0x0365, B:151:0x036d, B:153:0x0377, B:154:0x0397, B:156:0x039f, B:158:0x03a9, B:159:0x03c9, B:163:0x03fd, B:165:0x0429, B:169:0x045d, B:168:0x0446, B:162:0x03fa, B:145:0x0311, B:134:0x02e1, B:135:0x02e6, B:108:0x024b, B:111:0x025f, B:170:0x0463), top: B:180:0x0016 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x02f9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x0311, please report this as an issue */
    @Override // com.mbridge.msdk.mbnative.controller.b
    public void a(int i10, long j10, int i11, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z10) {
        int i12;
        int i13;
        int iOptInt;
        int iA;
        int i14;
        String strA;
        b bVar;
        long j11;
        k kVar;
        JSONArray jSONArrayB;
        String str3;
        int iOptInt2;
        String string;
        List<Campaign> listA;
        List<Campaign> listA2;
        try {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).d();
            int iF = this.f31513d.f();
            int iE = this.f31513d.e();
            com.mbridge.msdk.mbnative.service.net.a aVar2 = new com.mbridge.msdk.mbnative.service.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.f31518i;
            if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.f31518i.containsKey(MBridgeConstans.APP_KEY) && this.f31518i.containsKey(MBridgeConstans.KEY_WORD) && this.f31518i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f31518i.get(MBridgeConstans.APP_ID) instanceof String) {
                    strB = (String) this.f31518i.get(MBridgeConstans.APP_ID);
                }
                if (this.f31518i.get(MBridgeConstans.APP_KEY) instanceof String) {
                    strC = (String) this.f31518i.get(MBridgeConstans.APP_KEY);
                }
                String str4 = this.f31518i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f31518i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str4)) {
                    eVar.a("smart", k0.b(str4));
                }
            }
            String str5 = strB;
            String str6 = strC;
            eVar.a(MBridgeConstans.APP_ID, str5);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("req_type", "1");
            if (!TextUtils.isEmpty(this.f31514e)) {
                eVar.a("category", this.f31514e);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            eVar.a("sign", SameMD5.getMD5(str5 + str6));
            eVar.a("only_impression", "1");
            String strD = v0.d(str);
            if (!TextUtils.isEmpty(strD)) {
                eVar.a("j", strD);
            }
            int iIntValue = f31506v.get(str).intValue();
            if (iF != f31509y && iF != 0 && iIntValue != 0) {
                if (i11 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                    if (z10) {
                        if (bVarA != null && (listA2 = bVarA.a(str, iIntValue)) != null && listA2.size() > 0) {
                            a(true, aVar, (String) null);
                            return;
                        } else {
                            if (this.f31523n) {
                                a("", i11, str, str2, aVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (i10 != 1 && bVarA != null && (listA = bVarA.a(str, iIntValue)) != null && listA.size() > 0) {
                        a(true, aVar, (String) null);
                        return;
                    }
                }
                if (iIntValue != 0) {
                    eVar.a("ad_num", iIntValue + "");
                }
                if (this.f31517h != 0) {
                    eVar.a("frame_num", this.f31517h + "");
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    String str7 = (String) this.f31518i.get(MBridgeConstans.NATIVE_INFO);
                    if (TextUtils.isEmpty(str7)) {
                        i12 = iIntValue;
                    } else {
                        String str8 = f31502r;
                        StringBuilder sb2 = new StringBuilder();
                        i12 = iIntValue;
                        sb2.append(Saucuwx.leVVRAWENUDQa);
                        sb2.append(str7);
                        q0.b(str8, sb2.toString());
                        try {
                            JSONArray jSONArray = new JSONArray(str7);
                            str3 = str7;
                            if (jSONArray.length() > 0) {
                                int i15 = 0;
                                iOptInt = 0;
                                iOptInt2 = 0;
                                while (i15 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i15);
                                        JSONArray jSONArray2 = jSONArray;
                                        int i16 = i15;
                                        int iOptInt3 = jSONObject.optInt("id", 0);
                                        if (2 == iOptInt3) {
                                            iOptInt = jSONObject.optInt("ad_num");
                                            if (iF > 0) {
                                                jSONObject.put("ad_num", iF);
                                            }
                                        } else if (3 == iOptInt3) {
                                            iOptInt2 = jSONObject.optInt("ad_num");
                                            if (iF > 0) {
                                                jSONObject.put("ad_num", iF);
                                            }
                                        }
                                        i15 = i16 + 1;
                                        jSONArray = jSONArray2;
                                    } catch (JSONException e10) {
                                        e = e10;
                                        q0.b(f31502r, com.mbridge.msdk.mbnative.common.a.a(e));
                                        i13 = iOptInt2;
                                        string = str3;
                                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                                        iF = i12;
                                        eVar.a("ad_num", iF + "");
                                        eVar.a("ping_mode", "1");
                                        if (h.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                                            h.b().a();
                                        }
                                        if (!NativeController.b(this.f31518i)) {
                                            jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                                            if (jSONArrayB.length() > 0) {
                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30651h, v0.a(jSONArrayB));
                                            }
                                        }
                                        a(eVar, i10);
                                        if (f31505u.containsKey(str)) {
                                            iA = 0;
                                        } else {
                                            iA = 0;
                                        }
                                        if (this.f31518i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                            i14 = 1;
                                            if (i10 == 1) {
                                                eVar.a("tnum", this.f31524o + "");
                                            }
                                            eVar.a("offset", iA + "");
                                            eVar.a("ad_type", "42");
                                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                                            strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                            if (!TextUtils.isEmpty(strA)) {
                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                                            }
                                            if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                            }
                                            if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                            }
                                            eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                                            bVar = new b(i10);
                                            bVar.setUnitId(str);
                                            bVar.setPlacementId(str2);
                                            bVar.setAdType(42);
                                            bVar.d(i12);
                                            bVar.c(iOptInt);
                                            bVar.e(i13);
                                            bVar.b(iE);
                                            bVar.a(aVar);
                                            if (i10 == 1) {
                                                bVar.b(true);
                                            } else {
                                                bVar.b(true);
                                            }
                                            bVar.b(NativeController.a(this.f31518i));
                                            c cVar = new c(1, bVar, i11, str, str2);
                                            bVar.a(cVar);
                                            bVar.a(i11);
                                            cVar.a(aVar);
                                            cVar.a(z10);
                                            cVar.a(str);
                                            if (i11 == 0) {
                                                j11 = j10;
                                                aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                                            } else {
                                                j11 = j10;
                                                if (i11 == 1) {
                                                    aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                                                }
                                            }
                                            this.f31490a.postDelayed(cVar, j11);
                                            return;
                                        }
                                        i14 = 1;
                                        if (i10 == i14) {
                                            eVar.a("tnum", this.f31525p + "");
                                        }
                                        eVar.a("offset", iA + "");
                                        eVar.a("ad_type", "42");
                                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                        if (!TextUtils.isEmpty(strA)) {
                                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                                        }
                                        if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                            eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                        }
                                        if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                            eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                        }
                                        eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                                        bVar = new b(i10);
                                        bVar.setUnitId(str);
                                        bVar.setPlacementId(str2);
                                        bVar.setAdType(42);
                                        bVar.d(i12);
                                        bVar.c(iOptInt);
                                        bVar.e(i13);
                                        bVar.b(iE);
                                        bVar.a(aVar);
                                        if (i10 == 1) {
                                            bVar.b(true);
                                        } else {
                                            bVar.b(true);
                                        }
                                        bVar.b(NativeController.a(this.f31518i));
                                        c cVar2 = new c(1, bVar, i11, str, str2);
                                        bVar.a(cVar2);
                                        bVar.a(i11);
                                        cVar2.a(aVar);
                                        cVar2.a(z10);
                                        cVar2.a(str);
                                        if (i11 == 0) {
                                            j11 = j10;
                                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                                        } else {
                                            j11 = j10;
                                            if (i11 == 1) {
                                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                                            }
                                        }
                                        this.f31490a.postDelayed(cVar2, j11);
                                        return;
                                    }
                                }
                                i13 = iOptInt2;
                            } else {
                                i13 = 0;
                                iOptInt = 0;
                            }
                            JSONArray jSONArray3 = jSONArray;
                            try {
                                this.f31524o = Math.max(iOptInt, i13);
                                string = jSONArray3.toString();
                            } catch (JSONException e11) {
                                e = e11;
                                iOptInt2 = i13;
                                q0.b(f31502r, com.mbridge.msdk.mbnative.common.a.a(e));
                                i13 = iOptInt2;
                                string = str3;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            str3 = str7;
                            iOptInt = 0;
                            iOptInt2 = 0;
                        }
                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                    }
                    iF = i12;
                    eVar.a("ad_num", iF + "");
                    eVar.a("ping_mode", "1");
                    if (h.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                        h.b().a();
                    }
                    if (!NativeController.b(this.f31518i)) {
                        jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                        if (jSONArrayB.length() > 0) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30651h, v0.a(jSONArrayB));
                        }
                    }
                    a(eVar, i10);
                    if (f31505u.containsKey(str) || (kVar = f31505u.get(str)) == null) {
                        iA = 0;
                    } else if (i10 == 1 || i10 != 2) {
                        iA = kVar.a();
                    } else {
                        iA = kVar.b();
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i14 = 1;
                        if (i10 == 1) {
                            eVar.a("tnum", this.f31524o + "");
                        }
                        eVar.a("offset", iA + "");
                        eVar.a("ad_type", "42");
                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                        if (!TextUtils.isEmpty(strA)) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                        }
                        if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                            eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                        }
                        if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                            eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                        }
                        eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                        bVar = new b(i10);
                        bVar.setUnitId(str);
                        bVar.setPlacementId(str2);
                        bVar.setAdType(42);
                        bVar.d(i12);
                        bVar.c(iOptInt);
                        bVar.e(i13);
                        bVar.b(iE);
                        bVar.a(aVar);
                        if (i10 == 1 || z10) {
                            bVar.b(true);
                        }
                        bVar.b(NativeController.a(this.f31518i));
                        c cVar3 = new c(1, bVar, i11, str, str2);
                        bVar.a(cVar3);
                        bVar.a(i11);
                        cVar3.a(aVar);
                        cVar3.a(z10);
                        cVar3.a(str);
                        if (i11 == 0) {
                            j11 = j10;
                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                        } else {
                            j11 = j10;
                            if (i11 == 1) {
                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                            }
                        }
                        this.f31490a.postDelayed(cVar3, j11);
                        return;
                    }
                    i14 = 1;
                    if (i10 == i14) {
                        eVar.a("tnum", this.f31525p + "");
                    }
                    eVar.a("offset", iA + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i12);
                    bVar.c(iOptInt);
                    bVar.e(i13);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f31518i));
                    c cVar4 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar4);
                    bVar.a(i11);
                    cVar4.a(aVar);
                    cVar4.a(z10);
                    cVar4.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                        }
                    }
                    this.f31490a.postDelayed(cVar4, j11);
                    return;
                }
                i12 = iIntValue;
                if (iF != f31510z && iF != 0) {
                    i13 = 0;
                    iOptInt = 0;
                }
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (h.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    h.b().a();
                }
                if (!NativeController.b(this.f31518i)) {
                    jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30651h, v0.a(jSONArrayB));
                    }
                }
                a(eVar, i10);
                if (f31505u.containsKey(str)) {
                    iA = 0;
                } else {
                    iA = 0;
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i14 = 1;
                    if (i10 == 1) {
                        eVar.a("tnum", this.f31524o + "");
                    }
                    eVar.a("offset", iA + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i12);
                    bVar.c(iOptInt);
                    bVar.e(i13);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f31518i));
                    c cVar5 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar5);
                    bVar.a(i11);
                    cVar5.a(aVar);
                    cVar5.a(z10);
                    cVar5.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                        }
                    }
                    this.f31490a.postDelayed(cVar5, j11);
                    return;
                }
                i14 = 1;
                if (i10 == i14) {
                    eVar.a("tnum", this.f31525p + "");
                }
                eVar.a("offset", iA + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                bVar = new b(i10);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(i12);
                bVar.c(iOptInt);
                bVar.e(i13);
                bVar.b(iE);
                bVar.a(aVar);
                if (i10 == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.f31518i));
                c cVar6 = new c(1, bVar, i11, str, str2);
                bVar.a(cVar6);
                bVar.a(i11);
                cVar6.a(aVar);
                cVar6.a(z10);
                cVar6.a(str);
                if (i11 == 0) {
                    j11 = j10;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                } else {
                    j11 = j10;
                    if (i11 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    }
                }
                this.f31490a.postDelayed(cVar6, j11);
                return;
                i13 = 0;
                iOptInt = 0;
                iF = i12;
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (h.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    h.b().a();
                }
                if (!NativeController.b(this.f31518i)) {
                    jSONArrayB = v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30651h, v0.a(jSONArrayB));
                    }
                }
                a(eVar, i10);
                if (f31505u.containsKey(str)) {
                    iA = 0;
                } else {
                    iA = 0;
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i14 = 1;
                    if (i10 == 1) {
                        eVar.a("tnum", this.f31524o + "");
                    }
                    eVar.a("offset", iA + "");
                    eVar.a("ad_type", "42");
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                    bVar = new b(i10);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(i12);
                    bVar.c(iOptInt);
                    bVar.e(i13);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i10 == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.f31518i));
                    c cVar7 = new c(1, bVar, i11, str, str2);
                    bVar.a(cVar7);
                    bVar.a(i11);
                    cVar7.a(aVar);
                    cVar7.a(z10);
                    cVar7.a(str);
                    if (i11 == 0) {
                        j11 = j10;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    } else {
                        j11 = j10;
                        if (i11 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                        }
                    }
                    this.f31490a.postDelayed(cVar7, j11);
                    return;
                }
                i14 = 1;
                if (i10 == i14) {
                    eVar.a("tnum", this.f31525p + "");
                }
                eVar.a("offset", iA + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f31518i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.f31518i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                bVar = new b(i10);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(i12);
                bVar.c(iOptInt);
                bVar.e(i13);
                bVar.b(iE);
                bVar.a(aVar);
                if (i10 == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.f31518i));
                c cVar8 = new c(1, bVar, i11, str, str2);
                bVar.a(cVar8);
                bVar.a(i11);
                cVar8.a(aVar);
                cVar8.a(z10);
                cVar8.a(str);
                if (i11 == 0) {
                    j11 = j10;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                } else {
                    j11 = j10;
                    if (i11 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f30615b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j11, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    }
                }
                this.f31490a.postDelayed(cVar8, j11);
                return;
            }
            a("The request was refused", i11, str, str2, aVar);
        } catch (Exception e13) {
            String str9 = f31502r;
            q0.b(str9, com.mbridge.msdk.mbnative.common.a.a(e13));
            q0.b(str9, e13.getMessage());
        }
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f31505u.containsKey(str)) {
            kVar = f31505u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = f31506v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = iIntValue + kVar.a();
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = iIntValue + kVar.b();
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f31505u.put(str, kVar);
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f31502r, str);
        try {
            Queue<Integer> queue = this.f31515f;
            if (queue == null || queue.size() > 0) {
                if (this.f31515f != null) {
                    a(i10, this.f31513d, str2, str3, aVar);
                    return;
                }
            }
            a(false, aVar, str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f31511b == null) {
            this.f31511b = new j();
        }
        this.f31511b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f31815p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod(TrackLoadSettingsAtom.TYPE, String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(f31502r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e10) {
                q0.b(f31502r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }
}
