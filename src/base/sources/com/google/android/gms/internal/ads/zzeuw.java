package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuw implements zzfci {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final e0.b zzk;
    public final zzeut zzl;

    public zzeuw(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, int i12, boolean z11, e0.b bVar, zzeut zzeutVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = i12;
        this.zzj = z11;
        this.zzk = bVar;
        this.zzl = zzeutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        Bundle bundle = (Bundle) obj;
        int i10 = zzrVar.zze;
        zzfln.zzb(bundle, "smart_w", "full", i10 == -1);
        int i11 = zzrVar.zzb;
        zzfln.zzb(bundle, "smart_h", "auto", i11 == -2);
        zzfln.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfln.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfln.zzb(bundle, "rafmt", "108", zzrVar.zzp);
        zzfln.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfln.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfln.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfln.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfln.zze(bundle, "format", this.zzb);
        zzfln.zzb(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzfln.zzb(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.zzg);
        String str2 = this.zzh;
        zzfln.zzb(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i12 = this.zzi;
        if (i12 != -1) {
            bundle.putInt("u_mso", i12);
        }
        e0.b bVar = this.zzk;
        if (bVar != null) {
            bundle.putInt("sam_t", bVar.f37001b);
            bundle.putInt("sam_b", bVar.f37003d);
            bundle.putInt("sam_l", bVar.f37000a);
            bundle.putInt("sam_r", bVar.f37002c);
        }
        zzeut zzeutVar = this.zzl;
        if (zzeutVar != null) {
            bundle.putInt("rc_tl", zzeutVar.zza);
            bundle.putInt("rc_tr", zzeutVar.zzb);
            bundle.putInt("rc_bl", zzeutVar.zzc);
            bundle.putInt("rc_br", zzeutVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i11);
            bundle2.putInt("width", i10);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
