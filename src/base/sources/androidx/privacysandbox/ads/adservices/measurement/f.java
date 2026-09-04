package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService((Class<Object>) d.a());
        s.g(systemService, "context.getSystemService…ementManager::class.java)");
        super(e.a(systemService));
    }
}
