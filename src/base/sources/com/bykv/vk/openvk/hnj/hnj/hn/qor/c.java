package com.bykv.vk.openvk.hnj.hnj.hn.qor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d.g f11630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.InterfaceC0158d f11631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d.e f11632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d.a f11633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.b f11634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.f f11635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d.c f11636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f11637h = false;

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void b(d.b bVar) {
        this.f11634e = bVar;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void c(d.a aVar) {
        this.f11633d = aVar;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void e(d.c cVar) {
        this.f11636g = cVar;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void g(d.e eVar) {
        this.f11632c = eVar;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public void hnj(boolean z10) {
        this.f11637h = z10;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void i(d.g gVar) {
        this.f11630a = gVar;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void j(d.InterfaceC0158d interfaceC0158d) {
        this.f11631b = interfaceC0158d;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d
    public final void k(d.f fVar) {
        this.f11635f = fVar;
    }

    protected final void l() {
        try {
            d.a aVar = this.f11633d;
            if (aVar != null) {
                aVar.qor(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void m() {
        try {
            d.g gVar = this.f11630a;
            if (gVar != null) {
                gVar.hn(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean n(int i10, int i11) {
        try {
            d.c cVar = this.f11636g;
            return cVar != null && cVar.hn(this, i10, i11);
        } catch (Throwable unused) {
        }
    }

    public void o() {
        this.f11630a = null;
        this.f11632c = null;
        this.f11631b = null;
        this.f11633d = null;
        this.f11634e = null;
        this.f11635f = null;
        this.f11636g = null;
    }

    protected final void p(int i10) {
        try {
            d.e eVar = this.f11632c;
            if (eVar != null) {
                eVar.hnj(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void q(int i10, int i11, int i12, int i13) {
        try {
            d.b bVar = this.f11634e;
            if (bVar != null) {
                bVar.hnj(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean r(int i10, int i11) {
        try {
            d.f fVar = this.f11635f;
            return fVar != null && fVar.hnj(this, i10, i11);
        } catch (Throwable unused) {
        }
    }

    protected final void s() {
        try {
            d.InterfaceC0158d interfaceC0158d = this.f11631b;
            if (interfaceC0158d != null) {
                interfaceC0158d.hnj(this);
            }
        } catch (Throwable unused) {
        }
    }
}
