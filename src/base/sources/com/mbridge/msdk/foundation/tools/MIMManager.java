package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class MIMManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f30804i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f30805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f30807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f30808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f30809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f30810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile g f30811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f30812h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra("errorCode", 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                q0.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("key", URLEncoder.encode("m_mini_card", "utf-8"));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a("rid", campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f30138r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        q0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30813a;

        a(Context context) {
            this.f30813a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f30805a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f30809e = mIMManager.a();
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f30809e == null || !MIMManager.this.f30809e.booleanValue() || this.f30813a == null) {
                    return;
                }
                try {
                    MIMManager.this.f30811g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f30813a.registerReceiver(MIMManager.this.f30811g, intentFilter);
                } catch (Exception e11) {
                    q0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f30816b;

        b(Context context, CampaignEx campaignEx) {
            this.f30815a = context;
            this.f30816b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f30815a, this.f30816b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f30819b;

        c(Context context, CampaignEx campaignEx) {
            this.f30818a = context;
            this.f30819b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f30818a, this.f30819b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f30822b;

        d(Context context, CampaignEx campaignEx) {
            this.f30821a = context;
            this.f30822b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.f(this.f30821a, this.f30822b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            } finally {
                if (MIMManager.this.f30807c != null && MIMManager.this.f30807c.contains(this.f30822b)) {
                    MIMManager.this.f30807c.remove(this.f30822b);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f30826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30827d;

        e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f30824a = context;
            this.f30825b = str;
            this.f30826c = campaignEx;
            this.f30827d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f30824a == null || TextUtils.isEmpty(this.f30825b) || this.f30826c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000100");
                jSONObject.put("network_type", m0.s(this.f30824a));
                jSONObject.put("rid", this.f30826c.getRequestId());
                jSONObject.put("rid_n", this.f30826c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f30826c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f30826c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f30138r.get(this.f30826c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put(BidResponsedEx.KEY_CID, this.f30826c.getId());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f30825b);
                jSONObject.put("code", this.f30827d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("MIMManager", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final MIMManager f30829a = new MIMManager(null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private static class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i10 = extras.getInt("statusCode", -1);
                String string = extras.getString("packageName", "");
                if (i10 != -1 && !TextUtils.isEmpty(string) && (campaignExA = MIMManager.b().a(string)) != null) {
                    MIMManager.b().a(context, campaignExA, i10);
                    MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.f30806b++;
    }

    public void g() {
        int i10 = this.f30806b - 1;
        this.f30806b = i10;
        if (i10 <= 0) {
            a(this.f30808d);
        }
    }

    public void h() {
        try {
            if (this.f30812h == null) {
                this.f30812h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f30812h, intentFilter);
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f30812h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f30812h);
                }
                this.f30810f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f30807c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f30807c = null;
                this.f30812h = null;
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    private MIMManager() {
        this.f30806b = 0;
        this.f30807c = new CopyOnWriteArrayList<>();
        this.f30805a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrB;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrB = nativeVideoTracking.B()) == null) {
                    return;
                }
                int length = strArrB.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrB[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public String d() {
        try {
            return f30804i == null ? "" : String.format("[%s]", f30804i);
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f30809e;
    }

    public static MIMManager b() {
        return f.f30829a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrZ;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrZ = nativeVideoTracking.z()) == null) {
                    return;
                }
                int length = strArrZ.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrZ[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrA;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrA = nativeVideoTracking.A()) == null) {
                    return;
                }
                int length = strArrA.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrA[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    CampaignEx c() {
        return this.f30810f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.f30808d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f30809e != null && campaignEx != null && this.f30809e.booleanValue()) {
                this.f30810f = campaignEx;
                this.f30807c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f30812h == null) {
                    h();
                }
                this.f30810f = campaignEx;
                this.f30807c.add(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        String str = Saucuwx.lUUCuejusiPSZQR;
        try {
            if (this.f30809e == null || campaignEx == null || !this.f30809e.booleanValue()) {
                return;
            }
            this.f30810f = null;
            try {
                this.f30807c.remove(campaignEx);
            } catch (Exception e10) {
                q0.a(str, e10.getMessage());
            }
        } catch (Exception e11) {
            q0.b(str, e11.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f30810f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f30810f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f30807c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.f30807c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(k0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                q0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f30804i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                q0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            q0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                q0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030 A[PHI: r4
      0x0030: PHI (r4v7 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
      (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
      (r4v8 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
     binds: [B:20:0x002e, B:16:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.f30811g != null) {
                        context.unregisterReceiver(this.f30811g);
                    }
                    if (this.f30812h != null) {
                        context.unregisterReceiver(this.f30812h);
                    }
                    this.f30810f = null;
                    copyOnWriteArrayList = this.f30807c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                    this.f30810f = null;
                    copyOnWriteArrayList = this.f30807c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                }
                this.f30807c = null;
                this.f30811g = null;
                this.f30808d = null;
            } catch (Throwable th2) {
                this.f30810f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f30807c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.f30807c = null;
                this.f30811g = null;
                this.f30808d = null;
                throw th2;
            }
        }
        try {
            i();
        } catch (Throwable th3) {
            q0.b("MIMManager", th3.getMessage());
        }
    }

    void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableB;
        if (i10 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i10 != 3002) {
            runnableB = i10 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }
}
