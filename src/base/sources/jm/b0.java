package jm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {
    public static final a0 b(Object obj) {
        if (obj == b.f42637a) {
            throw new IllegalStateException("Does not contain segment");
        }
        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (a0) obj;
    }

    public static final boolean c(Object obj) {
        return obj == b.f42637a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
