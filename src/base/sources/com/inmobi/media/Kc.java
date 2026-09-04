package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Kc extends AbstractC2926e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25112h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kc(em.o0 coroutineScope, C3348u9 c3348u9) {
        super(coroutineScope, c3348u9);
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f25113g = Kc.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC2926e1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z10) {
        kotlin.jvm.internal.s.h(omsdkScript, "omsdkScript");
        kotlin.jvm.internal.s.h(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.s.h(macros, "macros");
        kotlin.jvm.internal.s.h(customReferenceData, "customReferenceData");
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeAdSessionManager", "initializeAdSession");
        }
        T4.a(this.f26430a, new Jc(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z10), W0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }

    @Override // com.inmobi.media.AbstractC2926e1
    public final void a() {
        if (this.f26434e == null) {
            String tag = this.f25113g;
            kotlin.jvm.internal.s.g(tag, "tag");
        } else {
            T4.a(this.f26430a, new C3031i2(this, null));
        }
    }
}
