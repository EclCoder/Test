package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f4340a;

    public c(Object obj) {
        this.f4340a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return b.a(this.f4340a, obj, obj2);
    }

    public final Object b() {
        return this.f4340a.get();
    }
}
