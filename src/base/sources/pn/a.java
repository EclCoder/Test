package pn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f50268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50269c;

    public a(int i10) {
        this.f50267a = i10;
    }

    public static /* synthetic */ void c(a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        aVar.b(j10, j11);
    }

    public final synchronized long a() {
        return this.f50268b - this.f50269c;
    }

    public final synchronized void b(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f50268b + j10;
            this.f50268b = j12;
            long j13 = this.f50269c + j11;
            this.f50269c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f50267a + ", total=" + this.f50268b + ", acknowledged=" + this.f50269c + ", unacknowledged=" + a() + ')';
    }
}
