package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g {
    public static String a(String str) {
        try {
            return H5DownLoadManager.getInstance().getH5ResAddress(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
