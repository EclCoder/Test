package com.arthenica.ffmpegkit;

import android.util.Log;
import android.util.SparseArray;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class FFmpegKitConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f11034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f11035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f11037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f11038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f11039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ExecutorService f11041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static i f11042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static q f11043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static f f11044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final SparseArray f11045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final SparseArray f11046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static j f11047n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > FFmpegKitConfig.f11036c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11049b;

        static {
            int[] iArr = new int[g.values().length];
            f11049b = iArr;
            try {
                iArr[g.AV_LOG_QUIET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11049b[g.AV_LOG_TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11049b[g.AV_LOG_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11049b[g.AV_LOG_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11049b[g.AV_LOG_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11049b[g.AV_LOG_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11049b[g.AV_LOG_FATAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11049b[g.AV_LOG_PANIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11049b[g.AV_LOG_STDERR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11049b[g.AV_LOG_VERBOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[j.values().length];
            f11048a = iArr2;
            try {
                iArr2[j.NEVER_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11048a[j.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11048a[j.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11048a[j.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11048a[j.ALWAYS_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        o5.a.b("com.arthenica");
        Log.i("ffmpeg-kit", "Loading ffmpeg-kit.");
        k.f(k.e());
        f11034a = new AtomicInteger(1);
        f11035b = g.e(k.j());
        f11040g = 10;
        f11041h = Executors.newFixedThreadPool(10);
        f11036c = 10;
        f11037d = new a();
        f11038e = new LinkedList();
        f11039f = new Object();
        f11042i = null;
        f11043j = null;
        f11044k = null;
        f11045l = new SparseArray();
        f11046m = new SparseArray();
        f11047n = j.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED;
        Log.i("ffmpeg-kit", String.format("Loaded ffmpeg-kit-%s-%s-%s-%s.", k.l(), k.c(), k.m(), k.d()));
    }

    static void b(n nVar) {
        synchronized (f11039f) {
            try {
                Map map = f11037d;
                if (!map.containsKey(Long.valueOf(nVar.getSessionId()))) {
                    map.put(Long.valueOf(nVar.getSessionId()), nVar);
                    f11038e.add(nVar);
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(e eVar) {
        eVar.p(f11041h.submit(new c(eVar)));
    }

    private static native void disableNativeRedirection();

    private static void e() {
        while (true) {
            List list = f11038e;
            if (list.size() <= f11036c) {
                return;
            }
            try {
                n nVar = (n) list.remove(0);
                if (nVar != null) {
                    f11037d.remove(Long.valueOf(nVar.getSessionId()));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    private static native void enableNativeRedirection();

    public static void f(e eVar) {
        eVar.q();
        try {
            eVar.h(new m(nativeFFmpegExecute(eVar.getSessionId(), eVar.l())));
        } catch (Exception e10) {
            eVar.i(e10);
            Log.w("ffmpeg-kit", String.format("FFmpeg execute failed: %s.%s", c(eVar.l()), o5.a.a(e10)));
        }
    }

    public static String g() {
        return getNativeBuildDate();
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    static native int getNativeLogLevel();

    private static native String getNativeVersion();

    public static f h() {
        return f11044k;
    }

    public static j i() {
        return f11047n;
    }

    private static native void ignoreNativeSignal(int i10);

    public static n j(long j10) {
        n nVar;
        synchronized (f11039f) {
            nVar = (n) f11037d.get(Long.valueOf(j10));
        }
        return nVar;
    }

    public static String k() {
        return l() ? String.format("%s-lts", getNativeVersion()) : getNativeVersion();
    }

    public static boolean l() {
        return AbiDetect.isNativeLTSBuild();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b A[PHI: r2
      0x005b: PHI (r2v1 com.arthenica.ffmpegkit.j) = (r2v0 com.arthenica.ffmpegkit.j), (r2v4 com.arthenica.ffmpegkit.j) binds: [B:10:0x0030, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    private static void log(long j10, int i10, byte[] bArr) {
        boolean z10;
        g gVarE = g.e(i10);
        String str = new String(bArr);
        h hVar = new h(j10, gVarE, str);
        j jVarA = f11047n;
        if ((f11035b != g.AV_LOG_QUIET || i10 == g.AV_LOG_STDERR.g()) && i10 <= f11035b.g()) {
            n nVarJ = j(j10);
            boolean z11 = false;
            if (nVarJ != null) {
                jVarA = nVarJ.a();
                nVarJ.g(hVar);
                if (nVarJ.b() != null) {
                    try {
                        nVarJ.b().a(hVar);
                    } catch (Exception e10) {
                        Log.e("ffmpeg-kit", String.format("Exception thrown inside session log callback.%s", o5.a.a(e10)));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            i iVar = f11042i;
            if (iVar != null) {
                try {
                    iVar.a(hVar);
                } catch (Exception e11) {
                    Log.e("ffmpeg-kit", String.format("Exception thrown inside global log callback.%s", o5.a.a(e11)));
                }
                z11 = true;
            }
            int i11 = b.f11048a[jVarA.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4 && (z11 || z10)) {
                            return;
                        }
                    } else if (z10) {
                        return;
                    }
                } else if (z11) {
                    return;
                }
                switch (b.f11049b[gVarE.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                        Log.d("ffmpeg-kit", str);
                        break;
                    case 4:
                        Log.i("ffmpeg-kit", str);
                        break;
                    case 5:
                        Log.w("ffmpeg-kit", str);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Log.e("ffmpeg-kit", str);
                        break;
                    default:
                        Log.v("ffmpeg-kit", str);
                        break;
                }
            }
        }
    }

    public static String[] m(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i10 < str.length()) {
            Character chValueOf = i10 > 0 ? Character.valueOf(str.charAt(i10 - 1)) : null;
            char cCharAt = str.charAt(i10);
            if (cCharAt == ' ') {
                if (z10 || z11) {
                    sb2.append(cCharAt);
                } else if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2 = new StringBuilder();
                }
            } else if (cCharAt != '\'' || (chValueOf != null && chValueOf.charValue() == '\\')) {
                if (cCharAt != '\"' || (chValueOf != null && chValueOf.charValue() == '\\')) {
                    sb2.append(cCharAt);
                } else if (z11) {
                    z11 = false;
                } else if (z10) {
                    sb2.append(cCharAt);
                } else {
                    z11 = true;
                }
            } else if (z10) {
                z10 = false;
            } else if (z11) {
                sb2.append(cCharAt);
            } else {
                z10 = true;
            }
            i10++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static native int messagesInTransmit(long j10);

    static native void nativeFFmpegCancel(long j10);

    private static native int nativeFFmpegExecute(long j10, String[] strArr);

    static native int nativeFFprobeExecute(long j10, String[] strArr);

    private static native int registerNewNativeFFmpegPipe(String str);

    private static int safClose(int i10) {
        try {
            android.support.v4.media.session.b.a(f11046m.get(i10));
            Log.e("ffmpeg-kit", String.format("SAF fd %d not found.", Integer.valueOf(i10)));
            return 0;
        } catch (Throwable th2) {
            Log.e("ffmpeg-kit", String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i10), o5.a.a(th2)));
            return 0;
        }
    }

    private static int safOpen(int i10) {
        try {
            android.support.v4.media.session.b.a(f11045l.get(i10));
            Log.e("ffmpeg-kit", String.format("SAF id %d not found.", Integer.valueOf(i10)));
            return 0;
        } catch (Throwable th2) {
            Log.e("ffmpeg-kit", String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i10), o5.a.a(th2)));
            return 0;
        }
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i10);

    private static void statistics(long j10, int i10, float f10, float f11, long j11, double d10, double d11, double d12) {
        p pVar = new p(j10, i10, f10, f11, j11, d10, d11, d12);
        n nVarJ = j(j10);
        if (nVarJ != null && nVarJ.c()) {
            e eVar = (e) nVarJ;
            eVar.t(pVar);
            if (eVar.w() != null) {
                try {
                    eVar.w().a(pVar);
                } catch (Exception e10) {
                    Log.e("ffmpeg-kit", String.format("Exception thrown inside session statistics callback.%s", o5.a.a(e10)));
                }
            }
        }
        q qVar = f11043j;
        if (qVar != null) {
            try {
                qVar.a(pVar);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global statistics callback.%s", o5.a.a(e11)));
            }
        }
    }

    public static String c(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(giNWGaNAgVQoO.OGT);
            }
            sb2.append(strArr[i10]);
        }
        return sb2.toString();
    }
}
