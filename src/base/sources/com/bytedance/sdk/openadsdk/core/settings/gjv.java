package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private static volatile int gjv = 0;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile String f14185hn = "";
    private static volatile String hnj = "";
    private static String qor;

    public static String gjv() {
        if (TextUtils.isEmpty(qor)) {
            qor = oj.hnj().getPackageManager().getInstallerPackageName(orp.dkl());
        }
        if (qor == null) {
            qor = "";
        }
        return qor;
    }

    public static String qor() {
        if (gjv != 0) {
            return f14185hn;
        }
        hnj();
        return f14185hn;
    }

    public static String hn() {
        if (gjv != 0) {
            return hnj;
        }
        hnj();
        return hnj;
    }

    public static void hnj() {
        try {
            AppSet.getClient(oj.hnj()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = gjv.hnj = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = gjv.f14185hn = appSetIdInfo.getId();
                    int unused3 = gjv.gjv = 1;
                }
            });
        } catch (Throwable unused) {
            gjv = 2;
        }
    }
}
