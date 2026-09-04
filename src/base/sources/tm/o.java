package tm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f53544a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f53544a = z10;
    }

    public static final r2 a(Function1 factory) {
        kotlin.jvm.internal.s.h(factory, "factory");
        return f53544a ? new s(factory) : new x(factory);
    }

    public static final y1 b(tl.o factory) {
        kotlin.jvm.internal.s.h(factory, "factory");
        return f53544a ? new t(factory) : new y(factory);
    }
}
