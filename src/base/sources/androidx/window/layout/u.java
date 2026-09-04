package androidx.window.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7764a;

    public u(List displayFeatures) {
        kotlin.jvm.internal.s.h(displayFeatures, "displayFeatures");
        this.f7764a = displayFeatures;
    }

    public final List a() {
        return this.f7764a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(u.class, obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f7764a, ((u) obj).f7764a);
    }

    public int hashCode() {
        return this.f7764a.hashCode();
    }

    public String toString() {
        return gl.r.l0(this.f7764a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
