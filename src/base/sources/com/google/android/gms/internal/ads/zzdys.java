package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdys implements zzdfx, zzdef, zzdcu, zzdlk {
    private final zzdzg zza;
    private final zzdzq zzb;

    zzdys(zzdzg zzdzgVar, zzdzq zzdzqVar) {
        this.zza = zzdzgVar;
        this.zzb = zzdzqVar;
    }

    private final void zzc(Bundle bundle, zzgwm zzgwmVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcN)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdyu.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzdzg zzdzgVar = this.zza;
        zzdzgVar.zzh();
        if (bundle.containsKey("ls")) {
            zzdzgVar.zzd("ls", true != bundle.getBoolean("ls") ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        int size = zzgwmVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzdyv zzdyvVar = (zzdyv) zzgwmVar.get(i10);
            long j10 = bundle.getLong(zzdyvVar.zzb().zza(), -1L);
            long j11 = bundle.getLong(zzdyvVar.zzc().zza(), -1L);
            if (j10 > 0 && j11 > 0) {
                zzdzgVar.zzd(zzdyvVar.zza(), String.valueOf(j11 - j10));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.zza.zzd(str, String.valueOf(j10));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhT)).booleanValue()) {
            if (zzbcVar == null) {
                zzdzg zzdzgVar = this.zza;
                zzdzgVar.zzc().put("action", "sgs");
                zzdzgVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdzgVar.zzc());
                return;
            }
            zzcbd zzcbdVar = zzbcVar.zzc;
            if (zzcbdVar != null) {
                zzc(zzcbdVar.zzm, zzdyv.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
                zzdzg zzdzgVar2 = this.zza;
                zzdzgVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdzgVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlc)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e10);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzcbd zzcbdVar2 = zzbcVar.zzc;
                if (zzcbdVar2 != null) {
                    this.zza.zzb(zzcbdVar2.zza);
                }
                zzdzg zzdzgVar3 = this.zza;
                zzdzgVar3.zzi();
                this.zzb.zzb(zzdzgVar3.zzc());
            } catch (JSONException unused) {
                zzdzg zzdzgVar4 = this.zza;
                zzdzgVar4.zzc().put("action", "sgf");
                zzdzgVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdzgVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdzg zzdzgVar = this.zza;
        zzdzgVar.zzc().put("action", "ftl");
        zzdzgVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdzgVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzii)).booleanValue()) {
            zzdzgVar.zzd("emsg", zzeVar.zzb);
        }
        zzdzgVar.zzi();
        this.zzb.zzb(zzdzgVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(zzcbd zzcbdVar) {
        this.zza.zzb(zzcbdVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(zzfkq zzfkqVar) {
        this.zza.zza(zzfkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhT)).booleanValue()) {
            zzdzg zzdzgVar = this.zza;
            zzdzgVar.zzc().put("action", "sgf");
            zzdzgVar.zzd("sgf_reason", str);
            zzdzgVar.zzi();
            this.zzb.zzb(zzdzgVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        zzdzg zzdzgVar = this.zza;
        zzdzgVar.zzc().put("action", "loaded");
        zzc(zzdzgVar.zze(), zzdyv.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzod)).booleanValue()) {
            zzdzgVar.zzc().put("mafe", true != x4.g.a("MUTE_AUDIO") ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        zzdzgVar.zzi();
        this.zzb.zzb(zzdzgVar.zzc());
    }
}
