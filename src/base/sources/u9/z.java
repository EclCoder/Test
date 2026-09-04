package u9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface z {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f54334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f54335b;

        public a(a0 a0Var) {
            this(a0Var, a0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f54334a.equals(aVar.f54334a) && this.f54335b.equals(aVar.f54335b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f54334a.hashCode() * 31) + this.f54335b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f54334a);
            if (this.f54334a.equals(this.f54335b)) {
                str = "";
            } else {
                str = ", " + this.f54335b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(a0 a0Var, a0 a0Var2) {
            this.f54334a = (a0) ob.a.e(a0Var);
            this.f54335b = (a0) ob.a.e(a0Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f54336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f54337b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // u9.z
        public long getDurationUs() {
            return this.f54336a;
        }

        @Override // u9.z
        public a getSeekPoints(long j10) {
            return this.f54337b;
        }

        @Override // u9.z
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f54336a = j10;
            this.f54337b = new a(j11 == 0 ? a0.f54230c : new a0(0L, j11));
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
