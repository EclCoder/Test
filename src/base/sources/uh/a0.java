package uh;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final /* synthetic */ class a0 implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function1 f54451a;

    a0(Function1 function) {
        kotlin.jvm.internal.s.h(function, "function");
        this.f54451a = function;
    }

    @Override // kotlin.jvm.internal.m
    public final fl.g a() {
        return this.f54451a;
    }

    @Override // androidx.lifecycle.q0
    public final /* synthetic */ void d(Object obj) {
        this.f54451a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
            return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
