package androidx.media3.exoplayer.source;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f5971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a.InterfaceC0055a f5972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l3.r.a f5973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r.a f5974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f5975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f5979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f5980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5981m;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o2.u f5982a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.datasource.a.InterfaceC0055a f5985d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private l3.r.a f5987f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e2.k f5988g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f5989h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f5983b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f5984c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5986e = true;

        public a(o2.u uVar, l3.r.a aVar) {
            this.f5982a = uVar;
            this.f5987f = aVar;
        }

        public static /* synthetic */ r.a c(a aVar, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
            aVar.getClass();
            return new c0.b(interfaceC0055a, aVar.f5982a);
        }

        private sc.x g(int i10) {
            sc.x xVar;
            sc.x xVar2;
            sc.x xVar3 = (sc.x) this.f5983b.get(Integer.valueOf(i10));
            if (xVar3 != null) {
                return xVar3;
            }
            final androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a = (androidx.media3.datasource.a.InterfaceC0055a) w1.a.e(this.f5985d);
            if (i10 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(r.a.class);
                xVar = new sc.x() { // from class: androidx.media3.exoplayer.source.d
                    @Override // sc.x
                    public final Object get() {
                        return i.m(clsAsSubclass, interfaceC0055a);
                    }
                };
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(r.a.class);
                        xVar = new sc.x() { // from class: androidx.media3.exoplayer.source.f
                            @Override // sc.x
                            public final Object get() {
                                return i.m(clsAsSubclass2, interfaceC0055a);
                            }
                        };
                    } else if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(r.a.class);
                        xVar2 = new sc.x() { // from class: androidx.media3.exoplayer.source.g
                            @Override // sc.x
                            public final Object get() {
                                return i.l(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        xVar2 = new sc.x() { // from class: androidx.media3.exoplayer.source.h
                            @Override // sc.x
                            public final Object get() {
                                return i.a.c(this.f5948a, interfaceC0055a);
                            }
                        };
                    }
                    this.f5983b.put(Integer.valueOf(i10), xVar2);
                    return xVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(r.a.class);
                xVar = new sc.x() { // from class: androidx.media3.exoplayer.source.e
                    @Override // sc.x
                    public final Object get() {
                        return i.m(clsAsSubclass4, interfaceC0055a);
                    }
                };
            }
            xVar2 = xVar;
            this.f5983b.put(Integer.valueOf(i10), xVar2);
            return xVar2;
        }

        public r.a f(int i10) {
            r.a aVar = (r.a) this.f5984c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            r.a aVar2 = (r.a) g(i10).get();
            e2.k kVar = this.f5988g;
            if (kVar != null) {
                aVar2.c(kVar);
            }
            androidx.media3.exoplayer.upstream.b bVar = this.f5989h;
            if (bVar != null) {
                aVar2.e(bVar);
            }
            aVar2.b(this.f5987f);
            aVar2.f(this.f5986e);
            this.f5984c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void h(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
            if (interfaceC0055a != this.f5985d) {
                this.f5985d = interfaceC0055a;
                this.f5983b.clear();
                this.f5984c.clear();
            }
        }

        public void i(e2.k kVar) {
            this.f5988g = kVar;
            Iterator it = this.f5984c.values().iterator();
            while (it.hasNext()) {
                ((r.a) it.next()).c(kVar);
            }
        }

        public void j(int i10) {
            o2.u uVar = this.f5982a;
            if (uVar instanceof o2.l) {
                ((o2.l) uVar).k(i10);
            }
        }

        public void k(androidx.media3.exoplayer.upstream.b bVar) {
            this.f5989h = bVar;
            Iterator it = this.f5984c.values().iterator();
            while (it.hasNext()) {
                ((r.a) it.next()).e(bVar);
            }
        }

        public void l(boolean z10) {
            this.f5986e = z10;
            this.f5982a.c(z10);
            Iterator it = this.f5984c.values().iterator();
            while (it.hasNext()) {
                ((r.a) it.next()).f(z10);
            }
        }

        public void m(l3.r.a aVar) {
            this.f5987f = aVar;
            this.f5982a.b(aVar);
            Iterator it = this.f5984c.values().iterator();
            while (it.hasNext()) {
                ((r.a) it.next()).b(aVar);
            }
        }
    }

    public i(Context context, o2.u uVar) {
        this(new androidx.media3.datasource.b.a(context), uVar);
    }

    public static /* synthetic */ o2.p[] a(i iVar, t1.o oVar) {
        return new o2.p[]{iVar.f5973e.a(oVar) ? new l3.n(iVar.f5973e.b(oVar), oVar) : new b(oVar)};
    }

    private static r j(t1.r rVar, r rVar2) {
        t1.r.d dVar = rVar.f52822f;
        if (dVar.f52847b == 0 && dVar.f52849d == Long.MIN_VALUE && !dVar.f52851f) {
            return rVar2;
        }
        t1.r.d dVar2 = rVar.f52822f;
        return new ClippingMediaSource(rVar2, dVar2.f52847b, dVar2.f52849d, !dVar2.f52852g, dVar2.f52850e, dVar2.f52851f);
    }

    private r k(t1.r rVar, r rVar2) {
        w1.a.e(rVar.f52818b);
        rVar.f52818b.getClass();
        return rVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a l(Class cls) {
        try {
            return (r.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a m(Class cls, androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
        try {
            return (r.a) cls.getConstructor(androidx.media3.datasource.a.InterfaceC0055a.class).newInstance(interfaceC0055a);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public r d(t1.r rVar) {
        w1.a.e(rVar.f52818b);
        String scheme = rVar.f52818b.f52910a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((r.a) w1.a.e(this.f5974f)).d(rVar);
        }
        if (Objects.equals(rVar.f52818b.f52911b, "application/x-image-uri")) {
            long jE0 = w1.c0.E0(rVar.f52818b.f52918i);
            android.support.v4.media.session.b.a(w1.a.e(null));
            return new l.b(jE0, null).d(rVar);
        }
        t1.r.h hVar = rVar.f52818b;
        int iQ0 = w1.c0.q0(hVar.f52910a, hVar.f52911b);
        if (rVar.f52818b.f52918i != C.TIME_UNSET) {
            this.f5971c.j(1);
        }
        try {
            r.a aVarF = this.f5971c.f(iQ0);
            t1.r.g.a aVarA = rVar.f52820d.a();
            if (rVar.f52820d.f52892a == C.TIME_UNSET) {
                aVarA.k(this.f5976h);
            }
            if (rVar.f52820d.f52895d == -3.4028235E38f) {
                aVarA.j(this.f5979k);
            }
            if (rVar.f52820d.f52896e == -3.4028235E38f) {
                aVarA.h(this.f5980l);
            }
            if (rVar.f52820d.f52893b == C.TIME_UNSET) {
                aVarA.i(this.f5977i);
            }
            if (rVar.f52820d.f52894c == C.TIME_UNSET) {
                aVarA.g(this.f5978j);
            }
            t1.r.g gVarF = aVarA.f();
            if (!gVarF.equals(rVar.f52820d)) {
                rVar = rVar.a().c(gVarF).a();
            }
            r rVarD = aVarF.d(rVar);
            com.google.common.collect.c0 c0Var = ((t1.r.h) w1.c0.h(rVar.f52818b)).f52915f;
            if (!c0Var.isEmpty()) {
                r[] rVarArr = new r[c0Var.size() + 1];
                rVarArr[0] = rVarD;
                for (int i10 = 0; i10 < c0Var.size(); i10++) {
                    if (this.f5981m) {
                        final t1.o oVarK = new t1.o.b().o0(((t1.r.k) c0Var.get(i10)).f52937b).e0(((t1.r.k) c0Var.get(i10)).f52938c).q0(((t1.r.k) c0Var.get(i10)).f52939d).m0(((t1.r.k) c0Var.get(i10)).f52940e).c0(((t1.r.k) c0Var.get(i10)).f52941f).a0(((t1.r.k) c0Var.get(i10)).f52942g).K();
                        c0.b bVar = new c0.b(this.f5972d, new o2.u() { // from class: i2.g
                            @Override // o2.u
                            public final o2.p[] createExtractors() {
                                return androidx.media3.exoplayer.source.i.a(this.f40758b, oVarK);
                            }
                        });
                        androidx.media3.exoplayer.upstream.b bVar2 = this.f5975g;
                        if (bVar2 != null) {
                            bVar.e(bVar2);
                        }
                        rVarArr[i10 + 1] = bVar.d(t1.r.b(((t1.r.k) c0Var.get(i10)).f52936a.toString()));
                    } else {
                        i0.b bVar3 = new i0.b(this.f5972d);
                        androidx.media3.exoplayer.upstream.b bVar4 = this.f5975g;
                        if (bVar4 != null) {
                            bVar3.b(bVar4);
                        }
                        rVarArr[i10 + 1] = bVar3.a((t1.r.k) c0Var.get(i10), C.TIME_UNSET);
                    }
                }
                rVarD = new MergingMediaSource(rVarArr);
            }
            return k(rVar, j(rVar, rVarD));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i f(boolean z10) {
        this.f5981m = z10;
        this.f5971c.l(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i c(e2.k kVar) {
        this.f5971c.i((e2.k) w1.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public i e(androidx.media3.exoplayer.upstream.b bVar) {
        this.f5975g = (androidx.media3.exoplayer.upstream.b) w1.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f5971c.k(bVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i b(l3.r.a aVar) {
        this.f5973e = (l3.r.a) w1.a.e(aVar);
        this.f5971c.m(aVar);
        return this;
    }

    public i(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a) {
        this(interfaceC0055a, new o2.l());
    }

    public i(androidx.media3.datasource.a.InterfaceC0055a interfaceC0055a, o2.u uVar) {
        this.f5972d = interfaceC0055a;
        l3.h hVar = new l3.h();
        this.f5973e = hVar;
        a aVar = new a(uVar, hVar);
        this.f5971c = aVar;
        aVar.h(interfaceC0055a);
        this.f5976h = C.TIME_UNSET;
        this.f5977i = C.TIME_UNSET;
        this.f5978j = C.TIME_UNSET;
        this.f5979k = -3.4028235E38f;
        this.f5980l = -3.4028235E38f;
        this.f5981m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements o2.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t1.o f5990a;

        public b(t1.o oVar) {
            this.f5990a = oVar;
        }

        @Override // o2.p
        public int b(o2.q qVar, o2.i0 i0Var) {
            return qVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // o2.p
        public void c(o2.r rVar) {
            o0 o0VarTrack = rVar.track(0, 3);
            rVar.d(new o2.j0.b(C.TIME_UNSET));
            rVar.endTracks();
            o0VarTrack.b(this.f5990a.a().o0("text/x-unknown").O(this.f5990a.f52757n).K());
        }

        @Override // o2.p
        public boolean d(o2.q qVar) {
            return true;
        }

        @Override // o2.p
        public void release() {
        }

        @Override // o2.p
        public void seek(long j10, long j11) {
        }
    }
}
