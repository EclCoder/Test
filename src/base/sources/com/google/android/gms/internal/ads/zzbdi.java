package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdi {
    public static String zza(Context context, String str, List list, Executor executor) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhcp zzhcpVarZze = zzhcp.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdh
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhcp zzhcpVar = zzhcpVarZze;
                if (list2 == null) {
                    zzhcpVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksumA = c.a(list2.get(i10));
                        if (apkChecksumA.getType() == 8) {
                            zzhcpVar.zza(zzbbv.zza(apkChecksumA.getValue()));
                            return;
                        }
                    }
                    zzhcpVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhcpVar.zza((Object) null);
                }
            }
        });
        return (String) zzhcpVarZze.get();
    }
}
