package com.vungle.ads.internal.network;

import android.os.Build;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    public static final m INSTANCE;
    private static String appId;
    private static String appVersion;
    private static String headerUa;

    static {
        m mVar = new m();
        INSTANCE = mVar;
        headerUa = mVar.defaultHeader();
    }

    private m() {
    }

    private final String defaultHeader() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.c("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb2.append("7.7.2");
        return sb2.toString();
    }

    public final String getAppId() {
        return appId;
    }

    public final String getAppVersion() {
        return appVersion;
    }

    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setAppId(String str) {
        appId = str;
    }

    public final void setAppVersion(String str) {
        appVersion = str;
    }

    public final void setHeaderUa(String str) {
        s.h(str, "<set-?>");
        headerUa = str;
    }
}
