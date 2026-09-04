package com.inmobi.media;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Sf {
    public static final boolean a(Context context, String permission) {
        kotlin.jvm.internal.s.h(permission, "permission");
        if (context == null) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(permission) == 0;
        } catch (Exception unused) {
        }
    }
}
