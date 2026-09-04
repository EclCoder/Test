package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlg {
    public static final /* synthetic */ int zza = 0;
    private static final androidx.collection.a zzb = new androidx.collection.a();

    public static synchronized Uri zza(String str) {
        androidx.collection.a aVar = zzb;
        Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        aVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String zzb(Context context, String str, boolean z10) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
        }
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(packageName).length());
        sb2.append(str);
        sb2.append("#");
        sb2.append(packageName);
        return sb2.toString();
    }
}
