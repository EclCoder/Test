package androidx.lifecycle;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f4562a;

    public y1(Object reference) {
        kotlin.jvm.internal.s.h(reference, "reference");
        this.f4562a = new WeakReference(reference);
    }

    public final Object a() {
        return this.f4562a.get();
    }
}
