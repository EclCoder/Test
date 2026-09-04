package f;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38152c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38155f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g.d.f f38150a = g.d.c.f38825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38151b = g.c.f38821a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g.d.b f38153d = g.d.b.a.f38823a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f38158c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f38160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f38161f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g.d.f f38156a = g.d.c.f38825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38157b = g.c.f38821a.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g.d.b f38159d = g.d.b.a.f38823a;

        public final i a() {
            i iVar = new i();
            iVar.k(this.f38156a);
            iVar.i(this.f38157b);
            iVar.l(this.f38158c);
            iVar.h(this.f38159d);
            iVar.g(this.f38160e);
            iVar.f(this.f38161f);
            iVar.j(null);
            return iVar;
        }

        public final a b(g.d.b defaultTab) {
            s.h(defaultTab, "defaultTab");
            this.f38159d = defaultTab;
            return this;
        }

        public final a c(int i10) {
            this.f38157b = i10;
            return this;
        }

        public final a d(g.d.f mediaType) {
            s.h(mediaType, "mediaType");
            this.f38156a = mediaType;
            return this;
        }

        public final a e(boolean z10) {
            this.f38158c = z10;
            return this;
        }
    }

    public final long a() {
        return this.f38155f;
    }

    public final g.d.b b() {
        return this.f38153d;
    }

    public final g.d.e c() {
        return null;
    }

    public final g.d.f d() {
        return this.f38150a;
    }

    public final boolean e() {
        return this.f38154e;
    }

    public final void f(long j10) {
        this.f38155f = j10;
    }

    public final void g(boolean z10) {
        this.f38154e = z10;
    }

    public final void h(g.d.b bVar) {
        s.h(bVar, "<set-?>");
        this.f38153d = bVar;
    }

    public final void i(int i10) {
        this.f38151b = i10;
    }

    public final void k(g.d.f fVar) {
        s.h(fVar, "<set-?>");
        this.f38150a = fVar;
    }

    public final void l(boolean z10) {
        this.f38152c = z10;
    }

    public final void j(g.d.e eVar) {
    }
}
