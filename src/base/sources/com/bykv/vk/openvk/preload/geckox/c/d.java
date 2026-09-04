package com.bykv.vk.openvk.preload.geckox.c;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<List<String>, List<Pair<String, Long>>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f11813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f11814e;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<List<Pair<String, Long>>> bVar, List<String> list) {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f11813d, this.f11814e);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(new File(file, str));
            arrayList.add(new Pair<>(str, Long.valueOf(lA == null ? 0L : lA.longValue())));
        }
        return bVar.a(arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.f11813d = (File) objArr[0];
        this.f11814e = (String) objArr[1];
    }
}
