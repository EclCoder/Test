package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.common.collect.e0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpp {
    private static final Object zza = new Object();
    private static volatile Map zzb;
    private final String zzc;

    zzpp(Context context, zzpr zzprVar) {
        this.zzc = zzprVar.zzb() ? zzlg.zzb(context, zzprVar.zza(), false) : zzprVar.zza();
        zzprVar.zzc();
        zzprVar.zzf();
        zzprVar.zzd();
        zzprVar.zze();
    }

    static Map zza(Context context) {
        Map mapD;
        Map map = zzb;
        if (map != null) {
            return map;
        }
        synchronized (zza) {
            mapD = zzb;
            if (mapD == null) {
                e0.a aVarG = e0.g();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    AssetManager assets = context.getAssets();
                                    StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                    sb2.append("phenotype/");
                                    sb2.append(str);
                                    InputStream inputStreamOpen = assets.open(sb2.toString());
                                    try {
                                        zzpp zzppVar = new zzpp(context, zzpr.zzh(inputStreamOpen, zzadf.zza()));
                                        aVarG.g(zzppVar.zzc, zzppVar);
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                    } catch (Throwable th2) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (zzaeh e10) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                    sb3.append("Unable to read Phenotype PackageMetadata for ");
                                    sb3.append(str);
                                    Log.e("PackageInfo", sb3.toString(), e10);
                                }
                            }
                        }
                    }
                } catch (IOException e11) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e11);
                }
                mapD = aVarG.d();
                zzb = mapD;
            }
        }
        return mapD;
    }
}
