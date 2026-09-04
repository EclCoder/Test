package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f3545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3547c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n1.b f3548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f3549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n1.b f3550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f3551d;

        public a(n1.b bVar, Object obj, n1.b bVar2, Object obj2) {
            this.f3548a = bVar;
            this.f3549b = obj;
            this.f3550c = bVar2;
            this.f3551d = obj2;
        }
    }

    private g0(n1.b bVar, Object obj, n1.b bVar2, Object obj2) {
        this.f3545a = new a(bVar, obj, bVar2, obj2);
        this.f3546b = obj;
        this.f3547c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return r.b(aVar.f3548a, 1, obj) + r.b(aVar.f3550c, 2, obj2);
    }

    public static g0 d(n1.b bVar, Object obj, n1.b bVar2, Object obj2) {
        return new g0(bVar, obj, bVar2, obj2);
    }

    static void e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        r.u(codedOutputStream, aVar.f3548a, 1, obj);
        r.u(codedOutputStream, aVar.f3550c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return CodedOutputStream.O(i10) + CodedOutputStream.y(b(this.f3545a, obj, obj2));
    }

    a c() {
        return this.f3545a;
    }
}
