package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface p {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17874a = r.f17880b;

        p a(y0 y0Var);

        a b(com.google.android.exoplayer2.upstream.c cVar);

        a c(t9.k kVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends ra.k {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(ra.k kVar) {
            super(kVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(p pVar, h2 h2Var);
    }

    y0 a();

    default boolean c() {
        return true;
    }

    default h2 d() {
        return null;
    }

    void f(c cVar);

    void h(c cVar, nb.a0 a0Var, s1 s1Var);

    void j(Handler handler, q qVar);

    void k(q qVar);

    void l(o oVar);

    void m(c cVar);

    void maybeThrowSourceInfoRefreshError();

    o o(b bVar, nb.b bVar2, long j10);

    void p(c cVar);

    void q(Handler handler, com.google.android.exoplayer2.drm.i iVar);

    void r(com.google.android.exoplayer2.drm.i iVar);
}
