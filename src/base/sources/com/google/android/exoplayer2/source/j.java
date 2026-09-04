package com.google.android.exoplayer2.source;

import android.content.Context;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nb.j.a f17830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f17831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.c f17832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f17835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f17836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f17837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17838l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u9.p f17839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f17840b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f17841c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f17842d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private nb.j.a f17843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t9.k f17844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.c f17845g;

        public a(u9.p pVar) {
            this.f17839a = pVar;
        }

        public static /* synthetic */ p.a d(a aVar, nb.j.a aVar2) {
            aVar.getClass();
            return new z.b(aVar2, aVar.f17839a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        private sc.x g(int i10) {
            sc.x xVar;
            sc.x xVar2;
            if (this.f17840b.containsKey(Integer.valueOf(i10))) {
                return (sc.x) this.f17840b.get(Integer.valueOf(i10));
            }
            final nb.j.a aVar = (nb.j.a) ob.a.e(this.f17843e);
            sc.x xVar3 = null;
            try {
                if (i10 == 0) {
                    final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(p.a.class);
                    xVar = new sc.x() { // from class: com.google.android.exoplayer2.source.e
                        @Override // sc.x
                        public final Object get() {
                            return j.j(clsAsSubclass, aVar);
                        }
                    };
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                final Class clsAsSubclass2 = RtspMediaSource.Factory.class.asSubclass(p.a.class);
                                xVar2 = new sc.x() { // from class: com.google.android.exoplayer2.source.h
                                    @Override // sc.x
                                    public final Object get() {
                                        return j.i(clsAsSubclass2);
                                    }
                                };
                            } else if (i10 == 4) {
                                xVar2 = new sc.x() { // from class: com.google.android.exoplayer2.source.i
                                    @Override // sc.x
                                    public final Object get() {
                                        return j.a.d(this.f17825a, aVar);
                                    }
                                };
                            }
                            xVar3 = xVar2;
                        } else {
                            final Class clsAsSubclass3 = HlsMediaSource.Factory.class.asSubclass(p.a.class);
                            xVar = new sc.x() { // from class: com.google.android.exoplayer2.source.g
                                @Override // sc.x
                                public final Object get() {
                                    return j.j(clsAsSubclass3, aVar);
                                }
                            };
                        }
                        this.f17840b.put(Integer.valueOf(i10), xVar3);
                        if (xVar3 != null) {
                            this.f17841c.add(Integer.valueOf(i10));
                        }
                        return xVar3;
                    }
                    final Class clsAsSubclass4 = SsMediaSource.Factory.class.asSubclass(p.a.class);
                    xVar = new sc.x() { // from class: com.google.android.exoplayer2.source.f
                        @Override // sc.x
                        public final Object get() {
                            return j.j(clsAsSubclass4, aVar);
                        }
                    };
                }
                xVar3 = xVar;
            } catch (ClassNotFoundException unused) {
            }
            this.f17840b.put(Integer.valueOf(i10), xVar3);
            if (xVar3 != null) {
                this.f17841c.add(Integer.valueOf(i10));
            }
            return xVar3;
        }

        public p.a f(int i10) {
            p.a aVar = (p.a) this.f17842d.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            sc.x xVarG = g(i10);
            if (xVarG == null) {
                return null;
            }
            p.a aVar2 = (p.a) xVarG.get();
            t9.k kVar = this.f17844f;
            if (kVar != null) {
                aVar2.c(kVar);
            }
            com.google.android.exoplayer2.upstream.c cVar = this.f17845g;
            if (cVar != null) {
                aVar2.b(cVar);
            }
            this.f17842d.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void h(nb.j.a aVar) {
            if (aVar != this.f17843e) {
                this.f17843e = aVar;
                this.f17840b.clear();
                this.f17842d.clear();
            }
        }

        public void i(t9.k kVar) {
            this.f17844f = kVar;
            Iterator it = this.f17842d.values().iterator();
            while (it.hasNext()) {
                ((p.a) it.next()).c(kVar);
            }
        }

        public void j(com.google.android.exoplayer2.upstream.c cVar) {
            this.f17845g = cVar;
            Iterator it = this.f17842d.values().iterator();
            while (it.hasNext()) {
                ((p.a) it.next()).b(cVar);
            }
        }
    }

    public j(Context context, u9.p pVar) {
        this(new nb.p.a(context), pVar);
    }

    public static /* synthetic */ u9.k[] d(v0 v0Var) {
        bb.k kVar = bb.k.f8791a;
        return new u9.k[]{kVar.a(v0Var) ? new bb.l(kVar.b(v0Var), v0Var) : new b(v0Var)};
    }

    private static p g(y0 y0Var, p pVar) {
        y0.d dVar = y0Var.f18986f;
        if (dVar.f19015a == 0 && dVar.f19016b == Long.MIN_VALUE && !dVar.f19018d) {
            return pVar;
        }
        long jH0 = r0.H0(y0Var.f18986f.f19015a);
        long jH1 = r0.H0(y0Var.f18986f.f19016b);
        y0.d dVar2 = y0Var.f18986f;
        return new ClippingMediaSource(pVar, jH0, jH1, !dVar2.f19019e, dVar2.f19017c, dVar2.f19018d);
    }

    private p h(y0 y0Var, p pVar) {
        ob.a.e(y0Var.f18982b);
        if (y0Var.f18982b.f19082d == null) {
            return pVar;
        }
        ob.u.i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p.a i(Class cls) {
        try {
            return (p.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p.a j(Class cls, nb.j.a aVar) {
        try {
            return (p.a) cls.getConstructor(nb.j.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.p.a
    public p a(y0 y0Var) {
        ob.a.e(y0Var.f18982b);
        String scheme = y0Var.f18982b.f19079a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((p.a) ob.a.e(this.f17831e)).a(y0Var);
        }
        y0.h hVar = y0Var.f18982b;
        int iW0 = r0.w0(hVar.f19079a, hVar.f19080b);
        p.a aVarF = this.f17829c.f(iW0);
        ob.a.j(aVarF, "No suitable media source factory found for content type: " + iW0);
        y0.g.a aVarB = y0Var.f18984d.b();
        if (y0Var.f18984d.f19061a == C.TIME_UNSET) {
            aVarB.k(this.f17833g);
        }
        if (y0Var.f18984d.f19064d == -3.4028235E38f) {
            aVarB.j(this.f17836j);
        }
        if (y0Var.f18984d.f19065e == -3.4028235E38f) {
            aVarB.h(this.f17837k);
        }
        if (y0Var.f18984d.f19062b == C.TIME_UNSET) {
            aVarB.i(this.f17834h);
        }
        if (y0Var.f18984d.f19063c == C.TIME_UNSET) {
            aVarB.g(this.f17835i);
        }
        y0.g gVarF = aVarB.f();
        if (!gVarF.equals(y0Var.f18984d)) {
            y0Var = y0Var.b().c(gVarF).a();
        }
        p pVarA = aVarF.a(y0Var);
        com.google.common.collect.c0 c0Var = ((y0.h) r0.j(y0Var.f18982b)).f19085g;
        if (!c0Var.isEmpty()) {
            p[] pVarArr = new p[c0Var.size() + 1];
            pVarArr[0] = pVarA;
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                if (this.f17838l) {
                    final v0 v0VarG = new v0.b().g0(((y0.k) c0Var.get(i10)).f19108b).X(((y0.k) c0Var.get(i10)).f19109c).i0(((y0.k) c0Var.get(i10)).f19110d).e0(((y0.k) c0Var.get(i10)).f19111e).W(((y0.k) c0Var.get(i10)).f19112f).U(((y0.k) c0Var.get(i10)).f19113g).G();
                    z.b bVar = new z.b(this.f17830d, new u9.p() { // from class: ra.g
                        @Override // u9.p
                        public final u9.k[] createExtractors() {
                            return com.google.android.exoplayer2.source.j.d(v0VarG);
                        }
                    });
                    com.google.android.exoplayer2.upstream.c cVar = this.f17832f;
                    if (cVar != null) {
                        bVar.b(cVar);
                    }
                    pVarArr[i10 + 1] = bVar.a(y0.e(((y0.k) c0Var.get(i10)).f19107a.toString()));
                } else {
                    g0.b bVar2 = new g0.b(this.f17830d);
                    com.google.android.exoplayer2.upstream.c cVar2 = this.f17832f;
                    if (cVar2 != null) {
                        bVar2.b(cVar2);
                    }
                    pVarArr[i10 + 1] = bVar2.a((y0.k) c0Var.get(i10), C.TIME_UNSET);
                }
            }
            pVarA = new MergingMediaSource(pVarArr);
        }
        return h(y0Var, g(y0Var, pVarA));
    }

    @Override // com.google.android.exoplayer2.source.p.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public j c(t9.k kVar) {
        this.f17829c.i((t9.k) ob.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.p.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public j b(com.google.android.exoplayer2.upstream.c cVar) {
        this.f17832f = (com.google.android.exoplayer2.upstream.c) ob.a.f(cVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f17829c.j(cVar);
        return this;
    }

    public j(nb.j.a aVar, u9.p pVar) {
        this.f17830d = aVar;
        a aVar2 = new a(pVar);
        this.f17829c = aVar2;
        aVar2.h(aVar);
        this.f17833g = C.TIME_UNSET;
        this.f17834h = C.TIME_UNSET;
        this.f17835i = C.TIME_UNSET;
        this.f17836j = -3.4028235E38f;
        this.f17837k = -3.4028235E38f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements u9.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v0 f17846a;

        public b(v0 v0Var) {
            this.f17846a = v0Var;
        }

        @Override // u9.k
        public void b(u9.m mVar) {
            u9.b0 b0VarTrack = mVar.track(0, 3);
            mVar.c(new u9.z.b(C.TIME_UNSET));
            mVar.endTracks();
            b0VarTrack.e(this.f17846a.b().g0("text/x-unknown").K(this.f17846a.f18868l).G());
        }

        @Override // u9.k
        public int c(u9.l lVar, u9.y yVar) {
            return lVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // u9.k
        public boolean d(u9.l lVar) {
            return true;
        }

        @Override // u9.k
        public void release() {
        }

        @Override // u9.k
        public void seek(long j10, long j11) {
        }
    }
}
