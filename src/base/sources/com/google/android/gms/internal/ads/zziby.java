package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zziby implements CharSequence {
    private char[] zza;
    private String zzb;

    private zziby() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.zza[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.zza.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new String(this.zza, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.zzb == null) {
            this.zzb = new String(this.zza);
        }
        return this.zzb;
    }

    final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }

    /* synthetic */ zziby(byte[] bArr) {
    }
}
