package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class X6 {
    public static final void a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        Iterator it = gl.r.o(Ka.a("carb_store"), Ka.a("aes_key_store"), Ka.a("mraid_js_store"), Ka.a("omid_js_store"), Ka.a("user_info_store"), Ka.a("coppa_store"), Ka.a("gesture_info_store"), Ka.a("display_info_store"), Ka.a("unified_id_info_store"), Ka.a("app_bundle_store"), Ka.a("pub_signals_store"), Ka.a("CrashSession-store")).iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
    }

    public static final void a(File path) {
        kotlin.jvm.internal.s.h(path, "path");
        try {
            if (path.exists()) {
                File[] fileArrListFiles = path.listFiles();
                if (fileArrListFiles != null) {
                    Iterator itA = kotlin.jvm.internal.c.a(fileArrListFiles);
                    while (itA.hasNext()) {
                        File file = (File) itA.next();
                        if (file.isDirectory()) {
                            kotlin.jvm.internal.s.e(file);
                            a(file);
                        } else if (file.delete()) {
                            kotlin.jvm.internal.s.g("X6", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    kotlin.jvm.internal.s.g("X6", "TAG");
                    path.getName();
                }
            }
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("X6", "TAG");
            e10.getMessage();
        }
    }
}
