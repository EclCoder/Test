package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10980a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10981b = -1;

    public static com.apm.insight.nativecrash.b a(Context context) {
        return new com.apm.insight.nativecrash.b(context, new ICommonParams() { // from class: com.apm.insight.runtime.g.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    public final boolean b() {
        return this.f10980a != null;
    }

    public final void a(String str) {
        this.f10980a = str;
        o.a().a(str);
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f10980a) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f10980a)) {
            return this.f10980a;
        }
        String strD = com.apm.insight.e.a().d();
        this.f10980a = strD;
        if (!TextUtils.isEmpty(strD) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f10980a)) {
            return this.f10980a;
        }
        String strB = o.a().b();
        this.f10980a = strB;
        return strB;
    }
}
