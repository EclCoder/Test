package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Z7 implements Pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26131a;

    public Z7(String content) {
        kotlin.jvm.internal.s.h(content, "content");
        this.f26131a = content;
    }

    @Override // com.inmobi.media.Pg
    public final Object a(kl.f fVar) {
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.Pg
    public final Object b() {
        return bm.r.V0(this.f26131a).toString();
    }

    @Override // com.inmobi.media.Pg
    public final void a() {
        if (URLUtil.isValidUrl(bm.r.V0(this.f26131a).toString())) {
            return;
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2162);
        throw new Rg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(map));
    }
}
