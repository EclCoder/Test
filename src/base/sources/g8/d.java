package g8;

import com.fasterxml.jackson.core.JsonParseException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.fasterxml.jackson.core.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final d f38973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f38974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected d f38975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f38976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Object f38977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f38978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f38979i;

    public d(d dVar, b bVar, int i10, int i11, int i12) {
        this.f38973c = dVar;
        this.f38974d = bVar;
        this.f16192a = i10;
        this.f38978h = i11;
        this.f38979i = i12;
        this.f16193b = -1;
    }

    private void h(b bVar, String str) throws JsonParseException {
        if (bVar.c(str)) {
            Object objB = bVar.b();
            throw new JsonParseException(objB instanceof com.fasterxml.jackson.core.e ? (com.fasterxml.jackson.core.e) objB : null, "Duplicate field '" + str + "'");
        }
    }

    public static d l(b bVar) {
        return new d(null, bVar, 0, 1, 0);
    }

    @Override // com.fasterxml.jackson.core.f
    public String b() {
        return this.f38976f;
    }

    public d i() {
        this.f38977g = null;
        return this.f38973c;
    }

    public d j(int i10, int i11) {
        d dVar = this.f38975e;
        if (dVar != null) {
            dVar.p(1, i10, i11);
            return dVar;
        }
        b bVar = this.f38974d;
        d dVar2 = new d(this, bVar == null ? null : bVar.a(), 1, i10, i11);
        this.f38975e = dVar2;
        return dVar2;
    }

    public d k(int i10, int i11) {
        d dVar = this.f38975e;
        if (dVar != null) {
            dVar.p(2, i10, i11);
            return dVar;
        }
        b bVar = this.f38974d;
        d dVar2 = new d(this, bVar == null ? null : bVar.a(), 2, i10, i11);
        this.f38975e = dVar2;
        return dVar2;
    }

    public boolean m() {
        int i10 = this.f16193b + 1;
        this.f16193b = i10;
        return this.f16192a != 0 && i10 > 0;
    }

    public d n() {
        return this.f38973c;
    }

    public com.fasterxml.jackson.core.d o(Object obj) {
        return new com.fasterxml.jackson.core.d(obj, -1L, this.f38978h, this.f38979i);
    }

    protected void p(int i10, int i11, int i12) {
        this.f16192a = i10;
        this.f16193b = -1;
        this.f38978h = i11;
        this.f38979i = i12;
        this.f38976f = null;
        this.f38977g = null;
        b bVar = this.f38974d;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void q(String str) throws JsonParseException {
        this.f38976f = str;
        b bVar = this.f38974d;
        if (bVar != null) {
            h(bVar, str);
        }
    }
}
