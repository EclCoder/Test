package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.s4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3291s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27431a = C3291s4.class.getSimpleName();

    public final Al a(C3005h2 configResponseObj, C3240q4 configRequestContext) {
        Integer num;
        kotlin.jvm.internal.s.h(configResponseObj, "configResponseObj");
        kotlin.jvm.internal.s.h(configRequestContext, "configRequestContext");
        int iB = configResponseObj.b();
        Config config = configRequestContext.f27311b;
        if (iB == 200) {
            try {
                Config configA = configResponseObj.a();
                if (configA == null) {
                    String tag = this.f27431a;
                    kotlin.jvm.internal.s.g(tag, "tag");
                    num = 3;
                } else if (configA.isValid()) {
                    num = null;
                } else {
                    String tag2 = this.f27431a;
                    kotlin.jvm.internal.s.g(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    iB = num.intValue();
                } else {
                    if (configA == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = configA;
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        } else if (iB != 304) {
            String tag3 = this.f27431a;
            kotlin.jvm.internal.s.g(tag3, "tag");
            iB += 1000;
        } else {
            String tag4 = this.f27431a;
            kotlin.jvm.internal.s.g(tag4, "tag");
            configRequestContext.f27311b.getType();
        }
        return new Al(iB, config);
    }
}
