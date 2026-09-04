package i8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41219a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f41220b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReferenceQueue f41221c = new ReferenceQueue();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f41222a = new j();
    }

    j() {
    }

    public static j a() {
        return a.f41222a;
    }

    private void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f41221c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f41220b.remove(softReference);
            }
        }
    }

    public SoftReference c(i8.a aVar) {
        SoftReference softReference = new SoftReference(aVar, this.f41221c);
        this.f41220b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
