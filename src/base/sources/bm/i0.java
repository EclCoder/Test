package bm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i0 {
    public static /* synthetic */ long a(long j10, long j11) {
        if (j11 < 0) {
            return (j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j10 >= 0) {
            return j10 / j11;
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return j12 + ((long) (((j10 - (j12 * j11)) ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE) ? 0 : 1));
    }
}
