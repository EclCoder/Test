package jh;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements d4.c.b, kotlin.jvm.internal.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ tl.a f42463a;

    public a(tl.a function) {
        s.h(function, "function");
        this.f42463a = function;
    }

    @Override // kotlin.jvm.internal.m
    public final fl.g a() {
        return this.f42463a;
    }

    @Override // d4.c.b
    public final /* synthetic */ boolean b() {
        return ((Boolean) this.f42463a.invoke()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d4.c.b) && (obj instanceof kotlin.jvm.internal.m)) {
            return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
