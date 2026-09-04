package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.J2;
import com.inmobi.media.Sh;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Sh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Rb f25699b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ib f25698a = Ib.ERROR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f25700c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rh f25701d = new Rh();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f25702e = new ReentrantLock();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Function1 f25703f = new Function1() { // from class: yh.a4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Sh.a((J2) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ReferenceQueue f25704g = new ReferenceQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap f25705h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f25706i = new AtomicBoolean(false);

    public static final fl.g0 a(J2 it) throws JSONException {
        kotlin.jvm.internal.s.h(it, "it");
        int i10 = it.f25043a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case 150:
                case 151:
                case 152:
                    Map map = it.f25045c;
                    if (map != null && map.containsKey(DataSchemeDataSource.SCHEME_DATA)) {
                        Object obj = it.f25045c.get(DataSchemeDataSource.SCHEME_DATA);
                        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((X9) obj);
                    }
                    break;
            }
        } else {
            a(i10);
            f25700c.set(false);
            ((Fc) Xi.f26025e.getValue()).a(f25703f);
            f25699b = null;
        }
        return fl.g0.f38750a;
    }

    public static void b() {
        if (f25699b == null && f25702e.tryLock()) {
            try {
                if (f25699b == null && f25700c.get()) {
                    Context context = Xi.f26021a;
                    if (context != null) {
                        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
                        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getLoggingConfig();
                        f25699b = new Rb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Rb rb2 = f25699b;
                    if (rb2 != null) {
                        AbstractC3426x9.a(rb2);
                    }
                }
            } finally {
                f25702e.unlock();
            }
        }
    }

    public static final void c() throws InterruptedException {
        while (f25700c.get()) {
            a();
        }
    }

    public static void a(Object obj, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(obj, "obj");
        try {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3322t9 != null) {
                    f25705h.put(new PhantomReference(obj, f25704g), new fl.q(obj.toString(), new WeakReference(interfaceC3322t9)));
                    if (f25706i.getAndSet(true)) {
                        return;
                    }
                    em.o0 o0Var = AbstractC2834ac.f26174a;
                    Runnable runnable = new Runnable() { // from class: yh.z3
                        @Override // java.lang.Runnable
                        public final void run() throws InterruptedException {
                            Sh.c();
                        }
                    };
                    kotlin.jvm.internal.s.h("RemoteLoggerComponent", "tag");
                    kotlin.jvm.internal.s.h(runnable, "runnable");
                    try {
                        em.k.d(AbstractC2834ac.f26174a, null, null, new Wb(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.s.c(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.s.c(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.s.c(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.s.c(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static C3348u9 a(String logType, String placementType) {
        kotlin.jvm.internal.s.h(logType, "logType");
        kotlin.jvm.internal.s.h(placementType, "placementType");
        Context context = Xi.f26021a;
        if (context != null) {
            try {
                b();
                C3136m4 c3136m4 = AbstractC2878c4.f26300a;
                kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getLoggingConfig();
                double dB = b(logType, placementType, loggingConfig);
                Ib logLevel = a(logType, placementType, loggingConfig);
                boolean z10 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                kotlin.jvm.internal.s.h(context, "context");
                kotlin.jvm.internal.s.h(logLevel, "logLevel");
                return new C3348u9(context, dB, logLevel, z10, maxNoOfEntries, expiry);
            } catch (Exception e10) {
                fl.k kVar = W9.f25935a;
                AbstractC3219p9.a(e10);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Ib a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (kotlin.jvm.internal.s.c(str2, "AB")) {
                        return Jb.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return Jb.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (kotlin.jvm.internal.s.c(str2, "AB")) {
                        return Jb.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return Jb.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (kotlin.jvm.internal.s.c(str2, "AB")) {
                        return Jb.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return Jb.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    return Jb.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (kotlin.jvm.internal.s.c(str2, "AB")) {
                        return Jb.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return Jb.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Jb.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f25698a;
    }

    public static void a() throws InterruptedException {
        WeakReference weakReference;
        InterfaceC3322t9 interfaceC3322t9;
        Reference referenceRemove = f25704g.remove();
        ConcurrentHashMap concurrentHashMap = f25705h;
        if (gl.r.U(concurrentHashMap.keySet(), referenceRemove)) {
            fl.q qVar = (fl.q) concurrentHashMap.get(referenceRemove);
            if (qVar != null && (weakReference = (WeakReference) qVar.i()) != null && (interfaceC3322t9 = (InterfaceC3322t9) weakReference.get()) != null) {
                ((C3348u9) interfaceC3322t9).a("ReferenceTracker", " reference " + qVar.h() + " reference is GCed.");
            }
            kotlin.jvm.internal.p0.d(concurrentHashMap).remove(referenceRemove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((fl.q) entry.getValue()).i()).get() == null) {
                f25705h.remove(entry.getKey());
            }
        }
    }

    public static void a(X9 incident) throws JSONException {
        kotlin.jvm.internal.s.h(incident, "incident");
        if (!(incident instanceof X4) && !(incident instanceof C3208oo)) {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(CrashConfig.class, "clazz");
            C3136m4 c3136m5 = AbstractC2878c4.f26300a;
            if (((CrashConfig) c3136m5.a(CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (incident instanceof C3468z1)) {
                kotlin.jvm.internal.s.h(CrashConfig.class, "clazz");
                C2961fa c2961fa = new C2961fa(((CrashConfig) c3136m5.a(CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                String message = incident.f26767a;
                String str = incident.f26768b;
                String exitData = str == null ? "" : str;
                int i10 = ((C3468z1) incident).f27967g;
                long j10 = incident.f26769c;
                kotlin.jvm.internal.s.h(message, "message");
                kotlin.jvm.internal.s.h(exitData, "exitData");
                em.o0 o0Var = AbstractC2834ac.f26174a;
                Zb.a(new C2935ea(c2961fa, j10, message, i10, exitData, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3426x9.f27835a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Ub.f25828a;
        ArrayList arrayListA = Tb.a();
        int size = arrayListA.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListA.get(i12);
            i12++;
            arrayList.add(new Ri((Ph) obj));
        }
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            Ri ri2 = (Ri) obj2;
            Ib logLevel = Ib.ERROR;
            String str2 = incident.f26767a;
            long j11 = incident.f26769c;
            String str3 = incident.f26768b;
            if (str3 == null) {
                str3 = "";
            }
            String message2 = "TYPE - " + str2 + ", TIMESTAMP - " + j11 + ", PAYLOAD - " + str3;
            ri2.getClass();
            kotlin.jvm.internal.s.h(logLevel, "logLevel");
            kotlin.jvm.internal.s.h("LOGGER CRASH", "tag");
            kotlin.jvm.internal.s.h(message2, "message");
            ri2.f25646a.a(logLevel, "LOGGER CRASH", message2);
            if (incident instanceof X4) {
                ri2.f25646a.b();
            }
        }
    }

    public static void a(int i10) throws JSONException {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3426x9.f27835a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Ub.f25828a;
        ArrayList arrayListA = Tb.a();
        int size = arrayListA.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            arrayList.add(new Ri((Ph) obj));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            Ri ri2 = (Ri) obj2;
            Ib logLevel = Ib.ERROR;
            String message = "SYSTEM SHUTDOWN RECEIVED - " + i10;
            ri2.getClass();
            kotlin.jvm.internal.s.h(logLevel, "logLevel");
            kotlin.jvm.internal.s.h("LOGGER CRASH", "tag");
            kotlin.jvm.internal.s.h(message, "message");
            ri2.f25646a.a(logLevel, "LOGGER CRASH", message);
            ri2.f25646a.b();
        }
        f25700c.set(false);
        ((Fc) Xi.f26025e.getValue()).a(f25703f);
        f25699b = null;
    }
}
