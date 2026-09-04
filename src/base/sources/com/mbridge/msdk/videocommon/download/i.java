package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35127a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static i f35128a = new i(null);
    }

    /* synthetic */ i(h hVar) {
        this();
    }

    public static i a() {
        return a.f35128a;
    }

    public void b() {
        this.f35127a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
    }

    private i() {
        b();
    }

    public String a(String str) {
        String strSubstring;
        String str2 = "";
        try {
            String str3 = this.f35127a + "/" + SameMD5.getMD5(c1.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!o0.e(str5)) {
                return null;
            }
            try {
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF != null && !TextUtils.isEmpty(gVarF.U())) {
                    com.mbridge.msdk.foundation.same.d.a(str, new File(str5));
                }
                strSubstring = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                str2 = "?" + strSubstring;
            }
            return com.vungle.ads.internal.model.b.FILE_SCHEME + str5 + str2;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e10.printStackTrace();
            return null;
        }
    }
}
