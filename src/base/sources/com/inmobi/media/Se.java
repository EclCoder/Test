package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Se extends Ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gk f25690b;

    public Se(String url, Gk gk2) {
        kotlin.jvm.internal.s.h(url, "url");
        this.f25689a = url;
        this.f25690b = gk2;
    }

    @Override // com.inmobi.media.Ue
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Ue
    public final Ni b() {
        return null;
    }

    @Override // com.inmobi.media.Ue
    public final String c() {
        return this.f25689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Se)) {
            return false;
        }
        Se se2 = (Se) obj;
        return kotlin.jvm.internal.s.c(this.f25689a, se2.f25689a) && kotlin.jvm.internal.s.c(null, null) && kotlin.jvm.internal.s.c(this.f25690b, se2.f25690b) && kotlin.jvm.internal.s.c(null, null);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f25690b.hashCode() + (this.f25689a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.f25689a + ", headers=" + ((Object) null) + ", timeouts=" + this.f25690b + ", retryPolicy=" + ((Object) null) + ", followRedirects=true)";
    }
}
