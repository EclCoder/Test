package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3487zk {
    public static final Map a(G g10) {
        String creativeType;
        kotlin.jvm.internal.s.h(g10, "<this>");
        Map mapM = gl.l0.m(fl.w.a("plId", Long.valueOf(g10.f24811a.f27159a.f25691a)), fl.w.a("plType", g10.f24811a.f27159a.f25697g), fl.w.a("adType", "native"), fl.w.a("markupType", g10.f24813c), fl.w.a("creativeId", "\"" + g10.f24815e + "\""), fl.w.a("impressionId", "\"" + g10.f24823m.f24740b + "\""), fl.w.a("isRewarded", Boolean.valueOf(g10.f24812b.f24631a)));
        MetaInfo metaInfo = g10.f24814d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mapM.put("creativeType", creativeType);
        }
        String str = g10.f24819i;
        if (str != null) {
            mapM.put("metadataBlob", str);
        }
        return mapM;
    }

    public static final Map a(C3211p1 c3211p1) {
        kotlin.jvm.internal.s.h(c3211p1, "<this>");
        return gl.l0.m(fl.w.a("plId", Long.valueOf(c3211p1.f27159a.f25691a)), fl.w.a("plType", c3211p1.f27159a.f25697g), fl.w.a("adType", "native"));
    }
}
