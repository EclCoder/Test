package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.inmobi.media.ij, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3047ij {
    public static SharedPreferences a() {
        Context context = Xi.f26021a;
        String str = (context != null ? context.getPackageName() : null) + "_preferences";
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
