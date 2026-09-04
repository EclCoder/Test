package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdl extends zzdn {
    zzdl(zzdo zzdoVar, CharSequence charSequence, zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    final int zzd(int i10) {
        CharSequence charSequence = ((zzdn) this).zza;
        int length = charSequence.length();
        zzdj.zzb(i10, length, "index");
        while (i10 < length) {
            if (charSequence.charAt(i10) == ',') {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
