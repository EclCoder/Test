package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcef {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcds zzd;

    zzcef(Context context, zzcds zzcdsVar) {
        this.zzc = context;
        this.zzd = zzcdsVar;
    }

    final synchronized void zza(zzced zzcedVar) {
        this.zzb.add(zzcedVar);
    }

    final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzcec zzcecVar = new zzcec(this, str);
            map.put(str, zzcecVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcecVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
