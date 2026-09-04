package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35125a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static f f35126a = new f(null);
    }

    /* synthetic */ f(e eVar) {
        this();
    }

    public static f a() {
        return a.f35126a;
    }

    public void b() {
        this.f35125a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
    }

    private f() {
        b();
    }

    public String a(String str) {
        try {
            File file = new File(this.f35125a + "/" + SameMD5.getMD5(c1.b(str)) + ".html");
            if (file.exists()) {
                return o0.e(file);
            }
            return null;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public String b(String str) {
        try {
            String str2 = this.f35125a + "/" + SameMD5.getMD5(c1.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF != null && !TextUtils.isEmpty(gVarF.U())) {
                com.mbridge.msdk.foundation.same.d.a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
