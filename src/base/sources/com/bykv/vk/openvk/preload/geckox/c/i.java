package com.bykv.vk.openvk.preload.geckox.c;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i extends com.bykv.vk.openvk.preload.a.d<Pair<String, Long>, Pair<String, Long>> {
    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Pair<String, Long>> bVar, Pair<String, Long> pair) {
        Pair<String, Long> pair2 = pair;
        GeckoLogger.d("gecko-debug-tag", "update success:", pair2);
        return bVar.a(pair2);
    }
}
