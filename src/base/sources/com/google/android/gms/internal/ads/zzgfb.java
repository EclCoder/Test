package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfb extends zzget {
    private final ExecutorService zzb;
    private final zzgfa zzc;
    private final zzgta zzd;

    public zzgfb(File file, ExecutorService executorService, zzgfa zzgfaVar, zzgta zzgtaVar) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgfaVar;
        this.zzd = zzgtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final ListenableFuture zzb() {
        return zzhbw.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgey
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final ListenableFuture zzc(final Object obj) {
        return zzhbw.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgex
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Object zzd() {
        Object objApply;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        objZzb = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException unused) {
                    objApply = this.zzc.zzc();
                    return objApply;
                }
            } catch (zzgew e10) {
                objApply = this.zzd.apply(e10);
                return objApply;
            } catch (IOException e11) {
                objApply = this.zzd.apply(new zzgew(e11));
                return objApply;
            }
        }
        return objZzb;
    }

    final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgzt.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
            sb2.append(name);
            sb2.append(".temp");
            File file2 = new File(parent, sb2.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                file2.delete();
                throw e10;
            }
        }
        return null;
    }
}
