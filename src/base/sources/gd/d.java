package gd;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import md.h0;
import md.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements gd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f39114c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.a f39115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f39116b = new AtomicReference(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements h {
        private b() {
        }

        @Override // gd.h
        public File a() {
            return null;
        }

        @Override // gd.h
        public h0.a b() {
            return null;
        }

        @Override // gd.h
        public File c() {
            return null;
        }

        @Override // gd.h
        public File d() {
            return null;
        }

        @Override // gd.h
        public File e() {
            return null;
        }

        @Override // gd.h
        public File f() {
            return null;
        }

        @Override // gd.h
        public File g() {
            return null;
        }
    }

    public d(ce.a aVar) {
        this.f39115a = aVar;
        aVar.a(new ce.a.InterfaceC0137a() { // from class: gd.b
            @Override // ce.a.InterfaceC0137a
            public final void a(ce.b bVar) {
                d.f(this.f39109a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(d dVar, ce.b bVar) {
        dVar.getClass();
        g.f().b("Crashlytics native component now available.");
        dVar.f39116b.set((gd.a) bVar.get());
    }

    @Override // gd.a
    public h a(String str) {
        gd.a aVar = (gd.a) this.f39116b.get();
        return aVar == null ? f39114c : aVar.a(str);
    }

    @Override // gd.a
    public boolean b() {
        gd.a aVar = (gd.a) this.f39116b.get();
        return aVar != null && aVar.b();
    }

    @Override // gd.a
    public boolean c(String str) {
        gd.a aVar = (gd.a) this.f39116b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // gd.a
    public void d(final String str, final String str2, final long j10, final i0 i0Var) {
        g.f().i("Deferring native open session: " + str);
        this.f39115a.a(new ce.a.InterfaceC0137a() { // from class: gd.c
            @Override // ce.a.InterfaceC0137a
            public final void a(ce.b bVar) {
                ((a) bVar.get()).d(str, str2, j10, i0Var);
            }
        });
    }
}
