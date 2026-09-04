package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3444y2 extends AbstractC2926e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27904h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27905g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3444y2(em.o0 coroutineScope, InterfaceC3322t9 interfaceC3322t9) {
        super(coroutineScope, interfaceC3322t9);
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f27905g = AbstractC3444y2.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC2926e1
    public final void a(boolean z10) {
        if (this.f26434e == null) {
            kotlin.jvm.internal.s.g(this.f27905g, "tag");
            return;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            String tag = this.f27905g;
            kotlin.jvm.internal.s.g(tag, "tag");
            ((C3348u9) interfaceC3322t9).a(tag, "nonSkippableVideoAdLoaded - isAutoPlay: " + z10);
        }
        try {
            T4.a(this.f26430a, new C3367v2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g(this.f27905g, "tag");
            e10.getStackTrace();
        }
    }

    public final void b(AbstractC3050im abstractC3050im) {
        MediaEvents mediaEvents;
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            String tag = this.f27905g;
            kotlin.jvm.internal.s.g(tag, "tag");
            ((C3348u9) interfaceC3322t9).a(tag, "fireAdVideoEvent - received video event: " + abstractC3050im);
        }
        if (abstractC3050im instanceof C3025hm) {
            AdSession adSession = this.f26432c;
            if (adSession != null) {
                adSession.error(ErrorType.VIDEO, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (abstractC3050im instanceof C2974fn) {
            MediaEvents mediaEvents2 = this.f26433d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (abstractC3050im instanceof C3465yn) {
            MediaEvents mediaEvents3 = this.f26433d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (abstractC3050im instanceof Om) {
            MediaEvents mediaEvents4 = this.f26433d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (abstractC3050im instanceof C3490zn) {
            MediaEvents mediaEvents5 = this.f26433d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (abstractC3050im instanceof In) {
            MediaEvents mediaEvents6 = this.f26433d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (abstractC3050im instanceof C2999gm) {
            MediaEvents mediaEvents7 = this.f26433d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (abstractC3050im instanceof Bn) {
            MediaEvents mediaEvents8 = this.f26433d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((Bn) abstractC3050im).f24569a, 0.0f);
                return;
            }
            return;
        }
        if (abstractC3050im instanceof S1) {
            MediaEvents mediaEvents9 = this.f26433d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((S1) abstractC3050im).f25667b);
                return;
            }
            return;
        }
        if (!(abstractC3050im instanceof An) || (mediaEvents = this.f26433d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f10, boolean z10) {
        if (this.f26434e == null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
            if (interfaceC3322t9 != null) {
                String tag = this.f27905g;
                kotlin.jvm.internal.s.g(tag, "tag");
                ((C3348u9) interfaceC3322t9).a(tag, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f26431b;
        if (interfaceC3322t10 != null) {
            String tag2 = this.f27905g;
            kotlin.jvm.internal.s.g(tag2, "tag");
            ((C3348u9) interfaceC3322t10).a(tag2, "skippableVideoAdLoaded - skipOffset: " + f10 + ", isAutoPlay: " + z10);
        }
        try {
            T4.a(this.f26430a, new C3393w2(this, VastProperties.createVastPropertiesForSkippableMedia(f10, z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g(this.f27905g, "tag");
            e10.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC2926e1, com.inmobi.media.InterfaceC2870bm
    public final void a(AbstractC3050im videoEvent) {
        kotlin.jvm.internal.s.h(videoEvent, "videoEvent");
        if (videoEvent instanceof C3207on) {
            return;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f26431b;
        if (interfaceC3322t9 != null) {
            String tag = this.f27905g;
            kotlin.jvm.internal.s.g(tag, "tag");
            ((C3348u9) interfaceC3322t9).a(tag, "trackAdVideoEvent - videoEvent: " + videoEvent);
        }
        if (this.f26433d == null) {
            kotlin.jvm.internal.s.g(this.f27905g, "tag");
        } else {
            T4.a(this.f26430a, new C3419x2(this, videoEvent, null));
        }
    }
}
