package com.vungle.ads.internal.downloader;

import android.util.Base64;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.vungle.ads.internal.f;
import fl.g0;
import fl.r;
import fl.s;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final d INSTANCE = new d();

    private d() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objB;
        try {
            r.a aVar = r.f38769b;
            byte[] bArrDecode = Base64.decode(f.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                g0 g0Var = g0.f38750a;
                ql.b.a(fileOutputStream, null);
                objB = r.b(Boolean.TRUE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            r.a aVar2 = r.f38769b;
            objB = r.b(s.a(th4));
        }
        Boolean bool = Boolean.FALSE;
        if (r.h(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final File injectPrivacyIcon(File file) {
        kotlin.jvm.internal.s.h(file, UHbHibBvYxKnPE.SqD);
        File file2 = new File(file, f.PRIVACY_ICON_FILE_NAME);
        if (file2.exists() || writePrivacyFileFromString(file2)) {
            return file2;
        }
        return null;
    }
}
