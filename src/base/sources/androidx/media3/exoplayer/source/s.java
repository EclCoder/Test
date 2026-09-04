package androidx.media3.exoplayer.source;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f6061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f6062c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0063a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f6063a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public s f6064b;

            public C0063a(Handler handler, s sVar) {
                this.f6063a = handler;
                this.f6064b = sVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void f(Handler handler, s sVar) {
            w1.a.e(handler);
            w1.a.e(sVar);
            this.f6062c.add(new C0063a(handler, sVar));
        }

        public void g(int i10, t1.o oVar, int i11, Object obj, long j10) {
            h(new i2.j(1, i10, oVar, i11, obj, w1.c0.c1(j10), C.TIME_UNSET));
        }

        public void h(final i2.j jVar) {
            for (C0063a c0063a : this.f6062c) {
                final s sVar = c0063a.f6064b;
                w1.c0.K0(c0063a.f6063a, new Runnable() { // from class: i2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.s.a aVar = this.f40775a;
                        sVar.F(aVar.f6060a, aVar.f6061b, jVar);
                    }
                });
            }
        }

        public void i(i2.i iVar, int i10, int i11, t1.o oVar, int i12, Object obj, long j10, long j11) {
            j(iVar, new i2.j(i10, i11, oVar, i12, obj, w1.c0.c1(j10), w1.c0.c1(j11)));
        }

        public void j(final i2.i iVar, final i2.j jVar) {
            for (C0063a c0063a : this.f6062c) {
                final s sVar = c0063a.f6064b;
                w1.c0.K0(c0063a.f6063a, new Runnable() { // from class: i2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.s.a aVar = this.f40792a;
                        sVar.D(aVar.f6060a, aVar.f6061b, iVar, jVar);
                    }
                });
            }
        }

        public void k(i2.i iVar, int i10, int i11, t1.o oVar, int i12, Object obj, long j10, long j11) {
            l(iVar, new i2.j(i10, i11, oVar, i12, obj, w1.c0.c1(j10), w1.c0.c1(j11)));
        }

        public void l(final i2.i iVar, final i2.j jVar) {
            for (C0063a c0063a : this.f6062c) {
                final s sVar = c0063a.f6064b;
                w1.c0.K0(c0063a.f6063a, new Runnable() { // from class: i2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.s.a aVar = this.f40782a;
                        sVar.u(aVar.f6060a, aVar.f6061b, iVar, jVar);
                    }
                });
            }
        }

        public void m(i2.i iVar, int i10, int i11, t1.o oVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            n(iVar, new i2.j(i10, i11, oVar, i12, obj, w1.c0.c1(j10), w1.c0.c1(j11)), iOException, z10);
        }

        public void n(final i2.i iVar, final i2.j jVar, final IOException iOException, final boolean z10) {
            for (C0063a c0063a : this.f6062c) {
                final s sVar = c0063a.f6064b;
                w1.c0.K0(c0063a.f6063a, new Runnable() { // from class: i2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.s.a aVar = this.f40786a;
                        sVar.q(aVar.f6060a, aVar.f6061b, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        public void o(i2.i iVar, int i10, int i11, t1.o oVar, int i12, Object obj, long j10, long j11) {
            p(iVar, new i2.j(i10, i11, oVar, i12, obj, w1.c0.c1(j10), w1.c0.c1(j11)));
        }

        public void p(final i2.i iVar, final i2.j jVar) {
            for (C0063a c0063a : this.f6062c) {
                final s sVar = c0063a.f6064b;
                w1.c0.K0(c0063a.f6063a, new Runnable() { // from class: i2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.s.a aVar = this.f40778a;
                        sVar.A(aVar.f6060a, aVar.f6061b, iVar, jVar);
                    }
                });
            }
        }

        public void q(s sVar) {
            for (C0063a c0063a : this.f6062c) {
                if (c0063a.f6064b == sVar) {
                    this.f6062c.remove(c0063a);
                }
            }
        }

        public a r(int i10, r.b bVar) {
            return new a(this.f6062c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, r.b bVar) {
            this.f6062c = copyOnWriteArrayList;
            this.f6060a = i10;
            this.f6061b = bVar;
        }
    }

    void A(int i10, r.b bVar, i2.i iVar, i2.j jVar);

    void D(int i10, r.b bVar, i2.i iVar, i2.j jVar);

    void F(int i10, r.b bVar, i2.j jVar);

    void q(int i10, r.b bVar, i2.i iVar, i2.j jVar, IOException iOException, boolean z10);

    void u(int i10, r.b bVar, i2.i iVar, i2.j jVar);
}
