package q1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.c f50292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f50293b;

    public f(zl.c clazz, Function1 initializer) {
        s.h(clazz, "clazz");
        s.h(initializer, "initializer");
        this.f50292a = clazz;
        this.f50293b = initializer;
    }

    public final zl.c a() {
        return this.f50292a;
    }

    public final Function1 b() {
        return this.f50293b;
    }
}
