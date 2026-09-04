package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f28472e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f28473f = 10000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f28474g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f28475h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f28476i = 600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f28477j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f28478k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f28479l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f28480m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f28481n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f28482o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f28483p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f28484q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f28485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f28486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f28487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f28488d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0372a extends BroadcastReceiver {
        C0372a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f28488d.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f28490a = new a(null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f28491k);
                }
            }
        }
    }

    /* synthetic */ a(C0372a c0372a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f28486b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f28492l);
            }
        }
    }

    private a() {
        this.f28485a = new ConcurrentHashMap<>();
        this.f28486b = new com.mbridge.msdk.click.retry.c(f28475h);
        this.f28488d = new c(Looper.getMainLooper());
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        f28474g = gVarD.h0();
        f28473f = gVarD.j0() * 1000;
        f28476i = gVarD.k0() * 1000;
        f28477j = gVarD.g0();
        f28478k = gVarD.i0();
        a();
    }

    public static a b() {
        return b.f28490a;
    }

    private boolean b(int i10) {
        return i10 == f28480m || i10 == f28481n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f28472e, "").replace("&" + f28472e, "");
        if (this.f28485a == null) {
            this.f28485a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f28485a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f28492l) {
            bVarRemove.a(str2);
        }
        if ((!a(i10) || f28477j == 0) && ((!b(i10) || f28478k == 0) && i10 != f28484q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + ((long) f28476i)) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f28491k) {
                if (bVarRemove.e() <= f28474g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f28491k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f28484q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f28486b == null) {
            this.f28486b = new com.mbridge.msdk.click.retry.c(f28475h);
        }
        this.f28486b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f28488d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f28488d.sendMessageDelayed(messageObtainMessage, f28473f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String str2;
        com.mbridge.msdk.click.retry.c cVar = this.f28486b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f28486b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f28485a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) f28476i) || bVar.e() >= f28474g || i10 == com.mbridge.msdk.click.retry.b.f28492l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + ((long) f28476i)) {
                bVarA.a(i10);
                this.f28485a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    str2 = str + "?" + f28472e;
                } else {
                    str2 = str + "&" + f28472e;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.f28492l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f28487c == null) {
                this.f28487c = new C0372a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f28487c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f28483p || i10 == f28482o;
    }
}
