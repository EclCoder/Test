package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class h implements com.bumptech.glide.load.engine.f.a, Runnable, Comparable, n6.a.f {
    public static final r5.f I = r5.f.e("glide_thread_priority_override");
    private r5.e A;
    private Object B;
    private r5.a C;
    private com.bumptech.glide.load.data.d D;
    private volatile com.bumptech.glide.load.engine.f E;
    private volatile boolean F;
    private volatile boolean G;
    private boolean H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f11320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0.d f11321e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.e f11324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r5.e f11325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.h f11326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m f11327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t5.a f11330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r5.g f11331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f11332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private EnumC0155h f11334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g f11335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f11336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f11337u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f11338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.bumptech.glide.f f11339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Supplier f11340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Thread f11341y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private r5.e f11342z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g f11317a = new com.bumptech.glide.load.engine.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11318b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n6.c f11319c = n6.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f11322f = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f11323g = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11345c;

        static {
            int[] iArr = new int[r5.c.values().length];
            f11345c = iArr;
            try {
                iArr[r5.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11345c[r5.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0155h.values().length];
            f11344b = iArr2;
            try {
                iArr2[EnumC0155h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11344b[EnumC0155h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11344b[EnumC0155h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11344b[EnumC0155h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11344b[EnumC0155h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f11343a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11343a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11343a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void b(t5.c cVar, r5.a aVar, boolean z10);

        void c(GlideException glideException);

        void e(h hVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r5.a f11346a;

        c(r5.a aVar) {
            this.f11346a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public t5.c a(t5.c cVar) {
            return h.this.v(this.f11346a, cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r5.e f11348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r5.j f11349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r f11350c;

        d() {
        }

        void a() {
            this.f11348a = null;
            this.f11349b = null;
            this.f11350c = null;
        }

        void b(e eVar, r5.g gVar) {
            n6.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f11348a, new com.bumptech.glide.load.engine.e(this.f11349b, this.f11350c, gVar));
            } finally {
                this.f11350c.g();
                n6.b.e();
            }
        }

        boolean c() {
            return this.f11350c != null;
        }

        void d(r5.e eVar, r5.j jVar, r rVar) {
            this.f11348a = eVar;
            this.f11349b = jVar;
            this.f11350c = rVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface e {
        v5.a a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11353c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f11353c || z10 || this.f11352b) && this.f11351a;
        }

        synchronized boolean b() {
            this.f11352b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f11353c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f11351a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f11352b = false;
            this.f11351a = false;
            this.f11353c = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum EnumC0155h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, m0.d dVar) {
        this.f11320d = eVar;
        this.f11321e = dVar;
    }

    private void A() {
        this.f11341y = Thread.currentThread();
        this.f11336t = m6.g.b();
        boolean zB = false;
        while (!this.G && this.E != null && !(zB = this.E.b())) {
            this.f11334r = k(this.f11334r);
            this.E = j();
            if (this.f11334r == EnumC0155h.SOURCE) {
                y(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f11334r == EnumC0155h.FINISHED || this.G) && !zB) {
            s();
        }
    }

    private t5.c B(Object obj, r5.a aVar, q qVar) {
        r5.g gVarL = l(aVar);
        com.bumptech.glide.load.data.e eVarL = this.f11324h.i().l(obj);
        try {
            return qVar.a(eVarL, gVarL, this.f11328l, this.f11329m, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void C() {
        int i10 = a.f11343a[this.f11335s.ordinal()];
        if (i10 == 1) {
            this.f11334r = k(EnumC0155h.INITIALIZE);
            this.E = j();
            A();
        } else if (i10 == 2) {
            A();
        } else {
            if (i10 == 3) {
                i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f11335s);
        }
    }

    private void D() {
        Throwable th2;
        this.f11319c.c();
        if (!this.F) {
            this.F = true;
            return;
        }
        if (this.f11318b.isEmpty()) {
            th2 = null;
        } else {
            List list = this.f11318b;
            th2 = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private t5.c g(com.bumptech.glide.load.data.d dVar, Object obj, r5.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = m6.g.b();
            t5.c cVarH = h(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                o("Decoded result " + cVarH, jB);
            }
            return cVarH;
        } finally {
            dVar.b();
        }
    }

    private t5.c h(Object obj, r5.a aVar) {
        return B(obj, aVar, this.f11317a.h(obj.getClass()));
    }

    private void i() {
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            p("Retrieved data", this.f11336t, "data: " + this.B + ", cache key: " + this.f11342z + ", fetcher: " + this.D);
        }
        t5.c cVarG = null;
        if (this.f11339w.b(com.bumptech.glide.d.e.class) && (supplier = this.f11340x) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f11340x.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e10) {
                this.f11340x = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e10);
                }
            }
        }
        try {
            cVarG = g(this.D, this.B, this.C);
        } catch (GlideException e11) {
            e11.k(this.A, this.C);
            this.f11318b.add(e11);
        }
        if (cVarG != null) {
            r(cVarG, this.C, this.H);
        } else {
            A();
        }
    }

    private com.bumptech.glide.load.engine.f j() {
        int i10 = a.f11344b[this.f11334r.ordinal()];
        if (i10 == 1) {
            return new s(this.f11317a, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f11317a, this);
        }
        if (i10 == 3) {
            return new v(this.f11317a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f11334r);
    }

    private EnumC0155h k(EnumC0155h enumC0155h) {
        int i10 = a.f11344b[enumC0155h.ordinal()];
        if (i10 == 1) {
            return this.f11330n.a() ? EnumC0155h.DATA_CACHE : k(EnumC0155h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f11337u ? EnumC0155h.FINISHED : EnumC0155h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0155h.FINISHED;
        }
        if (i10 == 5) {
            return this.f11330n.b() ? EnumC0155h.RESOURCE_CACHE : k(EnumC0155h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0155h);
    }

    private r5.g l(r5.a aVar) {
        r5.g gVar = this.f11331o;
        if (Build.VERSION.SDK_INT < 26) {
            return gVar;
        }
        boolean z10 = aVar == r5.a.RESOURCE_DISK_CACHE || this.f11317a.x();
        r5.f fVar = com.bumptech.glide.load.resource.bitmap.r.f11564j;
        Boolean bool = (Boolean) gVar.c(fVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return gVar;
        }
        r5.g gVar2 = new r5.g();
        gVar2.d(this.f11331o);
        gVar2.f(fVar, Boolean.valueOf(z10));
        return gVar2;
    }

    private int m() {
        return this.f11326j.ordinal();
    }

    private void o(String str, long j10) {
        p(str, j10, null);
    }

    private void p(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(m6.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f11327k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void q(t5.c cVar, r5.a aVar, boolean z10) {
        if (this.f11339w.b(com.bumptech.glide.d.e.class)) {
            z();
        }
        D();
        this.f11332p.b(cVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(t5.c cVar, r5.a aVar, boolean z10) {
        r rVar;
        n6.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cVar instanceof t5.b) {
                ((t5.b) cVar).initialize();
            }
            if (this.f11322f.c()) {
                cVar = r.e(cVar);
                rVar = cVar;
            } else {
                rVar = 0;
            }
            q(cVar, aVar, z10);
            this.f11334r = EnumC0155h.ENCODE;
            try {
                if (this.f11322f.c()) {
                    this.f11322f.b(this.f11320d, this.f11331o);
                }
                if (rVar != 0) {
                    rVar.g();
                }
                t();
                n6.b.e();
            } catch (Throwable th2) {
                if (rVar != 0) {
                    rVar.g();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            n6.b.e();
            throw th3;
        }
    }

    private void s() {
        if (this.f11339w.b(com.bumptech.glide.d.e.class)) {
            z();
        }
        D();
        this.f11332p.c(new GlideException("Failed to load resource", new ArrayList(this.f11318b)));
        u();
    }

    private void t() {
        if (this.f11323g.b()) {
            x();
        }
    }

    private void u() {
        if (this.f11323g.c()) {
            x();
        }
    }

    private void x() {
        this.f11323g.e();
        this.f11322f.a();
        this.f11317a.a();
        this.F = false;
        this.f11324h = null;
        this.f11325i = null;
        this.f11331o = null;
        this.f11326j = null;
        this.f11327k = null;
        this.f11332p = null;
        this.f11334r = null;
        this.E = null;
        this.f11341y = null;
        this.f11342z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.f11336t = 0L;
        this.G = false;
        this.f11338v = null;
        this.f11318b.clear();
        this.f11321e.a(this);
    }

    private void y(g gVar) {
        this.f11335s = gVar;
        this.f11332p.e(this);
    }

    private void z() {
        if (!this.f11339w.b(com.bumptech.glide.d.e.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f11340x;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e10) {
            this.f11340x = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e10);
            }
        }
    }

    boolean E() {
        EnumC0155h enumC0155hK = k(EnumC0155h.INITIALIZE);
        return enumC0155hK == EnumC0155h.RESOURCE_CACHE || enumC0155hK == EnumC0155h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(r5.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, r5.a aVar, r5.e eVar2) {
        this.f11342z = eVar;
        this.B = obj;
        this.D = dVar;
        this.C = aVar;
        this.A = eVar2;
        this.H = eVar != this.f11317a.c().get(0);
        if (Thread.currentThread() != this.f11341y) {
            y(g.DECODE_DATA);
            return;
        }
        n6.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            n6.b.e();
        }
    }

    public void b() {
        this.G = true;
        com.bumptech.glide.load.engine.f fVar = this.E;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(r5.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, r5.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.l(eVar, aVar, dVar.a());
        this.f11318b.add(glideException);
        if (Thread.currentThread() != this.f11341y) {
            y(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            A();
        }
    }

    @Override // n6.a.f
    public n6.c d() {
        return this.f11319c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e() {
        y(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int iM = m() - hVar.m();
        return iM == 0 ? this.f11333q - hVar.f11333q : iM;
    }

    h n(com.bumptech.glide.e eVar, Object obj, m mVar, r5.e eVar2, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, t5.a aVar, Map map, boolean z10, boolean z11, boolean z12, r5.g gVar, b bVar, int i12) {
        this.f11317a.v(eVar, obj, eVar2, i10, i11, aVar, cls, cls2, hVar, gVar, map, z10, z11, this.f11320d);
        this.f11324h = eVar;
        this.f11325i = eVar2;
        this.f11326j = hVar;
        this.f11327k = mVar;
        this.f11328l = i10;
        this.f11329m = i11;
        this.f11330n = aVar;
        this.f11337u = z12;
        this.f11331o = gVar;
        this.f11332p = bVar;
        this.f11333q = i12;
        this.f11335s = g.INITIALIZE;
        this.f11338v = obj;
        this.f11339w = eVar.g();
        this.f11340x = (Supplier) gVar.c(I);
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        n6.b.c("DecodeJob#run(reason=%s, model=%s)", this.f11335s, this.f11338v);
        com.bumptech.glide.load.data.d dVar = this.D;
        try {
            try {
                if (this.G) {
                    s();
                    if (dVar != null) {
                        dVar.b();
                    }
                    n6.b.e();
                    return;
                }
                C();
                if (dVar != null) {
                    dVar.b();
                }
                n6.b.e();
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                n6.b.e();
                throw th2;
            }
        } catch (com.bumptech.glide.load.engine.b e10) {
            throw e10;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.G + ", stage: " + this.f11334r, th3);
            }
            if (this.f11334r != EnumC0155h.ENCODE) {
                this.f11318b.add(th3);
                s();
            }
            if (!this.G) {
                throw th3;
            }
            throw th3;
        }
    }

    t5.c v(r5.a aVar, t5.c cVar) {
        t5.c cVarB;
        r5.k kVar;
        r5.c cVarB2;
        r5.e dVar;
        Class<?> cls = cVar.get().getClass();
        r5.j jVarN = null;
        if (aVar != r5.a.RESOURCE_DISK_CACHE) {
            r5.k kVarS = this.f11317a.s(cls);
            kVar = kVarS;
            cVarB = kVarS.b(this.f11324h, cVar, this.f11328l, this.f11329m);
        } else {
            cVarB = cVar;
            kVar = null;
        }
        if (!cVar.equals(cVarB)) {
            cVar.a();
        }
        if (this.f11317a.w(cVarB)) {
            jVarN = this.f11317a.n(cVarB);
            cVarB2 = jVarN.b(this.f11331o);
        } else {
            cVarB2 = r5.c.NONE;
        }
        r5.j jVar = jVarN;
        if (!this.f11330n.d(!this.f11317a.y(this.f11342z), aVar, cVarB2)) {
            return cVarB;
        }
        if (jVar == null) {
            throw new Registry.NoResultEncoderAvailableException(cVarB.get().getClass());
        }
        int i10 = a.f11345c[cVarB2.ordinal()];
        if (i10 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f11342z, this.f11325i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarB2);
            }
            dVar = new t(this.f11317a.b(), this.f11342z, this.f11325i, this.f11328l, this.f11329m, kVar, cls, this.f11331o);
        }
        r rVarE = r.e(cVarB);
        this.f11322f.d(dVar, jVar, rVarE);
        return rVarE;
    }

    void w(boolean z10) {
        if (this.f11323g.d(z10)) {
            x();
        }
    }
}
