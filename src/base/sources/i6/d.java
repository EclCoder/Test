package i6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f41126a;

        a(boolean z10) {
            this.f41126a = z10;
        }

        boolean g() {
            return this.f41126a;
        }
    }

    boolean a();

    boolean b(c cVar);

    void c(c cVar);

    void e(c cVar);

    boolean g(c cVar);

    d getRoot();

    boolean i(c cVar);
}
