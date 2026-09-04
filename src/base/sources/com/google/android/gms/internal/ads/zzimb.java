package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzimb implements zzaup {
    private static final zzimm zzg = zzimm.zzb(zzimb.class);
    protected final String zza;
    long zzd;
    zzimg zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    protected zzimb(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzimm zzimmVar = zzg;
                String str = this.zza;
                zzimmVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zze(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzb(zzimg zzimgVar, ByteBuffer byteBuffer, long j10, zzaum zzaumVar) {
        this.zzd = zzimgVar.zzc();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zzimgVar;
        zzimgVar.zzd(zzimgVar.zzc() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzimm zzimmVar = zzg;
            String str = this.zza;
            zzimmVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
