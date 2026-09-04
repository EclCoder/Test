package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dse;
import com.bytedance.sdk.openadsdk.core.oj;
import java.io.File;
import t6.b;
import z6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String hnj;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static a getICacheDir(int i10) {
        return hnj();
    }

    public static String getImageCacheDir(String str) {
        if (hnj == null) {
            hnj = getDiskCacheDirPath(str);
        }
        return hnj;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileHnj = dse.hnj(oj.hnj(), "tt_ad");
        if (fileHnj.isFile()) {
            fileHnj.delete();
        }
        if (!fileHnj.exists()) {
            fileHnj.mkdirs();
        }
        String absolutePath = fileHnj.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static a hnj() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        b bVar = new b();
                        MEDIA_CACHE_DIR = bVar;
                        bVar.hnj(getRootDir());
                        MEDIA_CACHE_DIR.gjv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
