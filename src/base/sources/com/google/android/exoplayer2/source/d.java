package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.google.android.exoplayer2.source.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final y0 f17463w = new y0.c().g(Uri.EMPTY).a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f17464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f17465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f17466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f17467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final IdentityHashMap f17468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f17469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set f17470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f17471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f17472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Set f17474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e0 f17475v;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends com.google.android.exoplayer2.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f17476i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f17477j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int[] f17478k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int[] f17479l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final h2[] f17480m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object[] f17481n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final HashMap f17482o;

        public b(Collection collection, e0 e0Var, boolean z10) {
            super(z10, e0Var);
            int size = collection.size();
            this.f17478k = new int[size];
            this.f17479l = new int[size];
            this.f17480m = new h2[size];
            this.f17481n = new Object[size];
            this.f17482o = new HashMap();
            Iterator it = collection.iterator();
            int iT = 0;
            int iM = 0;
            int i10 = 0;
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f17480m[i10] = eVar.f17485a.Z();
                this.f17479l[i10] = iT;
                this.f17478k[i10] = iM;
                iT += this.f17480m[i10].t();
                iM += this.f17480m[i10].m();
                Object[] objArr = this.f17481n;
                Object obj = eVar.f17486b;
                objArr[i10] = obj;
                this.f17482o.put(obj, Integer.valueOf(i10));
                i10++;
            }
            this.f17476i = iT;
            this.f17477j = iM;
        }

        @Override // com.google.android.exoplayer2.a
        protected Object B(int i10) {
            return this.f17481n[i10];
        }

        @Override // com.google.android.exoplayer2.a
        protected int D(int i10) {
            return this.f17478k[i10];
        }

        @Override // com.google.android.exoplayer2.a
        protected int E(int i10) {
            return this.f17479l[i10];
        }

        @Override // com.google.android.exoplayer2.a
        protected h2 H(int i10) {
            return this.f17480m[i10];
        }

        @Override // com.google.android.exoplayer2.h2
        public int m() {
            return this.f17477j;
        }

        @Override // com.google.android.exoplayer2.h2
        public int t() {
            return this.f17476i;
        }

        @Override // com.google.android.exoplayer2.a
        protected int w(Object obj) {
            Integer num = (Integer) this.f17482o.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.a
        protected int x(int i10) {
            return r0.h(this.f17478k, i10 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.a
        protected int y(int i10) {
            return r0.h(this.f17479l, i10 + 1, false, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0283d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f17483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f17484b;

        public C0283d(Handler handler, Runnable runnable) {
            this.f17483a = handler;
            this.f17484b = runnable;
        }

        public void a() {
            this.f17483a.post(this.f17484b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f17485a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17490f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f17487c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17486b = new Object();

        public e(p pVar, boolean z10) {
            this.f17485a = new n(pVar, z10);
        }

        public void a(int i10, int i11) {
            this.f17488d = i10;
            this.f17489e = i11;
            this.f17490f = false;
            this.f17487c.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0283d f17493c;

        public f(int i10, Object obj, C0283d c0283d) {
            this.f17491a = i10;
            this.f17492b = obj;
            this.f17493c = c0283d;
        }
    }

    public d(boolean z10, p... pVarArr) {
        this(z10, new e0.a(0), pVarArr);
    }

    private void Q(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = (e) this.f17467n.get(i10 - 1);
            eVar.a(i10, eVar2.f17489e + eVar2.f17485a.Z().t());
        } else {
            eVar.a(i10, 0);
        }
        U(i10, 1, eVar.f17485a.Z().t());
        this.f17467n.add(i10, eVar);
        this.f17469p.put(eVar.f17486b, eVar);
        K(eVar, eVar.f17485a);
        if (z() && this.f17468o.isEmpty()) {
            this.f17470q.add(eVar);
        } else {
            E(eVar);
        }
    }

    private void S(int i10, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Q(i10, (e) it.next());
            i10++;
        }
    }

    private void T(int i10, Collection collection, Handler handler, Runnable runnable) {
        ob.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f17466m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ob.a.e((p) it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e((p) it2.next(), this.f17472s));
        }
        this.f17464k.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i10, arrayList, V(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void U(int i10, int i11, int i12) {
        while (i10 < this.f17467n.size()) {
            e eVar = (e) this.f17467n.get(i10);
            eVar.f17488d += i11;
            eVar.f17489e += i12;
            i10++;
        }
    }

    private C0283d V(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0283d c0283d = new C0283d(handler, runnable);
        this.f17465l.add(c0283d);
        return c0283d;
    }

    private void W() {
        Iterator it = this.f17470q.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f17487c.isEmpty()) {
                E(eVar);
                it.remove();
            }
        }
    }

    private synchronized void X(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C0283d) it.next()).a();
            }
            this.f17465l.removeAll(set);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void Y(e eVar) {
        this.f17470q.add(eVar);
        F(eVar);
    }

    private static Object Z(Object obj) {
        return com.google.android.exoplayer2.a.z(obj);
    }

    private static Object c0(Object obj) {
        return com.google.android.exoplayer2.a.A(obj);
    }

    private static Object d0(e eVar, Object obj) {
        return com.google.android.exoplayer2.a.C(eVar.f17486b, obj);
    }

    private Handler e0() {
        return (Handler) ob.a.e(this.f17466m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g0(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f fVar = (f) r0.j(message.obj);
            this.f17475v = this.f17475v.cloneAndInsert(fVar.f17491a, ((Collection) fVar.f17492b).size());
            S(fVar.f17491a, (Collection) fVar.f17492b);
            o0(fVar.f17493c);
        } else if (i10 == 1) {
            f fVar2 = (f) r0.j(message.obj);
            int i11 = fVar2.f17491a;
            int iIntValue = ((Integer) fVar2.f17492b).intValue();
            if (i11 == 0 && iIntValue == this.f17475v.getLength()) {
                this.f17475v = this.f17475v.cloneAndClear();
            } else {
                this.f17475v = this.f17475v.a(i11, iIntValue);
            }
            for (int i12 = iIntValue - 1; i12 >= i11; i12--) {
                l0(i12);
            }
            o0(fVar2.f17493c);
        } else if (i10 == 2) {
            f fVar3 = (f) r0.j(message.obj);
            e0 e0Var = this.f17475v;
            int i13 = fVar3.f17491a;
            e0 e0VarA = e0Var.a(i13, i13 + 1);
            this.f17475v = e0VarA;
            this.f17475v = e0VarA.cloneAndInsert(((Integer) fVar3.f17492b).intValue(), 1);
            i0(fVar3.f17491a, ((Integer) fVar3.f17492b).intValue());
            o0(fVar3.f17493c);
        } else if (i10 == 3) {
            f fVar4 = (f) r0.j(message.obj);
            this.f17475v = (e0) fVar4.f17492b;
            o0(fVar4.f17493c);
        } else if (i10 == 4) {
            q0();
        } else {
            if (i10 != 5) {
                throw new IllegalStateException();
            }
            X((Set) r0.j(message.obj));
        }
        return true;
    }

    private void h0(e eVar) {
        if (eVar.f17490f && eVar.f17487c.isEmpty()) {
            this.f17470q.remove(eVar);
            L(eVar);
        }
    }

    private void i0(int i10, int i11) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iT = ((e) this.f17467n.get(iMin)).f17489e;
        List list = this.f17467n;
        list.add(i11, (e) list.remove(i10));
        while (iMin <= iMax) {
            e eVar = (e) this.f17467n.get(iMin);
            eVar.f17488d = iMin;
            eVar.f17489e = iT;
            iT += eVar.f17485a.Z().t();
            iMin++;
        }
    }

    private void l0(int i10) {
        e eVar = (e) this.f17467n.remove(i10);
        this.f17469p.remove(eVar.f17486b);
        U(i10, -1, -eVar.f17485a.Z().t());
        eVar.f17490f = true;
        h0(eVar);
    }

    private void m0(int i10, int i11, Handler handler, Runnable runnable) {
        ob.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f17466m;
        r0.S0(this.f17464k, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i10, Integer.valueOf(i11), V(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void n0() {
        o0(null);
    }

    private void o0(C0283d c0283d) {
        if (!this.f17473t) {
            e0().obtainMessage(4).sendToTarget();
            this.f17473t = true;
        }
        if (c0283d != null) {
            this.f17474u.add(c0283d);
        }
    }

    private void p0(e eVar, h2 h2Var) {
        if (eVar.f17488d + 1 < this.f17467n.size()) {
            int iT = h2Var.t() - (((e) this.f17467n.get(eVar.f17488d + 1)).f17489e - eVar.f17489e);
            if (iT != 0) {
                U(eVar.f17488d + 1, 0, iT);
            }
        }
        n0();
    }

    private void q0() {
        this.f17473t = false;
        Set set = this.f17474u;
        this.f17474u = new HashSet();
        B(new b(this.f17467n, this.f17475v, this.f17471r));
        e0().obtainMessage(5, set).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected synchronized void A(nb.a0 a0Var) {
        try {
            super.A(a0Var);
            this.f17466m = new Handler(new Handler.Callback() { // from class: ra.e
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f51182a.g0(message);
                }
            });
            if (this.f17464k.isEmpty()) {
                q0();
            } else {
                this.f17475v = this.f17475v.cloneAndInsert(0, this.f17464k.size());
                S(0, this.f17464k);
                n0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected synchronized void C() {
        try {
            super.C();
            this.f17467n.clear();
            this.f17470q.clear();
            this.f17469p.clear();
            this.f17475v = this.f17475v.cloneAndClear();
            Handler handler = this.f17466m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f17466m = null;
            }
            this.f17473t = false;
            this.f17474u.clear();
            X(this.f17465l);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void O(int i10, p pVar) {
        T(i10, Collections.singletonList(pVar), null, null);
    }

    public synchronized void P(p pVar) {
        O(this.f17464k.size(), pVar);
    }

    public synchronized void R(Collection collection) {
        T(this.f17464k.size(), collection, null, null);
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return f17463w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public p.b G(e eVar, p.b bVar) {
        for (int i10 = 0; i10 < eVar.f17487c.size(); i10++) {
            if (((p.b) eVar.f17487c.get(i10)).f51202d == bVar.f51202d) {
                return bVar.c(d0(eVar, bVar.f51199a));
            }
        }
        return null;
    }

    public synchronized p b0(int i10) {
        return ((e) this.f17464k.get(i10)).f17485a;
    }

    @Override // com.google.android.exoplayer2.source.p
    public boolean c() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.p
    public synchronized h2 d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new b(this.f17464k, this.f17475v.getLength() != this.f17464k.size() ? this.f17475v.cloneAndClear().cloneAndInsert(0, this.f17464k.size()) : this.f17475v, this.f17471r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int I(e eVar, int i10) {
        return i10 + eVar.f17489e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void J(e eVar, p pVar, h2 h2Var) {
        p0(eVar, h2Var);
    }

    public synchronized p k0(int i10) {
        p pVarB0;
        pVarB0 = b0(i10);
        m0(i10, i10 + 1, null, null);
        return pVarB0;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        e eVar = (e) ob.a.e((e) this.f17468o.remove(oVar));
        eVar.f17485a.l(oVar);
        eVar.f17487c.remove(((m) oVar).f17853a);
        if (!this.f17468o.isEmpty()) {
            W();
        }
        h0(eVar);
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        Object objC0 = c0(bVar.f51199a);
        p.b bVarC = bVar.c(Z(bVar.f51199a));
        e eVar = (e) this.f17469p.get(objC0);
        if (eVar == null) {
            eVar = new e(new c(), this.f17472s);
            eVar.f17490f = true;
            K(eVar, eVar.f17485a);
        }
        Y(eVar);
        eVar.f17487c.add(bVarC);
        m mVarO = eVar.f17485a.o(bVarC, bVar2, j10);
        this.f17468o.put(mVarO, eVar);
        W();
        return mVarO;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void w() {
        super.w();
        this.f17470q.clear();
    }

    public d(boolean z10, e0 e0Var, p... pVarArr) {
        this(z10, false, e0Var, pVarArr);
    }

    public d(boolean z10, boolean z11, e0 e0Var, p... pVarArr) {
        for (p pVar : pVarArr) {
            ob.a.e(pVar);
        }
        this.f17475v = e0Var.getLength() > 0 ? e0Var.cloneAndClear() : e0Var;
        this.f17468o = new IdentityHashMap();
        this.f17469p = new HashMap();
        this.f17464k = new ArrayList();
        this.f17467n = new ArrayList();
        this.f17474u = new HashSet();
        this.f17465l = new HashSet();
        this.f17470q = new HashSet();
        this.f17471r = z10;
        this.f17472s = z11;
        R(Arrays.asList(pVarArr));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends com.google.android.exoplayer2.source.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.p
        public y0 a() {
            return d.f17463w;
        }

        @Override // com.google.android.exoplayer2.source.p
        public o o(p.b bVar, nb.b bVar2, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.a
        protected void C() {
        }

        @Override // com.google.android.exoplayer2.source.p
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.a
        protected void A(nb.a0 a0Var) {
        }

        @Override // com.google.android.exoplayer2.source.p
        public void l(o oVar) {
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void x() {
    }
}
