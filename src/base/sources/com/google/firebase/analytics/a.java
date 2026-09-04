package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a implements zzlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzez f22081a;

    a(zzez zzezVar) {
        this.f22081a = zzezVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        this.f22081a.zzi(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j10, long j11) {
        this.f22081a.zzj(str, str2, bundle, j10, 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z10) {
        return this.f22081a.zzC(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        this.f22081a.zzd(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.f22081a.zzf(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        this.f22081a.zzg(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        return this.f22081a.zzA();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        return this.f22081a.zzB();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return this.f22081a.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.f22081a.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.f22081a.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        this.f22081a.zzu(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        this.f22081a.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        this.f22081a.zzl(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        this.f22081a.zzm(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        return this.f22081a.zzn(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        return this.f22081a.zzF(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i10) {
        return this.f22081a.zzJ(i10);
    }
}
