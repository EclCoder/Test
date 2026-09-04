package com.hecorat.screenrecorder.free.ui.live;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import androidx.activity.p;
import androidx.lifecycle.r1;
import androidx.lifecycle.s;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.ui.live.LiveHomeActivity;
import com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbActivity;
import com.hecorat.screenrecorder.free.ui.live.youtube.LiveYtActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import fh.v;
import fl.g0;
import fl.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import lf.j;
import nh.j0;
import nh.l0;
import tf.z1;
import tl.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103¨\u0006=²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/LiveHomeActivity;", "Landroidx/appcompat/app/d;", "Llf/j$c;", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lfl/g0;", "M0", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "cls", "K0", "(Ljava/lang/Class;)V", "Llf/j;", "adsManager", "F0", "(Llf/j;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onStart", "onAdDismissed", "x", "c", "Llf/j;", "interstitialAdsManager", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/Class;", "targetClass", "Ltf/z1;", "e", "Ltf/z1;", "binding", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "", "g", "Z", "isAwaitingAd", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "pendingAdProceed", "Lwg/b;", "", "i", "Lwg/b;", "closeEventObserver", "j", "openFacebookEventObserver", CampaignEx.JSON_KEY_AD_K, "openYoutubeEventObserver", "l", "a", "Lfh/v;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveHomeActivity extends androidx.appcompat.app.d implements j.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j interstitialAdsManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Class targetClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private z1 binding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isAwaitingAd;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Runnable pendingAdProceed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wg.b closeEventObserver = new wg.b(new Function1() { // from class: fh.r
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return LiveHomeActivity.H0(this.f38706a, obj);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wg.b openFacebookEventObserver = new wg.b(new Function1() { // from class: fh.s
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return LiveHomeActivity.J0(this.f38707a, obj);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wg.b openYoutubeEventObserver = new wg.b(new Function1() { // from class: fh.t
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return LiveHomeActivity.L0(this.f38708a, obj);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f23121b;

        b(j jVar) {
            this.f23121b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!LiveHomeActivity.this.getLifecycle().b().e(s.b.STARTED)) {
                LiveHomeActivity.this.pendingAdProceed = this;
                return;
            }
            LiveHomeActivity.this.isAwaitingAd = false;
            Class cls = null;
            this.f23121b.r(null);
            z1 z1Var = LiveHomeActivity.this.binding;
            if (z1Var == null) {
                kotlin.jvm.internal.s.w("binding");
                z1Var = null;
            }
            z1Var.D.setVisibility(8);
            if (!this.f23121b.s(LiveHomeActivity.this)) {
                LiveHomeActivity liveHomeActivity = LiveHomeActivity.this;
                Class cls2 = liveHomeActivity.targetClass;
                if (cls2 == null) {
                    kotlin.jvm.internal.s.w("targetClass");
                } else {
                    cls = cls2;
                }
                l0.q(liveHomeActivity, cls);
                LiveHomeActivity.this.finish();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f23122a;

        public c(p pVar) {
            this.f23122a = pVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            return this.f23122a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f23123a;

        public d(p pVar) {
            this.f23123a = pVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return this.f23123a.getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f23124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f23125b;

        public e(a aVar, p pVar) {
            this.f23124a = aVar;
            this.f23125b = pVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            a aVar2 = this.f23124a;
            return (aVar2 == null || (aVar = (q1.a) aVar2.invoke()) == null) ? this.f23125b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    private final void F0(j adsManager) {
        this.isAwaitingAd = true;
        z1 z1Var = this.binding;
        if (z1Var == null) {
            kotlin.jvm.internal.s.w("binding");
            z1Var = null;
        }
        z1Var.D.setVisibility(0);
        final b bVar = new b(adsManager);
        this.handler.postDelayed(bVar, 4000L);
        adsManager.r(new a() { // from class: fh.u
            @Override // tl.a
            public final Object invoke() {
                return LiveHomeActivity.G0(this.f38709a, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 G0(LiveHomeActivity liveHomeActivity, b bVar) {
        liveHomeActivity.handler.removeCallbacks(bVar);
        bVar.run();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 H0(LiveHomeActivity liveHomeActivity, Object it) {
        kotlin.jvm.internal.s.h(it, "it");
        liveHomeActivity.finish();
        return g0.f38750a;
    }

    private static final v I0(k kVar) {
        return (v) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 J0(LiveHomeActivity liveHomeActivity, Object it) {
        kotlin.jvm.internal.s.h(it, "it");
        liveHomeActivity.M0("facebook");
        liveHomeActivity.K0(LiveFbActivity.class);
        return g0.f38750a;
    }

    private final void K0(Class cls) {
        if (!l0.f47742a.k()) {
            j0.b(AzRecorderApp.e().getApplicationContext(), R.string.toast_error_get_internet);
        } else {
            if (!l0.o()) {
                this.targetClass = cls;
                if (this.isAwaitingAd) {
                    return;
                }
                j jVar = this.interstitialAdsManager;
                if (jVar == null || !jVar.s(this)) {
                    if (jVar != null && jVar.j()) {
                        F0(jVar);
                        return;
                    } else {
                        l0.q(this, cls);
                        finish();
                        return;
                    }
                }
                return;
            }
            l0.q(this, cls);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 L0(LiveHomeActivity liveHomeActivity, Object it) {
        kotlin.jvm.internal.s.h(it, "it");
        liveHomeActivity.M0("youtube");
        liveHomeActivity.K0(LiveYtActivity.class);
        return g0.f38750a;
    }

    private final void M0(String value) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", value);
        FirebaseAnalytics.getInstance(this).a("select_platform_to_livestream", bundle);
    }

    @Override // lf.j.c
    public void onAdDismissed() {
        Class cls = this.targetClass;
        if (cls == null) {
            kotlin.jvm.internal.s.w("targetClass");
            cls = null;
        }
        l0.q(this, cls);
        j jVar = this.interstitialAdsManager;
        if (jVar != null) {
            j.o(jVar, null, 1, null);
        }
        finish();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        z1 z1VarY = z1.Y(LayoutInflater.from(this));
        this.binding = z1VarY;
        z1 z1Var = null;
        if (z1VarY == null) {
            kotlin.jvm.internal.s.w("binding");
            z1VarY = null;
        }
        setContentView(z1VarY.B());
        if (!l0.o()) {
            j jVarA = j.f44444g.a(j.a.LIVE_STREAM);
            this.interstitialAdsManager = jVarA;
            if (jVarA != null) {
                jVarA.q(this);
            }
            j jVar = this.interstitialAdsManager;
            if (jVar != null) {
                j.o(jVar, null, 1, null);
            }
        }
        r1 r1Var = new r1(kotlin.jvm.internal.l0.b(v.class), new d(this), new c(this), new e(null, this));
        z1 z1Var2 = this.binding;
        if (z1Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            z1Var = z1Var2;
        }
        z1Var.a0(I0(r1Var));
        I0(r1Var).k().j(this, this.closeEventObserver);
        I0(r1Var).l().j(this, this.openFacebookEventObserver);
        I0(r1Var).m().j(this, this.openYoutubeEventObserver);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        this.handler.removeCallbacksAndMessages(null);
        this.pendingAdProceed = null;
        j jVar = this.interstitialAdsManager;
        if (jVar != null) {
            jVar.r(null);
        }
        j jVar2 = this.interstitialAdsManager;
        if (jVar2 != null) {
            jVar2.m();
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        Runnable runnable = this.pendingAdProceed;
        if (runnable != null) {
            this.pendingAdProceed = null;
            runnable.run();
        }
    }

    @Override // lf.j.c
    public void x() {
        Class cls = this.targetClass;
        if (cls == null) {
            kotlin.jvm.internal.s.w("targetClass");
            cls = null;
        }
        l0.q(this, cls);
        j jVar = this.interstitialAdsManager;
        if (jVar != null) {
            j.o(jVar, null, 1, null);
        }
        finish();
    }
}
