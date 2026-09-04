package com.hecorat.screenrecorder.free.services;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.lifecycle.i0;
import androidx.lifecycle.q0;
import bm.r;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import dg.l;
import dg.u;
import fl.g;
import fl.g0;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import lf.n;
import nh.j0;
import nh.l0;
import qf.j;
import qg.a;
import qg.d;
import vl.Rlkc.CIdIVqKnNZ;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002i#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J)\u0010\u001a\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J#\u0010 \u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010Z\u001a\b\u0012\u0004\u0012\u00020S0R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010_\u001a\b\u0012\u0004\u0012\u00020[0R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\\\u0010U\u001a\u0004\b]\u0010W\"\u0004\b^\u0010YR\u0016\u0010b\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010g¨\u0006j"}, d2 = {"Lcom/hecorat/screenrecorder/free/services/RecordService;", "Landroidx/lifecycle/i0;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "Lfl/g0;", "w", "", "", "ownedProducts", "v", "(Ljava/util/Set;)V", "Landroid/content/Intent;", "intent", "s", "(Landroid/content/Intent;)V", "u", "t", "y", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroid/content/SharedPreferences;", "sharedPreferences", "key", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "Lcom/hecorat/screenrecorder/free/services/RecordService$b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/hecorat/screenrecorder/free/services/RecordService$b;", "mReceiver", "Lqf/j;", "c", "Lqf/j;", "billingDataSource", "Lqg/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lqg/d;", CampaignEx.JSON_KEY_AD_Q, "()Lqg/d;", "setWatermarkManager", "(Lqg/d;)V", "watermarkManager", "Lqg/a;", "e", "Lqg/a;", "m", "()Lqg/a;", "setLogoManager", "(Lqg/a;)V", "logoManager", "Llg/a;", "f", "Llg/a;", "n", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lug/a;", "g", "Lug/a;", CampaignEx.JSON_KEY_AD_K, "()Lug/a;", "setAzNotificationManager", "(Lug/a;)V", "azNotificationManager", "Lzg/p;", "h", "Lzg/p;", "l", "()Lzg/p;", "setGlobalBubbleManager", "(Lzg/p;)V", "globalBubbleManager", "Ldk/a;", "Ldg/u;", "i", "Ldk/a;", TtmlNode.TAG_P, "()Ldk/a;", "setScreenshotController", "(Ldk/a;)V", "screenshotController", "Ldg/l;", "j", "o", "setRecordingController", "recordingController", "", "Z", "isObservingOwnedProducts", "Landroid/os/Handler;", "Landroid/os/Handler;", "billingSetupHandler", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "billingSetupRunnable", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecordService extends i0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Intent f23094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f23095p;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j billingDataSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public d watermarkManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public a logoManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ug.a azNotificationManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public p globalBubbleManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public dk.a screenshotController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public dk.a recordingController;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isObservingOwnedProducts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b mReceiver = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Handler billingSetupHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Runnable billingSetupRunnable = new Runnable() { // from class: xg.b
        @Override // java.lang.Runnable
        public final void run() {
            RecordService.j(this.f56851a);
        }
    };

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.services.RecordService$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaProjection a() {
            Object systemService = AzRecorderApp.e().getApplicationContext().getSystemService("media_projection");
            s.f(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            Intent intentB = b();
            s.e(intentB);
            Object objClone = intentB.clone();
            s.f(objClone, "null cannot be cast to non-null type android.content.Intent");
            MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(-1, (Intent) objClone);
            s.e(mediaProjection);
            return mediaProjection;
        }

        public final Intent b() {
            return RecordService.f23094o;
        }

        public final boolean c() {
            return RecordService.f23095p;
        }

        public final void d(Intent intent) {
            RecordService.f23094o = intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            RecordService recordService = RecordService.this;
            if (context == null || intent == null || (action = intent.getAction()) == null) {
                return;
            }
            if (!s.c(action, "grant_overlay_permission")) {
                if (s.c(action, "press_home_while_requesting_permission")) {
                    ((l) recordService.o().get()).Z();
                }
            } else if (lg.c.c()) {
                recordService.l().s(2, true);
                recordService.n().m(R.string.pref_countdown, "3");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c implements q0, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f23109a;

        c(Function1 function) {
            s.h(function, "function");
            this.f23109a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final g a() {
            return this.f23109a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23109a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof m)) {
                return s.c(a(), ((m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(RecordService recordService) {
        recordService.w();
    }

    public static final boolean r() {
        return INSTANCE.c();
    }

    private final void s(Intent intent) {
        ef.a.j().set(false);
        Intent intent2 = (Intent) androidx.core.content.b.a(intent, "result_intent", Intent.class);
        f23094o = intent2;
        if (intent2 != null) {
            if (s.c(intent.getAction(), "process_start_recording")) {
                ((l) o().get()).v0();
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                k().c(this);
            }
            ((u) p().get()).O(200L);
        }
    }

    private final void t() {
        lf.j.f44444g.b();
        n.f44484g.b();
        lf.c.f44397g.b();
        lf.l.f44461f.b();
    }

    private final void u() {
        n().f().unregisterOnSharedPreferenceChangeListener(this);
        this.billingSetupHandler.removeCallbacks(this.billingSetupRunnable);
        j jVar = this.billingDataSource;
        if (jVar != null) {
            j jVar2 = null;
            if (jVar == null) {
                s.w("billingDataSource");
                jVar = null;
            }
            jVar.L().p(this);
            j jVar3 = this.billingDataSource;
            if (jVar3 == null) {
                s.w("billingDataSource");
            } else {
                jVar2 = jVar3;
            }
            jVar2.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 x(RecordService recordService, Set set) {
        s.e(set);
        recordService.v(set);
        return g0.f38750a;
    }

    private final void y() {
        try {
            if (n().b(R.string.pref_enable_watermark, false)) {
                q().l();
            }
            if (n().b(R.string.pref_enable_logo, false)) {
                m().g();
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public final ug.a k() {
        ug.a aVar = this.azNotificationManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("azNotificationManager");
        return null;
    }

    public final p l() {
        p pVar = this.globalBubbleManager;
        if (pVar != null) {
            return pVar;
        }
        s.w("globalBubbleManager");
        return null;
    }

    public final a m() {
        a aVar = this.logoManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("logoManager");
        return null;
    }

    public final lg.a n() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("preferenceManager");
        return null;
    }

    public final dk.a o() {
        dk.a aVar = this.recordingController;
        if (aVar != null) {
            return aVar;
        }
        s.w("recordingController");
        return null;
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public IBinder onBind(Intent intent) {
        s.h(intent, "intent");
        super.onBind(intent);
        return null;
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public void onCreate() {
        super.onCreate();
        AzRecorderApp.d().x(this);
        k().m(this);
        n().f().registerOnSharedPreferenceChangeListener(this);
        w();
        if (n().b(R.string.pref_was_recording, false)) {
            n().j(R.string.pref_was_recording, false);
            wp.a.i("Process restarted while recording was in progress", new Object[0]);
            k().d();
            String strH = n().h(R.string.pref_audio_source, "-1");
            if ((s.c(strH, MBridgeConstans.ENDCARD_URL_TYPE_PL) || s.c(strH, MBridgeConstans.API_REUQEST_CATEGORY_APP)) && !lg.c.e()) {
                j0.b(this, R.string.toast_recording_interrupted_permission);
            } else {
                j0.b(this, R.string.toast_recording_interrupted);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("grant_overlay_permission");
        intentFilter.addAction("press_home_while_requesting_permission");
        l0.z(this, this.mReceiver, intentFilter);
        nh.j.f(n());
        y();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.mReceiver);
        f23095p = false;
        l().r(62);
        q().f();
        m().f();
        u();
        t();
        super.onDestroy();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (s.c(key, getString(R.string.pref_all_inapp_products)) || s.c(key, getString(R.string.pref_all_subs_products)) || s.c(key, getString(R.string.pref_shown_products))) {
            this.billingSetupHandler.removeCallbacks(this.billingSetupRunnable);
            this.billingSetupHandler.postDelayed(this.billingSetupRunnable, 250L);
        }
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("On start command ");
        sb2.append(intent);
        sb2.append(", action: ");
        sb2.append(intent != null ? intent.getAction() : null);
        wp.a.a(sb2.toString(), new Object[0]);
        int i10 = 1;
        f23095p = true;
        if (intent != null) {
            String action = intent.getAction();
            if (action == null) {
                if (!ef.a.h()) {
                    i10 = ef.a.f() ? 3 : 0;
                } else if (((l) o().get()).f0()) {
                    i10 = 2;
                }
                wp.a.a("Notification type: " + i10, new Object[0]);
                k().l(this, i10);
            } else if (s.c(action, "show_idle_notification")) {
                k().l(this, 0);
            } else if (s.c(action, "add_record_permissions")) {
                if (Build.VERSION.SDK_INT >= 29) {
                    k().b(this);
                    ((l) o().get()).s0();
                }
            } else if (s.c(action, "show_record_notification")) {
                k().l(this, 1);
            } else if (s.c(action, "show_pause_notification")) {
                k().l(this, 2);
            } else if (s.c(action, "show_stop_recording_notification")) {
                k().o(this);
            } else if (s.c(action, "show_stop_screenshot_notification")) {
                if (Build.VERSION.SDK_INT >= 29) {
                    k().p(this);
                }
            } else if (s.c(action, "show_live_notification")) {
                k().l(this, 3);
            } else if (s.c(action, "add_camera_permission")) {
                k().a(this);
            } else if (s.c(action, "remove_camera_permission")) {
                k().j(this);
            } else if (s.c(action, "add_screenshot_permissions")) {
                if (Build.VERSION.SDK_INT >= 29) {
                    k().c(this);
                }
            } else if (r.N(action, "process_", false, 2, null)) {
                s(intent);
            } else if (s.c(action, "require_projection_live")) {
                s1.a.b(this).d(new Intent("action_request_projection"));
            } else if (!s.c(action, "add_live_permissions")) {
                k().l(this, 0);
            } else if (Build.VERSION.SDK_INT >= 29) {
                k().b(this);
            }
        } else {
            stopSelf();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    public final dk.a p() {
        dk.a aVar = this.screenshotController;
        if (aVar != null) {
            return aVar;
        }
        s.w("screenshotController");
        return null;
    }

    public final d q() {
        d dVar = this.watermarkManager;
        if (dVar != null) {
            return dVar;
        }
        s.w("watermarkManager");
        return null;
    }

    private final void v(Set ownedProducts) {
        SharedPreferences sharedPreferencesG = n().g();
        String string = getString(R.string.pref_bought_products);
        Set<String> set = Collections.EMPTY_SET;
        Set<String> stringSet = sharedPreferencesG.getStringSet(string, set);
        if (stringSet != null) {
            set = stringSet;
        }
        if (!s.c(set, ownedProducts)) {
            wp.a.a("Owned products changed: " + set + CIdIVqKnNZ.QoNSeSpul + ownedProducts, new Object[0]);
            s.e(sharedPreferencesG);
            SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
            editorEdit.putStringSet(getString(R.string.pref_bought_products), new androidx.collection.b(ownedProducts));
            editorEdit.apply();
            s.e(set);
            if (!set.isEmpty() && ownedProducts.isEmpty() && !l0.l(this)) {
                n().j(R.string.pref_hide_saved_window_after_recording, false);
                String[] stringArray = getResources().getStringArray(R.array.resolution_entry_values_for_2k);
                s.g(stringArray, "getStringArray(...)");
                if (s.c(n().h(R.string.pref_resolution, "720"), stringArray[0])) {
                    n().m(R.string.pref_resolution, stringArray[1]);
                }
            }
        }
    }

    private final void w() {
        lg.a aVarN = n();
        Set set = Collections.EMPTY_SET;
        Set setI = aVarN.i(R.string.pref_all_inapp_products, set);
        Set setI2 = n().i(R.string.pref_all_subs_products, set);
        Set setI3 = n().i(R.string.pref_shown_products, set);
        if (n().a(R.string.pref_shown_products)) {
            if (j.E()) {
                j jVarX = j.x();
                List listZ = jVarX.z();
                s.g(listZ, "getKnownInappProducts(...)");
                if (s.c(gl.r.N0(listZ), setI)) {
                    List listA = jVarX.A();
                    s.g(listA, "getKnownSubscriptionProducts(...)");
                    if (s.c(gl.r.N0(listA), setI2)) {
                        List listC = jVarX.C();
                        s.g(listC, "getShownProducts(...)");
                        if (s.c(gl.r.N0(listC), setI3)) {
                            return;
                        }
                    }
                }
                wp.a.a(PAFNPq.SxVmDoEzdkCGWMx, new Object[0]);
                s.e(setI);
                String[] strArr = (String[]) setI.toArray(new String[0]);
                s.e(setI2);
                String[] strArr2 = (String[]) setI2.toArray(new String[0]);
                s.e(setI3);
                jVarX.V(strArr, strArr2, (String[]) setI3.toArray(new String[0]));
                return;
            }
            Application application = getApplication();
            s.e(setI);
            String[] strArr3 = (String[]) setI.toArray(new String[0]);
            s.e(setI2);
            String[] strArr4 = (String[]) setI2.toArray(new String[0]);
            s.e(setI3);
            j jVar = null;
            j jVarY = j.y(application, strArr3, strArr4, null, (String[]) setI3.toArray(new String[0]));
            this.billingDataSource = jVarY;
            if (!this.isObservingOwnedProducts) {
                this.isObservingOwnedProducts = true;
                if (jVarY == null) {
                    s.w("billingDataSource");
                } else {
                    jVar = jVarY;
                }
                jVar.L().j(this, new c(new Function1() { // from class: xg.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecordService.x(this.f56850a, (Set) obj);
                    }
                }));
            }
        }
    }
}
