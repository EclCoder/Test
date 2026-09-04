package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k extends f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {
        a() {
        }

        public abstract k a();

        public abstract a b(long j10);

        abstract a c(long j10);

        public abstract a d(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        SENT,
        RECEIVED
    }

    k() {
    }

    public static a a(b bVar, long j10) {
        return new d.b().e((b) jk.b.b(bVar, "type")).c(j10).d(0L).b(0L);
    }

    public abstract long b();

    public abstract long c();

    public abstract b d();

    public abstract long e();
}
