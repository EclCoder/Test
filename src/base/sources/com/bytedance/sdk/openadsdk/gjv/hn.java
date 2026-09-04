package com.bytedance.sdk.openadsdk.gjv;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static final String hnj = com.bytedance.sdk.openadsdk.gjv.qor.hnj.InterfaceC0245hnj.hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final String f14349hn = com.bytedance.sdk.openadsdk.gjv.qor.hnj.InterfaceC0245hnj.f14453hn;
    public static final String qor = com.bytedance.sdk.openadsdk.gjv.qor.hnj.InterfaceC0245hnj.qor;
    public static final String gjv = com.bytedance.sdk.openadsdk.gjv.qor.hnj.InterfaceC0245hnj.gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public static final String f14350sk = com.bytedance.sdk.openadsdk.gjv.qor.hnj.InterfaceC0245hnj.f14454sk;
    public static final String dkl = com.bytedance.sdk.openadsdk.gjv.qor.hnj.InterfaceC0245hnj.dkl;
    public static final Set<String> dse = new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.gjv.hn$hn, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0241hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public static int f14351hn = 2;
        public static int hnj = 1;
        public static int qor = 100;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public static String gjv = "saLandingPageLinks";

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public static String f14352hn = "openAdLandPageLinks";
        public static String hnj = "openDetailPage";
        public static String qor = "direct";
    }

    public static boolean hnj(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
