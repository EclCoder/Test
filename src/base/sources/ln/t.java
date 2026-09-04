package ln;

import gn.y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface t {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        n a();

        a b();

        b c();

        void cancel();

        a d();

        boolean isReady();
    }

    static /* synthetic */ boolean d(t tVar, n nVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            nVar = null;
        }
        return tVar.f(nVar);
    }

    gn.a a();

    gl.i b();

    b c();

    boolean e(y yVar);

    boolean f(n nVar);

    boolean isCanceled();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f44847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f44848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Throwable f44849c;

        public a(b plan, b bVar, Throwable th2) {
            kotlin.jvm.internal.s.h(plan, "plan");
            this.f44847a = plan;
            this.f44848b = bVar;
            this.f44849c = th2;
        }

        public final b a() {
            return this.f44848b;
        }

        public final Throwable b() {
            return this.f44849c;
        }

        public final b c() {
            return this.f44848b;
        }

        public final b d() {
            return this.f44847a;
        }

        public final Throwable e() {
            return this.f44849c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f44847a, aVar.f44847a) && kotlin.jvm.internal.s.c(this.f44848b, aVar.f44848b) && kotlin.jvm.internal.s.c(this.f44849c, aVar.f44849c);
        }

        public final boolean f() {
            return this.f44848b == null && this.f44849c == null;
        }

        public int hashCode() {
            int iHashCode = this.f44847a.hashCode() * 31;
            b bVar = this.f44848b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th2 = this.f44849c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f44847a + ", nextPlan=" + this.f44848b + ", throwable=" + this.f44849c + ')';
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th2);
        }
    }
}
