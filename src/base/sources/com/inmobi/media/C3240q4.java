package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3240q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f27311b;

    public C3240q4(String url, Config availableConfig) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(availableConfig, "availableConfig");
        this.f27310a = url;
        this.f27311b = availableConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3240q4) && kotlin.jvm.internal.s.c(this.f27311b.getType(), ((C3240q4) obj).f27311b.getType());
    }

    public final int hashCode() {
        return this.f27311b.getType().hashCode();
    }
}
