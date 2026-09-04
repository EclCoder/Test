package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.source.r;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f5255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f5256c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0061a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f5257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public h f5258b;

            public C0061a(Handler handler, h hVar) {
                this.f5257a = handler;
                this.f5258b = hVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void c(a aVar, h hVar, int i10) {
            hVar.x(aVar.f5254a, aVar.f5255b);
            hVar.w(aVar.f5254a, aVar.f5255b, i10);
        }

        public void g(Handler handler, h hVar) {
            w1.a.e(handler);
            w1.a.e(hVar);
            this.f5256c.add(new C0061a(handler, hVar));
        }

        public void h() {
            for (C0061a c0061a : this.f5256c) {
                final h hVar = c0061a.f5258b;
                c0.K0(c0061a.f5257a, new Runnable() { // from class: e2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f37051a;
                        hVar.t(aVar.f5254a, aVar.f5255b);
                    }
                });
            }
        }

        public void i() {
            for (C0061a c0061a : this.f5256c) {
                final h hVar = c0061a.f5258b;
                c0.K0(c0061a.f5257a, new Runnable() { // from class: e2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f37047a;
                        hVar.y(aVar.f5254a, aVar.f5255b);
                    }
                });
            }
        }

        public void j() {
            for (C0061a c0061a : this.f5256c) {
                final h hVar = c0061a.f5258b;
                c0.K0(c0061a.f5257a, new Runnable() { // from class: e2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f37049a;
                        hVar.B(aVar.f5254a, aVar.f5255b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0061a c0061a : this.f5256c) {
                final h hVar = c0061a.f5258b;
                c0.K0(c0061a.f5257a, new Runnable() { // from class: e2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a.c(this.f37042a, hVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0061a c0061a : this.f5256c) {
                final h hVar = c0061a.f5258b;
                c0.K0(c0061a.f5257a, new Runnable() { // from class: e2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f37039a;
                        hVar.z(aVar.f5254a, aVar.f5255b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0061a c0061a : this.f5256c) {
                final h hVar = c0061a.f5258b;
                c0.K0(c0061a.f5257a, new Runnable() { // from class: e2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.h.a aVar = this.f37045a;
                        hVar.G(aVar.f5254a, aVar.f5255b);
                    }
                });
            }
        }

        public void n(h hVar) {
            for (C0061a c0061a : this.f5256c) {
                if (c0061a.f5258b == hVar) {
                    this.f5256c.remove(c0061a);
                }
            }
        }

        public a o(int i10, r.b bVar) {
            return new a(this.f5256c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, r.b bVar) {
            this.f5256c = copyOnWriteArrayList;
            this.f5254a = i10;
            this.f5255b = bVar;
        }
    }

    void B(int i10, r.b bVar);

    void G(int i10, r.b bVar);

    void t(int i10, r.b bVar);

    void w(int i10, r.b bVar, int i11);

    void y(int i10, r.b bVar);

    void z(int i10, r.b bVar, Exception exc);

    default void x(int i10, r.b bVar) {
    }
}
