package com.bytedance.sdk.component.adexpress.dynamic.hn;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.gjv.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static int hnj(dse dseVar) {
        if (dseVar == null) {
            return 0;
        }
        String strOrp = dseVar.orp();
        String strM8do = dseVar.m8do();
        if (TextUtils.isEmpty(strM8do) || TextUtils.isEmpty(strOrp) || !strM8do.equals("creative")) {
            return 0;
        }
        if (strOrp.equals("shake")) {
            return 2;
        }
        if (strOrp.equals("twist")) {
            return 3;
        }
        return strOrp.equals("slide") ? 1 : 0;
    }
}
