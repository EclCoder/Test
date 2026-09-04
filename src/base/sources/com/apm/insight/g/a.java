package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.k.h;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f10696a = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f10697i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f10698j = new ThreadLocal<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile long f10699l = 10000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ArrayList<b> f10700m = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f10702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f10703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f10704e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f10705f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f10706g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f10707h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONArray f10708k;

    private a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f10701b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static a a() {
        if (f10696a == null) {
            f10696a = new a();
        }
        return f10696a;
    }

    private void c(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10701b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    private void d() {
        synchronized (this) {
            this.f10705f--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f10705f != 0 && SystemClock.uptimeMillis() - jUptimeMillis < f10699l) {
            SystemClock.sleep(50L);
        }
    }

    private static void e() {
        File fileA = j.a(e.g());
        File fileA2 = j.a();
        if (f.b(fileA) && f.b(fileA2)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!h.a() && SystemClock.uptimeMillis() - jUptimeMillis < f10699l) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private static int f() {
        int iA = 0;
        for (int i10 = 0; i10 < f10700m.size(); i10++) {
            try {
                try {
                    iA |= f10700m.get(i10).a();
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            } catch (Throwable unused) {
            }
        }
        return iA;
    }

    private static Throwable g() {
        for (int i10 = 0; i10 < f10700m.size(); i10++) {
            try {
                f10700m.get(i10);
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    public final void b(c cVar) {
        this.f10703d = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        do {
            th2 = a(thread, th2);
        } while (th2 != null);
    }

    private static boolean b(Thread thread, Throwable th2) {
        ICrashFilter iCrashFilterB = e.b().b();
        if (iCrashFilterB != null) {
            try {
                if (!iCrashFilterB.onJavaCrashFilter(th2, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a(DataSchemeDataSource.SCHEME_DATA, (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (aVarA != null) {
                            com.apm.insight.k.d.a().c(aVarA.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean c() {
        Boolean bool = f10698j.get();
        return bool != null && bool.booleanValue();
    }

    public final void a(c cVar) {
        this.f10702c = cVar;
    }

    public final boolean b(String str) {
        return this.f10706g.containsKey(str);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ac A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #10 {all -> 0x01b0, blocks: (B:103:0x01a6, B:105:0x01ac), top: B:161:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r0
      0x0065: PHI (r0v52 boolean) = (r0v9 boolean), (r0v53 boolean), (r0v53 boolean), (r0v53 boolean) binds: [B:24:0x0064, B:20:0x005a, B:142:0x0065, B:22:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v15, types: [long] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Throwable a(Thread thread, Throwable th2) {
        boolean zC;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17 = this;
        if (r17.f10704e >= 3) {
            return null;
        }
        r17.f10704e++;
        r17.f10705f++;
        if (f10697i) {
            f10698j.set(Boolean.TRUE);
        }
        f10697i = true;
        ?? CurrentTimeMillis = System.currentTimeMillis();
        boolean z13 = (com.apm.insight.runtime.a.b.c() == -1 || CurrentTimeMillis - com.apm.insight.runtime.a.b.c() <= e.i().getLaunchCrashInterval()) && !(e.n() && e.q() == 0);
        try {
            zC = com.apm.insight.l.m.c(th2);
            if (zC) {
                try {
                    if (com.apm.insight.l.m.d(th2)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z10 = false;
            }
        } catch (Throwable unused2) {
            zC = false;
        }
        try {
            try {
                String strA = e.a(CurrentTimeMillis, z13 ? CrashType.LAUNCH : CrashType.JAVA, zC, false);
                File file = new File(j.a(e.g()), strA);
                String strA2 = r17.a(new File(file, "logEventStack"), th2, thread, z10);
                if ((f() & 1) != 0 || (strA2 != null && e.i().isCrashIgnored(strA2))) {
                    z11 = false;
                    z12 = true;
                } else {
                    z11 = false;
                    z12 = false;
                }
                try {
                    JSONArray jSONArrayA = com.apm.insight.entity.b.a(th2, thread, file);
                    r17.f10708k = jSONArrayA;
                    if (jSONArrayA == null || z12) {
                        strA = e.a(CurrentTimeMillis, z13 != 0 ? CrashType.LAUNCH : CrashType.JAVA, zC, true);
                        File file2 = new File(j.a(e.g()), strA);
                        file.renameTo(file2);
                        new File(file2, "logEventStack");
                    }
                    com.apm.insight.a.d();
                    com.apm.insight.k.b.a().b();
                    if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        try {
                            r17.a(thread, th2, z13, CurrentTimeMillis);
                        } catch (Throwable th3) {
                            th = th3;
                            r11 = r17;
                            r10 = CurrentTimeMillis;
                            try {
                                if (!com.apm.insight.l.m.c(th)) {
                                    com.apm.insight.a.a(th);
                                }
                                if (!z12) {
                                    if (z10) {
                                        r11.a(thread, th2, z13, r10);
                                    }
                                    e();
                                    r12 = r11;
                                    r12.d();
                                    c(thread, th2);
                                    return null;
                                }
                                synchronized (this) {
                                    r11.f10705f--;
                                    r11.f10704e--;
                                    return g();
                                }
                            } catch (Throwable th4) {
                                if (!z12) {
                                    if (z10 && !z11) {
                                        try {
                                            r11.a(thread, th2, z13, r10);
                                        } catch (Throwable unused3) {
                                            throw th4;
                                        }
                                    }
                                    e();
                                    r11.d();
                                    c(thread, th2);
                                    throw th4;
                                }
                                synchronized (this) {
                                    r11.f10705f--;
                                    r11.f10704e--;
                                    return g();
                                }
                            }
                        }
                    }
                    try {
                        ?? ValueOf = String.valueOf(z13);
                        com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(ValueOf));
                        com.apm.insight.a.a.a();
                        boolean zB = b(thread, th2);
                        try {
                            if (zB) {
                                try {
                                    ?? r18 = r17.f10702c;
                                    if (r18 == 0 || z13 == 0) {
                                        r15 = CurrentTimeMillis;
                                        String str = strA;
                                        if (zB || (r16 = r17.f10703d) == 0) {
                                            r13 = r15;
                                            ValueOf = r15;
                                        } else {
                                            r16.a(r15, thread, th2, str, strA2, z12);
                                            r13 = r15;
                                            StringBuilder sb2 = new StringBuilder("[uncaughtException] mLaunchCrashDisposer ");
                                            String string = th2.toString();
                                            sb2.append(string);
                                            com.apm.insight.a.a((Object) sb2.toString());
                                            ValueOf = string;
                                        }
                                    } else {
                                        r18.a(CurrentTimeMillis, thread, th2, strA, strA2, z12);
                                        r13 = CurrentTimeMillis;
                                        StringBuilder sb3 = new StringBuilder("[uncaughtException] mLaunchCrashDisposer ");
                                        String string2 = th2.toString();
                                        sb3.append(string2);
                                        com.apm.insight.a.a((Object) sb3.toString());
                                        ValueOf = string2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r11 = r17;
                                    z13 = z13;
                                    r10 = CurrentTimeMillis;
                                    if (!com.apm.insight.l.m.c(th)) {
                                        com.apm.insight.a.a(th);
                                    }
                                    if (!z12) {
                                        if (z10 && !z11) {
                                            r11.a(thread, th2, z13, r10);
                                        }
                                        e();
                                        r12 = r11;
                                    } else {
                                        synchronized (this) {
                                            r11.f10705f--;
                                            r11.f10704e--;
                                        }
                                        return g();
                                    }
                                }
                            } else {
                                r15 = CurrentTimeMillis;
                                String str2 = strA;
                                if (zB) {
                                    r13 = r15;
                                    ValueOf = r15;
                                } else {
                                    r13 = r15;
                                    ValueOf = r15;
                                }
                            }
                            if (!z12) {
                                if (!z10 || z11) {
                                    r14 = r17;
                                } else {
                                    ?? r19 = r17;
                                    r19.a(thread, th2, z13, r13);
                                    r14 = r19;
                                }
                                e();
                                r12 = r14;
                                r12.d();
                                c(thread, th2);
                                return null;
                            }
                            synchronized (this) {
                                r17.f10705f--;
                                r17.f10704e--;
                            }
                            return g();
                        } catch (Throwable th6) {
                            th = th6;
                            CurrentTimeMillis = ValueOf;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r11 = r17;
                    r10 = CurrentTimeMillis;
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable th9) {
            th = th9;
            z11 = false;
            z13 = z13;
            z12 = false;
            r11 = r17;
            r10 = CurrentTimeMillis;
        }
    }

    public static boolean b() {
        return f10697i;
    }

    private String a(File file, Throwable th2, Thread thread, boolean z10) {
        String absolutePath = file.getAbsolutePath();
        this.f10707h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String strA = null;
        if (z10) {
            int iH = NativeImpl.h(absolutePath);
            if (iH > 0) {
                try {
                    e.g();
                    NativeImpl.a(iH, com.apm.insight.l.a.b());
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, th2.getMessage());
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, th2.getClass().getName());
                    if (th2.getMessage() != null) {
                        NativeImpl.a(iH, ": ");
                        NativeImpl.a(iH, th2.getMessage());
                    }
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, thread.getName());
                    NativeImpl.a(iH, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(iH, "stack:");
                    NativeImpl.a(iH, "\n");
                } catch (Throwable unused3) {
                }
                com.apm.insight.l.m.a(th2, iH);
                NativeImpl.b(iH);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    e.g();
                    sb2.append(com.apm.insight.l.a.b());
                    sb2.append("\n");
                    fileOutputStream.write(sb2.toString().getBytes());
                    fileOutputStream.write((th2.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th2 + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused5) {
                }
                try {
                    strA = com.apm.insight.l.m.a(th2, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new com.apm.insight.l.e.a() { // from class: com.apm.insight.g.a.1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private boolean f10709a = false;

                        @Override // com.apm.insight.l.e.a
                        public final boolean a(String str) {
                            if (!this.f10709a && str.contains("android.os.Looper.loop")) {
                                this.f10709a = true;
                            }
                            return !this.f10709a;
                        }
                    } : new com.apm.insight.l.e.a());
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    try {
                        th2.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                            fileOutputStream.write((th4 + "\n").getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                }
                com.apm.insight.a.a((Closeable) fileOutputStream);
            } catch (Throwable unused7) {
            }
        }
        return strA;
    }

    public final void a(Thread thread, Throwable th2, boolean z10, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> listC;
        CrashType crashType;
        if (z10) {
            listC = l.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            listC = l.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : listC) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, com.apm.insight.l.m.a(th2), thread, this.f10708k);
                } else {
                    iCrashCallback.onCrash(crashType, com.apm.insight.l.m.a(th2), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th3) {
                com.apm.insight.a.b(th3);
                aVar.b("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    private void a(Thread thread, Throwable th2, boolean z10, long j10) {
        Thread thread2;
        Throwable th3;
        long j11;
        List<IOOMCallback> listA = l.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : listA) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    thread2 = thread;
                    th3 = th2;
                    j11 = j10;
                    try {
                        ((com.apm.insight.b) iOOMCallback).a(crashType, th3, thread2, j11, this.f10708k);
                    } catch (Throwable th4) {
                        th = th4;
                        com.apm.insight.a.b(th);
                    }
                } else {
                    thread2 = thread;
                    th3 = th2;
                    j11 = j10;
                    iOOMCallback.onCrash(crashType, th3, thread2, j11);
                }
            } catch (Throwable th5) {
                th = th5;
                thread2 = thread;
                th3 = th2;
                j11 = j10;
            }
            th2 = th3;
            thread = thread2;
            j10 = j11;
        }
    }

    public final void a(String str) {
        this.f10706g.put(str, new Object());
    }

    public static void a(final Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVarA = com.apm.insight.entity.a.a(System.currentTimeMillis(), e.g(), th2);
                        aVarA.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA2 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVarA);
                        if (aVarA2 != null) {
                            com.apm.insight.k.d.a().c(aVarA2.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void a(long j10) {
        f10699l = j10;
    }
}
