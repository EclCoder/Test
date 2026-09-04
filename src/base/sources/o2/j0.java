package o2;

import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface j0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f48077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f48078b;

        public a(k0 k0Var) {
            this(k0Var, k0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f48077a.equals(aVar.f48077a) && this.f48078b.equals(aVar.f48078b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f48077a.hashCode() * 31) + this.f48078b.hashCode();
        }

        public a(k0 k0Var, k0 k0Var2) {
            this.f48077a = (k0) w1.a.e(k0Var);
            this.f48078b = (k0) w1.a.e(k0Var2);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f48077a);
            if (this.f48077a.equals(this.f48078b)) {
                str = qnwOeeQSSWa.sUo;
            } else {
                str = ", " + this.f48078b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f48079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f48080b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // o2.j0
        public long getDurationUs() {
            return this.f48079a;
        }

        @Override // o2.j0
        public a getSeekPoints(long j10) {
            return this.f48080b;
        }

        @Override // o2.j0
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f48079a = j10;
            this.f48080b = new a(j11 == 0 ? k0.f48081c : new k0(0L, j11));
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
