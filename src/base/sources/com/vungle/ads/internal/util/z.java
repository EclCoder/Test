package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class z {
    public static final z INSTANCE = new z();

    private z() {
    }

    private final long getFolderSize(File file) {
        long length = 0;
        if (file.exists()) {
            for (File file2 : ql.f.l(file)) {
                if (file2.isFile()) {
                    length += file2.length();
                }
            }
        }
        return length;
    }

    public final long getWebViewDataSize(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        long folderSize = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            folderSize = file.exists() ? getFolderSize(file) : 0L;
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return folderSize;
            }
            kotlin.jvm.internal.s.g(cacheDir, "cacheDir");
            return folderSize + getFolderSize(ql.f.s(cacheDir, "webviewCache"));
        } catch (Exception e10) {
            q.Companion.e("WebViewSize", "Error reading WebView data size: " + e10.getMessage());
            return folderSize;
        }
    }

    public final boolean isOSVersionInvalid() {
        return Build.VERSION.SDK_INT < 25;
    }

    public final boolean isUrlValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }
}
