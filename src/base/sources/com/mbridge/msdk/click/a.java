package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f28328n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Map<String, Long> f28329o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Set<String> f28330p = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f28333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f28334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.e f28335e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.report.h f28337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f28338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f28339i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f28343m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f28336f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28340j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28341k = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements g {
        b() {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f28348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28350c;

        c(boolean z10, boolean z11, CampaignEx campaignEx) {
            this.f28348a = z10;
            this.f28349b = z11;
            this.f28350c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28348a && !a.f28328n && !a.this.f28342l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.f28349b) {
                a.this.d(this.f28350c);
            }
            if (this.f28348a || a.this.f28336f == null || a.f28328n || a.this.f28342l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f28336f.onShowLoading(this.f28350c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f28358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Campaign f28359b;

        e(boolean z10, Campaign campaign) {
            this.f28358a = z10;
            this.f28359b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28358a && !a.f28328n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                a.this.a();
            }
            if (a.this.f28336f == null || a.f28328n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f28336f.onDismissLoading(this.f28359b);
        }
    }

    public a(Context context, String str) {
        this.f28333c = null;
        this.f28334d = null;
        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(str);
        this.f28338h = gVarF;
        if (gVarF == null) {
            this.f28338h = com.mbridge.msdk.setting.h.b().a();
        }
        this.f28339i = this.f28338h.N0();
        Context applicationContext = context.getApplicationContext();
        this.f28334d = applicationContext;
        this.f28331a = str;
        if (this.f28333c == null) {
            this.f28333c = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f28337g = new com.mbridge.msdk.foundation.same.report.h(this.f28334d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10) {
        if (i10 == 1) {
            return "2000136";
        }
        if (i10 == 2) {
            return "2000137";
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "2000138";
        }
        return "2000139";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.f28334d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            this.f28334d.startActivity(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    public void c() {
        try {
            this.f28336f = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                    if (cVarB != null) {
                        cVarB.a(cVarB.t() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    q0.b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            cVarB2.a(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_check_local_c", cVarB2);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, null, str2, z10, z11, com.mbridge.msdk.click.retry.a.f28479l);
    }

    public boolean b(CampaignEx campaignEx) {
        Long l10;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id2 = campaignEx.getId();
            Map<String, Long> map = f28329o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id2) && (l10 = f28329o.get(id2)) != null) {
                if (l10.longValue() > System.currentTimeMillis() || f28330p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f28329o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11, int i10) {
        int i11;
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            i11 = -1;
        } else {
            i11 = str2.startsWith("tcp") ? 1 : 0;
        }
        a(i10, campaignEx, i11);
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, new C0371a(i11, str2, i10, campaignEx), str2, z10, z11, i10);
    }

    private static void a(int i10, CampaignEx campaignEx, int i11) {
        if (campaignEx != null) {
            try {
                String strB = b(i10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("net_ty", Integer.valueOf(i11));
                eVar.a("result", 3);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.setting.g gVar = this.f28338h;
            if (gVar != null) {
                return gVar.W();
            }
            return 1;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0371a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f28344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28347d;

        C0371a(int i10, String str, int i11, CampaignEx campaignEx) {
            this.f28344a = i10;
            this.f28345b = str;
            this.f28346c = i11;
            this.f28347d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                eVar.a("net_ty", String.valueOf(this.f28344a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    eVar.a("status_code", str);
                    if (str.startsWith(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                        eVar.a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str;
                        }
                        eVar.a("failingURL", c1.d(this.f28345b));
                        eVar.a("reason", exceptionMsg);
                    }
                }
                String strB = a.b(this.f28346c);
                if (this.f28347d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f28347d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            try {
                String strB = a.b(this.f28346c);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    eVar.a("reason", str);
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                eVar.a("code", "");
                eVar.a("failingURL", c1.d(this.f28345b));
                eVar.a("net_ty", String.valueOf(this.f28344a));
                if (this.f28347d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f28347d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z10, boolean z11) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        com.mbridge.msdk.click.e eVar = new com.mbridge.msdk.click.e(context.getApplicationContext());
        for (String str2 : strArr) {
            eVar.a(str, campaignEx, new b(), str2, z10, z11, com.mbridge.msdk.click.retry.a.f28479l);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f28354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f28355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f28356e;

        d(CampaignEx campaignEx, boolean z10, Boolean bool, List list, boolean z11) {
            this.f28352a = campaignEx;
            this.f28353b = z10;
            this.f28354c = bool;
            this.f28355d = list;
            this.f28356e = z11;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0097  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            ?? StartsWith;
            Throwable th2;
            Set<String> set = a.f28330p;
            if (set != null) {
                set.remove(this.f28352a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            this.f28352a.setJumpResult(jumpLoaderResult2);
                            a aVar = a.this;
                            aVar.a(this.f28352a, jumpLoaderResult2, this.f28353b, aVar.f28340j, this.f28354c, (List<String>) this.f28355d);
                            if (jumpLoaderResult2.isjumpDone()) {
                                com.mbridge.msdk.click.b.a(com.mbridge.msdk.foundation.db.d.a(a.this.f28333c), this.f28352a, a.this.f28331a);
                            }
                            a.this.a(this.f28356e, this.f28352a);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            jumpLoaderResult = jumpLoaderResult2;
                            q0.b("CommonClickControl", th2.getMessage());
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "1");
                if (jumpLoaderResult != null) {
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                CampaignEx campaignEx = this.f28352a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (TextUtils.isEmpty(clickURL)) {
                        StartsWith = -1;
                    } else {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                } else {
                    StartsWith = -1;
                }
                eVar.a("net_ty", Integer.valueOf((int) StartsWith));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f28352a, eVar);
            } catch (Throwable th5) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th5.getMessage());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0065  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v10, types: [int] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            ?? StartsWith;
            Set<String> set = a.f28330p;
            if (set != null) {
                set.remove(this.f28352a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            a.this.a((JumpLoaderResult) obj, this.f28352a, true);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th2) {
                            th = th2;
                            jumpLoaderResult = jumpLoaderResult2;
                            q0.b("CommonClickControl", th.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (a.this.f28336f != null) {
                a.this.f28336f.onRedirectionFailed(this.f28352a, str);
            }
            a.this.a(this.f28356e, this.f28352a);
            try {
                CampaignEx campaignEx = this.f28352a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (TextUtils.isEmpty(clickURL)) {
                        StartsWith = -1;
                    } else {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                } else {
                    StartsWith = -1;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                eVar.a("net_ty", Integer.valueOf((int) StartsWith));
                if (jumpLoaderResult != null) {
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f28352a, eVar);
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th4.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    public void a(String str) {
        this.f28331a = str;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f28336f = nativeTrackingListener;
    }

    public void a(j jVar) {
        this.f28343m = jVar;
    }

    public void a(boolean z10) {
        this.f28341k = z10;
    }

    public void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    public void a(CampaignEx campaignEx) {
        a aVar = this;
        if (campaignEx == null) {
            return;
        }
        try {
            if (b(campaignEx)) {
                c(campaignEx);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", campaignEx);
                String noticeUrl = campaignEx.getNoticeUrl();
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(aVar.f28333c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), aVar.f28331a);
                if (jumpLoaderResultB != null) {
                    if (jumpLoaderResultB.getNoticeurl() != null) {
                        jumpLoaderResultB.setNoticeurl(null);
                    }
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    com.mbridge.msdk.click.b.a(dVarA, campaignEx, aVar.f28331a);
                }
                ArrayList arrayList = new ArrayList();
                AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
                if (v0.b(campaignEx)) {
                    MIMManager.b().a(campaignEx);
                    arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                    if (com.mbridge.msdk.click.c.d(aVar.f28334d, campaignEx.getDeepLinkURL())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener = aVar.f28336f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        com.mbridge.msdk.click.b.a(aVar.f28334d, aVar.f28331a, campaignEx, noticeUrl + "&opdptype=1", -1);
                        com.mbridge.msdk.click.b.a(campaignEx);
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = aVar.f28336f;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        aVar.a(campaignEx, 3, 1, arrayList);
                        return;
                    }
                    noticeUrl = noticeUrl + "&opdptype=0";
                    MIMManager.b().b(campaignEx);
                }
                String str = noticeUrl;
                if (campaignEx.getLinkType() == 12) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = aVar.f28336f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    com.mbridge.msdk.click.b.a(aVar.f28334d, aVar.f28331a, campaignEx, str, -1);
                    aVar.a(aVar.f28334d, campaignEx, arrayList);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = aVar.f28336f;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                    if (appletsModel.isRequestSuccess()) {
                        if (com.mbridge.msdk.click.c.d(aVar.f28334d, appletsModel.getDeepLink())) {
                            NativeListener.NativeTrackingListener nativeTrackingListener5 = aVar.f28336f;
                            if (nativeTrackingListener5 != null) {
                                nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            if (aVar.f28334d != null) {
                                Intent intent = new Intent();
                                intent.setAction("mb_dp_close_broadcast_receiver");
                                try {
                                    aVar.f28334d.sendBroadcast(intent);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("CommonClickControl", e10.getMessage());
                                    }
                                }
                            }
                            com.mbridge.msdk.click.b.a(aVar.f28334d, aVar.f28331a, campaignEx, str + "&opdptype=1", -1);
                            com.mbridge.msdk.click.b.a(campaignEx);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = aVar.f28336f;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                                return;
                            }
                            return;
                        }
                        str = str + "&opdptype=0";
                    } else {
                        if (appletsModel.isRequesting()) {
                            NativeListener.NativeTrackingListener nativeTrackingListener7 = aVar.f28336f;
                            if (nativeTrackingListener7 != null) {
                                nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.setAppletSchemeCallBack(aVar.a(aVar.f28336f, campaignEx, appletsModel, aVar));
                            return;
                        }
                        if (appletsModel.can(1)) {
                            if (appletsModel.isRequestTimesMaxPerDay()) {
                                if (!TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                    campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                                }
                            } else {
                                NativeListener.NativeTrackingListener nativeTrackingListener8 = aVar.f28336f;
                                if (nativeTrackingListener8 != null) {
                                    nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                                }
                                appletsModel.requestWxAppletsScheme(1, aVar.a(aVar.f28336f, campaignEx, appletsModel, aVar));
                                return;
                            }
                        }
                    }
                }
                if (com.mbridge.msdk.util.b.b()) {
                    com.mbridge.msdk.click.b.a(aVar.f28334d, aVar.f28331a, campaignEx, str, -1);
                }
                if (!campaignEx.getUserActivation() && com.mbridge.msdk.click.c.a(aVar.f28334d, campaignEx.getPackageName())) {
                    com.mbridge.msdk.click.c.b(aVar.f28334d, campaignEx.getPackageName());
                    if (com.mbridge.msdk.util.b.a()) {
                        com.mbridge.msdk.click.b.a(aVar.f28334d, aVar.f28331a, campaignEx, str, com.mbridge.msdk.foundation.same.a.N);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener9 = aVar.f28336f;
                    if (nativeTrackingListener9 != null) {
                        nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (com.mbridge.msdk.util.b.a()) {
                        aVar.a(campaignEx, true, Boolean.TRUE, (List<String>) arrayList);
                    } else {
                        aVar.a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener10 = aVar.f28336f;
                    if (nativeTrackingListener10 != null) {
                        nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        u0.a(aVar.f28336f);
                        return;
                    }
                    return;
                }
                int linkType = campaignEx.getLinkType();
                int iB = aVar.b();
                if (com.mbridge.msdk.util.b.a() && linkType != 3) {
                    com.mbridge.msdk.click.b.a(aVar.f28334d, aVar.f28331a, campaignEx, str, -1);
                }
                boolean z10 = linkType == 8 || linkType == 9 || linkType == 4;
                String clickURL = campaignEx.getClickURL();
                if (!TextUtils.isEmpty(clickURL) && (clickURL.startsWith("market://") || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add("google_play");
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = aVar.f28336f;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (u0.a.a(aVar.f28334d, campaignEx.getClickURL(), aVar.f28336f)) {
                        aVar.a(jumpLoaderResultB, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = aVar.f28336f;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        aVar.a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    aVar.a(iB, campaignEx.getClickURL(), campaignEx, aVar.f28336f, arrayList);
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = aVar.f28336f;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (!z10) {
                    if (linkType == 2) {
                        if (com.mbridge.msdk.util.b.a()) {
                            aVar.a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            return;
                        } else {
                            aVar.a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (com.mbridge.msdk.util.b.a()) {
                            aVar.a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            aVar.a(campaignEx, 2, 1, arrayList);
                            return;
                        } else {
                            aVar.a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = aVar.f28336f;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = aVar.f28336f;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        aVar.a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = aVar.f28336f;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    u0.a(aVar.f28334d, clickURL2, aVar.f28336f, campaignEx, arrayList);
                    if (com.mbridge.msdk.util.b.a()) {
                        aVar.a(jumpLoaderResultB, campaignEx, false);
                        return;
                    } else {
                        aVar.a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = aVar.f28336f;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = aVar.f28336f;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    aVar.a(jumpLoaderResultB, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                        BaseTrackingListener baseTrackingListener = aVar.f28336f;
                        if (baseTrackingListener == null && (baseTrackingListener = aVar.f28343m) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        try {
                            u0.a(aVar.f28334d, clickURL3, campaignEx, aVar, baseTrackingListener, arrayList);
                            aVar = aVar;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        u0.a(aVar.f28334d, clickURL3, campaignEx, aVar.f28336f, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = aVar.f28336f;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    }
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    u0.a(aVar.f28334d, clickURL3, aVar.f28336f, campaignEx, arrayList);
                    aVar.a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = aVar.f28336f;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (iB == 2) {
                        u0.a(aVar.f28334d, clickURL3, campaignEx, aVar.f28336f, arrayList);
                    } else {
                        u0.a(aVar.f28334d, clickURL3, aVar.f28336f, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = aVar.f28336f;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                aVar.a(jumpLoaderResultB, campaignEx, false);
                return;
            }
            return;
        } catch (Throwable th3) {
            th = th3;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b("CommonClickControl", th.getMessage(), th);
        }
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new h(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, 2, "context is null", this.f28331a);
            return;
        }
        boolean z10 = m0.G() == 1;
        boolean z11 = m0.E(context) == 1;
        if (z10 && z11) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String strJ = com.mbridge.msdk.foundation.controller.c.n().j();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(strJ)) {
                        bindId = strJ;
                    }
                    Object objD = m0.d(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object objNewInstance = cls.newInstance();
                    cls.getField("userName").set(objNewInstance, ghId);
                    cls.getField(MBridgeConstans.DYNAMIC_VIEW_WX_PATH).set(objNewInstance, ghPath);
                    cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 1, "", this.f28331a);
                    return;
                } catch (Throwable th2) {
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, th2.getMessage(), this.f28331a);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "ghid is empty", this.f28331a);
            return;
        }
        com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "integrated:" + z10 + "-hasWx:" + z11, this.f28331a);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            u0.a(this.f28334d, campaignEx.getClickURL(), campaignEx, this.f28336f, list);
        } else {
            u0.a(this.f28334d, campaignEx.getClickURL(), this.f28336f, campaignEx, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[PHI: r4
      0x0082: PHI (r4v5 boolean) = (r4v2 boolean), (r4v1 boolean) binds: [B:43:0x00de, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(CampaignEx campaignEx, boolean z10, Boolean bool, List<String> list) {
        boolean z11;
        boolean z12;
        try {
            this.f28332b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f28336f;
            if (nativeTrackingListener == null || z10) {
                z11 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z11 = !this.f28336f.onInterceptDefaultLoadingDialog();
            }
            this.f28342l = false;
            boolean z13 = true;
            if (campaignEx.getJumpResult() != null) {
                if (!z10) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.f28340j, bool, list);
                }
                this.f28342l = true;
                this.f28340j = false;
                z13 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.f28333c).c(campaignEx.getId(), this.f28331a) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f28333c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.f28331a);
                if (jumpLoaderResultB != null && !z10) {
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    if (z13) {
                        a(campaignEx, jumpLoaderResultB, z13, this.f28340j, bool, list);
                        this.f28342l = true;
                        this.f28340j = false;
                        z12 = false;
                    } else {
                        z12 = z13;
                    }
                } else {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z10) {
                        boolean zA = u0.a.a(this.f28334d, "market://details?id=" + campaignEx.getPackageName(), this.f28336f);
                        if (list != null) {
                            list.add("google_play");
                        }
                        if (zA) {
                            a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f28336f;
                        if (nativeTrackingListener2 != null && z13) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.f28336f.onFinishRedirection(campaignEx, null);
                        }
                        this.f28342l = true;
                        z13 = false;
                    }
                    if (z10) {
                        this.f28342l = true;
                        this.f28340j = false;
                        z12 = false;
                    } else {
                        z12 = z13;
                    }
                }
                new Handler(Looper.getMainLooper()).post(new c(z11, z10, campaignEx));
                com.mbridge.msdk.click.e eVar = this.f28335e;
                if (eVar != null) {
                    eVar.a();
                }
                Set<String> set = f28330p;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f28336f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f28336f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = f28330p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                com.mbridge.msdk.click.e eVar2 = new com.mbridge.msdk.click.e(this.f28334d);
                this.f28335e = eVar2;
                eVar2.a(this.f28331a, campaignEx, new d(campaignEx, z12, bool, list, z11));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z10, campaign));
    }

    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f28332b;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int iS = m0.s(this.f28334d);
            eVar.e(iS);
            eVar.h(m0.a(this.f28334d, iS));
            eVar.i(campaignEx.getRequestId());
            eVar.j(campaignEx.getRequestIdNotice());
            eVar.a(i10);
            eVar.c(jCurrentTimeMillis + "");
            eVar.a(campaignEx.getId());
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            eVar.b((this.f28332b / 1000) + "");
            eVar.c(Integer.parseInt(campaignEx.getLandingType()));
            eVar.d(campaignEx.getLinkType());
            eVar.k(this.f28331a);
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            if (this.f28339i) {
                eVar.b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), "utf-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getContent(), C.UTF8_NAME));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), "utf-8"));
                }
            }
            if (z10) {
                this.f28337g.a("click_jump_error", eVar, this.f28331a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            ArrayList<JSONObject> arrayListA = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (arrayListA == null || arrayListA.isEmpty()) {
                return;
            }
            int size = arrayListA.size();
            int i11 = 0;
            while (i11 < size) {
                JSONObject jSONObject = arrayListA.get(i11);
                i11++;
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th2) {
            q0.b("CommonClickControl", th2.getMessage());
        }
    }

    public void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) {
                    com.mbridge.msdk.click.b.a(str, this.f28334d, this.f28331a, campaignEx, this.f28336f);
                    return;
                }
                if (u0.a.a(this.f28334d, str, this.f28336f) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    u0.a.a(this.f28334d, "market://details?id=" + campaignEx.getPackageName(), this.f28336f);
                    return;
                }
                if (b() == 2) {
                    u0.a(this.f28334d, campaignEx.getClickURL(), campaignEx, this.f28336f, new ArrayList());
                } else {
                    u0.a(this.f28334d, campaignEx.getClickURL(), this.f28336f, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z10) {
        a(jumpLoaderResult, campaignEx, 1, z10);
    }

    private void a(int i10, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i10 == 2) {
                u0.a(this.f28334d, str, campaignEx, nativeTrackingListener, list);
            } else {
                u0.a(this.f28334d, str, nativeTrackingListener, campaignEx, list);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, int i10, List<String> list) {
        boolean z11 = true;
        boolean z12 = false;
        if (z10) {
            try {
                int i11 = Integer.parseInt(campaignEx.getLandingType());
                if (i11 == 1) {
                    u0.a(this.f28334d, jumpLoaderResult.getUrl(), this.f28336f, campaignEx, list);
                } else if (i11 == 2) {
                    u0.a(this.f28334d, jumpLoaderResult.getUrl(), campaignEx, this.f28336f, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (u0.a.a(this.f28334d, "market://details?id=" + campaignEx.getPackageName(), this.f28336f)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th2) {
                                th = th2;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z11;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f28336f, list);
                    }
                } else {
                    a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f28336f, list);
                }
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
        }
        if (z12) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f28336f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z12;
            }
        } else {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f28336f;
            if (nativeTrackingListener2 != null && z10) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z12;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, List<String> list) {
        boolean z11 = false;
        if (z10) {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.f28334d, this.f28331a, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.M);
                }
                u0.a(this.f28334d, campaignEx.getClickURL(), this.f28336f, campaignEx, list);
                z11 = true;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th2.getMessage(), th2);
                }
                return false;
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z11) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f28336f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z11;
            }
        } else {
            if (com.mbridge.msdk.util.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f28336f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:2:0x0000, B:5:0x0006, B:9:0x0010, B:11:0x001a, B:13:0x0020, B:17:0x0032, B:20:0x0040, B:22:0x0046, B:26:0x0056, B:28:0x005a, B:30:0x006c, B:34:0x0077, B:36:0x0081, B:38:0x008b, B:41:0x009b, B:43:0x00a9, B:50:0x00ec, B:53:0x00f2, B:74:0x014e, B:76:0x015c, B:78:0x0164, B:82:0x016c, B:77:0x0161, B:45:0x00b7, B:47:0x00c1, B:49:0x00e0, B:56:0x00fe, B:57:0x010b, B:60:0x0111, B:63:0x011c, B:65:0x0122, B:67:0x0126, B:69:0x012c, B:71:0x0138, B:73:0x0147, B:85:0x0176, B:87:0x017d), top: B:91:0x0000 }] */
    public void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, boolean z11, Boolean bool, List<String> list) {
        try {
            if (this.f28341k) {
                com.mbridge.msdk.click.b.a();
                if (campaignEx != null && jumpLoaderResult != null) {
                    int iB = b();
                    int code = jumpLoaderResult.getCode();
                    if (bool != null && !bool.booleanValue()) {
                        com.mbridge.msdk.click.b.a(jumpLoaderResult, this.f28334d, this.f28331a, campaignEx, Boolean.FALSE, this.f28336f, list);
                        return;
                    }
                    if (TextUtils.isEmpty(jumpLoaderResult.getUrl()) && z10) {
                        int linkType = campaignEx.getLinkType();
                        if (linkType == 2) {
                            a(campaignEx, jumpLoaderResult, z10, b(), list);
                            return;
                        }
                        if (linkType == 3) {
                            a(campaignEx, jumpLoaderResult, z10, list);
                            return;
                        }
                        u0.a(this.f28334d, campaignEx.getClickURL(), this.f28336f, campaignEx, list);
                        a(jumpLoaderResult, campaignEx, true);
                        NativeListener.NativeTrackingListener nativeTrackingListener = this.f28336f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                            return;
                        }
                        return;
                    }
                    if (code == 1) {
                        if (TextUtils.isEmpty(campaignEx.getPackageName()) || TextUtils.isEmpty(jumpLoaderResult.getUrl()) || !jumpLoaderResult.getUrl().contains(campaignEx.getPackageName()) || !z10) {
                            if (z10) {
                                if (TextUtils.isEmpty(campaignEx.getPackageName())) {
                                    a(iB, jumpLoaderResult.getUrl(), campaignEx, this.f28336f, list);
                                } else {
                                    if (!u0.a.a(this.f28334d, "market://details?id=" + campaignEx.getPackageName(), this.f28336f)) {
                                        a(iB, jumpLoaderResult.getUrl(), campaignEx, this.f28336f, list);
                                    }
                                }
                            }
                        } else if (!u0.a.a(this.f28334d, jumpLoaderResult.getUrl(), this.f28336f)) {
                            a(iB, jumpLoaderResult.getUrl(), campaignEx, this.f28336f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f28336f;
                        if (nativeTrackingListener2 != null && z10) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else if (code == 3) {
                        if (z10) {
                            com.mbridge.msdk.click.b.a(this.f28334d, campaignEx, this.f28331a, jumpLoaderResult, bool, this.f28336f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f28336f;
                        if (nativeTrackingListener3 != null && z10) {
                            nativeTrackingListener3.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else if (z10) {
                        if (3 == campaignEx.getLinkType()) {
                            a(campaignEx, jumpLoaderResult, z10, list);
                            return;
                        } else {
                            if (2 == campaignEx.getLinkType()) {
                                a(campaignEx, jumpLoaderResult, z10, b(), list);
                                return;
                            }
                            u0.a(this.f28334d, jumpLoaderResult.getUrl(), this.f28336f, campaignEx, list);
                            NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f28336f;
                            if (nativeTrackingListener4 != null) {
                                nativeTrackingListener4.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                            }
                        }
                    }
                    if (a(campaignEx.getLinkType(), jumpLoaderResult.getUrl())) {
                        a(jumpLoaderResult, campaignEx, false);
                    } else {
                        a(jumpLoaderResult, campaignEx, true);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener5 = this.f28336f;
                    if (nativeTrackingListener5 == null || z10 || !z11) {
                        return;
                    }
                    nativeTrackingListener5.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                    return;
                }
                if (z10) {
                    a(jumpLoaderResult, campaignEx, true);
                    NativeListener.NativeTrackingListener nativeTrackingListener6 = this.f28336f;
                    if (nativeTrackingListener6 != null) {
                        nativeTrackingListener6.onRedirectionFailed(null, null);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10, String str) {
        try {
            if (i10 == 2) {
                return u0.a.b(str);
            }
            return !TextUtils.isEmpty(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.f28334d.sendBroadcast(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    private void a(CampaignEx campaignEx, int i10, int i11, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", Integer.valueOf(i10));
            if (i10 == 1 || i10 == 2) {
                eVar.a("url", campaignEx.getClickURL());
            } else if (i10 == 3) {
                eVar.a("url", campaignEx.getDeepLinkURL());
            }
            eVar.a("result", Integer.valueOf(i11));
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", e10.getMessage());
            }
        }
    }
}
