package com.bytedance.sdk.openadsdk.aq;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.hnj.hn.dkl;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.aq;
import com.bytedance.sdk.component.utils.as;
import com.bytedance.sdk.component.utils.ojm;
import com.bytedance.sdk.component.utils.tu;
import com.bytedance.sdk.component.utils.vf;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.gm;
import com.bytedance.sdk.openadsdk.core.mjg;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ojm.bug;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.pty;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.gjv.hnj.hn;
import com.bytedance.sdk.openadsdk.oj.gjv;
import com.bytedance.sdk.openadsdk.oj.qor;
import com.bytedance.sdk.openadsdk.p000do.hn.dse;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.eum;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.coremedia.iso.boxes.UserBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import u6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static final List<PAGSdk.PAGInitCallback> hnj = new ArrayList();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static long f13250hn = 0;

    private static void dkl() {
        fc.hnj(1);
        try {
            List<PAGSdk.PAGInitCallback> list = hnj;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qor.hn(new gjv() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.8
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("init");
                    return hnjVar;
                }
            });
        } catch (Throwable th3) {
            apu.qor(th3.getMessage(), new Object[0]);
        }
    }

    private static void gjv() {
        com.bytedance.sdk.openadsdk.core.qor.hnj().hnj(UserBox.TYPE, tgn.hnj());
    }

    public static void hn() {
        oj.gjv();
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_compliance_file", "a", 0);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("pag_sp_bad_par", "gaid");
    }

    private static void sk(final Context context, final InitConfig initConfig) {
        ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("init_sync") { // from class: com.bytedance.sdk.openadsdk.aq.hnj.6
            @Override // java.lang.Runnable
            public void run() {
                fc.hnj(initConfig.getData());
                sk.hnj(context, initConfig.getAppId());
                sk.hnj();
                qor.hnj();
                qor.hn();
                new jip();
                dkl.hnj(eum.hnj() * 10);
                hn.hnj(context);
                com.bytedance.sdk.openadsdk.core.jip.hnj().hn();
                com.bytedance.sdk.openadsdk.core.dnm.qor.hnj();
                com.bytedance.sdk.openadsdk.core.bug.qor.hnj();
                dnm.f14178sk = dnm.hnj(context);
                dnm.gjv = dnm.hn(context);
                dse.hn();
                o6.a.h(oj.gjv().tll());
                o6.a.i(CacheDirFactory.getICacheDir(0));
                dnm dnmVarGjv = oj.gjv();
                if (!dnmVarGjv.lhi()) {
                    synchronized (dnmVarGjv) {
                        try {
                            if (!dnmVarGjv.lhi()) {
                                dnmVarGjv.qor();
                                dnmVarGjv.orp();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                fc.dkl();
                DeviceUtils.dnm();
                hnj.hnj(context);
                DeviceUtils.hnj(context);
                DeviceUtils.dnm(context);
                DeviceUtils.bug(context);
                com.bytedance.sdk.openadsdk.jip.hnj.hnj();
                com.bytedance.sdk.openadsdk.core.settings.gjv.hnj();
                com.bytedance.sdk.openadsdk.jip.gjv.gjv();
                orp.ojm(context);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj();
                hnj.sk();
                com.bytedance.sdk.openadsdk.core.dnm.qor.hn();
                com.bytedance.sdk.openadsdk.core.sk.hnj.hnj().hn();
                com.bytedance.sdk.component.aq.hn.gjv.hnj(fc.hn());
                if (com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
                    com.bytedance.sdk.openadsdk.common.oj.hnj().gjv();
                }
                com.bytedance.sdk.component.utils.hn.hnj(new com.bytedance.sdk.component.utils.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.6.1
                    @Override // com.bytedance.sdk.component.utils.hn.hnj
                    public boolean hn() {
                        return sk.hnj("start_act_asy", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.hn.hnj
                    public boolean hnj() {
                        return sk.hnj("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.hn.hnj
                    public ExecutorService qor() {
                        return ua.ojm();
                    }
                });
                orp.qor();
                as.hnj(new as.hn() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.6.2
                    @Override // com.bytedance.sdk.component.utils.as.hn
                    public void hnj(final String str, boolean z10, final as.hnj hnjVar) {
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(str, z10, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.6.2.1
                            @Override // com.bytedance.sdk.openadsdk.jip.hn
                            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj(str).hn(hnjVar.hn());
                            }
                        });
                    }
                });
                vf.hnj(sk.hnj("webview_reuse_config", (String) null));
                o6.a.g(sk.hnj("video_play_config", (String) null));
                com.bytedance.sdk.openadsdk.jip.qor.hnj();
            }
        });
    }

    private static void qor(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            wu.hnj((String) null);
            com.bytedance.adsdk.ugeno.dse.gjv.hnj((String) null);
        } else {
            wu.hnj(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.dse.gjv.hnj(initConfig.getPackageName());
        }
        com.bytedance.sdk.openadsdk.xn.hnj.hnj(context);
        try {
            if (hn(initConfig)) {
                gm.hnj().hn();
                com.bytedance.sdk.openadsdk.utils.oj.hnj();
            }
        } catch (Throwable unused) {
        }
        oj.hn(context);
        bug.hnj();
        com.bytedance.sdk.openadsdk.core.bug.qor.hnj(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sk() {
        ShortcutManager shortcutManagerA;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextHnj = oj.hnj();
                if (contextHnj == null || (shortcutManagerA = b.a(contextHnj.getSystemService(a.a()))) == null) {
                    return;
                }
                ta.hn().hnj(shortcutManagerA.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void gjv(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.dse.hnj()) {
            com.bytedance.sdk.openadsdk.dse.hn.qor();
            fc.f13727hn.set(true);
            try {
                com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().hnj(new com.bytedance.sdk.openadsdk.ta.hnj());
            } catch (Exception e10) {
                apu.qor("PAGSdk", e10.getMessage());
            }
            qor(initConfig);
            hn(context, initConfig);
            c.e(context, null);
            c.d(2);
            c.f(com.bytedance.sdk.openadsdk.apu.hn.hn().qor().dse());
        }
    }

    public static final void hnj() {
        try {
            com.bytedance.sdk.component.hn.hnj(new com.bytedance.sdk.component.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.1
                @Override // com.bytedance.sdk.component.hn.hnj
                public ExecutorService hnj() {
                    return ua.sk();
                }

                @Override // com.bytedance.sdk.component.hn.hnj
                public HandlerThread hnj(String str, int i10) {
                    return aq.hnj(str, i10);
                }
            });
            ua.hnj(new com.bytedance.sdk.component.aq.hn.qor("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.aq.hnj.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(false);
                    ApmHelper.initAPM();
                    hnj.hn();
                }
            });
            fc.hnj(System.currentTimeMillis());
            fc.hn();
            com.bytedance.sdk.component.ojm.dkl.setWebViewProvider(new com.bytedance.sdk.component.ojm.dkl.gjv() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.3
                @Override // com.bytedance.sdk.component.ojm.dkl.gjv
                public WebView hnj(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.ojm.dkl.qor qorVar) {
                    if (vf.hn(qorVar)) {
                        return vf.hn(context, attributeSet, i10, qorVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i10 == 0 ? new com.bytedance.sdk.component.ojm.sk(context, attributeSet) : new com.bytedance.sdk.component.ojm.sk(context, attributeSet, i10);
                    } catch (Exception unused) {
                        return i10 == 0 ? new com.bytedance.sdk.component.ojm.sk(context, attributeSet) : new com.bytedance.sdk.component.ojm.sk(context, attributeSet, i10);
                    }
                }
            });
        } catch (Throwable th2) {
            Log.i("PAGSdk", th2.getMessage());
        }
    }

    public static void hnj(Context context) {
        com.bytedance.sdk.openadsdk.core.hnj.hnj.hnj(context);
        com.bytedance.sdk.openadsdk.utils.gm.hnj();
        sq.hnj(context);
        gjv();
        oj.sk();
        String strHnj = orl.hnj(context);
        com.bytedance.sdk.openadsdk.core.dnm.qor.hn(strHnj);
        hn.hnj(strHnj, true);
        bug.hn();
        com.bytedance.sdk.openadsdk.core.mjg.qor.hnj.hnj().hn();
    }

    private static void hn(Context context, InitConfig initConfig) {
        fc.hnj = true;
        gm.hnj().hnj(initConfig.getAppId()).gjv(initConfig.getPA()).qor(tu.hnj(context)).hnj(initConfig.getTitleBarTheme()).qor(initConfig.getAdxId());
        ta.eum();
        if (initConfig instanceof PAGConfig) {
            gm.hnj().hn(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        ojm.hnj();
    }

    private static void qor(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            ta.hn().qor(initConfig.getData());
        }
        ta.hn().qor(hn(initConfig));
    }

    public static void hnj(Context context, InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        int pa2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f13250hn = jElapsedRealtime;
        fc.qor = jElapsedRealtime;
        oj.hn(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = hnj;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (fc.gjv() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.dkl.hnj()) {
            hn(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            dkl();
            qor(initConfig);
            return;
        }
        if (initConfig == null) {
            hn(4000, "PAGConfig is null, please check.");
            return;
        }
        fc.hnj(3);
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dnm() && ((pa2 = initConfig.getPA()) < -1 || pa2 > 1)) {
            hn(10004, com.bytedance.sdk.openadsdk.core.ojm.hnj(10004));
            return;
        }
        if (context == null) {
            hn(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        qor(context, initConfig);
        try {
            ApmHelper.initApm(context, initConfig.getAppId());
            ta.hnj(new mjg() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.4
                @Override // com.bytedance.sdk.openadsdk.core.mjg
                public void hnj(int i10, String str) {
                    hnj.hn(i10, str);
                }
            });
            try {
                wu.hnj(oj.hnj(), "tt_ad_logo_txt");
                if (wu.gjv(context, "tt_ad_logo") == 0) {
                    hnj(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        dkl();
                    }
                } else {
                    final com.bytedance.sdk.openadsdk.sk.hnj hnjVar = new com.bytedance.sdk.openadsdk.sk.hnj();
                    SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.5
                        @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                        public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                            return hnjVar;
                        }
                    });
                    hnj(context, initConfig);
                }
            } catch (Throwable unused) {
                hnj(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            hn(4000, "Internal Error, setting exception. ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hn(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(int i10, String str) {
        fc.hnj(2);
        try {
            List<PAGSdk.PAGInitCallback> list = hnj;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i10, str);
                        }
                    }
                    qor.qor(new gjv() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.9
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("init");
                            return hnjVar;
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            apu.qor(th3.getMessage(), new Object[0]);
        }
    }

    private static void hnj(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        fc.hnj(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                hn(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                hn(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void hnj(Context context, InitConfig initConfig) {
        long j10;
        try {
            if (PAGSdk.isInitSuccess()) {
                dkl();
                return;
            }
            gjv(context, initConfig);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f13250hn;
            dkl();
            sk(context, initConfig);
            j10 = jElapsedRealtime;
            hnj(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - f13250hn, j10);
        } catch (Throwable th2) {
            th2.getMessage();
            apu.qor("PAGSdk", th2.getMessage());
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - f13250hn;
            hn(4000, th2.getMessage());
            j10 = jElapsedRealtime2;
        }
    }

    private static void hnj(final Context context, final boolean z10, final InitConfig initConfig, final long j10, final long j11) {
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.aq.hnj.7
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zQor = ta.hn().qor();
                    jSONObject.put("duration", j10);
                    jSONObject.put("sdk_init_time", j11);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", true ^ com.bytedance.sdk.component.utils.eum.hnj(context));
                    jSONObject.put("is_debug", hnj.hn(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zQor);
                    jSONObject.put("minSdkVersion", orp.dse(context));
                    jSONObject.put("targetSdkVersion", orp.dkl(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z10);
                    jSONObject.put("support_hevc_levels", w6.a.d());
                    ta.hn().hn(false);
                } catch (Exception e10) {
                    apu.hnj("PAGSdk", "run: ", e10);
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("pangle_sdk_init").hn(jSONObject.toString());
            }
        });
    }

    public static void hnj(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.dkl.hnj()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, com.bytedance.sdk.openadsdk.core.ojm.hnj(10009)));
            return;
        }
        if (oj.hnj() == null) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Context is null, please check."));
            return;
        }
        pty ptyVarHnj = gm.hnj();
        if (ptyVarHnj != null) {
            ptyVarHnj.hnj(pAGBiddingRequest, pAGBidCallback);
        } else {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Internal exception"));
        }
    }
}
