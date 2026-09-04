package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f30670a = "DomainReport";

    public static boolean a(com.mbridge.msdk.setting.g gVar, String str) {
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int iL = gVar.L();
                    JSONArray jSONArrayJ = gVar.J();
                    JSONArray jSONArrayI = gVar.I();
                    if (jSONArrayI != null) {
                        for (int i10 = 0; i10 < jSONArrayI.length(); i10++) {
                            if (str.contains(jSONArrayI.getString(i10))) {
                                return false;
                            }
                        }
                    }
                    if (iL == 2) {
                        if (jSONArrayJ != null) {
                            for (int i11 = 0; i11 < jSONArrayJ.length(); i11++) {
                                if (str.contains(jSONArrayJ.getString(i11))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b(f30670a, e10.getMessage());
            }
        }
        return true;
    }
}
