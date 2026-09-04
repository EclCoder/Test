package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y7 implements Pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26069a;

    public Y7(String content) {
        kotlin.jvm.internal.s.h(content, "content");
        this.f26069a = content;
    }

    @Override // com.inmobi.media.Pg
    public final Object a(kl.f fVar) {
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.Pg
    public final Object b() {
        return this.f26069a;
    }

    @Override // com.inmobi.media.Pg
    public final void a() {
        if (this.f26069a.length() != 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2162);
        throw new Rg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(map));
    }
}
