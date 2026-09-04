package com.bytedance.sdk.component.adexpress.gjv;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");


        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private String f12677sk;

        hnj(String str) {
            this.f12677sk = str;
        }

        public String hnj() {
            return this.f12677sk;
        }
    }

    public static hnj hnj(String str) {
        hnj hnjVar = hnj.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return hnj.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return hnj.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        return hnj.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hnjVar;
    }
}
