package jd;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.StatFs;
import android.util.Base64;
import c1.pGX.geAgcEazw;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class x {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final FilenameFilter f42387t = new FilenameFilter() { // from class: jd.t
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Charset f42388u = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f42390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f42391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.o f42392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kd.i f42393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r0 f42394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pd.j f42395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jd.a f42396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ld.f f42397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final gd.a f42398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final hd.a f42399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f42400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f1 f42401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k0 f42402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private rd.j f42403o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final TaskCompletionSource f42404p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final TaskCompletionSource f42405q = new TaskCompletionSource();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final TaskCompletionSource f42406r = new TaskCompletionSource();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicBoolean f42407s = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements k0.a {
        a() {
        }

        @Override // jd.k0.a
        public void a(rd.j jVar, Thread thread, Throwable th2) throws Throwable {
            x.this.L(jVar, thread, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f42409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f42410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f42411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ rd.j f42412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f42413e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements SuccessContinuation {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42415a;

            a(String str) {
                this.f42415a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(rd.d dVar) {
                if (dVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{x.this.Q(), x.this.f42401m.F(x.this.f42393e.f43179a, b.this.f42413e ? this.f42415a : null)});
                }
                gd.g.f().k("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        b(long j10, Throwable th2, Thread thread, rd.j jVar, boolean z10) {
            this.f42409a = j10;
            this.f42410b = th2;
            this.f42411c = thread;
            this.f42412d = jVar;
            this.f42413e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long J = x.J(this.f42409a);
            String strF = x.this.F();
            if (strF == null) {
                gd.g.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            x.this.f42391c.a();
            x.this.f42401m.z(this.f42410b, this.f42411c, strF, J);
            x.this.z(this.f42409a);
            x.this.w(this.f42412d);
            x.this.y(new h().c(), Boolean.valueOf(this.f42413e));
            return !x.this.f42390b.d() ? Tasks.forResult(null) : this.f42412d.a().onSuccessTask(x.this.f42393e.f43179a, new a(strF));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements SuccessContinuation {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Void r10) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements SuccessContinuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f42418a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements SuccessContinuation {
            a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(rd.d dVar) {
                if (dVar == null) {
                    gd.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                x.this.Q();
                x.this.f42401m.E(x.this.f42393e.f43179a);
                x.this.f42406r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f42418a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Boolean bool) {
            if (bool.booleanValue()) {
                gd.g.f().b("Sending cached crash reports...");
                x.this.f42390b.c(bool.booleanValue());
                return this.f42418a.onSuccessTask(x.this.f42393e.f43179a, new a());
            }
            gd.g.f().i("Deleting cached crash reports...");
            x.u(x.this.O());
            x.this.f42401m.D();
            x.this.f42406r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f42421a;

        e(long j10) {
            this.f42421a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(CampaignEx.JSON_KEY_TIMESTAMP, this.f42421a);
            x.this.f42399k.a("_ae", bundle);
            return null;
        }
    }

    x(Context context, r0 r0Var, m0 m0Var, pd.j jVar, h0 h0Var, jd.a aVar, ld.o oVar, ld.f fVar, f1 f1Var, gd.a aVar2, hd.a aVar3, m mVar, kd.i iVar) {
        this.f42389a = context;
        this.f42394f = r0Var;
        this.f42390b = m0Var;
        this.f42395g = jVar;
        this.f42391c = h0Var;
        this.f42396h = aVar;
        this.f42392d = oVar;
        this.f42397i = fVar;
        this.f42398j = aVar2;
        this.f42399k = aVar3;
        this.f42400l = mVar;
        this.f42401m = f1Var;
        this.f42393e = iVar;
    }

    private void C(String str) {
        gd.g.f().i("Finalizing native report for session " + str);
        gd.h hVarA = this.f42398j.a(str);
        File fileC = hVarA.c();
        md.h0.a aVarB = hVarA.b();
        if (R(str, fileC, aVarB)) {
            gd.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileC.lastModified();
        ld.f fVar = new ld.f(this.f42395g, str);
        File fileK = this.f42395g.k(str);
        if (!fileK.isDirectory()) {
            gd.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        z(jLastModified);
        List listH = H(hVarA, str, this.f42395g, fVar.b());
        v0.b(fileK, listH);
        gd.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f42401m.p(str, listH, aVarB);
        fVar.a();
    }

    private static boolean E() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F() {
        SortedSet sortedSetV = this.f42401m.v();
        if (sortedSetV.isEmpty()) {
            return null;
        }
        return (String) sortedSetV.first();
    }

    private static long G() {
        return J(System.currentTimeMillis());
    }

    static List H(gd.h hVar, String str, pd.j jVar, byte[] bArr) {
        File fileQ = jVar.q(str, "user-data");
        File fileQ2 = jVar.q(str, "keys");
        File fileQ3 = jVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g("logs_file", "logs", bArr));
        arrayList.add(new p0("crash_meta_file", TtmlNode.TAG_METADATA, hVar.d()));
        arrayList.add(new p0("session_meta_file", "session", hVar.g()));
        arrayList.add(new p0("app_meta_file", MBridgeConstans.DYNAMIC_VIEW_WX_APP, hVar.e()));
        arrayList.add(new p0("device_meta_file", "device", hVar.a()));
        arrayList.add(new p0("os_meta_file", "os", hVar.f()));
        arrayList.add(S(hVar));
        arrayList.add(new p0("user_meta_file", "user", fileQ));
        arrayList.add(new p0("keys_file", "keys", fileQ2));
        arrayList.add(new p0("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    private InputStream I(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        gd.g.f().k("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long J(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task Q() {
        ArrayList arrayList = new ArrayList();
        for (File file : O()) {
            try {
                arrayList.add(P(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                gd.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean R(String str, File file, md.h0.a aVar) {
        if (file == null || !file.exists()) {
            gd.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            gd.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static u0 S(gd.h hVar) {
        File fileC = hVar.c();
        return (fileC == null || !fileC.exists()) ? new g("minidump_file", "minidump", new byte[]{0}) : new p0("minidump_file", "minidump", fileC);
    }

    private static byte[] U(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void V(final String str, Executor executor) {
        ProfilingManager profilingManagerA = p.a(this.f42389a.getSystemService(o.a()));
        profilingManagerA.addProfilingTriggers(k0.g.a(new Object[]{n.a(7).build(), n.a(8).build()}));
        profilingManagerA.registerForAllProfilingResults(executor, new Consumer() { // from class: jd.r
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                x.b(this.f42372a, str, (ProfilingResult) obj);
            }
        });
    }

    private Task a0() {
        if (this.f42390b.d()) {
            gd.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f42404p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        gd.g.f().b("Automatic data collection is disabled.");
        gd.g.f().i("Notifying that unsent reports are available.");
        this.f42404p.trySetResult(Boolean.TRUE);
        Task taskOnSuccessTask = this.f42390b.h().onSuccessTask(new c());
        gd.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return kd.b.b(taskOnSuccessTask, this.f42405q.getTask());
    }

    public static /* synthetic */ void b(x xVar, String str, ProfilingResult profilingResult) {
        xVar.getClass();
        xVar.f0(str, profilingResult.getTriggerType());
    }

    private void b0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            gd.g.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f42389a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f42401m.C(str, historicalProcessExitReasons, new ld.f(this.f42395g, str), ld.o.j(str, this.f42395g, this.f42393e));
        } else {
            gd.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public static /* synthetic */ boolean d(Integer num) {
        return num.intValue() != 0;
    }

    private void d0(String str) {
        ActivityManager activityManager = (ActivityManager) this.f42389a.getSystemService("activity");
        this.f42401m.B(str, (List) this.f42395g.r(str, new FilenameFilter() { // from class: jd.u
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return k0.g.a(new Object[]{"trigger-type-anomaly", "trigger-type-oom"}).contains(str2);
            }
        }).stream().map(new Function() { // from class: jd.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.f((File) obj);
            }
        }).filter(new Predicate() { // from class: jd.w
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return x.d((Integer) obj);
            }
        }).collect(Collectors.toList()), activityManager.getHistoricalProcessExitReasons(null, 0, 0));
    }

    public static /* synthetic */ Integer f(File file) {
        String name = file.getName();
        name.getClass();
        if (name.equals("trigger-type-anomaly")) {
            return 8;
        }
        return !name.equals("trigger-type-oom") ? 0 : 7;
    }

    private static md.i0.a r(r0 r0Var, jd.a aVar) {
        return md.i0.a.b(r0Var.f(), aVar.f42246f, aVar.f42247g, r0Var.a().c(), n0.e(aVar.f42244d).g(), aVar.f42248h);
    }

    private static md.i0.b s(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return md.i0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), i.x(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static md.i0.c t() {
        return md.i0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(boolean z10, rd.j jVar, boolean z11) {
        String str;
        kd.i.c();
        ArrayList arrayList = new ArrayList(this.f42401m.v());
        if (arrayList.size() <= z10) {
            gd.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && jVar.b().f51284b.f51292b) {
            b0(str2);
        } else {
            gd.g.f().i("ANR feature disabled.");
        }
        if (z11 && this.f42398j.c(str2)) {
            C(str2);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            d0(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f42400l.e(null);
            str = null;
        }
        this.f42401m.q(G(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str, Boolean bool) {
        long jG = G();
        gd.g.f().b("Opening a new session with ID " + str);
        this.f42398j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", g0.m()), jG, md.i0.b(r(this.f42394f, this.f42396h), t(), s(this.f42389a)));
        if (bool.booleanValue() && str != null) {
            this.f42392d.n(str);
        }
        this.f42397i.e(str);
        this.f42400l.e(str);
        this.f42401m.w(str, jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(long j10) {
        try {
            if (this.f42395g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            gd.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    void A(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, rd.j jVar) {
        this.f42403o = jVar;
        T(str);
        k0 k0Var = new k0(new a(), jVar, uncaughtExceptionHandler, this.f42398j);
        this.f42402n = k0Var;
        Thread.setDefaultUncaughtExceptionHandler(k0Var);
    }

    void B(String str) {
        V(str, this.f42393e.f43180b.c());
    }

    boolean D(rd.j jVar) {
        kd.i.c();
        if (N()) {
            gd.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        gd.g.f().i("Finalizing previously open sessions.");
        try {
            x(true, jVar, true);
            gd.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            gd.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    String K() throws IOException {
        String strR = i.r(this.f42389a);
        if (strR != null) {
            gd.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f42388u), 0);
        }
        InputStream inputStreamI = I("META-INF/version-control-info.textproto");
        if (inputStreamI == null) {
            if (inputStreamI != null) {
                inputStreamI.close();
            }
            gd.g.f().g("No version control information found");
            return null;
        }
        try {
            gd.g.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(U(inputStreamI), 0);
            inputStreamI.close();
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                inputStreamI.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    void L(rd.j jVar, Thread thread, Throwable th2) throws Throwable {
        M(jVar, thread, th2, false);
    }

    synchronized void M(rd.j jVar, Thread thread, Throwable th2, boolean z10) throws Throwable {
        Throwable th3;
        try {
            try {
                gd.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
                if (!z10) {
                    try {
                        oe.a.b();
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                Task taskF = this.f42393e.f43179a.f(new b(System.currentTimeMillis(), th2, thread, jVar, z10));
                if (!z10) {
                    try {
                        i1.b(taskF);
                    } catch (TimeoutException unused) {
                        gd.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e10) {
                        gd.g.f().e("Error handling uncaught exception", e10);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    boolean N() {
        k0 k0Var = this.f42402n;
        return k0Var != null && k0Var.a();
    }

    List O() {
        return this.f42395g.h(f42387t);
    }

    void T(final String str) {
        this.f42393e.f43179a.e(new Runnable() { // from class: jd.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f42382a.y(str, Boolean.FALSE);
            }
        });
    }

    void W() {
        try {
            String strK = K();
            if (strK != null) {
                Y("com.crashlytics.version-control-info", strK);
                gd.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            gd.g.f().l("Unable to save version control info", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(String str, String str2) {
        try {
            this.f42392d.l(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f42389a;
            if (context != null && i.v(context)) {
                throw e10;
            }
            gd.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void Y(String str, String str2) {
        try {
            this.f42392d.m(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f42389a;
            if (context != null && i.v(context)) {
                throw e10;
            }
            gd.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void Z(Task task) {
        if (this.f42401m.t()) {
            gd.g.f().i("Crash reports are available to be sent.");
            a0().onSuccessTask(this.f42393e.f43179a, new d(task));
        } else {
            gd.g.f().i("No crash reports are available to be sent.");
            this.f42404p.trySetResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(Thread thread, Throwable th2, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (N()) {
            return;
        }
        long J = J(jCurrentTimeMillis);
        String strF = F();
        if (strF == null) {
            gd.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f42401m.A(th2, thread, new ld.c(strF, J, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(long j10, String str) {
        if (N()) {
            return;
        }
        this.f42397i.g(j10, str);
    }

    void f0(String str, int i10) {
        String str2;
        if (i10 == 8) {
            str2 = "trigger-type-anomaly";
        } else {
            str2 = i10 == 7 ? "trigger-type-oom" : "trigger-type-unknown";
        }
        try {
            if (this.f42395g.q(str, str2).createNewFile()) {
                return;
            }
            gd.g.f().b("Trigger file " + str2 + " exists for session: " + str);
        } catch (IOException unused) {
            gd.g.f().d("Unable to touch trigger file " + str2);
        }
    }

    boolean v() {
        kd.i.c();
        if (!this.f42391c.c()) {
            String strF = F();
            return strF != null && this.f42398j.c(strF);
        }
        gd.g.f().i("Found previous crash marker.");
        this.f42391c.d();
        return true;
    }

    void w(rd.j jVar) {
        x(false, jVar, false);
    }

    private Task P(long j10) {
        if (E()) {
            gd.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        gd.g.f().b(geAgcEazw.LmhjiMA);
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new e(j10));
    }
}
