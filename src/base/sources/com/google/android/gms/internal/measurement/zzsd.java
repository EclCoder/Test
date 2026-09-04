package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vc.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsd implements zzsx {
    public zzsd(zzsh zzshVar) {
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream zzd(Uri uri) {
        return zzsl.zzb(zzsc.zza(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean zze(Uri uri) {
        return zzsc.zza(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File zzg(Uri uri) {
        return zzsc.zza(uri);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream zzj(Uri uri) throws IOException {
        File fileZza = zzsc.zza(uri);
        b.a(fileZza);
        return new zzsm(new FileOutputStream(fileZza), fileZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzk(Uri uri) throws IOException {
        File fileZza = zzsc.zza(uri);
        if (fileZza.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileZza.delete()) {
            return;
        }
        if (!fileZza.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzl(Uri uri, Uri uri2) throws IOException {
        File fileZza = zzsc.zza(uri);
        File fileZza2 = zzsc.zza(uri2);
        b.a(fileZza2);
        if (!fileZza.renameTo(fileZza2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    public zzsd() {
        new zzsh();
    }
}
