package je;

import com.google.firebase.remoteconfig.internal.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42441b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f42442a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f42443b = m.f22325j;

        public i c() {
            return new i(this);
        }

        public b d(long j10) {
            if (j10 >= 0) {
                this.f42443b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f42440a;
    }

    public long b() {
        return this.f42441b;
    }

    private i(b bVar) {
        this.f42440a = bVar.f42442a;
        this.f42441b = bVar.f42443b;
    }
}
