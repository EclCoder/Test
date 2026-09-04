package androidx.media3.exoplayer.source;

import android.os.Handler;
import c2.x1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6059e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f6055a.equals(obj) ? this : new b(obj, this.f6056b, this.f6057c, this.f6058d, this.f6059e);
        }

        public boolean b() {
            return this.f6056b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6055a.equals(bVar.f6055a) && this.f6056b == bVar.f6056b && this.f6057c == bVar.f6057c && this.f6058d == bVar.f6058d && this.f6059e == bVar.f6059e;
        }

        public int hashCode() {
            return ((((((((527 + this.f6055a.hashCode()) * 31) + this.f6056b) * 31) + this.f6057c) * 31) + ((int) this.f6058d)) * 31) + this.f6059e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f6055a = obj;
            this.f6056b = i10;
            this.f6057c = i11;
            this.f6058d = j10;
            this.f6059e = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(r rVar, t1.a0 a0Var);
    }

    t1.r a();

    default boolean c() {
        return true;
    }

    default t1.a0 d() {
        return null;
    }

    void e(Handler handler, s sVar);

    q f(b bVar, l2.b bVar2, long j10);

    void g(s sVar);

    void h(Handler handler, androidx.media3.exoplayer.drm.h hVar);

    void i(androidx.media3.exoplayer.drm.h hVar);

    void j(q qVar);

    void l(c cVar);

    void m(c cVar);

    void maybeThrowSourceInfoRefreshError();

    void n(c cVar);

    void o(c cVar, z1.m mVar, x1 x1Var);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6054a = t.f6065b;

        a c(e2.k kVar);

        r d(t1.r rVar);

        a e(androidx.media3.exoplayer.upstream.b bVar);

        default a b(l3.r.a aVar) {
            return this;
        }

        default a f(boolean z10) {
            return this;
        }
    }

    default void k(t1.r rVar) {
    }
}
