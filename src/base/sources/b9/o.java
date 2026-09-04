package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class a {
        public abstract o a();

        public abstract a b(b9.a aVar);

        public abstract a c(b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8632a;

        b(int i10) {
            this.f8632a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract b9.a b();

    public abstract b c();
}
