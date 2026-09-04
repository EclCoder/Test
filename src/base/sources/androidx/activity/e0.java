package androidx.activity;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e0 extends e4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.b0 f570b;

    public e0(d0 callback, androidx.lifecycle.b0 b0Var) {
        kotlin.jvm.internal.s.h(callback, "callback");
        this.f569a = callback;
        this.f570b = b0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.s.c(this.f569a, e0Var.f569a) && kotlin.jvm.internal.s.c(this.f570b, e0Var.f570b);
    }

    public int hashCode() {
        int iHashCode = this.f569a.hashCode() * 31;
        androidx.lifecycle.b0 b0Var = this.f570b;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f569a + ", owner=" + this.f570b + ')';
    }

    public /* synthetic */ e0(d0 d0Var, androidx.lifecycle.b0 b0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, (i10 & 2) != 0 ? null : b0Var);
    }
}
