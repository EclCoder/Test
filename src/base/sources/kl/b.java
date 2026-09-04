package kl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f43521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j.c f43522b;

    public b(j.c baseKey, Function1 safeCast) {
        s.h(baseKey, "baseKey");
        s.h(safeCast, "safeCast");
        this.f43521a = safeCast;
        this.f43522b = baseKey instanceof b ? ((b) baseKey).f43522b : baseKey;
    }

    public final boolean a(j.c key) {
        s.h(key, "key");
        return key == this || this.f43522b == key;
    }

    public final j.b b(j.b element) {
        s.h(element, "element");
        return (j.b) this.f43521a.invoke(element);
    }
}
