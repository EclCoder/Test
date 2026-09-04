package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzimu;
import com.google.android.gms.internal.ads.zzind;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class CsiParamDefaults_Factory implements zzimu<CsiParamDefaults> {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;
    private final zzind zze;

    private CsiParamDefaults_Factory(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
    }

    public static CsiParamDefaults_Factory create(zzind<Context> zzindVar, zzind<VersionInfoParcel> zzindVar2, zzind<PackageInfo> zzindVar3, zzind<String> zzindVar4, zzind<DeviceTierManager> zzindVar5) {
        return new CsiParamDefaults_Factory(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        return new CsiParamDefaults(context, versionInfoParcel, packageInfo, str, deviceTierManager);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb(), (PackageInfo) this.zzc.zzb(), (String) this.zzd.zzb(), (DeviceTierManager) this.zze.zzb());
    }
}
