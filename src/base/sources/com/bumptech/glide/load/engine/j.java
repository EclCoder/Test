package com.bumptech.glide.load.engine;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements l, v5.h.a, o.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f11370i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f11372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.h f11373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f11374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f11375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f11376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f11377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f11378h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h.e f11379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final m0.d f11380b = n6.a.d(150, new C0156a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11381c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0156a implements n6.a.d {
            C0156a() {
            }

            @Override // n6.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h a() {
                a aVar = a.this;
                return new h(aVar.f11379a, aVar.f11380b);
            }
        }

        a(h.e eVar) {
            this.f11379a = eVar;
        }

        h a(com.bumptech.glide.e eVar, Object obj, m mVar, r5.e eVar2, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, t5.a aVar, Map map, boolean z10, boolean z11, boolean z12, r5.g gVar, h.b bVar) {
            h hVar2 = (h) m6.k.e((h) this.f11380b.b());
            int i12 = this.f11381c;
            this.f11381c = i12 + 1;
            return hVar2.n(eVar, obj, mVar, eVar2, i10, i11, cls, cls2, hVar, aVar, map, z10, z11, z12, gVar, bVar, i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w5.a f11383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final w5.a f11384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final w5.a f11385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final w5.a f11386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final l f11387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final o.a f11388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final m0.d f11389g = n6.a.d(150, new a());

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements n6.a.d {
            a() {
            }

            @Override // n6.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k a() {
                b bVar = b.this;
                return new k(bVar.f11383a, bVar.f11384b, bVar.f11385c, bVar.f11386d, bVar.f11387e, bVar.f11388f, bVar.f11389g);
            }
        }

        b(w5.a aVar, w5.a aVar2, w5.a aVar3, w5.a aVar4, l lVar, o.a aVar5) {
            this.f11383a = aVar;
            this.f11384b = aVar2;
            this.f11385c = aVar3;
            this.f11386d = aVar4;
            this.f11387e = lVar;
            this.f11388f = aVar5;
        }

        k a(r5.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((k) m6.k.e((k) this.f11389g.b())).l(eVar, z10, z11, z12, z13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v5.a.InterfaceC0829a f11391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile v5.a f11392b;

        c(v5.a.InterfaceC0829a interfaceC0829a) {
            this.f11391a = interfaceC0829a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public v5.a a() {
            if (this.f11392b == null) {
                synchronized (this) {
                    try {
                        if (this.f11392b == null) {
                            this.f11392b = this.f11391a.build();
                        }
                        if (this.f11392b == null) {
                            this.f11392b = new v5.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f11392b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f11393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i6.g f11394b;

        d(i6.g gVar, k kVar) {
            this.f11394b = gVar;
            this.f11393a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f11393a.r(this.f11394b);
            }
        }
    }

    public j(v5.h hVar, v5.a.InterfaceC0829a interfaceC0829a, w5.a aVar, w5.a aVar2, w5.a aVar3, w5.a aVar4, boolean z10) {
        this(hVar, interfaceC0829a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private o e(r5.e eVar) {
        t5.c cVarF = this.f11373c.f(eVar);
        if (cVarF == null) {
            return null;
        }
        return cVarF instanceof o ? (o) cVarF : new o(cVarF, true, true, eVar, this);
    }

    private o g(r5.e eVar) {
        o oVarE = this.f11378h.e(eVar);
        if (oVarE != null) {
            oVarE.c();
        }
        return oVarE;
    }

    private o h(r5.e eVar) {
        o oVarE = e(eVar);
        if (oVarE != null) {
            oVarE.c();
            this.f11378h.a(eVar, oVarE);
        }
        return oVarE;
    }

    private o i(m mVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        o oVarG = g(mVar);
        if (oVarG != null) {
            if (f11370i) {
                j("Loaded resource from active resources", j10, mVar);
            }
            return oVarG;
        }
        o oVarH = h(mVar);
        if (oVarH == null) {
            return null;
        }
        if (f11370i) {
            j("Loaded resource from cache", j10, mVar);
        }
        return oVarH;
    }

    private static void j(String str, long j10, r5.e eVar) {
        Log.v("Engine", str + " in " + m6.g.a(j10) + "ms, key: " + eVar);
    }

    private d l(com.bumptech.glide.e eVar, Object obj, r5.e eVar2, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, t5.a aVar, Map map, boolean z10, boolean z11, r5.g gVar, boolean z12, boolean z13, boolean z14, boolean z15, i6.g gVar2, Executor executor, m mVar, long j10) {
        k kVarA = this.f11371a.a(mVar, z15);
        if (kVarA != null) {
            kVarA.a(gVar2, executor);
            if (f11370i) {
                j("Added to existing load", j10, mVar);
            }
            return new d(gVar2, kVarA);
        }
        k kVarA2 = this.f11374d.a(mVar, z12, z13, z14, z15);
        h hVarA = this.f11377g.a(eVar, obj, mVar, eVar2, i10, i11, cls, cls2, hVar, aVar, map, z10, z11, z15, gVar, kVarA2);
        this.f11371a.c(mVar, kVarA2);
        kVarA2.a(gVar2, executor);
        kVarA2.s(hVarA);
        if (f11370i) {
            j("Started new load", j10, mVar);
        }
        return new d(gVar2, kVarA2);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void a(k kVar, r5.e eVar, o oVar) {
        if (oVar != null) {
            try {
                if (oVar.e()) {
                    this.f11378h.a(eVar, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11371a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void b(r5.e eVar, o oVar) {
        this.f11378h.d(eVar);
        if (oVar.e()) {
            this.f11373c.e(eVar, oVar);
        } else {
            this.f11375e.a(oVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void c(k kVar, r5.e eVar) {
        this.f11371a.d(eVar, kVar);
    }

    @Override // v5.h.a
    public void d(t5.c cVar) {
        this.f11375e.a(cVar, true);
    }

    public d f(com.bumptech.glide.e eVar, Object obj, r5.e eVar2, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, t5.a aVar, Map map, boolean z10, boolean z11, r5.g gVar, boolean z12, boolean z13, boolean z14, boolean z15, i6.g gVar2, Executor executor) {
        long jB = f11370i ? m6.g.b() : 0L;
        m mVarA = this.f11372b.a(obj, eVar2, i10, i11, map, cls, cls2, gVar);
        synchronized (this) {
            try {
                o oVarI = i(mVarA, z12, jB);
                if (oVarI == null) {
                    return l(eVar, obj, eVar2, i10, i11, cls, cls2, hVar, aVar, map, z10, z11, gVar, z12, z13, z14, z15, gVar2, executor, mVarA, jB);
                }
                gVar2.b(oVarI, r5.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(t5.c cVar) {
        if (!(cVar instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) cVar).f();
    }

    j(v5.h hVar, v5.a.InterfaceC0829a interfaceC0829a, w5.a aVar, w5.a aVar2, w5.a aVar3, w5.a aVar4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, u uVar, boolean z10) {
        this.f11373c = hVar;
        c cVar = new c(interfaceC0829a);
        this.f11376f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z10) : aVar5;
        this.f11378h = aVar7;
        aVar7.f(this);
        this.f11372b = nVar == null ? new n() : nVar;
        this.f11371a = pVar == null ? new p() : pVar;
        this.f11374d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f11377g = aVar6 == null ? new a(cVar) : aVar6;
        this.f11375e = uVar == null ? new u() : uVar;
        hVar.d(this);
    }
}
