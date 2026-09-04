package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwy extends zzfwt {
    public zzfwy(zzfwm zzfwmVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfwmVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfwm zzfwmVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfwe.zzg(jSONObject, zzfwmVar.zzd())) {
            return null;
        }
        zzfwmVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfwu
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfvi zzfviVarZza;
        if (!TextUtils.isEmpty(str) && (zzfviVarZza = zzfvi.zza()) != null) {
            for (zzfuo zzfuoVar : zzfviVarZza.zze()) {
                if (((zzfwt) this).zza.contains(zzfuoVar.zzh())) {
                    zzfuoVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
