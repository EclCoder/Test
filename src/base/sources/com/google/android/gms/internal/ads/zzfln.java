package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfln {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void zzb(Bundle bundle, String str, String str2, boolean z10) {
        if (!z10 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void zzc(Bundle bundle, String str, int i10, boolean z10) {
        if (z10) {
            bundle.putInt(str, i10);
        }
    }

    public static void zzd(Bundle bundle, String str, boolean z10, boolean z11) {
        if (z11) {
            bundle.putBoolean(str, z10);
        }
    }

    public static void zze(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzf(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzg(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zzh(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }
}
