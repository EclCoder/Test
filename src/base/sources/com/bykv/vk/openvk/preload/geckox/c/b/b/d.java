package com.bykv.vk.openvk.preload.geckox.c.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f11805d;

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.f11805d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) throws IOException {
        GeckoLogger.d("gecko-debug-tag", "start merge patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File fileF = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = fileF.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(parentFile, updatePackage.getLocalVersion() + File.separator + "res.zip");
        File file2 = new File(fileF.getParentFile(), "res.zip");
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file2);
        try {
            try {
                BsPatch.a(file, fileF, file2.getParentFile(), file2.getName());
                com.bykv.vk.openvk.preload.geckox.utils.b.a(fileF);
                this.f11805d.a();
                com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file2, file2.length());
                try {
                    return bVar.a(new Pair<>(aVarA, updatePackage));
                } finally {
                    aVarA.e();
                }
            } catch (Exception e10) {
                throw new RuntimeException("merged patch zip file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            com.bykv.vk.openvk.preload.geckox.utils.b.a(fileF);
            throw th2;
        }
    }
}
