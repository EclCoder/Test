package of;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48542a;

        public a(int i10) {
            this.f48542a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f48542a == ((a) obj).f48542a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f48542a);
        }

        public String toString() {
            return "Extracting(filesDone=" + this.f48542a + ')';
        }
    }

    /* JADX INFO: renamed from: of.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0748b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final of.a f48543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f48544b;

        public C0748b(of.a kind, Throwable th2) {
            s.h(kind, "kind");
            this.f48543a = kind;
            this.f48544b = th2;
        }

        public final of.a a() {
            return this.f48543a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0748b)) {
                return false;
            }
            C0748b c0748b = (C0748b) obj;
            return this.f48543a == c0748b.f48543a && s.c(this.f48544b, c0748b.f48544b);
        }

        public int hashCode() {
            int iHashCode = this.f48543a.hashCode() * 31;
            Throwable th2 = this.f48544b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        public String toString() {
            return "Failed(kind=" + this.f48543a + ", cause=" + this.f48544b + ')';
        }

        public /* synthetic */ C0748b(of.a aVar, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? null : th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f48545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48547c;

        public c(long j10, long j11, int i10) {
            this.f48545a = j10;
            this.f48546b = j11;
            this.f48547c = i10;
        }

        public final long a() {
            return this.f48545a;
        }

        public final int b() {
            return this.f48547c;
        }

        public final long c() {
            return this.f48546b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f48545a == cVar.f48545a && this.f48546b == cVar.f48546b && this.f48547c == cVar.f48547c;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f48545a) * 31) + Long.hashCode(this.f48546b)) * 31) + Integer.hashCode(this.f48547c);
        }

        public String toString() {
            return "Progress(bytesRead=" + this.f48545a + ", total=" + this.f48546b + ", percent=" + this.f48547c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f48548a = new d();

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f48549a = new e();

        private e() {
        }
    }
}
