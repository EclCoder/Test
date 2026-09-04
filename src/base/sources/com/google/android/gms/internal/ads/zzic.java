package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzic extends zzhh {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzic() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzib {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfl.zza;
            int i12 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.zzc -= (long) i12;
                zzh(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new zzib(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws zzib {
        Uri uri = zzhtVar.zza;
        this.zzb = uri;
        zzf(zzhtVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, CampaignEx.JSON_KEY_AD_R);
            this.zza = randomAccessFile;
            try {
                long j10 = zzhtVar.zze;
                randomAccessFile.seek(j10);
                long length = zzhtVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j10;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzib(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhtVar);
                return this.zzc;
            } catch (IOException e10) {
                throw new zzib(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzib(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzib(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new zzib(e12, 2006);
        } catch (RuntimeException e13) {
            throw new zzib(e13, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e10) {
                throw new zzib(e10, 2000);
            }
        } catch (Throwable th2) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th2;
        }
    }
}
