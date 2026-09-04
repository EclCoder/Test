package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f10752b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10753a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0147b f10757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, C0147b> f10758g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<File> f10754c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<File> f10755d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10756e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f10759h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f10760i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f10761j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0147b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10776a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f10779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f10780e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f10777b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<a> f10778c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f10781f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10782g = 0;

        C0147b(String str) {
            this.f10776a = str;
        }
    }

    private b(Context context) {
        this.f10753a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f10759h || this.f10758g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f10753a)) {
            e();
        }
        if (this.f10756e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f10756e = 1;
            } else {
                this.f10756e = 0;
            }
        }
        boolean z10 = this.f10756e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f10753a);
        Iterator<C0147b> it = this.f10758g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z10, fVar);
        }
        Iterator<C0147b> it2 = this.f10758g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z10, fVar);
        }
        Iterator<C0147b> it3 = this.f10758g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f10753a, it3.next().f10776a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.f10759h = true;
        this.f10758g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f10759h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f10753a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f10760i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f10753a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        }
    }

    public static b a() {
        if (f10752b == null) {
            synchronized (b.class) {
                try {
                    if (f10752b == null) {
                        f10752b = new b(com.apm.insight.e.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10752b;
    }

    public final void b() {
        try {
            if (!this.f10759h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.f10761j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f10759h;
    }

    private void b(HashMap<String, C0147b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f10753a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0147b c0147b = map.get(name);
                    if (c0147b == null) {
                        c0147b = new C0147b(name);
                        map.put(name, c0147b);
                    }
                    c0147b.f10778c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f10771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        CrashType f10774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f10775e;

        a(File file, CrashType crashType) {
            this.f10772b = -1L;
            this.f10773c = -1L;
            this.f10771a = file;
            this.f10774d = crashType;
            this.f10775e = file.getName();
        }

        a(File file, long j10, CrashType crashType) {
            this.f10773c = -1L;
            this.f10771a = file;
            this.f10772b = j10;
            this.f10774d = crashType;
            this.f10775e = file.getName();
        }
    }

    public final void a(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            if (this.f10757f == null) {
                this.f10757f = new C0147b("old_uuid");
                HashMap<String, C0147b> map = new HashMap<>();
                this.f10758g = map;
                a(map);
                a(this.f10758g, this.f10757f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f10753a));
                b(this.f10758g);
                b(this.f10757f, true, null);
                a(this.f10757f, true, null);
                this.f10757f = null;
                if (this.f10758g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0147b c0147b, boolean z10, com.apm.insight.runtime.f fVar) {
        boolean z11;
        if (c0147b.f10778c.size() <= 1 && c0147b.f10778c.isEmpty()) {
            c0147b.f10780e = c0147b.f10779d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f10753a);
        c0147b.f10780e = c0147b.f10779d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f10753a);
        for (a aVar2 : c0147b.f10778c) {
            final File file = aVar2.f10771a;
            try {
                aVar.a(file);
                JSONObject jSONObjectA = a(aVar);
                if (jSONObjectA != null && jSONObjectA.length() != 0) {
                    if (jSONObjectA.length() != 0) {
                        if (!z10) {
                            long jOptLong = jSONObjectA.optLong("crash_time");
                            try {
                                a aVar3 = c0147b.f10780e;
                                if (aVar3 == null) {
                                    c0147b.f10780e = aVar2;
                                    c0147b.f10781f = true;
                                    if (fVar == null || fVar.a("default")) {
                                        z11 = zB;
                                    } else {
                                        aVar.i();
                                    }
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    z11 = zB;
                                    try {
                                        if (!c0147b.f10781f && jOptLong < aVar3.f10772b) {
                                            c0147b.f10780e = aVar2;
                                            if (fVar != null && !fVar.a("default")) {
                                                aVar.i();
                                                zB = z11;
                                            } else {
                                                a(file);
                                                c0147b.f10781f = true;
                                            }
                                        } else {
                                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "aid", String.valueOf(jSONObjectA.optJSONObject("header").opt("aid")));
                                            jSONObjectA.optJSONObject("header").put("aid", 2010);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = zB;
                            }
                        } else {
                            z11 = zB;
                            if (fVar != null && !fVar.a("default")) {
                                aVar.i();
                            }
                        }
                        try {
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0147b.f10776a);
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                            if (z11) {
                                c.a aVar4 = new c.a(jSONObjectA, CrashType.NATIVE);
                                com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar4.c(), aVar4.a(), o.a().b(aVar4.b() == -1 ? System.currentTimeMillis() : aVar4.b())), new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.4
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject) {
                                        d.a();
                                        d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f10753a, c0147b.f10776a));
                                    }
                                });
                                if (!aVar.i()) {
                                    aVar.f();
                                }
                            }
                            c.a(CrashType.NATIVE, jSONObjectA);
                        } catch (Throwable th4) {
                            th = th4;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                        }
                    } else {
                        z11 = zB;
                    }
                    zB = z11;
                } else {
                    z11 = zB;
                    aVar.i();
                    zB = z11;
                }
            } catch (Throwable th5) {
                th = th5;
                z11 = zB;
            }
        }
    }

    private void a(HashMap<String, C0147b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f10753a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0147b c0147b = map.get(name);
                    if (c0147b == null) {
                        c0147b = new C0147b(name);
                        map.put(name, c0147b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0147b.f10782g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    private void a(HashMap<String, C0147b> map, C0147b c0147b) {
        CrashType crashType;
        File[] fileArrListFiles = com.apm.insight.l.j.a(this.f10753a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        char c10 = 0;
        int i10 = 0;
        while (i10 < fileArrListFiles.length) {
            File file = fileArrListFiles[i10];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            String[] strArrSplit = name.split("_");
                            if (strArrSplit.length < 5) {
                                c0147b.f10777b.add(new a(file, null));
                            } else {
                                try {
                                    long j10 = Long.parseLong(strArrSplit[c10]);
                                    long j11 = Long.parseLong(strArrSplit[4]);
                                    String str = strArrSplit[2];
                                    String str2 = strArrSplit[1];
                                    int iHashCode = str2.hashCode();
                                    if (iHashCode != -1109843021) {
                                        if (iHashCode != 96741) {
                                            if (iHashCode == 3254818 && str2.equals("java")) {
                                                crashType = CrashType.JAVA;
                                            } else {
                                                crashType = null;
                                            }
                                        } else if (str2.equals("anr")) {
                                            crashType = CrashType.ANR;
                                        } else {
                                            crashType = null;
                                        }
                                    } else if (str2.equals("launch")) {
                                        crashType = CrashType.LAUNCH;
                                    } else {
                                        crashType = null;
                                    }
                                    C0147b c0147b2 = map.get(str);
                                    if (c0147b2 == null) {
                                        c0147b2 = new C0147b(str);
                                        map.put(str, c0147b2);
                                    }
                                    a aVar = new a(file, j10, crashType);
                                    aVar.f10773c = j11;
                                    a aVar2 = c0147b2.f10779d;
                                    if ((aVar2 == null || aVar2.f10772b > aVar.f10772b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                        c0147b2.f10779d = aVar;
                                    }
                                    c0147b2.f10777b.add(aVar);
                                } catch (Throwable unused) {
                                    c0147b.f10777b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:".concat(name)), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            i10++;
            c10 = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0154 A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:72:0x0148, B:74:0x0154, B:78:0x0168), top: B:93:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00e0 A[EXC_TOP_SPLITTER, PHI: r16
      0x00e0: PHI (r16v7 java.util.Iterator<com.apm.insight.k.b$a>) = (r16v9 java.util.Iterator<com.apm.insight.k.b$a>), (r16v10 java.util.Iterator<com.apm.insight.k.b$a>) binds: [B:54:0x00de, B:48:0x00d0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private void a(final C0147b c0147b, boolean z10, com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        CrashType crashType;
        if (!c0147b.f10777b.isEmpty()) {
            if (c0147b.f10780e == null) {
                c0147b.f10780e = c0147b.f10779d;
            }
            Iterator<a> it2 = c0147b.f10777b.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                try {
                    final File file = next.f10771a;
                    CrashType crashType2 = next.f10774d;
                    try {
                        final com.apm.insight.f.b bVarA = a(file, crashType2, c0147b.f10776a, next.f10772b, next.f10773c);
                        if (bVarA == null) {
                            com.apm.insight.l.f.a(file);
                        } else {
                            JSONObject jSONObjectB = bVarA.b();
                            if (jSONObjectB == null) {
                                com.apm.insight.l.f.a(file);
                            } else {
                                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                                if (jSONObjectOptJSONObject == null) {
                                    com.apm.insight.l.f.a(file);
                                } else if (crashType2 == null && (new File(file, file.getName()).exists() || file.getName().split("_").length < 5)) {
                                    if (e.b(bVarA.a(), jSONObjectB.toString()).a()) {
                                        com.apm.insight.l.f.a(file);
                                    }
                                } else {
                                    File fileA = com.apm.insight.entity.b.a(file);
                                    if (!fileA.exists()) {
                                        com.apm.insight.l.f.a(file);
                                    } else {
                                        try {
                                            JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(fileA, "\n"));
                                            JSONObject jSONObjectOptJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) jSONObjectB.opt(DataSchemeDataSource.SCHEME_DATA)).optJSONObject(0) : jSONObjectB;
                                            try {
                                                if (z10) {
                                                    it = it2;
                                                } else {
                                                    it = it2;
                                                    try {
                                                        if (c0147b.f10780e != next) {
                                                            try {
                                                                com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                                crashType = crashType2;
                                                                try {
                                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f10775e.contains("ignore")));
                                                                    jSONObjectOptJSONObject.put("aid", 2010);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    com.apm.insight.c.a();
                                                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                crashType = crashType2;
                                                            }
                                                        }
                                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0147b.f10776a);
                                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0147b.f10782g));
                                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                                        com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                            @Override // com.apm.insight.entity.b.a
                                                            public final void a(JSONObject jSONObject) {
                                                                e.a(bVarA.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f10753a, c0147b.f10776a));
                                                            }
                                                        });
                                                        if (!com.apm.insight.l.f.a(file)) {
                                                            com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                                        }
                                                        c.a(crashType, jSONObjectB);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        com.apm.insight.c.a();
                                                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                        com.apm.insight.l.f.a(next.f10771a);
                                                        it2 = it;
                                                    }
                                                    it2 = it;
                                                }
                                                if (next.f10775e.contains("ignore")) {
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                    crashType = crashType2;
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f10775e.contains("ignore")));
                                                    jSONObjectOptJSONObject.put("aid", 2010);
                                                } else {
                                                    crashType = crashType2;
                                                    if (fVar != null && !fVar.a(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                                        com.apm.insight.l.f.a(next.f10771a);
                                                    }
                                                    it2 = it;
                                                }
                                                com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                    @Override // com.apm.insight.entity.b.a
                                                    public final void a(JSONObject jSONObject) {
                                                        e.a(bVarA.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f10753a, c0147b.f10776a));
                                                    }
                                                });
                                                if (!com.apm.insight.l.f.a(file)) {
                                                    com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                                }
                                                c.a(crashType, jSONObjectB);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                com.apm.insight.c.a();
                                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                com.apm.insight.l.f.a(next.f10771a);
                                            }
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0147b.f10776a);
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0147b.f10782g));
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        } catch (Throwable unused) {
                                            it = it2;
                                        }
                                        it2 = it;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        it = it2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    it = it2;
                }
            }
        }
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j10, long j11) {
        File file2;
        com.apm.insight.f.b bVar;
        com.apm.insight.f.b bVar2 = null;
        try {
            if (file.isFile()) {
                try {
                    com.apm.insight.l.f.a(file);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    file2 = file;
                }
            } else {
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        file2 = file;
                        try {
                            return com.apm.insight.l.f.b(new File(file2, file.getName()).getAbsolutePath());
                        } catch (Throwable th3) {
                            th = th3;
                            com.apm.insight.l.f.a(file2);
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            return bVar2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        file2 = file;
                    }
                } else {
                    file2 = file;
                    try {
                        com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                        try {
                            JSONObject jSONObjectB = bVarA.b();
                            try {
                                if (bVarA.b() != null) {
                                    boolean z11 = z10;
                                    if (crashType == CrashType.ANR) {
                                        return bVarA;
                                    }
                                    jSONObjectB.put("crash_time", j10);
                                    try {
                                        jSONObjectB.put("app_start_time", j11);
                                        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                                        try {
                                            if (jSONObjectOptJSONObject == null) {
                                                jSONObjectOptJSONObject = Header.a(j10).f();
                                            } else if (z11) {
                                                jSONObjectB.remove("header");
                                            }
                                            String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                                            if (strOptString == null) {
                                                strOptString = "2008-20250701130429";
                                            }
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "sdk_version", strOptString);
                                            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                                            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                                                jSONObjectB.put("logcat", com.apm.insight.runtime.h.a(str));
                                            }
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", "true");
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                                            try {
                                                jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f10753a));
                                                jSONObjectB.put("crash_uuid", file2.getName());
                                                try {
                                                    long j12 = Long.parseLong(com.apm.insight.runtime.b.a(j10, str));
                                                    com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j12 - j10) < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "< 60s" : "> 60s");
                                                    jSONObjectB.put("lastAliveTime", String.valueOf(j12));
                                                } catch (Throwable unused) {
                                                    jSONObjectB.put("lastAliveTime", "unknown");
                                                    com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                                                }
                                                jSONObjectB.put("has_dump", "true");
                                                if (jSONObjectB.opt("storage") == null) {
                                                    try {
                                                        com.apm.insight.e.g();
                                                        com.apm.insight.entity.a.a(jSONObjectB, n.a());
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        bVar2 = bVarA;
                                                        com.apm.insight.l.f.a(file2);
                                                        com.apm.insight.c.a();
                                                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                        return bVar2;
                                                    }
                                                }
                                                if (Header.b(jSONObjectOptJSONObject)) {
                                                    com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                                                }
                                                com.apm.insight.entity.d.b(jSONObjectB);
                                                bVarA.b().put("upload_scene", "launch_scan");
                                                if (z11) {
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObjectB.put("event_type", "start_crash");
                                                    jSONObjectB.put("stack", jSONObjectB.remove(DataSchemeDataSource.SCHEME_DATA));
                                                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONArray().put(jSONObjectB));
                                                    jSONObject.put("header", jSONObjectOptJSONObject);
                                                    bVar = bVarA;
                                                    bVar.a(jSONObject);
                                                } else {
                                                    bVar = bVarA;
                                                    jSONObjectB.put("isJava", 1);
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                bVar = bVarA;
                                                bVar2 = bVar;
                                                com.apm.insight.l.f.a(file2);
                                                com.apm.insight.c.a();
                                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                return bVar2;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                    bVar2 = bVar;
                                } else {
                                    bVar = bVarA;
                                    com.apm.insight.l.f.a(file2);
                                }
                                return bVar;
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            bVar = bVarA;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
            }
        } catch (Throwable th12) {
            th = th12;
            file2 = file;
        }
        com.apm.insight.l.f.a(file2);
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        return bVar2;
    }
}
