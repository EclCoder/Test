package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class c implements f, com.bumptech.glide.load.data.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f11286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f11287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r5.e f11289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f11290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile x5.n.a f11292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f11293i;

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f11291g < this.f11290f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        n6.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f11290f != null && a()) {
                    this.f11292h = null;
                    while (!z10 && a()) {
                        List list = this.f11290f;
                        int i10 = this.f11291g;
                        this.f11291g = i10 + 1;
                        this.f11292h = ((x5.n) list.get(i10)).b(this.f11293i, this.f11286b.t(), this.f11286b.f(), this.f11286b.k());
                        if (this.f11292h != null && this.f11286b.u(this.f11292h.f56703c.a())) {
                            this.f11292h.f56703c.e(this.f11286b.l(), this);
                            z10 = true;
                        }
                    }
                    n6.b.e();
                    return z10;
                }
                int i11 = this.f11288d + 1;
                this.f11288d = i11;
                if (i11 >= this.f11285a.size()) {
                    n6.b.e();
                    return false;
                }
                r5.e eVar = (r5.e) this.f11285a.get(this.f11288d);
                File fileB = this.f11286b.d().b(new d(eVar, this.f11286b.p()));
                this.f11293i = fileB;
                if (fileB != null) {
                    this.f11289e = eVar;
                    this.f11290f = this.f11286b.j(fileB);
                    this.f11291g = 0;
                }
            } catch (Throwable th2) {
                n6.b.e();
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f11287c.c(this.f11289e, exc, this.f11292h.f56703c, r5.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        x5.n.a aVar = this.f11292h;
        if (aVar != null) {
            aVar.f56703c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f11287c.a(this.f11289e, obj, this.f11292h.f56703c, r5.a.DATA_DISK_CACHE, this.f11289e);
    }

    c(List list, g gVar, f.a aVar) {
        this.f11288d = -1;
        this.f11285a = list;
        this.f11286b = gVar;
        this.f11287c = aVar;
    }
}
