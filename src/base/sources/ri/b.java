package ri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f51346a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51347b = 33;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f51348c = 33;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f51349d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51350e = false;

    public boolean a() {
        if (!this.f51350e) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f51346a;
        long j10 = this.f51348c;
        if (j10 >= jCurrentTimeMillis) {
            return true;
        }
        this.f51348c = j10 + this.f51347b;
        return false;
    }
}
