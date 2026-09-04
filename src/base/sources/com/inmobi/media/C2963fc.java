package com.inmobi.media;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2963fc implements gn.z {
    @Override // gn.z
    public final gn.f0 intercept(gn.z.a chain) throws MalformedURLException {
        kotlin.jvm.internal.s.h(chain, "chain");
        gn.f0 f0VarC = chain.c(chain.e());
        if (f0VarC.g0()) {
            kotlin.jvm.internal.s.e(f0VarC);
            kotlin.jvm.internal.s.h(f0VarC, "<this>");
            String strS = f0VarC.g0() ? f0VarC.s("Location") : null;
            if (strS != null) {
                kotlin.jvm.internal.s.h(strS, "<this>");
                try {
                    new URL(strS);
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException("Invalid URL in Location header: " + strS);
        }
        kotlin.jvm.internal.s.e(f0VarC);
        return f0VarC;
    }
}
