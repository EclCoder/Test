package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e extends b {
    e() {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f11732e.iterator();
        while (it.hasNext()) {
            List<File> listB = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.f11731d, it.next()));
            if (listB != null && listB.size() > this.f11730c.f11722a) {
                for (File file : listB.subList(0, listB.size() - this.f11730c.f11722a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.f11730c.f11723b != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
