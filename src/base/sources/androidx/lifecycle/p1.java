package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1.g f4461a = new r1.g();

    public final void d(String key, AutoCloseable closeable) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(closeable, "closeable");
        r1.g gVar = this.f4461a;
        if (gVar != null) {
            gVar.d(key, closeable);
        }
    }

    public final void e() {
        r1.g gVar = this.f4461a;
        if (gVar != null) {
            gVar.e();
        }
        g();
    }

    public final AutoCloseable f(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        r1.g gVar = this.f4461a;
        if (gVar != null) {
            return gVar.g(key);
        }
        return null;
    }

    protected void g() {
    }
}
