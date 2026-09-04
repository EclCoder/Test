package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static d f35117h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f35118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f35119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f35120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f35121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f35123f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f35124g = "down_type";

    private d() {
        this.f35122e = false;
        try {
            this.f35120c = i.a();
            this.f35121d = f.a();
            this.f35118a = new CopyOnWriteArrayList<>();
            this.f35119b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF != null) {
                this.f35122e = gVarF.b(1);
            }
        } catch (Throwable th2) {
            q0.b("H5DownLoadManager", th2.getMessage(), th2);
        }
    }

    public static synchronized d a() {
        try {
            if (f35117h == null) {
                f35117h = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35117h;
    }

    private String b(String str) {
        f fVar = this.f35121d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String c(String str) {
        i iVar = this.f35120c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public String a(String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches() && !URLUtil.isValidUrl(str)) {
                return str;
            }
            Uri uri = Uri.parse(str);
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                if (path.toLowerCase().endsWith(".zip")) {
                    return c(str);
                }
                return b(str);
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }
}
