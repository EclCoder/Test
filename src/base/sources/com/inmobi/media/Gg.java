package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Gg extends AbstractC3104ko {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f24866l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gg(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3322t9 interfaceC3322t9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b10, interfaceC3322t9);
        C3268r7 visibilityChecker = C3346u7.f27601k;
        kotlin.jvm.internal.s.h(visibilityChecker, "visibilityChecker");
        kotlin.jvm.internal.s.h(visibilityChecker, "visibilityChecker");
        this.f24866l = viewabilityConfig;
    }

    @Override // com.inmobi.media.AbstractC3104ko
    public final void d() {
        toString();
        if (this.f26885k || this.f26881g.get()) {
            return;
        }
        this.f26885k = true;
        em.k.d(H9.f24931d, null, null, new C3078jo(this, null), 3, null);
    }
}
