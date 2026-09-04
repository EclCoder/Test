package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11299a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11300b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f11301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f11302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class f11305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f11306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r5.g f11307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f11308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class f11309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r5.e f11312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.h f11313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t5.a f11314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11316r;

    g() {
    }

    void a() {
        this.f11301c = null;
        this.f11302d = null;
        this.f11312n = null;
        this.f11305g = null;
        this.f11309k = null;
        this.f11307i = null;
        this.f11313o = null;
        this.f11308j = null;
        this.f11314p = null;
        this.f11299a.clear();
        this.f11310l = false;
        this.f11300b.clear();
        this.f11311m = false;
    }

    u5.b b() {
        return this.f11301c.b();
    }

    List c() {
        if (!this.f11311m) {
            this.f11311m = true;
            this.f11300b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                x5.n.a aVar = (x5.n.a) listG.get(i10);
                if (!this.f11300b.contains(aVar.f56701a)) {
                    this.f11300b.add(aVar.f56701a);
                }
                for (int i11 = 0; i11 < aVar.f56702b.size(); i11++) {
                    if (!this.f11300b.contains(aVar.f56702b.get(i11))) {
                        this.f11300b.add((r5.e) aVar.f56702b.get(i11));
                    }
                }
            }
        }
        return this.f11300b;
    }

    v5.a d() {
        return this.f11306h.a();
    }

    t5.a e() {
        return this.f11314p;
    }

    int f() {
        return this.f11304f;
    }

    List g() {
        if (!this.f11310l) {
            this.f11310l = true;
            this.f11299a.clear();
            List listI = this.f11301c.i().i(this.f11302d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                x5.n.a aVarB = ((x5.n) listI.get(i10)).b(this.f11302d, this.f11303e, this.f11304f, this.f11307i);
                if (aVarB != null) {
                    this.f11299a.add(aVarB);
                }
            }
        }
        return this.f11299a;
    }

    q h(Class cls) {
        return this.f11301c.i().h(cls, this.f11305g, this.f11309k);
    }

    Class i() {
        return this.f11302d.getClass();
    }

    List j(File file) {
        return this.f11301c.i().i(file);
    }

    r5.g k() {
        return this.f11307i;
    }

    com.bumptech.glide.h l() {
        return this.f11313o;
    }

    List m() {
        return this.f11301c.i().j(this.f11302d.getClass(), this.f11305g, this.f11309k);
    }

    r5.j n(t5.c cVar) {
        return this.f11301c.i().k(cVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f11301c.i().l(obj);
    }

    r5.e p() {
        return this.f11312n;
    }

    r5.d q(Object obj) {
        return this.f11301c.i().m(obj);
    }

    Class r() {
        return this.f11309k;
    }

    r5.k s(Class cls) {
        r5.k kVar = (r5.k) this.f11308j.get(cls);
        if (kVar == null) {
            for (Map.Entry entry : this.f11308j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    kVar = (r5.k) entry.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f11308j.isEmpty() || !this.f11315q) {
            return z5.e.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f11303e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.e eVar, Object obj, r5.e eVar2, int i10, int i11, t5.a aVar, Class cls, Class cls2, com.bumptech.glide.h hVar, r5.g gVar, Map map, boolean z10, boolean z11, h.e eVar3) {
        this.f11301c = eVar;
        this.f11302d = obj;
        this.f11312n = eVar2;
        this.f11303e = i10;
        this.f11304f = i11;
        this.f11314p = aVar;
        this.f11305g = cls;
        this.f11306h = eVar3;
        this.f11309k = cls2;
        this.f11313o = hVar;
        this.f11307i = gVar;
        this.f11308j = map;
        this.f11315q = z10;
        this.f11316r = z11;
    }

    boolean w(t5.c cVar) {
        return this.f11301c.i().n(cVar);
    }

    boolean x() {
        return this.f11316r;
    }

    boolean y(r5.e eVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((x5.n.a) listG.get(i10)).f56701a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
