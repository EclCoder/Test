package com.bykv.vk.openvk.preload.geckox.c.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends com.bykv.vk.openvk.preload.a.d<Pair<File, UpdatePackage>, Pair<String, Long>> {
    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Pair<String, Long>> bVar, Pair<File, UpdatePackage> pair) {
        Pair<File, UpdatePackage> pair2 = pair;
        GeckoLogger.d("gecko-debug-tag", "start active merged zip file, channel:", ((UpdatePackage) pair2.second).getChannel());
        File parentFile = ((File) pair2.first).getParentFile();
        long version = ((UpdatePackage) pair2.second).getVersion();
        File file = new File(parentFile.getParentFile(), String.valueOf(version));
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
        if (parentFile.renameTo(file)) {
            return bVar.a(new Pair<>(((UpdatePackage) pair2.second).getChannel(), Long.valueOf(version)));
        }
        throw new RuntimeException("active merged zip file failed:" + parentFile.getAbsolutePath());
    }
}
