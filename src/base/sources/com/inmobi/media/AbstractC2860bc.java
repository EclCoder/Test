package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.inmobi.media.bc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2860bc {
    public static final boolean a(String tag, String data, String filePath) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(data, "data");
        kotlin.jvm.internal.s.h(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String filePath) {
        kotlin.jvm.internal.s.h(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            try {
                return ql.f.f(file, null, 1, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void a(String filePath) {
        kotlin.jvm.internal.s.h(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
