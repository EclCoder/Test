package dg;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.media.MediaScannerConnection;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.MediaStore;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.MutedWarningActivity;
import com.hecorat.screenrecorder.free.activities.MutedWarningBelow10Activity;
import com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity;
import com.hecorat.screenrecorder.free.activities.StorageWarningActivity;
import com.hecorat.screenrecorder.free.activities.VideoReviewActivity;
import com.hecorat.screenrecorder.free.activities.permission.AskPermissionActivity;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import em.k0;
import em.o0;
import fl.g0;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.x;
import nh.f0;
import nh.j0;
import nh.l0;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements eg.d.c {
    public static final a X = new a(null);
    private volatile boolean A;
    private volatile int B;
    private volatile int C;
    private volatile boolean D;
    private volatile boolean E;
    private volatile boolean F;
    private long G;
    private long H;
    private long I;
    private boolean J;
    private p0 K;
    private String L;
    private eg.d M;
    private final Bundle N;
    private int O;
    public FirebaseAnalytics P;
    public lg.a Q;
    public dh.f R;
    public x S;
    public zg.p T;
    private BroadcastReceiver U;
    private boolean V;
    private Runnable W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f36763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f36764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f36769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f36780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private lg.s f36781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f36782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f36783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f36784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f36785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Context f36786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f36787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f36788z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface b {
        void b();

        void d();

        void i();

        void o();

        void s();

        void y();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ef.a.h()) {
                l.this.G();
                if (l.this.F()) {
                    l.this.f36782t.postDelayed(this, 2000L);
                    return;
                }
                l.this.f36787y = true;
                l.this.x0("on_low_memory");
                wp.a.a("Stop recording on low memory", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(intent, "intent");
            if (kotlin.jvm.internal.s.c("android.intent.action.SCREEN_OFF", intent.getAction()) && ef.a.h() && l.this.V) {
                l.this.x0("on_screen_off");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends MediaProjection.Callback {
        e() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            if (ef.a.h()) {
                l.this.x0("stop_sharing_system_dialog");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends AudioManager.AudioRecordingCallback {
        f() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List configs) {
            kotlin.jvm.internal.s.h(configs, "configs");
            super.onRecordingConfigChanged(configs);
            Iterator it = configs.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
                wp.a.a("is client silenced: " + audioRecordingConfiguration.isClientSilenced() + ", isRecording: " + ef.a.h(), new Object[0]);
                if (audioRecordingConfiguration.getAudioSource() == 1 && audioRecordingConfiguration.isClientSilenced()) {
                    if (l.this.f36788z) {
                        return;
                    }
                    MutedWarningActivity.y0(l.this.f36786x);
                    l.this.f36788z = true;
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class g implements dh.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f36793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f36794b;

        g(int i10, l lVar) {
            this.f36793a = i10;
            this.f36794b = lVar;
        }

        @Override // dh.b.c
        public void a() {
            if (this.f36793a != this.f36794b.O) {
                return;
            }
            ef.a.k(false);
            this.f36794b.A();
        }

        @Override // dh.b.c
        public void b() {
            if (this.f36793a != this.f36794b.O) {
                return;
            }
            ef.a.k(true);
            if (!this.f36794b.Y() || kotlin.jvm.internal.s.c(this.f36794b.f36771i, "magic_button")) {
                return;
            }
            this.f36794b.R().k(1);
        }

        @Override // dh.b.c
        public void c() {
            if (this.f36793a == this.f36794b.O && this.f36794b.Y()) {
                this.f36794b.R().g(true);
            }
        }

        @Override // dh.b.c
        public void d() {
            if (this.f36793a == this.f36794b.O && this.f36794b.Y()) {
                this.f36794b.R().g(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class i extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36796r;

        i(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return l.this.new i(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            eg.d dVar;
            ll.b.f();
            if (this.f36796r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            if (l.this.M != null && (dVar = l.this.M) != null) {
                dVar.e();
            }
            return g0.f38750a;
        }
    }

    public l(k0 ioDispatcher, o0 externalScope) {
        kotlin.jvm.internal.s.h(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.s.h(externalScope, "externalScope");
        this.f36763a = ioDispatcher;
        this.f36764b = externalScope;
        this.f36766d = 1280;
        this.f36767e = 720;
        this.f36776n = true;
        this.f36779q = 30;
        this.f36782t = new Handler(Looper.getMainLooper());
        this.f36783u = new HashSet();
        this.f36784v = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        this.f36785w = true;
        this.f36786x = AzRecorderApp.e().getApplicationContext();
        this.K = new p0();
        this.N = new Bundle();
        this.W = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (Build.VERSION.SDK_INT >= 29) {
            l0.D(this.f36786x, "add_record_permissions");
        } else {
            s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(l lVar) {
        l0.A(lVar.f36786x, "saved_new_video");
    }

    private final boolean C(eg.d.a aVar) {
        String str;
        String str2;
        if (aVar == null) {
            return false;
        }
        String str3 = this.f36784v;
        if (kotlin.jvm.internal.s.c(str3, "1")) {
            if (aVar.a()) {
                Bundle bundle = this.N;
                if (this.A) {
                    str2 = "internal_audio_silent_call";
                } else {
                    str2 = !V() ? "internal_audio_silent_no_playback" : "internal_audio_silent";
                }
                bundle.putString("audio_source", str2);
                return true;
            }
        } else if (kotlin.jvm.internal.s.c(str3, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            if (aVar.b()) {
                Bundle bundle2 = this.N;
                if (this.A) {
                    str = "internal_and_mic_audio_all_silent_call";
                } else {
                    str = !V() ? "internal_and_mic_audio_all_silent_no_playback" : "internal_and_mic_audio_all_silent";
                }
                bundle2.putString("audio_source", str);
                return true;
            }
            if (aVar.a()) {
                this.N.putString("audio_source", "internal_and_mic_audio_internal_silent");
            }
        }
        return false;
    }

    private final void D() {
        if (this.D) {
            if (this.F) {
                this.D = false;
            } else {
                this.f36782t.postDelayed(new Runnable() { // from class: dg.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.E(this.f36760a);
                    }
                }, 600L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(l lVar) {
        if (lVar.D && !lVar.E) {
            ug.b bVar = ug.b.f54450a;
            Context context = lVar.f36786x;
            kotlin.jvm.internal.s.g(context, "context");
            bVar.b(context);
        }
        lVar.D = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F() {
        if (this.f36765c == null) {
            return false;
        }
        try {
            String str = this.f36765c;
            kotlin.jvm.internal.s.e(str);
            return new StatFs(str).getAvailableBytes() > 73400320;
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        if (this.J) {
            return;
        }
        try {
            Object systemService = this.f36786x.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (!V() && audioManager.isMusicActive()) {
                this.C++;
            }
            if (this.A) {
                return;
            }
            int mode = audioManager.getMode();
            if (mode == 2 || mode == 3) {
                this.B++;
                if (this.B >= 2) {
                    this.A = true;
                    wp.a.a("Call detected during recording, mode: %d", Integer.valueOf(mode));
                }
            }
        } catch (Exception e10) {
            wp.a.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(l lVar) {
        lVar.p0();
    }

    private final void J() {
        this.f36780r = nh.e.l(this.f36786x, Q());
        boolean zB = Q().b(R.string.pref_use_internal_storage, true);
        this.f36785w = zB;
        this.f36765c = zB ? Environment.getExternalStorageDirectory().getAbsolutePath() : nh.e.q(this.f36786x);
        this.N.putString("dir_path", this.f36780r);
        this.N.putString("root_path", this.f36765c);
        String str = this.f36765c;
        kotlin.jvm.internal.s.e(str);
        long availableBytes = new StatFs(str).getAvailableBytes();
        this.N.putLong("available_bytes", availableBytes);
        if (availableBytes < 104857600) {
            StorageWarningActivity.z0(this.f36786x, false);
            Z();
            P().a("low_free_space", null);
        } else if (kotlin.jvm.internal.s.c(this.f36784v, "-1")) {
            o0();
        } else {
            lg.c.l(new lg.c.a() { // from class: dg.f
                @Override // lg.c.a
                public final void a(boolean z10) {
                    l.K(this.f36756a, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(final l lVar, boolean z10) {
        if (!z10) {
            lVar.f36784v = "-1";
            lVar.N.putString("audio_source", "audio_permission_denied");
            j0.j(lVar.f36786x, R.string.name_toast_will_not_record_audio);
        } else if (Build.VERSION.SDK_INT < 29 && !l0.f47742a.m()) {
            lVar.f36784v = "-1";
            lVar.N.putString("audio_source", "mic_is_busy");
            MutedWarningBelow10Activity.y0(lVar.f36786x, new MutedWarningBelow10Activity.a() { // from class: dg.j
                @Override // com.hecorat.screenrecorder.free.activities.MutedWarningBelow10Activity.a
                public final void a(boolean z11) {
                    l.L(this.f36761a, z11);
                }
            });
            return;
        }
        lVar.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(l lVar, boolean z10) {
        if (z10) {
            lVar.o0();
        } else {
            lVar.Z();
        }
    }

    private final void M() {
        l0.D(this.f36786x, "show_pause_notification");
        synchronized (this.f36783u) {
            try {
                Iterator it = this.f36783u.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f36772j) {
            R().f();
        }
    }

    private final void N() {
        l0.D(this.f36786x, "show_record_notification");
        synchronized (this.f36783u) {
            try {
                Iterator it = this.f36783u.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).o();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void O() {
        ef.a.n(false);
        this.J = false;
        Q().j(R.string.pref_was_recording, false);
        l0.D(this.f36786x, "show_stop_recording_notification");
        synchronized (this.f36783u) {
            try {
                Iterator it = this.f36783u.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).i();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.V) {
            y0();
        }
        if (this.f36772j) {
            R().h();
        }
    }

    private final boolean V() {
        return this.C >= 2;
    }

    private final void a0() {
        if (this.f36775m || this.f36781s != null) {
            return;
        }
        Object systemService = this.f36786x.getSystemService("sensor");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        lg.s sVar = new lg.s();
        sVar.a(new lg.s.a() { // from class: dg.h
            @Override // lg.s.a
            public final void a(int i10) {
                l.b0(this.f36759a, i10);
            }
        });
        this.f36781s = sVar;
        sensorManager.registerListener(sVar, defaultSensor, 2);
        this.f36775m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(l lVar, int i10) {
        if (ef.a.h() && lVar.f36774l) {
            lVar.x0("on_shake");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v1 int, still in use, count: 1, list:
      (r5v1 int) from 0x00b7: IF  (r5v1 int) != (1444 int)  -> B:19:0x00b9 A[HIDDEN] (LINE:184)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private final void c0() {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 34) {
            this.N.putString("enable_single_app", Q().b(R.string.pref_enable_single_app, false) ? "enable" : "disable");
        } else {
            this.N.putString("enable_single_app", "unavailable");
        }
        boolean zB = i10 >= 35 ? true : Q().b(R.string.pref_stop_on_screen_off, false);
        this.V = zB;
        this.N.putBoolean("stop_on_screen_off", zB);
        boolean zB2 = Q().b(R.string.pref_stop_on_shake, false);
        this.f36774l = zB2;
        this.N.putBoolean("stop_on_shake", zB2);
        if (this.f36774l) {
            a0();
        }
        boolean zB3 = Q().b(R.string.pref_stop_on_time_limit, false);
        this.f36773k = zB3;
        this.N.putBoolean("enable_time_limit", zB3);
        String strH = Q().h(R.string.pref_orientation, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        kotlin.jvm.internal.s.g(strH, "getString(...)");
        this.f36778p = Integer.parseInt(strH);
        boolean zB4 = Q().b(R.string.pref_use_magic_button, false);
        this.f36772j = zB4;
        this.N.putBoolean("use_magic_button", zB4);
        String strH2 = Q().h(R.string.pref_audio_source, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.f36784v = strH2;
        Bundle bundle = this.N;
        if (strH2.hashCode() != 1444) {
            switch (strH2) {
                case "0":
                    str = "mic_audio";
                    break;
                case "1":
                    str = "internal_audio";
                    break;
                case "2":
                    str = "internal_and_mic_audio";
                    break;
                default:
                    str = this.f36784v;
                    break;
            }
        } else if (strH2.equals("-1")) {
            str = "mute_audio";
        } else {
            str = this.f36784v;
        }
        bundle.putString("audio_source", str);
        if (!kotlin.jvm.internal.s.c(this.f36784v, "1") && !kotlin.jvm.internal.s.c(this.f36784v, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            z10 = true;
        }
        this.f36776n = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        this.f36787y = false;
        c0();
        ef.a.o(true);
        Iterator it = this.f36783u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).s();
        }
        if (Build.VERSION.SDK_INT < 30) {
            lg.c.m(new lg.c.a() { // from class: dg.d
                @Override // lg.c.a
                public final void a(boolean z10) {
                    l.e0(this.f36754a, z10);
                }
            });
        } else {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(l lVar, boolean z10) {
        if (z10) {
            lVar.J();
        } else {
            j0.h(R.string.toast_cant_use_without_grant_permission_edited);
            lVar.Z();
        }
    }

    private final void g0(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("start_action", str);
        bundle.putString("action_source", str2);
        P().a("before_start", bundle);
        com.google.firebase.crashlytics.a.b().e("start_gate", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(l lVar, int i10, String str, Uri uri) {
        lVar.f36769g = uri;
        lVar.z0(i10);
    }

    private final boolean j0(String str) {
        if (!ef.a.d() && !ef.a.i()) {
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        if (ef.a.d() && jElapsedRealtime - ef.a.a() > CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            this.O++;
            ef.a.k(false);
            g0(str, "reset_stale_counting_down");
        }
        if (ef.a.i() && !AskPermissionActivity.O0() && jElapsedRealtime - ef.a.b() > 120000) {
            ef.a.o(false);
            g0(str, "reset_stale_requesting_permission");
        }
        if (ef.a.d()) {
            g0(str, "blocked_counting_down");
            z10 = true;
        }
        if (ef.a.i()) {
            g0(str, "blocked_requesting_permission");
            z10 = true;
        }
        return !z10;
    }

    private final void m0() {
        if (this.U == null) {
            this.U = new d();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f36786x.registerReceiver(this.U, intentFilter);
    }

    private final void p0() {
        eg.d dVar = this.M;
        if (dVar != null) {
            dVar.m();
        }
        this.J = false;
        this.I += System.nanoTime() - this.H;
        N();
    }

    private final double q0(long j10) {
        return (vl.a.e(j10 / 500.0d) + ((double) 1)) / ((double) 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(l lVar) {
        lVar.x0("on_time_limit");
    }

    private final void y0() {
        try {
            BroadcastReceiver broadcastReceiver = this.U;
            if (broadcastReceiver != null) {
                this.f36786x.unregisterReceiver(broadcastReceiver);
            }
        } catch (IllegalArgumentException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private final void z0(int i10) {
        this.K.n(Integer.valueOf(i10));
        if (Build.VERSION.SDK_INT < 30 || !this.f36785w) {
            l0.A(this.f36786x, "saved_new_video");
        } else {
            this.f36782t.postDelayed(new Runnable() { // from class: dg.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.A0(this.f36762a);
                }
            }, 500L);
        }
    }

    public final void B(b listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        synchronized (this.f36783u) {
            this.f36783u.add(listener);
        }
    }

    public final void H() {
        if (!this.f36772j) {
            p0();
        } else {
            R().g(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dg.e
                @Override // java.lang.Runnable
                public final void run() {
                    l.I(this.f36755a);
                }
            }, 100L);
        }
    }

    public final FirebaseAnalytics P() {
        FirebaseAnalytics firebaseAnalytics = this.P;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        kotlin.jvm.internal.s.w("firebaseAnalytics");
        return null;
    }

    public final lg.a Q() {
        lg.a aVar = this.Q;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("mPreferenceManager");
        return null;
    }

    public final dh.f R() {
        dh.f fVar = this.R;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.s.w("magicViewManager");
        return null;
    }

    public final String S() {
        return this.f36770h;
    }

    public final Uri T() {
        return this.f36769g;
    }

    public final p0 U() {
        return this.K;
    }

    public final x W() {
        x xVar = this.S;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.s.w("silentRecordingFlagStore");
        return null;
    }

    public final long X() {
        return (((!this.J ? System.nanoTime() : this.H) - this.I) - this.G) / ((long) 1000000000);
    }

    public final boolean Y() {
        return this.f36772j;
    }

    public final void Z() {
        ef.a.o(false);
        Iterator it = this.f36783u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    @Override // eg.d.c
    public void a(Throwable th2, String str, Uri uri) {
        eg.d dVar = this.M;
        eg.d.a aVarF = dVar != null ? dVar.f() : null;
        eg.d dVar2 = this.M;
        boolean z10 = (dVar2 != null ? dVar2.g() : 1) == 1;
        wp.a.a("Silence stats: %s", aVarF);
        this.M = null;
        if (uri != null) {
            this.f36769g = uri;
        }
        if (str != null) {
            this.f36770h = str;
        }
        final int i10 = th2 == null ? 2 : 1;
        if (th2 == null && C(aVarF)) {
            if (z10) {
                if (this.A) {
                    W().e(this.f36770h, NotificationCompat.CATEGORY_CALL);
                } else if (V()) {
                    W().e(this.f36770h, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
            }
        } else if (th2 == null && this.A && !kotlin.jvm.internal.s.c(this.f36784v, "-1")) {
            this.N.putString("audio_source", "call_during_recording");
            if (z10) {
                W().e(this.f36770h, "call_partial");
            }
        }
        if (this.f36769g == null) {
            MediaScannerConnection.scanFile(this.f36786x, new String[]{this.f36770h}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: dg.g
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri2) {
                    l.i0(this.f36757a, i10, str2, uri2);
                }
            });
        } else {
            z0(i10);
        }
        if (th2 == null) {
            double dQ0 = q0(System.currentTimeMillis() - this.f36768f);
            this.N.putString("stop_wait_duration", "" + (dQ0 - 0.5d) + '-' + dQ0 + 's');
            P().a("complete_recording", this.N);
            D();
        } else {
            wp.a.e(th2);
            com.google.firebase.crashlytics.a.b().d(th2);
            P().a("stop_failed_recording", this.N);
        }
        try {
            this.f36782t.removeCallbacks(this.W);
        } catch (Exception e10) {
            wp.a.e(e10);
        }
    }

    @Override // eg.d.c
    public void b(Throwable th2) {
        if (th2 != null) {
            wp.a.e(th2);
            com.google.firebase.crashlytics.a.b().d(th2);
            l0 l0Var = l0.f47742a;
            Context context = this.f36786x;
            kotlin.jvm.internal.s.g(context, "context");
            l0Var.w(context);
            O();
            return;
        }
        this.K.n(0);
        this.G = System.nanoTime();
        P().a("start_recording", this.N);
        ef.a.n(true);
        Q().j(R.string.pref_was_recording, true);
        l0.D(this.f36786x, "show_record_notification");
        synchronized (this.f36783u) {
            try {
                Iterator it = this.f36783u.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).y();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.V) {
            m0();
        }
        if (this.f36772j) {
            R().k(0);
        }
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.f36782t.post(this.W);
    }

    @Override // eg.d.c
    public void c(Throwable error) {
        kotlin.jvm.internal.s.h(error, "error");
        this.M = null;
        if (this.f36769g == null) {
            MediaScannerConnection.scanFile(this.f36786x, new String[]{this.f36770h}, null, null);
        }
        wp.a.e(error);
        com.google.firebase.crashlytics.a.b().d(error);
        O();
        Context context = this.f36786x;
        kotlin.jvm.internal.s.g(context, "context");
        l0.x(context);
    }

    @Override // eg.d.c
    public void d(Throwable th2) {
        if (th2 != null) {
            wp.a.e(th2);
            com.google.firebase.crashlytics.a.b().d(th2);
        }
    }

    public final boolean f0() {
        return this.J;
    }

    public final void h0() {
        this.E = true;
        ug.b bVar = ug.b.f54450a;
        Context context = this.f36786x;
        kotlin.jvm.internal.s.g(context, "context");
        bVar.a(context);
    }

    public final void k0() {
        if (this.J) {
            H();
        } else {
            l0();
        }
    }

    public final void l0() {
        try {
            eg.d dVar = this.M;
            if (dVar != null) {
                dVar.j();
            }
            this.J = true;
            this.H = System.nanoTime();
            M();
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public final void n0(b listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        synchronized (this.f36783u) {
            this.f36783u.remove(listener);
        }
    }

    public final void o0() {
        if (!l0.o()) {
            lf.l.f44461f.a(lf.l.a.REVIEW).a();
            lf.c.f44397g.a(lf.c.a.REVIEW).a();
        }
        ef.a.o(false);
        boolean zB = Q().b(R.string.pref_show_warning_for_5_1, false);
        if (kotlin.jvm.internal.s.c(Build.VERSION.RELEASE, "5.1") && !zB) {
            Q().j(R.string.pref_show_warning_for_5_1, true);
            l0 l0Var = l0.f47742a;
            Context context = this.f36786x;
            kotlin.jvm.internal.s.g(context, "context");
            l0Var.y(context);
            return;
        }
        try {
            if (RecordService.INSTANCE.b() != null && Build.VERSION.SDK_INT <= 33) {
                v0();
                return;
            }
            Context context2 = this.f36786x;
            kotlin.jvm.internal.s.g(context2, "context");
            mh.b.b(context2, "start_recording", 0, 4, null);
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            Context context3 = this.f36786x;
            kotlin.jvm.internal.s.g(context3, "context");
            mh.b.b(context3, "start_recording", 0, 4, null);
        }
    }

    public final void r0(boolean z10) {
        this.f36772j = z10;
    }

    public final void s0() {
        Object objB;
        l lVar;
        eg.d rVar;
        wp.a.a("useDefaultEncoder %s", Boolean.valueOf(this.f36776n));
        try {
            fl.r.a aVar = fl.r.f38769b;
            objB = fl.r.b(RecordService.INSTANCE.a());
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Throwable thE = fl.r.e(objB);
        if (thE != null) {
            wp.a.e(thE);
            com.google.firebase.crashlytics.a.b().d(thE);
        }
        if (fl.r.e(objB) != null) {
            RecordService.INSTANCE.d(null);
            Z();
            j0.h(R.string.toast_common_error);
            return;
        }
        MediaProjection mediaProjection = (MediaProjection) objB;
        eg.e eVar = new eg.e(this.f36766d, this.f36767e, this.f36777o, this.f36779q);
        eg.a aVar3 = kotlin.jvm.internal.s.c(this.f36784v, "-1") ? null : new eg.a(this.f36784v, 128000, 44100, 1);
        mediaProjection.registerCallback(new e(), new Handler(Looper.getMainLooper()));
        Uri uri = this.f36769g;
        if (uri == null) {
            lVar = this;
            if (lVar.f36776n) {
                Context context = lVar.f36786x;
                String str = lVar.f36770h;
                String str2 = lVar.L;
                if (str2 == null) {
                    kotlin.jvm.internal.s.w("videoName");
                    str2 = null;
                }
                rVar = new gg.f(context, eVar, aVar3, str, mediaProjection, str2, lVar);
            } else {
                Context context2 = lVar.f36786x;
                String str3 = lVar.f36770h;
                String str4 = lVar.L;
                if (str4 == null) {
                    kotlin.jvm.internal.s.w("videoName");
                    str4 = null;
                }
                rVar = new fg.r(context2, eVar, aVar3, str3, mediaProjection, str4, lVar);
            }
        } else if (this.f36776n) {
            Context context3 = this.f36786x;
            String str5 = this.L;
            if (str5 == null) {
                kotlin.jvm.internal.s.w("videoName");
                str5 = null;
            }
            lVar = this;
            rVar = new gg.f(context3, eVar, aVar3, uri, mediaProjection, str5, lVar);
        } else {
            lVar = this;
            Context context4 = lVar.f36786x;
            String str6 = lVar.L;
            if (str6 == null) {
                kotlin.jvm.internal.s.w("videoName");
                str6 = null;
            }
            rVar = new fg.r(context4, eVar, aVar3, uri, mediaProjection, str6, lVar);
        }
        lVar.M = rVar;
        if (lVar.f36773k) {
            String strH = Q().h(R.string.pref_time_limit_value, "-1");
            kotlin.jvm.internal.s.g(strH, "getString(...)");
            int i10 = Integer.parseInt(strH);
            eg.d dVar = lVar.M;
            if (dVar != null) {
                dVar.o(i10, new eg.d.b() { // from class: dg.c
                    @Override // eg.d.b
                    public final void a() {
                        l.t0(this.f36753a);
                    }
                });
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && aVar3 != null && (kotlin.jvm.internal.s.c(aVar3.d(), MBridgeConstans.ENDCARD_URL_TYPE_PL) || kotlin.jvm.internal.s.c(aVar3.d(), MBridgeConstans.API_REUQEST_CATEGORY_APP))) {
            f fVar = new f();
            eg.d dVar2 = lVar.M;
            if (dVar2 != null) {
                dVar2.n(lVar.f36786x.getMainExecutor(), fVar);
            }
            lVar.f36788z = false;
        }
        eg.d dVar3 = lVar.M;
        if (dVar3 != null) {
            dVar3.q();
        }
    }

    public final void v0() {
        if (ef.a.d()) {
            return;
        }
        u0();
        String strH = Q().h(R.string.pref_countdown, "3");
        kotlin.jvm.internal.s.g(strH, "getString(...)");
        int i10 = Integer.parseInt(strH);
        if (i10 <= 0 || !lg.c.c()) {
            if (i10 > 0) {
                Q().m(R.string.pref_countdown, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            this.N.putBoolean("enable_countdown_timer", false);
            A();
            return;
        }
        this.N.putBoolean("enable_countdown_timer", true);
        int i11 = this.O + 1;
        this.O = i11;
        new dh.b(i10).k(new g(i11, this));
    }

    public final void w0(String startActionSource) {
        kotlin.jvm.internal.s.h(startActionSource, "startActionSource");
        wp.a.a("Start record...isRequestingPermission: " + ef.a.i(), new Object[0]);
        if (j0(startActionSource)) {
            if (ef.a.h()) {
                j0.b(this.f36786x, R.string.toast_recorder_is_recording);
                return;
            }
            this.N.putString("start_action", startActionSource);
            this.f36771i = startActionSource;
            if (Build.VERSION.SDK_INT >= 28) {
                Object systemService = this.f36786x.getSystemService("activity");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                if (((ActivityManager) systemService).isBackgroundRestricted()) {
                    RestrictedBackgroundWarningActivity.Companion aVar = RestrictedBackgroundWarningActivity.INSTANCE;
                    Context context = this.f36786x;
                    kotlin.jvm.internal.s.g(context, "context");
                    aVar.a(context, new h());
                    return;
                }
            }
            d0();
        }
    }

    public final void x0(String stopActionSource) {
        kotlin.jvm.internal.s.h(stopActionSource, "stopActionSource");
        if (!ef.a.h()) {
            j0.b(this.f36786x, R.string.toast_recording_stopped);
            return;
        }
        this.f36768f = System.currentTimeMillis();
        this.N.putString("stop_action", stopActionSource);
        long jX = X();
        int[] iArr = pf.b.f50033b;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length && jX >= iArr[i11]; i11++) {
            i10++;
        }
        this.N.putString("time_interval", pf.b.f50034c[i10]);
        this.I = 0L;
        this.H = 0L;
        O();
        em.k.d(this.f36764b, this.f36763a, null, new i(null), 2, null);
        if (this.f36787y) {
            StorageWarningActivity.z0(this.f36786x, true);
        } else {
            if (Q().b(R.string.pref_hide_saved_window_after_recording, false)) {
                return;
            }
            this.E = false;
            this.D = true;
            this.F = AzRecorderApp.e().h() || lg.c.f("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            l0.q(this.f36786x, VideoReviewActivity.class);
        }
    }

    private final void u0() {
        int i10;
        int i11;
        Cursor cursorQuery;
        String str = OGoz.EDH;
        try {
            String strH = Q().h(R.string.pref_resolution, "720");
            kotlin.jvm.internal.s.g(strH, str);
            i10 = Integer.parseInt(strH);
        } catch (Exception unused) {
            int i12 = Integer.parseInt("720");
            Q().m(R.string.pref_resolution, "720");
            Q().m(R.string.pref_bitrate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            Q().m(R.string.pref_countdown, "3");
            i10 = i12;
        }
        int height = nh.b.c().getHeight();
        if (i10 > height) {
            i10 = height;
        }
        int iN = nh.b.n(i10);
        String strH2 = Q().h(R.string.pref_frame_rate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        kotlin.jvm.internal.s.g(strH2, str);
        int i13 = Integer.parseInt(strH2);
        this.f36779q = i13;
        if (i13 == Integer.parseInt(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            this.f36779q = 30;
        }
        int iJ = nh.b.j(this.f36786x);
        if (this.f36779q > iJ) {
            this.f36779q = iJ;
        }
        String strH3 = Q().h(R.string.pref_bitrate, MBridgeConstans.ENDCARD_URL_TYPE_PL);
        kotlin.jvm.internal.s.g(strH3, str);
        int i14 = Integer.parseInt(strH3);
        this.f36777o = i14;
        if (i14 == 0) {
            this.f36777o = f0.y(i10);
        }
        wp.a.a("height: %s, frameRate: %s, Bitrate: %s, old: %s", Integer.valueOf(i10), Integer.valueOf(this.f36779q), Integer.valueOf(this.f36777o), Integer.valueOf(((iN * i10) * this.f36779q) / 5));
        if ((this.f36778p == 0 && this.f36786x.getResources().getConfiguration().orientation == 1) || (i11 = this.f36778p) == 2) {
            this.f36766d = i10;
            this.f36767e = iN;
            this.N.putString("video_orientation", this.f36778p == 0 ? "auto_portrait" : "portrait");
        } else {
            this.f36766d = iN;
            this.f36767e = i10;
            this.N.putString("video_orientation", i11 == 0 ? "auto_landscape" : "landscape");
        }
        Bundle bundle = this.N;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36767e);
        sb2.append('x');
        sb2.append(this.f36766d);
        bundle.putString(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, sb2.toString());
        this.N.putInt("video_frame_rate", this.f36779q);
        this.N.putInt("video_bit_rate", this.f36777o);
        this.L = nh.e.d(null);
        StringBuilder sb3 = new StringBuilder();
        String str2 = this.L;
        if (str2 == null) {
            kotlin.jvm.internal.s.w("videoName");
            str2 = null;
        }
        sb3.append(str2);
        sb3.append(".mp4");
        String string = sb3.toString();
        this.f36770h = new File(this.f36780r, string).getAbsolutePath();
        this.f36769g = null;
        if (Build.VERSION.SDK_INT >= 30 && this.f36785w) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", string);
            contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / ((long) 1000)));
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("relative_path", "Movies/AzScreenRecorder/");
            ContentResolver contentResolver = this.f36786x.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Video.Media.getContentUri("external_primary"), contentValues);
            this.f36769g = uriInsert;
            if (uriInsert != null && (cursorQuery = contentResolver.query(uriInsert, new String[]{"_data"}, null, null, null)) != null) {
                cursorQuery.moveToFirst();
                this.f36770h = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                cursorQuery.close();
            }
        }
        this.N.putBoolean("use_default_encoder", this.f36776n);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h implements RestrictedBackgroundWarningActivity.b {
        h() {
        }

        @Override // com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity.b
        public void ignore() {
            l.this.d0();
        }

        @Override // com.hecorat.screenrecorder.free.activities.RestrictedBackgroundWarningActivity.b
        public void a() {
        }
    }
}
