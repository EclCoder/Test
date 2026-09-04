package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3121lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26945a;

    public C3121lf(Map requestParams) {
        kotlin.jvm.internal.s.h(requestParams, "requestParams");
        this.f26945a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3121lf) && kotlin.jvm.internal.s.c(this.f26945a, ((C3121lf) obj).f26945a);
    }

    public final int hashCode() {
        return this.f26945a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f26945a + ")";
    }
}
