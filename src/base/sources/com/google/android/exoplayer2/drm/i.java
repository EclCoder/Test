package com.google.android.exoplayer2.drm;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.p.b f16864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f16865c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0281a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f16866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public i f16867b;

            public C0281a(Handler handler, i iVar) {
                this.f16866a = handler;
                this.f16867b = iVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void d(a aVar, i iVar, int i10) {
            iVar.u(aVar.f16863a, aVar.f16864b);
            iVar.S(aVar.f16863a, aVar.f16864b, i10);
        }

        public void g(Handler handler, i iVar) {
            ob.a.e(handler);
            ob.a.e(iVar);
            this.f16865c.add(new C0281a(handler, iVar));
        }

        public void h() {
            for (C0281a c0281a : this.f16865c) {
                final i iVar = c0281a.f16867b;
                r0.Q0(c0281a.f16866a, new Runnable() { // from class: t9.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f53176a;
                        iVar.Q(aVar.f16863a, aVar.f16864b);
                    }
                });
            }
        }

        public void i() {
            for (C0281a c0281a : this.f16865c) {
                final i iVar = c0281a.f16867b;
                r0.Q0(c0281a.f16866a, new Runnable() { // from class: t9.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f53172a;
                        iVar.q(aVar.f16863a, aVar.f16864b);
                    }
                });
            }
        }

        public void j() {
            for (C0281a c0281a : this.f16865c) {
                final i iVar = c0281a.f16867b;
                r0.Q0(c0281a.f16866a, new Runnable() { // from class: t9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f53174a;
                        iVar.U(aVar.f16863a, aVar.f16864b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0281a c0281a : this.f16865c) {
                final i iVar = c0281a.f16867b;
                r0.Q0(c0281a.f16866a, new Runnable() { // from class: t9.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a.d(this.f53169a, iVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0281a c0281a : this.f16865c) {
                final i iVar = c0281a.f16867b;
                r0.Q0(c0281a.f16866a, new Runnable() { // from class: t9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f53164a;
                        iVar.J(aVar.f16863a, aVar.f16864b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0281a c0281a : this.f16865c) {
                final i iVar = c0281a.f16867b;
                r0.Q0(c0281a.f16866a, new Runnable() { // from class: t9.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.i.a aVar = this.f53167a;
                        iVar.T(aVar.f16863a, aVar.f16864b);
                    }
                });
            }
        }

        public void n(i iVar) {
            for (C0281a c0281a : this.f16865c) {
                if (c0281a.f16867b == iVar) {
                    this.f16865c.remove(c0281a);
                }
            }
        }

        public a o(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            return new a(this.f16865c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, com.google.android.exoplayer2.source.p.b bVar) {
            this.f16865c = copyOnWriteArrayList;
            this.f16863a = i10;
            this.f16864b = bVar;
        }
    }

    void J(int i10, com.google.android.exoplayer2.source.p.b bVar, Exception exc);

    void Q(int i10, com.google.android.exoplayer2.source.p.b bVar);

    void S(int i10, com.google.android.exoplayer2.source.p.b bVar, int i11);

    void T(int i10, com.google.android.exoplayer2.source.p.b bVar);

    void U(int i10, com.google.android.exoplayer2.source.p.b bVar);

    void q(int i10, com.google.android.exoplayer2.source.p.b bVar);

    default void u(int i10, com.google.android.exoplayer2.source.p.b bVar) {
    }
}
