package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zztu {
    public static boolean zza(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || !(i10 == 26 || i10 == 27)) {
            return i11 >= 33 && i10 == 30;
        }
        return true;
    }
}
