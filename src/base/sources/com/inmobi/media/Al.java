package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f24487b;

    public Al(int i10, Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        this.f24486a = i10;
        this.f24487b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Al)) {
            return false;
        }
        Al al2 = (Al) obj;
        return this.f24486a == al2.f24486a && kotlin.jvm.internal.s.c(this.f24487b, al2.f24487b);
    }

    public final int hashCode() {
        return this.f24487b.hashCode() + (Integer.hashCode(this.f24486a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f24486a + ", config=" + this.f24487b + ")";
    }
}
