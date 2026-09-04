package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzsx {
    String zzc();

    default InputStream zzd(Uri uri) throws zzsk {
        throw new zzsk("openForRead not supported by ".concat(String.valueOf(zzc())));
    }

    default boolean zze(Uri uri) throws zzsk {
        throw new zzsk("exists not supported by ".concat(String.valueOf(zzc())));
    }

    default File zzg(Uri uri) throws zzsk {
        String strZzc = zzc();
        String strValueOf = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzc).length() + 28 + strValueOf.length());
        sb2.append("Cannot convert uri to file ");
        sb2.append(strZzc);
        sb2.append(" ");
        sb2.append(strValueOf);
        throw new zzsk(sb2.toString());
    }

    default OutputStream zzj(Uri uri) throws zzsk {
        throw new zzsk("openForWrite not supported by ".concat(String.valueOf(zzc())));
    }

    default void zzk(Uri uri) throws zzsk {
        throw new zzsk("deleteFile not supported by ".concat(String.valueOf(zzc())));
    }

    default void zzl(Uri uri, Uri uri2) throws zzsk {
        throw new zzsk("rename not supported by ".concat(String.valueOf(zzc())));
    }
}
