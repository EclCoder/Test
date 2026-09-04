package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f31076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f31077p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f31078q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Map<String, d> f31079r = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f31085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f31086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f31087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterstitialListener f31088i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31080a = "InterstitialController";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31089j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f31090k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f31091l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f31092m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31093n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class HandlerC0406a extends Handler {
        HandlerC0406a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f31088i != null) {
                    a.this.f31088i.onInterstitialLoadSuccess(a.this.f31085f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f31088i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f31088i.onInterstitialLoadFail(a.this.f31085f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f31089j = true;
                if (aVar.f31088i != null) {
                    a.this.f31088i.onInterstitialShowSuccess(a.this.f31085f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f31088i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f31088i.onInterstitialShowFail(a.this.f31085f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f31088i != null) {
                    a.this.f31088i.onInterstitialAdClick(a.this.f31085f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f31089j = false;
                if (aVar2.f31088i != null) {
                    a.this.f31088i.onInterstitialClosed(a.this.f31085f);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f31095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f31096b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f31095a = aVar;
            this.f31096b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f31095a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f31095a = null;
                }
                if (this.f31096b != null) {
                    if (a.this.f31086g != null) {
                        a.this.f31086g.removeCallbacks(this.f31096b);
                    }
                    if (z10) {
                        if (a.this.f31088i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f31088i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f31090k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f31095a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f31095a.d());
                    }
                    a.this.f31091l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f31080a, e10.getMessage());
                }
                if (this.f31096b != null) {
                    if (a.this.f31086g != null) {
                        a.this.f31086g.removeCallbacks(this.f31096b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f31088i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f31098a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f31098a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f31098a;
                if (aVar != null) {
                    boolean zF = aVar.f();
                    String str = mDXVAtwcaFMHJ.pMdymZHF;
                    if (zF) {
                        a.this.c(str);
                    } else if (a.this.f31088i != null) {
                        a.this.b(str);
                    }
                    this.f31098a.a((b) null);
                    this.f31098a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f31086g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f31086g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void g() {
        try {
            new j().a(this.f31081b, (String) null, (String) null, this.f31082c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f31081b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f31082c)) {
                c("unitid is null");
            } else if (!this.f31093n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d {
        public d() {
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f31086g != null) {
                    a.this.f31086g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f31086g != null) {
                    a.this.f31086g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void e() {
        try {
            g();
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31082c);
            this.f31087h = lVarE;
            if (lVarE == null) {
                this.f31087h = l.h(this.f31082c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        try {
            if (this.f31081b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f31082c)) {
                b("unitid is null");
            } else {
                if (!this.f31093n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    private void c() {
        try {
            this.f31086g = new HandlerC0406a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            l lVar = this.f31087h;
            if (lVar != null) {
                int iE = lVar.e();
                int iY = this.f31087h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f31078q == null || TextUtils.isEmpty(this.f31082c)) {
                    return;
                }
                f31078q.put(this.f31082c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f31089j) {
            return this.f31092m;
        }
        return this.f31090k;
    }

    public static void a(String str, int i10) {
        try {
            if (f31077p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f31077p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f31086g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f31086g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f31081b, this.f31082c, this.f31083d, this.f31084e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f31088i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f31077p) == null || !map.containsKey(str) || (num = f31077p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f31088i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f31093n = false;
            if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                    this.f31084e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                this.f31082c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                this.f31081b = context;
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    this.f31083d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                }
                this.f31085f = new MBridgeIds(this.f31083d, this.f31082c);
                this.f31093n = true;
                return this.f31093n;
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f31093n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f31086g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f31086g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f31091l;
    }

    public void a(boolean z10) {
        boolean z11;
        try {
            z11 = z10;
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f31081b, this.f31082c, this.f31083d, this.f31084e, z11);
                c cVar = new c(aVar);
                aVar.a(new b(aVar, cVar));
                Handler handler = this.f31086g;
                if (handler != null) {
                    handler.postDelayed(cVar, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                }
                aVar.j();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                if (z11) {
                    return;
                }
                b("can't show because unknow error");
            }
        } catch (Exception e11) {
            e = e11;
            z11 = z10;
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f31079r != null && !TextUtils.isEmpty(this.f31082c)) {
            f31079r.put(this.f31082c, dVar);
        }
        Intent intent = new Intent(this.f31081b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f31082c)) {
            intent.putExtra("unitId", this.f31082c);
        }
        if (campaignEx != null) {
            this.f31092m = campaignEx.getRequestId();
            intent.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, campaignEx);
        }
        Context context = this.f31081b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
