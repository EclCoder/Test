package com.inmobi.media;

import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3343u4 extends AbstractC3317t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f27595b;

    public C3343u4(int i10, Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        this.f27594a = i10;
        this.f27595b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3343u4)) {
            return false;
        }
        C3343u4 c3343u4 = (C3343u4) obj;
        return this.f27594a == c3343u4.f27594a && kotlin.jvm.internal.s.c(this.f27595b, c3343u4.f27595b);
    }

    public final int hashCode() {
        return this.f27595b.hashCode() + (Integer.hashCode(this.f27594a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.f27594a + trPLwhKZgZ.OlGm + this.f27595b + ")";
    }
}
