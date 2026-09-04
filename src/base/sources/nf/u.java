package nf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface u {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47636a = new a();

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f47638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f47639c;

        public b(int i10, long j10, long j11) {
            this.f47637a = i10;
            this.f47638b = j10;
            this.f47639c = j11;
        }

        public final long a() {
            return this.f47638b;
        }

        public final int b() {
            return this.f47637a;
        }

        public final long c() {
            return this.f47639c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47637a == bVar.f47637a && this.f47638b == bVar.f47638b && this.f47639c == bVar.f47639c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f47637a) * 31) + Long.hashCode(this.f47638b)) * 31) + Long.hashCode(this.f47639c);
        }

        public String toString() {
            return "Downloading(percent=" + this.f47637a + ", bytesRead=" + this.f47638b + ", totalBytes=" + this.f47639c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47640a;

        public c(int i10) {
            this.f47640a = i10;
        }

        public final int a() {
            return this.f47640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f47640a == ((c) obj).f47640a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47640a);
        }

        public String toString() {
            return "Failed(messageRes=" + this.f47640a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f47641a = new d();

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f47642a = new e();

        private e() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f47643a = new f();

        private f() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47644a;

        public g(int i10) {
            this.f47644a = i10;
        }

        public final int a() {
            return this.f47644a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f47644a == ((g) obj).f47644a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47644a);
        }

        public String toString() {
            return "PreparingAudio(percent=" + this.f47644a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47645a;

        public h(int i10) {
            this.f47645a = i10;
        }

        public final int a() {
            return this.f47645a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f47645a == ((h) obj).f47645a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47645a);
        }

        public String toString() {
            return "Transcribing(percent=" + this.f47645a + ')';
        }
    }
}
