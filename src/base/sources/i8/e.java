package i8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e implements com.fasterxml.jackson.core.i, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.io.g f41192h = new com.fasterxml.jackson.core.io.g(" ");
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f41193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b f41194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.j f41195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f41196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected transient int f41197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected h f41198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f41199g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f41200b = new a();

        @Override // i8.e.c, i8.e.b
        public void a(com.fasterxml.jackson.core.c cVar, int i10) {
            cVar.F0(' ');
        }

        @Override // i8.e.c, i8.e.b
        public boolean isInline() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(com.fasterxml.jackson.core.c cVar, int i10);

        boolean isInline();
    }

    public e() {
        this(f41192h);
    }

    @Override // com.fasterxml.jackson.core.i
    public void a(com.fasterxml.jackson.core.c cVar) {
        cVar.F0('{');
        if (this.f41194b.isInline()) {
            return;
        }
        this.f41197e++;
    }

    @Override // com.fasterxml.jackson.core.i
    public void b(com.fasterxml.jackson.core.c cVar) {
        com.fasterxml.jackson.core.j jVar = this.f41195c;
        if (jVar != null) {
            cVar.K0(jVar);
        }
    }

    @Override // com.fasterxml.jackson.core.i
    public void c(com.fasterxml.jackson.core.c cVar) {
        cVar.F0(this.f41198f.g());
        this.f41193a.a(cVar, this.f41197e);
    }

    @Override // com.fasterxml.jackson.core.i
    public void d(com.fasterxml.jackson.core.c cVar) {
        this.f41194b.a(cVar, this.f41197e);
    }

    @Override // com.fasterxml.jackson.core.i
    public void e(com.fasterxml.jackson.core.c cVar) {
        this.f41193a.a(cVar, this.f41197e);
    }

    @Override // com.fasterxml.jackson.core.i
    public void g(com.fasterxml.jackson.core.c cVar) {
        cVar.F0(this.f41198f.h());
        this.f41194b.a(cVar, this.f41197e);
    }

    @Override // com.fasterxml.jackson.core.i
    public void h(com.fasterxml.jackson.core.c cVar, int i10) {
        if (!this.f41193a.isInline()) {
            this.f41197e--;
        }
        if (i10 > 0) {
            this.f41193a.a(cVar, this.f41197e);
        } else {
            cVar.F0(' ');
        }
        cVar.F0(']');
    }

    @Override // com.fasterxml.jackson.core.i
    public void i(com.fasterxml.jackson.core.c cVar) {
        if (this.f41196d) {
            cVar.N0(this.f41199g);
        } else {
            cVar.F0(this.f41198f.i());
        }
    }

    @Override // com.fasterxml.jackson.core.i
    public void j(com.fasterxml.jackson.core.c cVar, int i10) {
        if (!this.f41194b.isInline()) {
            this.f41197e--;
        }
        if (i10 > 0) {
            this.f41194b.a(cVar, this.f41197e);
        } else {
            cVar.F0(' ');
        }
        cVar.F0('}');
    }

    @Override // com.fasterxml.jackson.core.i
    public void k(com.fasterxml.jackson.core.c cVar) {
        if (!this.f41193a.isInline()) {
            this.f41197e++;
        }
        cVar.F0('[');
    }

    public e l(h hVar) {
        this.f41198f = hVar;
        this.f41199g = " " + hVar.i() + " ";
        return this;
    }

    public e(com.fasterxml.jackson.core.j jVar) {
        this.f41193a = a.f41200b;
        this.f41194b = d.f41188f;
        this.f41196d = true;
        this.f41195c = jVar;
        l(com.fasterxml.jackson.core.i.f16217t2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c implements b, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f41201a = new c();

        @Override // i8.e.b
        public boolean isInline() {
            return true;
        }

        @Override // i8.e.b
        public void a(com.fasterxml.jackson.core.c cVar, int i10) {
        }
    }
}
