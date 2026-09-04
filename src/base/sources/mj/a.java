package mj;

import android.util.Log;
import fl.g0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46268e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f46275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f46276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f46278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f46279p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f46281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f46282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f46283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f46284u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46264a = "CommandsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tj.c f46265b = new tj.c(null, null, 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46269f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46270g = 1935;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f46271h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f46272i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46273j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f46274k = "FMLE/3.0 (compatible; Lavf57.56.101)";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f46280q = 128;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46285v = 640;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f46286w = 480;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f46287x = 30;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f46288y = 44100;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f46289z = true;
    private ji.m A = ji.m.H264;
    private ji.a B = ji.a.AAC;
    private final nm.a C = nm.g.a(false);

    /* JADX INFO: renamed from: mj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0713a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46290r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46291s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46292t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46293u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46295w;

        C0713a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46293u = obj;
            this.f46295w |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46296r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46297s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46298t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46299u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46301w;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46299u = obj;
            this.f46301w |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46302r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46303s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46304t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f46305u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f46306v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f46308x;

        c(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46306v = obj;
            this.f46308x |= Integer.MIN_VALUE;
            return a.this.C(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46309r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46310s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46311t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46312u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46314w;

        d(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46312u = obj;
            this.f46314w |= Integer.MIN_VALUE;
            return a.this.D(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46315r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46316s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46317t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46318u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46320w;

        e(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46318u = obj;
            this.f46320w |= Integer.MIN_VALUE;
            return a.this.E(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46321r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46322s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46323t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f46324u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f46325v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f46327x;

        f(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46325v = obj;
            this.f46327x |= Integer.MIN_VALUE;
            return a.this.G(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46328r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46329s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46330t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46331u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46333w;

        g(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46331u = obj;
            this.f46333w |= Integer.MIN_VALUE;
            return a.this.I(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46334r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46335s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46336t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f46337u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f46338v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f46340x;

        h(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46338v = obj;
            this.f46340x |= Integer.MIN_VALUE;
            return a.this.K(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46341r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46342s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46343t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46344u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46346w;

        i(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46344u = obj;
            this.f46346w |= Integer.MIN_VALUE;
            return a.this.L(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46347r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46348s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46349t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f46350u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f46351v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f46353x;

        j(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46351v = obj;
            this.f46353x |= Integer.MIN_VALUE;
            return a.this.N(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46354r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f46355s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46356t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f46357u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f46359w;

        k(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46357u = obj;
            this.f46359w |= Integer.MIN_VALUE;
            return a.this.O(null, this);
        }
    }

    public final oj.i A(uj.a socket) throws IOException {
        kotlin.jvm.internal.s.h(socket, "socket");
        oj.i iVarC = oj.i.f48961b.c(socket.e(), this.f46280q, this.f46265b);
        this.f46265b.e(iVarC.b());
        Log.i(this.f46264a, "read " + iVarC);
        this.f46283t = this.f46283t + iVarC.b().e();
        return iVarC;
    }

    public final void B() {
        this.f46279p = 0L;
        this.f46266c = 0;
        this.f46268e = 0;
        this.f46267d = 0;
        this.f46280q = 128;
        this.f46265b.c();
        this.f46284u = 0;
        this.f46283t = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(fj.b bVar, uj.a aVar, kl.f fVar) {
        c cVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f46308x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f46308x = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object obj = cVar.f46306v;
        Object objF = ll.b.f();
        int i11 = cVar.f46308x;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            cVar.f46302r = this;
            cVar.f46303s = bVar;
            cVar.f46304t = aVar;
            cVar.f46305u = aVar2;
            cVar.f46308x = 1;
            if (aVar2.e(null, cVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) cVar.f46305u;
            aVar = (uj.a) cVar.f46304t;
            fj.b bVar2 = (fj.b) cVar.f46303s;
            aVar3 = (a) cVar.f46302r;
            fl.s.b(obj);
            aVar2 = aVar4;
            bVar = bVar2;
        }
        try {
            OutputStream outputStreamF = aVar.f();
            if (aVar3.f46278o) {
                long j10 = 1000;
                bVar.e(((ji.k.b() / j10) - aVar3.f46279p) / j10);
            }
            oj.d dVar = new oj.d(bVar, aVar3.f46268e);
            dVar.j(outputStreamF);
            dVar.i(outputStreamF);
            aVar.c(true);
            return kotlin.coroutines.jvm.internal.b.d(dVar.b().e());
        } finally {
            aVar2.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(uj.a aVar, kl.f fVar) {
        d dVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f46314w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f46314w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object obj = dVar.f46312u;
        Object objF = ll.b.f();
        int i11 = dVar.f46314w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            dVar.f46309r = this;
            dVar.f46310s = aVar;
            dVar.f46311t = aVar2;
            dVar.f46314w = 1;
            if (aVar2.e(null, dVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) dVar.f46311t;
            uj.a aVar5 = (uj.a) dVar.f46310s;
            aVar3 = (a) dVar.f46309r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            OutputStream outputStreamF = aVar.f();
            tj.d dVar2 = tj.d.f53435a;
            if (dVar2.b() != 128) {
                oj.j jVar = new oj.j(dVar2.b());
                jVar.b().k(aVar3.h());
                jVar.b().i(aVar3.f46268e);
                jVar.j(outputStreamF);
                jVar.i(outputStreamF);
                uj.a.d(aVar, false, 1, null);
                Log.i(aVar3.f46264a, "send " + jVar);
            } else {
                Log.i(aVar3.f46264a, "using default write chunk size 128");
            }
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(uj.a aVar, kl.f fVar) {
        e eVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f46320w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f46320w = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar);
            }
        } else {
            eVar = new e(fVar);
        }
        Object obj = eVar.f46318u;
        Object objF = ll.b.f();
        int i11 = eVar.f46320w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            eVar.f46315r = this;
            eVar.f46316s = aVar;
            eVar.f46317t = aVar2;
            eVar.f46320w = 1;
            if (aVar2.e(null, eVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) eVar.f46317t;
            uj.a aVar5 = (uj.a) eVar.f46316s;
            aVar3 = (a) eVar.f46315r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            aVar3.F(aVar.f());
            uj.a.d(aVar, false, 1, null);
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public abstract void F(OutputStream outputStream);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(String str, uj.a aVar, kl.f fVar) {
        f fVar2;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.f46327x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f46327x = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(fVar);
            }
        } else {
            fVar2 = new f(fVar);
        }
        Object obj = fVar2.f46325v;
        Object objF = ll.b.f();
        int i11 = fVar2.f46327x;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            fVar2.f46321r = this;
            fVar2.f46322s = str;
            fVar2.f46323t = aVar;
            fVar2.f46324u = aVar2;
            fVar2.f46327x = 1;
            if (aVar2.e(null, fVar2) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) fVar2.f46324u;
            aVar = (uj.a) fVar2.f46323t;
            String str2 = (String) fVar2.f46322s;
            aVar3 = (a) fVar2.f46321r;
            fl.s.b(obj);
            aVar2 = aVar4;
            str = str2;
        }
        try {
            aVar3.H(str, aVar.f());
            uj.a.d(aVar, false, 1, null);
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public abstract void H(String str, OutputStream outputStream);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(uj.a aVar, kl.f fVar) {
        g gVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof g) {
            gVar = (g) fVar;
            int i10 = gVar.f46333w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f46333w = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(fVar);
            }
        } else {
            gVar = new g(fVar);
        }
        Object obj = gVar.f46331u;
        Object objF = ll.b.f();
        int i11 = gVar.f46333w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            gVar.f46328r = this;
            gVar.f46329s = aVar;
            gVar.f46330t = aVar2;
            gVar.f46333w = 1;
            if (aVar2.e(null, gVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) gVar.f46330t;
            uj.a aVar5 = (uj.a) gVar.f46329s;
            aVar3 = (a) gVar.f46328r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            aVar3.J(aVar.f());
            uj.a.d(aVar, false, 1, null);
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public abstract void J(OutputStream outputStream);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K(qj.a aVar, uj.a aVar2, kl.f fVar) {
        h hVar;
        nm.a aVar3;
        a aVar4;
        if (fVar instanceof h) {
            hVar = (h) fVar;
            int i10 = hVar.f46340x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f46340x = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(fVar);
            }
        } else {
            hVar = new h(fVar);
        }
        Object obj = hVar.f46338v;
        Object objF = ll.b.f();
        int i11 = hVar.f46340x;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar3 = this.C;
            hVar.f46334r = this;
            hVar.f46335s = aVar;
            hVar.f46336t = aVar2;
            hVar.f46337u = aVar3;
            hVar.f46340x = 1;
            if (aVar3.e(null, hVar) == objF) {
                return objF;
            }
            aVar4 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar5 = (nm.a) hVar.f46337u;
            aVar2 = (uj.a) hVar.f46336t;
            qj.a aVar6 = (qj.a) hVar.f46335s;
            aVar4 = (a) hVar.f46334r;
            fl.s.b(obj);
            aVar3 = aVar5;
            aVar = aVar6;
        }
        try {
            OutputStream outputStreamF = aVar2.f();
            qj.c cVar = new qj.c(qj.b.PONG_REPLY, aVar);
            cVar.j(outputStreamF);
            cVar.i(outputStreamF);
            uj.a.d(aVar2, false, 1, null);
            Log.i(aVar4.f46264a, "send pong");
            return g0.f38750a;
        } finally {
            aVar3.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(uj.a aVar, kl.f fVar) {
        i iVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof i) {
            iVar = (i) fVar;
            int i10 = iVar.f46346w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f46346w = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(fVar);
            }
        } else {
            iVar = new i(fVar);
        }
        Object obj = iVar.f46344u;
        Object objF = ll.b.f();
        int i11 = iVar.f46346w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            iVar.f46341r = this;
            iVar.f46342s = aVar;
            iVar.f46343t = aVar2;
            iVar.f46346w = 1;
            if (aVar2.e(null, iVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) iVar.f46343t;
            uj.a aVar5 = (uj.a) iVar.f46342s;
            aVar3 = (a) iVar.f46341r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            aVar3.M(aVar.f());
            uj.a.d(aVar, false, 1, null);
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public abstract void M(OutputStream outputStream);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(fj.b bVar, uj.a aVar, kl.f fVar) {
        j jVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof j) {
            jVar = (j) fVar;
            int i10 = jVar.f46353x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f46353x = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(fVar);
            }
        } else {
            jVar = new j(fVar);
        }
        Object obj = jVar.f46351v;
        Object objF = ll.b.f();
        int i11 = jVar.f46353x;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            jVar.f46347r = this;
            jVar.f46348s = bVar;
            jVar.f46349t = aVar;
            jVar.f46350u = aVar2;
            jVar.f46353x = 1;
            if (aVar2.e(null, jVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) jVar.f46350u;
            aVar = (uj.a) jVar.f46349t;
            fj.b bVar2 = (fj.b) jVar.f46348s;
            aVar3 = (a) jVar.f46347r;
            fl.s.b(obj);
            aVar2 = aVar4;
            bVar = bVar2;
        }
        try {
            OutputStream outputStreamF = aVar.f();
            if (aVar3.f46278o) {
                long j10 = 1000;
                bVar.e(((ji.k.b() / j10) - aVar3.f46279p) / j10);
            }
            oj.l lVar = new oj.l(bVar, aVar3.f46268e);
            lVar.j(outputStreamF);
            lVar.i(outputStreamF);
            aVar.c(true);
            return kotlin.coroutines.jvm.internal.b.d(lVar.b().e());
        } finally {
            aVar2.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(uj.a aVar, kl.f fVar) {
        k kVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof k) {
            kVar = (k) fVar;
            int i10 = kVar.f46359w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f46359w = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(fVar);
            }
        } else {
            kVar = new k(fVar);
        }
        Object obj = kVar.f46357u;
        Object objF = ll.b.f();
        int i11 = kVar.f46359w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            kVar.f46354r = this;
            kVar.f46355s = aVar;
            kVar.f46356t = aVar2;
            kVar.f46359w = 1;
            if (aVar2.e(null, kVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) kVar.f46356t;
            uj.a aVar5 = (uj.a) kVar.f46355s;
            aVar3 = (a) kVar.f46354r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            OutputStream outputStreamF = aVar.f();
            oj.m mVar = new oj.m(tj.d.f53435a.a(), aVar3.h());
            mVar.j(outputStreamF);
            mVar.i(outputStreamF);
            uj.a.d(aVar, false, 1, null);
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public final void P(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.f46271h = str;
    }

    public final void Q(int i10, boolean z10) {
        this.f46288y = i10;
        this.f46289z = z10;
    }

    public final void R(String str, String str2) {
        this.f46275l = str;
        this.f46276m = str2;
    }

    protected final void S(int i10) {
        this.f46267d = i10;
    }

    public final void T(int i10) {
        this.f46287x = i10;
    }

    public final void U(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.f46269f = str;
    }

    public final void V(boolean z10) {
        this.f46277n = z10;
    }

    public final void W(int i10) {
        this.f46270g = i10;
    }

    public final void X(int i10) {
        this.f46280q = i10;
    }

    public final void Y(long j10) {
        this.f46279p = j10;
    }

    public final void Z(int i10) {
        this.f46268e = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(uj.a aVar, kl.f fVar) {
        C0713a c0713a;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof C0713a) {
            c0713a = (C0713a) fVar;
            int i10 = c0713a.f46295w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0713a.f46295w = i10 - Integer.MIN_VALUE;
            } else {
                c0713a = new C0713a(fVar);
            }
        } else {
            c0713a = new C0713a(fVar);
        }
        Object obj = c0713a.f46293u;
        Object objF = ll.b.f();
        int i11 = c0713a.f46295w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            c0713a.f46290r = this;
            c0713a.f46291s = aVar;
            c0713a.f46292t = aVar2;
            c0713a.f46295w = 1;
            if (aVar2.e(null, c0713a) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) c0713a.f46292t;
            uj.a aVar5 = (uj.a) c0713a.f46291s;
            aVar3 = (a) c0713a.f46290r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            int i12 = aVar3.f46283t;
            tj.d dVar = tj.d.f53435a;
            if (i12 >= dVar.a()) {
                int i13 = aVar3.f46284u;
                int i14 = aVar3.f46283t;
                aVar3.f46284u = i13 + i14;
                aVar3.f46283t = i14 - dVar.a();
                OutputStream outputStreamF = aVar.f();
                oj.b bVar = new oj.b(aVar3.f46284u);
                bVar.j(outputStreamF);
                bVar.i(outputStreamF);
                outputStreamF.flush();
                Log.i(aVar3.f46264a, "send " + bVar);
            }
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public final void a0(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.f46272i = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(uj.a aVar, kl.f fVar) {
        b bVar;
        nm.a aVar2;
        a aVar3;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f46301w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f46301w = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f46299u;
        Object objF = ll.b.f();
        int i11 = bVar.f46301w;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar2 = this.C;
            bVar.f46296r = this;
            bVar.f46297s = aVar;
            bVar.f46298t = aVar2;
            bVar.f46301w = 1;
            if (aVar2.e(null, bVar) == objF) {
                return objF;
            }
            aVar3 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar4 = (nm.a) bVar.f46298t;
            uj.a aVar5 = (uj.a) bVar.f46297s;
            aVar3 = (a) bVar.f46296r;
            fl.s.b(obj);
            aVar2 = aVar4;
            aVar = aVar5;
        }
        try {
            aVar3.c(aVar.f());
            uj.a.d(aVar, false, 1, null);
            g0 g0Var = g0.f38750a;
            return g0.f38750a;
        } finally {
            aVar2.f(null);
        }
    }

    public final void b0(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.f46273j = str;
    }

    public abstract void c(OutputStream outputStream);

    public final void c0(int i10) {
        this.f46266c = i10;
    }

    public final String d() {
        return this.f46271h;
    }

    public final void d0(int i10, int i11) {
        this.f46285v = i10;
        this.f46286w = i11;
    }

    public final ji.a e() {
        return this.B;
    }

    public final boolean f() {
        return this.f46281r;
    }

    protected final int g() {
        return this.f46267d;
    }

    protected final int h() {
        return (int) ((ji.k.a() / ((long) 1000)) - ((long) this.f46266c));
    }

    public final String i() {
        return this.f46274k;
    }

    public final int j() {
        return this.f46287x;
    }

    protected final int k() {
        return this.f46286w;
    }

    public final String l() {
        return this.f46269f;
    }

    public final boolean m() {
        return this.f46277n;
    }

    public final String n() {
        return this.f46276m;
    }

    public final int o() {
        return this.f46270g;
    }

    protected final int p() {
        return this.f46288y;
    }

    public final tj.c q() {
        return this.f46265b;
    }

    public final int r() {
        return this.f46268e;
    }

    public final String s() {
        return this.f46272i;
    }

    protected final String t() {
        return this.f46264a;
    }

    public final String u() {
        return this.f46273j;
    }

    public final String v() {
        return this.f46275l;
    }

    public final ji.m w() {
        return this.A;
    }

    public final boolean x() {
        return this.f46282s;
    }

    protected final int y() {
        return this.f46285v;
    }

    protected final boolean z() {
        return this.f46289z;
    }
}
