package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class u implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u f3737a = new u();

    private u() {
    }

    public static u a() {
        return f3737a;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public boolean isSupported(Class cls) {
        return v.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public l0 messageInfoFor(Class cls) {
        if (!v.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (l0) v.q(cls.asSubclass(v.class)).f();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
