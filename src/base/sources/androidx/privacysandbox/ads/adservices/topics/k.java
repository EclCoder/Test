package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(null);
        s.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) b.c.class);
        s.g(systemService, "context.getSystemService…opicsManager::class.java)");
        android.support.v4.media.session.b.a(systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.l
    public b.a c(a request) {
        s.h(request, "request");
        b.f6525a.a(request);
        return null;
    }
}
