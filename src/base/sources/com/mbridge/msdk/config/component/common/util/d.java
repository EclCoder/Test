package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                b.a(contextD).b(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, str);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            b.a(contextD).b("c", str2);
        } catch (Throwable th2) {
            q0.b("MBIdsMergeStoreUtil", th2.getMessage());
        }
    }

    public void a(final String str, final String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: ci.b
            @Override // java.lang.Runnable
            public final void run() {
                d.b(str, str2);
            }
        });
    }

    public void a() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: ci.c
            @Override // java.lang.Runnable
            public final void run() {
                d.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            String strA = b.a(contextD).a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "");
            String strA2 = b.a(contextD).a("c", "");
            if (!TextUtils.isEmpty(strA)) {
                com.mbridge.msdk.foundation.same.a.V = strA;
            }
            if (TextUtils.isEmpty(strA2)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f30485g = strA2;
        } catch (Throwable th2) {
            q0.b("MBIdsMergeStoreUtil", th2.getMessage());
        }
    }
}
