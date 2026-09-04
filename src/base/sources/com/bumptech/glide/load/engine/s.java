package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class s implements f, com.bumptech.glide.load.data.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.a f11456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f11457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11459d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r5.e f11460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f11461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile x5.n.a f11463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f11464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t f11465j;

    s(g gVar, f.a aVar) {
        this.f11457b = gVar;
        this.f11456a = aVar;
    }

    private boolean a() {
        return this.f11462g < this.f11461f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        n6.b.a("ResourceCacheGenerator.startNext");
        try {
            List listC = this.f11457b.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                n6.b.e();
                return false;
            }
            List listM = this.f11457b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f11457b.r())) {
                    n6.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f11457b.i() + " to " + this.f11457b.r());
            }
            while (true) {
                if (this.f11461f != null && a()) {
                    this.f11463h = null;
                    while (!z10 && a()) {
                        List list = this.f11461f;
                        int i10 = this.f11462g;
                        this.f11462g = i10 + 1;
                        this.f11463h = ((x5.n) list.get(i10)).b(this.f11464i, this.f11457b.t(), this.f11457b.f(), this.f11457b.k());
                        if (this.f11463h != null && this.f11457b.u(this.f11463h.f56703c.a())) {
                            this.f11463h.f56703c.e(this.f11457b.l(), this);
                            z10 = true;
                        }
                    }
                    n6.b.e();
                    return z10;
                }
                int i11 = this.f11459d + 1;
                this.f11459d = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f11458c + 1;
                    this.f11458c = i12;
                    if (i12 >= listC.size()) {
                        n6.b.e();
                        return false;
                    }
                    this.f11459d = 0;
                }
                r5.e eVar = (r5.e) listC.get(this.f11458c);
                Class cls = (Class) listM.get(this.f11459d);
                this.f11465j = new t(this.f11457b.b(), eVar, this.f11457b.p(), this.f11457b.t(), this.f11457b.f(), this.f11457b.s(cls), cls, this.f11457b.k());
                File fileB = this.f11457b.d().b(this.f11465j);
                this.f11464i = fileB;
                if (fileB != null) {
                    this.f11460e = eVar;
                    this.f11461f = this.f11457b.j(fileB);
                    this.f11462g = 0;
                }
            }
        } catch (Throwable th2) {
            n6.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f11456a.c(this.f11465j, exc, this.f11463h.f56703c, r5.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        x5.n.a aVar = this.f11463h;
        if (aVar != null) {
            aVar.f56703c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f11456a.a(this.f11460e, obj, this.f11463h.f56703c, r5.a.RESOURCE_DISK_CACHE, this.f11465j);
    }
}
