package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfsa implements zzhbt {
    final /* synthetic */ zzfpw zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzdfg zzc;
    final /* synthetic */ zzfsc zzd;

    zzfsa(zzfsc zzfscVar, zzfpw zzfpwVar, zzfqg zzfqgVar, zzdfg zzdfgVar) {
        this.zza = zzfpwVar;
        this.zzb = zzfqgVar;
        this.zzc = zzdfgVar;
        Objects.requireNonNull(zzfscVar);
        this.zzd = zzfscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzfpw zzfpwVar = this.zza;
        if (zzfpwVar == null) {
            return;
        }
        zzfpwVar.zzd(false);
        zzfqg zzfqgVar = this.zzb;
        if (zzfqgVar != null) {
            zzfqgVar.zza(zzfpwVar);
            zzfqgVar.zzh();
        } else {
            zzfsc zzfscVar = this.zzd;
            zzfscVar.zze().zzb(zzfpwVar.zzm());
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10;
        zzfpw zzfpwVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfpwVar != null) {
            zzfpwVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfqg zzfqgVar = this.zzb;
            if (zzfqgVar == null) {
                this.zzd.zze().zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zza(zzfpwVar);
                zzfqgVar.zzh();
            }
        }
        zzdfg zzdfgVar = this.zzc;
        if (zzdfgVar != null) {
            String strZzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(strZzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString("currency");
                long jOptLong = jSONObject.optLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
                int iHashCode = strOptString.hashCode();
                int i11 = 3;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            jOptLong /= 1000;
                            i10 = 3;
                        } else {
                            i10 = 0;
                        }
                    } else if (strOptString.equals("CPM")) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                } else if (strOptString.equals("CPC")) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            i11 = 2;
                        } else {
                            i11 = 0;
                        }
                    } else if (!strOptString2.equals("PRECISE")) {
                        i11 = 0;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i10, i11, strOptString3, jOptLong));
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "UrlPinger.pingUrl");
            }
        }
    }
}
