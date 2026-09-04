package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class v implements f, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f11479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f11480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f11481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile x5.n.a f11482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile d f11483g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.bumptech.glide.load.data.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x5.n.a f11484a;

        a(x5.n.a aVar) {
            this.f11484a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (v.this.g(this.f11484a)) {
                v.this.i(this.f11484a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (v.this.g(this.f11484a)) {
                v.this.h(this.f11484a, obj);
            }
        }
    }

    v(g gVar, f.a aVar) {
        this.f11477a = gVar;
        this.f11478b = aVar;
    }

    private boolean d(Object obj) throws Throwable {
        Throwable th2;
        long jB = m6.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e eVarO = this.f11477a.o(obj);
            Object objA = eVarO.a();
            r5.d dVarQ = this.f11477a.q(objA);
            e eVar = new e(dVarQ, objA, this.f11477a.k());
            d dVar = new d(this.f11482f.f56701a, this.f11477a.p());
            v5.a aVarD = this.f11477a.d();
            aVarD.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + m6.g.a(jB));
            }
            if (aVarD.b(dVar) != null) {
                this.f11483g = dVar;
                this.f11480d = new c(Collections.singletonList(this.f11482f.f56701a), this.f11477a, this);
                this.f11482f.f56703c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f11483g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f11478b.a(this.f11482f.f56701a, eVarO.a(), this.f11482f.f56703c, this.f11482f.f56703c.d(), this.f11482f.f56701a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f11482f.f56703c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean f() {
        return this.f11479c < this.f11477a.g().size();
    }

    private void j(x5.n.a aVar) {
        this.f11482f.f56703c.e(this.f11477a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(r5.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, r5.a aVar, r5.e eVar2) {
        this.f11478b.a(eVar, obj, dVar, this.f11482f.f56703c.d(), eVar);
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.f11481e != null) {
            Object obj = this.f11481e;
            this.f11481e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f11480d != null && this.f11480d.b()) {
            return true;
        }
        this.f11480d = null;
        this.f11482f = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List listG = this.f11477a.g();
            int i10 = this.f11479c;
            this.f11479c = i10 + 1;
            this.f11482f = (x5.n.a) listG.get(i10);
            if (this.f11482f != null && (this.f11477a.e().c(this.f11482f.f56703c.d()) || this.f11477a.u(this.f11482f.f56703c.a()))) {
                j(this.f11482f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(r5.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, r5.a aVar) {
        this.f11478b.c(eVar, exc, dVar, this.f11482f.f56703c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        x5.n.a aVar = this.f11482f;
        if (aVar != null) {
            aVar.f56703c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e() {
        throw new UnsupportedOperationException();
    }

    boolean g(x5.n.a aVar) {
        x5.n.a aVar2 = this.f11482f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(x5.n.a aVar, Object obj) {
        t5.a aVarE = this.f11477a.e();
        if (obj != null && aVarE.c(aVar.f56703c.d())) {
            this.f11481e = obj;
            this.f11478b.e();
        } else {
            f.a aVar2 = this.f11478b;
            r5.e eVar = aVar.f56701a;
            com.bumptech.glide.load.data.d dVar = aVar.f56703c;
            aVar2.a(eVar, obj, dVar, dVar.d(), this.f11483g);
        }
    }

    void i(x5.n.a aVar, Exception exc) {
        f.a aVar2 = this.f11478b;
        d dVar = this.f11483g;
        com.bumptech.glide.load.data.d dVar2 = aVar.f56703c;
        aVar2.c(dVar, exc, dVar2, dVar2.d());
    }
}
