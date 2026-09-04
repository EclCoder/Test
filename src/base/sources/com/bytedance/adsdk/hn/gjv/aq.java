package com.bytedance.adsdk.hn.gjv;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.hn.bug;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final dkl f11953hn;
    private final dse hnj;

    public aq(dse dseVar, dkl dklVar) {
        this.hnj = dseVar;
        this.f11953hn = dklVar;
    }

    private com.bytedance.adsdk.hn.dse hn(Context context, String str, String str2) {
        dse dseVar;
        Pair<qor, InputStream> pairHnj;
        if (str2 == null || (dseVar = this.hnj) == null || (pairHnj = dseVar.hnj(str)) == null) {
            return null;
        }
        qor qorVar = (qor) pairHnj.first;
        InputStream inputStream = (InputStream) pairHnj.second;
        bug<com.bytedance.adsdk.hn.dse> bugVarHnj = qorVar == qor.ZIP ? com.bytedance.adsdk.hn.aq.hnj(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.hn.aq.hn(inputStream, str2);
        if (bugVarHnj.hnj() != null) {
            return bugVarHnj.hnj();
        }
        return null;
    }

    private bug<com.bytedance.adsdk.hn.dse> qor(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                gjv gjvVarHnj = this.f11953hn.hnj(str);
                if (!gjvVarHnj.hnj()) {
                    bug<com.bytedance.adsdk.hn.dse> bugVar = new bug<>(new IllegalArgumentException(gjvVarHnj.gjv()));
                    try {
                        gjvVarHnj.close();
                    } catch (IOException unused) {
                    }
                    return bugVar;
                }
                bug<com.bytedance.adsdk.hn.dse> bugVarHnj = hnj(context, str, gjvVarHnj.hn(), gjvVarHnj.qor(), str2);
                bugVarHnj.hnj();
                try {
                    gjvVarHnj.close();
                } catch (IOException unused2) {
                }
                return bugVarHnj;
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                try {
                    closeable.close();
                    throw th2;
                } catch (IOException unused3) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            bug<com.bytedance.adsdk.hn.dse> bugVar2 = new bug<>(e10);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            return bugVar2;
        }
    }

    public bug<com.bytedance.adsdk.hn.dse> hnj(Context context, String str, String str2) {
        com.bytedance.adsdk.hn.dse dseVarHn = hn(context, str, str2);
        return dseVarHn != null ? new bug<>(dseVarHn) : qor(context, str, str2);
    }

    private bug<com.bytedance.adsdk.hn.dse> hnj(Context context, String str, InputStream inputStream, String str2, String str3) {
        bug<com.bytedance.adsdk.hn.dse> bugVarHnj;
        qor qorVar;
        dse dseVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            qorVar = qor.JSON;
            bugVarHnj = hnj(str, inputStream, str3);
        } else {
            qor qorVar2 = qor.ZIP;
            bugVarHnj = hnj(context, str, inputStream, str3);
            qorVar = qorVar2;
        }
        if (str3 != null && bugVarHnj.hnj() != null && (dseVar = this.hnj) != null) {
            dseVar.hnj(str, qorVar);
        }
        return bugVarHnj;
    }

    private bug<com.bytedance.adsdk.hn.dse> hnj(Context context, String str, InputStream inputStream, String str2) {
        dse dseVar;
        if (str2 != null && (dseVar = this.hnj) != null) {
            return com.bytedance.adsdk.hn.aq.hnj(context, new ZipInputStream(new FileInputStream(dseVar.hnj(str, inputStream, qor.ZIP))), str);
        }
        return com.bytedance.adsdk.hn.aq.hnj(context, new ZipInputStream(inputStream), (String) null);
    }

    private bug<com.bytedance.adsdk.hn.dse> hnj(String str, InputStream inputStream, String str2) {
        dse dseVar;
        if (str2 != null && (dseVar = this.hnj) != null) {
            return com.bytedance.adsdk.hn.aq.hn(new FileInputStream(dseVar.hnj(str, inputStream, qor.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.hn.aq.hn(inputStream, (String) null);
    }
}
