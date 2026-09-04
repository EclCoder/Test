package com.vungle.ads.internal.network.converters;

import gn.g0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    @Override // com.vungle.ads.internal.network.converters.a
    public Void convert(g0 g0Var) throws IOException {
        if (g0Var != null) {
            try {
                g0Var.close();
                fl.g0 g0Var2 = fl.g0.f38750a;
                ql.b.a(g0Var, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(g0Var, th2);
                    throw th3;
                }
            }
        }
        return null;
    }
}
