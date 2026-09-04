package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.MBridgeConstans;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgz extends zzos {
    public zzgz(zzpg zzpgVar) {
        super(zzpgVar);
    }

    public final boolean zzb() {
        zzay();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.zzu.zzaZ().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbc() {
        return false;
    }

    public final void zzc(String str, zzot zzotVar, com.google.android.gms.internal.measurement.zzib zzibVar, zzgw zzgwVar) {
        zzgz zzgzVar;
        String str2;
        zzg();
        zzay();
        try {
            URL url = new URI(zzotVar.zza()).toURL();
            this.zzg.zzp();
            byte[] bArrZzcd = zzibVar.zzcd();
            zzgzVar = this;
            str2 = str;
            try {
                this.zzu.zzaX().zzm(new zzgy(zzgzVar, str2, url, bArrZzcd, zzotVar.zzb(), zzgwVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                zzgzVar.zzu.zzaW().zzb().zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", zzgu.zzl(str2), zzotVar.zza());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            zzgzVar = this;
            str2 = str;
        }
    }

    public final void zzd(zzh zzhVar, Map map, zzgw zzgwVar) {
        zzgz zzgzVar;
        zzg();
        zzay();
        Preconditions.checkNotNull(zzhVar);
        Preconditions.checkNotNull(zzgwVar);
        zzou zzouVarZzf = this.zzg.zzf();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzfy.zze.zzb(null)).encodedAuthority((String) zzfy.zzf.zzb(null)).path("config/app/".concat(String.valueOf(zzhVar.zzf()))).appendQueryParameter("platform", "android");
        zzouVarZzf.zzu.zzc().zzi();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            zzgzVar = this;
            try {
                this.zzu.zzaX().zzm(new zzgy(zzgzVar, zzhVar.zzc(), url, null, map, zzgwVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                zzgzVar.zzu.zzaW().zzb().zzc("Failed to parse config URL. Not fetching. appId", zzgu.zzl(zzhVar.zzc()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            zzgzVar = this;
        }
    }
}
