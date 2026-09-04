package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ie extends AbstractC3444y2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25005i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(em.o0 coroutineScope, InterfaceC3322t9 interfaceC3322t9) {
        super(coroutineScope, interfaceC3322t9);
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC2926e1
    public final void a(String omsdkScript, List omidTrackers, Map macros, String str, String customReferenceData, boolean z10) {
        kotlin.jvm.internal.s.h(omsdkScript, "omsdkScript");
        kotlin.jvm.internal.s.h(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.s.h(macros, "macros");
        kotlin.jvm.internal.s.h(customReferenceData, "customReferenceData");
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        T4.a(this.f26430a, new He(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z10), W0.a(omsdkScript, omidTrackers, macros, str, customReferenceData), null));
    }
}
