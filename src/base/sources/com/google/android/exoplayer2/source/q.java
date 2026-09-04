package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface q {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.b f17876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f17877c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0288a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f17878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public q f17879b;

            public C0288a(Handler handler, q qVar) {
                this.f17878a = handler;
                this.f17879b = qVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, q qVar) {
            ob.a.e(handler);
            ob.a.e(qVar);
            this.f17877c.add(new C0288a(handler, qVar));
        }

        public void h(int i10, v0 v0Var, int i11, Object obj, long j10) {
            i(new ra.j(1, i10, v0Var, i11, obj, r0.i1(j10), C.TIME_UNSET));
        }

        public void i(final ra.j jVar) {
            for (C0288a c0288a : this.f17877c) {
                final q qVar = c0288a.f17879b;
                r0.Q0(c0288a.f17878a, new Runnable() { // from class: ra.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.q.a aVar = this.f51226a;
                        qVar.F(aVar.f17875a, aVar.f17876b, jVar);
                    }
                });
            }
        }

        public void j(ra.i iVar, int i10) {
            k(iVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void k(ra.i iVar, int i10, int i11, v0 v0Var, int i12, Object obj, long j10, long j11) {
            l(iVar, new ra.j(i10, i11, v0Var, i12, obj, r0.i1(j10), r0.i1(j11)));
        }

        public void l(final ra.i iVar, final ra.j jVar) {
            for (C0288a c0288a : this.f17877c) {
                final q qVar = c0288a.f17879b;
                r0.Q0(c0288a.f17878a, new Runnable() { // from class: ra.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.q.a aVar = this.f51214a;
                        qVar.N(aVar.f17875a, aVar.f17876b, iVar, jVar);
                    }
                });
            }
        }

        public void m(ra.i iVar, int i10) {
            n(iVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void n(ra.i iVar, int i10, int i11, v0 v0Var, int i12, Object obj, long j10, long j11) {
            o(iVar, new ra.j(i10, i11, v0Var, i12, obj, r0.i1(j10), r0.i1(j11)));
        }

        public void o(final ra.i iVar, final ra.j jVar) {
            for (C0288a c0288a : this.f17877c) {
                final q qVar = c0288a.f17879b;
                r0.Q0(c0288a.f17878a, new Runnable() { // from class: ra.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.q.a aVar = this.f51204a;
                        qVar.R(aVar.f17875a, aVar.f17876b, iVar, jVar);
                    }
                });
            }
        }

        public void p(ra.i iVar, int i10, int i11, v0 v0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            r(iVar, new ra.j(i10, i11, v0Var, i12, obj, r0.i1(j10), r0.i1(j11)), iOException, z10);
        }

        public void q(ra.i iVar, int i10, IOException iOException, boolean z10) {
            p(iVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z10);
        }

        public void r(final ra.i iVar, final ra.j jVar, final IOException iOException, final boolean z10) {
            for (C0288a c0288a : this.f17877c) {
                final q qVar = c0288a.f17879b;
                r0.Q0(c0288a.f17878a, new Runnable() { // from class: ra.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.q.a aVar = this.f51208a;
                        qVar.G(aVar.f17875a, aVar.f17876b, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        public void s(ra.i iVar, int i10) {
            t(iVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void t(ra.i iVar, int i10, int i11, v0 v0Var, int i12, Object obj, long j10, long j11) {
            u(iVar, new ra.j(i10, i11, v0Var, i12, obj, r0.i1(j10), r0.i1(j11)));
        }

        public void u(final ra.i iVar, final ra.j jVar) {
            for (C0288a c0288a : this.f17877c) {
                final q qVar = c0288a.f17879b;
                r0.Q0(c0288a.f17878a, new Runnable() { // from class: ra.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.q.a aVar = this.f51218a;
                        qVar.E(aVar.f17875a, aVar.f17876b, iVar, jVar);
                    }
                });
            }
        }

        public void v(q qVar) {
            for (C0288a c0288a : this.f17877c) {
                if (c0288a.f17879b == qVar) {
                    this.f17877c.remove(c0288a);
                }
            }
        }

        public void w(int i10, long j10, long j11) {
            x(new ra.j(1, i10, null, 3, null, r0.i1(j10), r0.i1(j11)));
        }

        public void x(final ra.j jVar) {
            final p.b bVar = (p.b) ob.a.e(this.f17876b);
            for (C0288a c0288a : this.f17877c) {
                final q qVar = c0288a.f17879b;
                r0.Q0(c0288a.f17878a, new Runnable() { // from class: ra.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        qVar.K(this.f51222a.f17875a, bVar, jVar);
                    }
                });
            }
        }

        public a y(int i10, p.b bVar) {
            return new a(this.f17877c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, p.b bVar) {
            this.f17877c = copyOnWriteArrayList;
            this.f17875a = i10;
            this.f17876b = bVar;
        }
    }

    void E(int i10, p.b bVar, ra.i iVar, ra.j jVar);

    void F(int i10, p.b bVar, ra.j jVar);

    void G(int i10, p.b bVar, ra.i iVar, ra.j jVar, IOException iOException, boolean z10);

    void K(int i10, p.b bVar, ra.j jVar);

    void N(int i10, p.b bVar, ra.i iVar, ra.j jVar);

    void R(int i10, p.b bVar, ra.i iVar, ra.j jVar);
}
