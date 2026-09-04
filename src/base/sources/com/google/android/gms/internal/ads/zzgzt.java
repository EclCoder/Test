package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzt {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgzi zzgziVar = new zzgzi();
        file.getClass();
        FileOutputStream fileOutputStreamZza = zzgzr.zza(file, zzgww.zzq(new zzgzq[0]), zzgziVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th2) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgtj.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgtj.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgzs zzgzsVar = new zzgzs(file, null);
        zzgzi zzgziVar = new zzgzi();
        zzgww zzgwwVarZzq = zzgww.zzq(new zzgzq[0]);
        zzgzp zzgzpVarZza = zzgzp.zza();
        try {
            InputStream inputStreamZza = zzgzsVar.zza();
            zzgzpVarZza.zzb(inputStreamZza);
            FileOutputStream fileOutputStreamZza = zzgzr.zza(file2, zzgwwVarZzq, zzgziVar);
            zzgzpVarZza.zzb(fileOutputStreamZza);
            int i10 = zzgzm.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = inputStreamZza.read(bArr);
                if (i11 == -1) {
                    break;
                } else {
                    fileOutputStreamZza.write(bArr, 0, i11);
                }
            }
            zzgzpVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th2) {
            try {
                throw zzgzpVarZza.zzc(th2);
            } catch (Throwable th3) {
                zzgzpVarZza.close();
                throw th3;
            }
        }
    }
}
