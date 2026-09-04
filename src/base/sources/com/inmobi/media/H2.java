package com.inmobi.media;

import java.util.Objects;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class H2 implements gn.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H2 f24908a = new H2();

    @Override // gn.z
    public final gn.f0 intercept(gn.z.a chain) throws Exception {
        String str = NpmRNZ.dVJXCfyTcvqiTsm;
        kotlin.jvm.internal.s.h(chain, "chain");
        gn.d0 d0VarE = chain.e();
        String str2 = I2.f24979a;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
        Objects.toString(d0VarE);
        try {
            gn.f0 f0VarC = chain.c(d0VarE);
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            Objects.toString(f0VarC);
            kotlin.jvm.internal.s.e(d0VarE);
            kotlin.jvm.internal.s.h(d0VarE, str);
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            Objects.toString(d0VarE);
            Objects.toString(f0VarC);
            kotlin.jvm.internal.s.e(f0VarC);
            return f0VarC;
        } catch (Exception e10) {
            String str3 = I2.f24979a;
            Objects.toString(d0VarE);
            kotlin.jvm.internal.s.e(d0VarE);
            kotlin.jvm.internal.s.h(d0VarE, str);
            throw e10;
        }
    }
}
