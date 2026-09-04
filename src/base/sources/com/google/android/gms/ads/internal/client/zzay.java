package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzccu;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzay {
    public static final /* synthetic */ int zza = 0;
    private static final zzay zzb = new zzay();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final zzaw zzd;
    private boolean zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;
    private final String zzh;

    protected zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzfc(), new zzbnx(), new zzccu(), new zzbyy(), new zzbny(), new zzl());
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        String strZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj();
        this.zzc = zzfVar;
        this.zzd = zzawVar;
        this.zze = false;
        this.zzf = versionInfoParcel;
        this.zzg = random;
        this.zzh = strZzj;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return zzb.zzc;
    }

    public static zzaw zzb() {
        return zzb.zzd;
    }

    public static void zzc() {
        zzb.zze = false;
    }

    public static void zzd() {
        zzb.zze = true;
    }

    public static boolean zze() {
        return zzb.zze;
    }

    public static String zzf() {
        return zzb.zzh;
    }

    public static VersionInfoParcel zzg() {
        return zzb.zzf;
    }

    public static Random zzh() {
        return zzb.zzg;
    }
}
