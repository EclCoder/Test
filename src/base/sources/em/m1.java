package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jm.d0 f38031a = new jm.d0("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final jm.d0 f38032b = new jm.d0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
