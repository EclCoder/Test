package ge;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f39129a;

    private b() {
    }

    public static b a() {
        if (f39129a == null) {
            f39129a = new b();
        }
        return f39129a;
    }

    @Override // ge.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
