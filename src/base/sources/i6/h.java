package i6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import m6.l;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements c, j6.h, g {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n6.c f41129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f41130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f41131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f41132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f41133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.e f41134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f41135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class f41136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i6.a f41137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f41138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f41139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.h f41140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j6.i f41141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f41142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k6.c f41143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Executor f41144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t5.c f41145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j.d f41146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f41147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile j f41148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f41149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f41150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f41151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f41152z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        f41156d,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, i6.a aVar, int i10, int i11, com.bumptech.glide.h hVar, j6.i iVar, e eVar2, List list, d dVar, j jVar, k6.c cVar, Executor executor) {
        this.f41128b = E ? String.valueOf(super.hashCode()) : null;
        this.f41129c = n6.c.a();
        this.f41130d = obj;
        this.f41133g = context;
        this.f41134h = eVar;
        this.f41135i = obj2;
        this.f41136j = cls;
        this.f41137k = aVar;
        this.f41138l = i10;
        this.f41139m = i11;
        this.f41140n = hVar;
        this.f41141o = iVar;
        this.f41131e = eVar2;
        this.f41142p = list;
        this.f41132f = dVar;
        this.f41148v = jVar;
        this.f41143q = cVar;
        this.f41144r = executor;
        this.f41149w = a.PENDING;
        if (this.D == null && eVar.g().b(com.bumptech.glide.d.c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void B() {
        if (l()) {
            Drawable drawableQ = this.f41135i == null ? q() : null;
            if (drawableQ == null) {
                drawableQ = p();
            }
            if (drawableQ == null) {
                drawableQ = r();
            }
            this.f41141o.g(drawableQ);
        }
    }

    private void i() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        d dVar = this.f41132f;
        return dVar == null || dVar.b(this);
    }

    private boolean l() {
        d dVar = this.f41132f;
        return dVar == null || dVar.g(this);
    }

    private boolean m() {
        d dVar = this.f41132f;
        return dVar == null || dVar.i(this);
    }

    private void n() {
        i();
        this.f41129c.c();
        this.f41141o.b(this);
        j.d dVar = this.f41146t;
        if (dVar != null) {
            dVar.a();
            this.f41146t = null;
        }
    }

    private void o(Object obj) {
        List<e> list = this.f41142p;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
        }
    }

    private Drawable p() {
        if (this.f41150x == null) {
            Drawable drawableO = this.f41137k.o();
            this.f41150x = drawableO;
            if (drawableO == null && this.f41137k.n() > 0) {
                this.f41150x = t(this.f41137k.n());
            }
        }
        return this.f41150x;
    }

    private Drawable q() {
        if (this.f41152z == null) {
            Drawable drawableP = this.f41137k.p();
            this.f41152z = drawableP;
            if (drawableP == null && this.f41137k.q() > 0) {
                this.f41152z = t(this.f41137k.q());
            }
        }
        return this.f41152z;
    }

    private Drawable r() {
        if (this.f41151y == null) {
            Drawable drawableV = this.f41137k.v();
            this.f41151y = drawableV;
            if (drawableV == null && this.f41137k.w() > 0) {
                this.f41151y = t(this.f41137k.w());
            }
        }
        return this.f41151y;
    }

    private boolean s() {
        d dVar = this.f41132f;
        return dVar == null || !dVar.getRoot().a();
    }

    private Drawable t(int i10) {
        return b6.d.a(this.f41133g, i10, this.f41137k.B() != null ? this.f41137k.B() : this.f41133g.getTheme());
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f41128b);
    }

    private static int v(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void w() {
        d dVar = this.f41132f;
        if (dVar != null) {
            dVar.e(this);
        }
    }

    private void x() {
        d dVar = this.f41132f;
        if (dVar != null) {
            dVar.c(this);
        }
    }

    public static h y(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, i6.a aVar, int i10, int i11, com.bumptech.glide.h hVar, j6.i iVar, e eVar2, List list, d dVar, j jVar, k6.c cVar, Executor executor) {
        return new h(context, eVar, obj, obj2, cls, aVar, i10, i11, hVar, iVar, eVar2, list, dVar, jVar, cVar, executor);
    }

    private void z(GlideException glideException, int i10) {
        boolean zA;
        this.f41129c.c();
        synchronized (this.f41130d) {
            try {
                glideException.m(this.D);
                int iH = this.f41134h.h();
                if (iH <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f41135i + "] with dimensions [" + this.A + "x" + this.B + "]", glideException);
                    if (iH <= 4) {
                        glideException.i("Glide");
                    }
                }
                this.f41146t = null;
                this.f41149w = a.FAILED;
                w();
                boolean z10 = true;
                this.C = true;
                try {
                    List list = this.f41142p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zA = false;
                        while (it.hasNext()) {
                            zA |= ((e) it.next()).a(glideException, this.f41135i, this.f41141o, s());
                        }
                    } else {
                        zA = false;
                    }
                    e eVar = this.f41131e;
                    if (eVar == null || !eVar.a(glideException, this.f41135i, this.f41141o, s())) {
                        z10 = false;
                    }
                    if (!(zA | z10)) {
                        B();
                    }
                    this.C = false;
                    n6.b.f("GlideRequest", this.f41127a);
                } catch (Throwable th2) {
                    this.C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // i6.c
    public boolean a() {
        boolean z10;
        synchronized (this.f41130d) {
            z10 = this.f41149w == a.f41156d;
        }
        return z10;
    }

    @Override // i6.g
    public void b(t5.c cVar, r5.a aVar, boolean z10) {
        this.f41129c.c();
        t5.c cVar2 = null;
        try {
            synchronized (this.f41130d) {
                try {
                    this.f41146t = null;
                    if (cVar == null) {
                        c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f41136j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj == null || !this.f41136j.isAssignableFrom(obj.getClass())) {
                            this.f41145s = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f41136j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(cVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            c(new GlideException(sb2.toString()));
                        } else if (m()) {
                            A(cVar, obj, aVar, z10);
                            return;
                        } else {
                            this.f41145s = null;
                            this.f41149w = a.f41156d;
                            n6.b.f("GlideRequest", this.f41127a);
                        }
                        this.f41148v.k(cVar);
                    } catch (Throwable th2) {
                        cVar2 = cVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (cVar2 != null) {
                this.f41148v.k(cVar2);
            }
            throw th4;
        }
    }

    @Override // i6.g
    public void c(GlideException glideException) {
        z(glideException, 5);
    }

    @Override // i6.c
    public void clear() {
        synchronized (this.f41130d) {
            try {
                i();
                this.f41129c.c();
                a aVar = this.f41149w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                n();
                t5.c cVar = this.f41145s;
                if (cVar != null) {
                    this.f41145s = null;
                } else {
                    cVar = null;
                }
                if (k()) {
                    this.f41141o.e(r());
                }
                n6.b.f("GlideRequest", this.f41127a);
                this.f41149w = aVar2;
                if (cVar != null) {
                    this.f41148v.k(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public boolean d() {
        boolean z10;
        synchronized (this.f41130d) {
            z10 = this.f41149w == a.f41156d;
        }
        return z10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j6.h
    public void e(int i10, int i11) throws Throwable {
        Object obj;
        h hVar = this;
        hVar.f41129c.c();
        Object obj2 = hVar.f41130d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = E;
                    if (z10) {
                        hVar.u("Got onSizeReady in " + m6.g.a(hVar.f41147u));
                    }
                    if (hVar.f41149w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        hVar.f41149w = aVar;
                        float fA = hVar.f41137k.A();
                        hVar.A = v(i10, fA);
                        hVar.B = v(i11, fA);
                        if (z10) {
                            hVar.u("finished setup for calling load in " + m6.g.a(hVar.f41147u));
                        }
                        try {
                            j jVar = hVar.f41148v;
                            com.bumptech.glide.e eVar = hVar.f41134h;
                            try {
                                Object obj3 = hVar.f41135i;
                                r5.e eVarZ = hVar.f41137k.z();
                                try {
                                    int i12 = hVar.A;
                                    int i13 = hVar.B;
                                    Class clsY = hVar.f41137k.y();
                                    Class cls = hVar.f41136j;
                                    try {
                                        com.bumptech.glide.h hVar2 = hVar.f41140n;
                                        t5.a aVarM = hVar.f41137k.m();
                                        Map mapC = hVar.f41137k.C();
                                        boolean zN = hVar.f41137k.N();
                                        boolean zJ = hVar.f41137k.J();
                                        r5.g gVarS = hVar.f41137k.s();
                                        boolean zH = hVar.f41137k.H();
                                        boolean zE = hVar.f41137k.E();
                                        boolean zD = hVar.f41137k.D();
                                        boolean zR = hVar.f41137k.r();
                                        Executor executor = hVar.f41144r;
                                        Object obj4 = obj2;
                                        try {
                                            hVar.f41146t = jVar.f(eVar, obj3, eVarZ, i12, i13, clsY, cls, hVar2, aVarM, mapC, zN, zJ, gVarS, zH, zE, zD, zR, hVar, executor);
                                            if (hVar.f41149w != aVar) {
                                                hVar.f41146t = null;
                                            }
                                            if (z10) {
                                                hVar.u("finished onSizeReady in " + m6.g.a(hVar.f41147u));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj = obj2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = obj2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj = obj2;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = hVar;
            }
        }
    }

    @Override // i6.c
    public boolean f() {
        boolean z10;
        synchronized (this.f41130d) {
            z10 = this.f41149w == a.CLEARED;
        }
        return z10;
    }

    @Override // i6.g
    public Object g() {
        this.f41129c.c();
        return this.f41130d;
    }

    @Override // i6.c
    public boolean h(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        i6.a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        i6.a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f41130d) {
            try {
                i10 = this.f41138l;
                i11 = this.f41139m;
                obj = this.f41135i;
                cls = this.f41136j;
                aVar = this.f41137k;
                hVar = this.f41140n;
                List list = this.f41142p;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h hVar3 = (h) cVar;
        synchronized (hVar3.f41130d) {
            try {
                i12 = hVar3.f41138l;
                i13 = hVar3.f41139m;
                obj2 = hVar3.f41135i;
                cls2 = hVar3.f41136j;
                aVar2 = hVar3.f41137k;
                hVar2 = hVar3.f41140n;
                List list2 = hVar3.f41142p;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(aVar, aVar2) && hVar == hVar2 && size == size2;
    }

    @Override // i6.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f41130d) {
            try {
                a aVar = this.f41149w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.c
    public void j() {
        synchronized (this.f41130d) {
            try {
                i();
                this.f41129c.c();
                this.f41147u = m6.g.b();
                Object obj = this.f41135i;
                if (obj == null) {
                    if (l.t(this.f41138l, this.f41139m)) {
                        this.A = this.f41138l;
                        this.B = this.f41139m;
                    }
                    z(new GlideException("Received null model"), q() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f41149w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.f41156d) {
                    b(this.f41145s, r5.a.MEMORY_CACHE, false);
                    return;
                }
                o(obj);
                this.f41127a = n6.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f41149w = aVar3;
                if (l.t(this.f41138l, this.f41139m)) {
                    e(this.f41138l, this.f41139m);
                } else {
                    this.f41141o.h(this);
                }
                a aVar4 = this.f41149w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.f41141o.c(r());
                }
                if (E) {
                    u("finished run method in " + m6.g.a(this.f41147u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public void pause() {
        synchronized (this.f41130d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f41130d) {
            obj = this.f41135i;
            cls = this.f41136j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    private void A(t5.c cVar, Object obj, r5.a aVar, boolean z10) {
        boolean zB;
        boolean zS = s();
        this.f41149w = a.f41156d;
        this.f41145s = cVar;
        if (this.f41134h.h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f41135i + " with size [" + this.A + "x" + this.B + "] in " + m6.g.a(this.f41147u) + " ms");
        }
        x();
        boolean z11 = true;
        this.C = true;
        try {
            List list = this.f41142p;
            if (list != null) {
                Iterator it = list.iterator();
                zB = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    r5.a aVar2 = aVar;
                    zB |= ((e) it.next()).b(obj2, this.f41135i, this.f41141o, aVar2, zS);
                    obj = obj2;
                    aVar = aVar2;
                }
            } else {
                zB = false;
            }
            Object obj3 = obj;
            r5.a aVar3 = aVar;
            e eVar = this.f41131e;
            if (eVar == null || !eVar.b(obj3, this.f41135i, this.f41141o, aVar3, zS)) {
                z11 = false;
            }
            if (!(z11 | zB)) {
                this.f41141o.a(obj3, this.f41143q.a(aVar3, zS));
            }
            this.C = false;
            n6.b.f(YSHErhbVu.hPauZzFJTcRwEbz, this.f41127a);
        } catch (Throwable th2) {
            this.C = false;
            throw th2;
        }
    }
}
