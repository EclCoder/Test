package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zztc {
    String zza();

    default InputStream zzb(Uri uri, InputStream inputStream) throws IOException {
        if (inputStream != null) {
            inputStream.close();
        }
        throw new zzsk("wrapForRead not supported by ".concat(String.valueOf(zza())));
    }

    default OutputStream zzc(Uri uri, OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new zzsk("wrapForWrite not supported by ".concat(String.valueOf(zza())));
    }
}
