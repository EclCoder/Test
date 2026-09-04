package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Un {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f25858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25859b;

    public Un(em.o0 coroutineScope, int i10) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f25858a = coroutineScope;
        this.f25859b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Un)) {
            return false;
        }
        Un un2 = (Un) obj;
        return kotlin.jvm.internal.s.c(this.f25858a, un2.f25858a) && this.f25859b == un2.f25859b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25859b) + (this.f25858a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f25858a + ", impressionMinDuration=" + this.f25859b + ")";
    }
}
