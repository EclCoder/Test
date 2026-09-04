package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.internal.appset.zzr;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AppSet {
    private AppSet() {
    }

    public static AppSetIdClient getClient(Context context) {
        return new zzr(context);
    }
}
