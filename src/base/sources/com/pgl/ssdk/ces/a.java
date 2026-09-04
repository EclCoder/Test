package com.pgl.ssdk.ces;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static native Object meta(int i10, Context context, Object obj);

    public static Object njss(int i10, Object obj) {
        try {
            b bVarE = b.e();
            if (bVarE != null) {
                return bVarE.a(i10, obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
