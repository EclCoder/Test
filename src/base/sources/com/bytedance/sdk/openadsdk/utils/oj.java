package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj {
    private static List<String> hn() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    public static void hnj() {
        Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
        if (contextHnj != null && com.bytedance.sdk.component.utils.fc.qor()) {
            String packageName = contextHnj.getPackageName();
            int i10 = contextHnj.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextHnj.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listHn = hn();
                for (String str : strArr) {
                    if (str != null) {
                        listHn.remove(str);
                    }
                }
                if (listHn.isEmpty()) {
                    return;
                }
                for (String str2 : listHn) {
                }
            } catch (Throwable unused) {
            }
        }
    }
}
