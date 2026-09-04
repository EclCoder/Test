package com.bykv.vk.openvk.preload.geckox.e.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public c(File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    protected final InputStream a(File file, String str) throws IOException {
        File file2 = new File(file, "res" + File.separator + str);
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            throw new IOException("file not found");
        }
        GeckoLogger.d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
        return new FileInputStream(file2.getCanonicalFile());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    protected final boolean b(File file, String str) {
        return new File(file, "res" + File.separator + str).exists();
    }
}
