package g8;

import com.fasterxml.jackson.core.JsonGenerationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f extends com.fasterxml.jackson.core.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final f f38995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f38996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected f f38997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f38998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Object f38999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f39000h;

    protected f(int i10, f fVar, b bVar) {
        this.f16192a = i10;
        this.f38995c = fVar;
        this.f38996d = bVar;
        this.f16193b = -1;
    }

    private final void h(b bVar, String str) throws JsonGenerationException {
        if (bVar.c(str)) {
            Object objB = bVar.b();
            throw new JsonGenerationException("Duplicate field '" + str + "'", objB instanceof com.fasterxml.jackson.core.c ? (com.fasterxml.jackson.core.c) objB : null);
        }
    }

    public static f l(b bVar) {
        return new f(0, null, bVar);
    }

    @Override // com.fasterxml.jackson.core.f
    public final String b() {
        return this.f38998f;
    }

    public f i() {
        this.f38999g = null;
        return this.f38995c;
    }

    public f j() {
        f fVar = this.f38997e;
        if (fVar != null) {
            return fVar.m(1);
        }
        b bVar = this.f38996d;
        f fVar2 = new f(1, this, bVar == null ? null : bVar.a());
        this.f38997e = fVar2;
        return fVar2;
    }

    public f k() {
        f fVar = this.f38997e;
        if (fVar != null) {
            return fVar.m(2);
        }
        b bVar = this.f38996d;
        f fVar2 = new f(2, this, bVar == null ? null : bVar.a());
        this.f38997e = fVar2;
        return fVar2;
    }

    protected f m(int i10) {
        this.f16192a = i10;
        this.f16193b = -1;
        this.f38998f = null;
        this.f39000h = false;
        this.f38999g = null;
        b bVar = this.f38996d;
        if (bVar != null) {
            bVar.d();
        }
        return this;
    }

    public int n(String str) throws JsonGenerationException {
        if (this.f16192a != 2 || this.f39000h) {
            return 4;
        }
        this.f39000h = true;
        this.f38998f = str;
        b bVar = this.f38996d;
        if (bVar != null) {
            h(bVar, str);
        }
        return this.f16193b < 0 ? 0 : 1;
    }

    public int o() {
        int i10 = this.f16192a;
        if (i10 == 2) {
            if (!this.f39000h) {
                return 5;
            }
            this.f39000h = false;
            this.f16193b++;
            return 2;
        }
        if (i10 == 1) {
            int i11 = this.f16193b;
            this.f16193b = i11 + 1;
            return i11 < 0 ? 0 : 1;
        }
        int i12 = this.f16193b + 1;
        this.f16193b = i12;
        return i12 == 0 ? 0 : 3;
    }
}
