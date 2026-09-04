package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfwu extends AsyncTask {
    private zzfwv zza;
    protected final zzfwm zzd;

    public zzfwu(zzfwm zzfwmVar) {
        this.zzd = zzfwmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfwv zzfwvVar = this.zza;
        if (zzfwvVar != null) {
            zzfwvVar.zzb(this);
        }
    }

    public final void zzb(zzfwv zzfwvVar) {
        this.zza = zzfwvVar;
    }
}
