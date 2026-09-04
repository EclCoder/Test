package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbul implements zzbqg {
    final /* synthetic */ zzbum zza;
    private final zzbto zzb;
    private final zzcfw zzc;

    public zzbul(zzbum zzbumVar, zzbto zzbtoVar, zzcfw zzcfwVar) {
        Objects.requireNonNull(zzbumVar);
        this.zza = zzbumVar;
        this.zzb = zzbtoVar;
        this.zzc = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.zzc.zzd(e10);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbtx());
            } else {
                this.zzc.zzd(new zzbtx(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zza();
        }
    }
}
