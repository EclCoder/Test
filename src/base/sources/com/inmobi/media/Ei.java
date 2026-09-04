package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ei extends AbstractC3441y implements InterfaceC3332tj, InterfaceC2976g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nc f24724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3416x f24725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublisherCallbacks f24726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3410wj f24727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ei(Nc adUnit, C3416x adComponent, PublisherCallbacks publisherCallbacks, AbstractC3410wj stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.s.h(adUnit, "adUnit");
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f24724b = adUnit;
        this.f24725c = adComponent;
        this.f24726d = publisherCallbacks;
        this.f24727e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-RenderedState", "onDestroy");
        }
        this.f24727e.a(new C3370v5(this.f24724b, null, this.f24725c), this);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    public final boolean a(G g10) {
        boolean z10;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        if (((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getNative().getInteraction().getBlockCallbackOnExpiry()) {
            C3211p1 c3211p1 = g10.f24811a;
            if (kotlin.jvm.internal.s.c("native", "native")) {
                kotlin.jvm.internal.s.h(g10, "<this>");
                kotlin.jvm.internal.s.h(g10, "<this>");
                long timeToLive = g10.f24811a.f27160b.getCacheConfig("native").getTimeToLive();
                long millis = g10.f24821k;
                if (millis == -1) {
                    millis = g10.f24820j + TimeUnit.SECONDS.toMillis(timeToLive);
                }
                if (millis - System.currentTimeMillis() < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).b("AUM-RenderedState", "shouldBlockCallback - " + z10);
        }
        return z10;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
