package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.a;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcr {
    private static final a zza = new a();

    public static synchronized Uri zza(String str) {
        a aVar = zza;
        Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse(YSHErhbVu.svfZvQEeZOhC.concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        aVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
