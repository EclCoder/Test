package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ge implements InterfaceC3332tj, Ah, InterfaceC2950f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f24854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f24855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fi f24856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2926e1 f24857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H4 f24858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vc f24859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Mc f24860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rc f24861h;

    public Ge(View view, MediaView mediaView, Fi renderedStateCache, AbstractC2926e1 adSessionManager, H4 contextualDataHandler, Vc nativeBeaconProcessor, Mc nativeAdUnitComponent, Rc stateMachine) {
        kotlin.jvm.internal.s.h(renderedStateCache, "renderedStateCache");
        kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
        kotlin.jvm.internal.s.h(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.s.h(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f24854a = view;
        this.f24855b = mediaView;
        this.f24856c = renderedStateCache;
        this.f24857d = adSessionManager;
        this.f24858e = contextualDataHandler;
        this.f24859f = nativeBeaconProcessor;
        this.f24860g = nativeAdUnitComponent;
        this.f24861h = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        Ph ph2;
        C3348u9 c3348u9 = this.f24860g.f25267a.f27822a.f27105c;
        if (c3348u9 == null || (ph2 = c3348u9.f27613a) == null) {
            return;
        }
        ph2.a();
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData nativeViewData) {
        kotlin.jvm.internal.s.h(nativeViewData, "nativeViewData");
        this.f24861h.a(new Be(new Ce(this.f24856c, new C2865bh(nativeViewData, this.f24855b, this.f24854a), this.f24858e, this.f24857d, this.f24859f, this.f24860g), this.f24861h), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L33;
     */
    @Override // com.inmobi.media.InterfaceC2950f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kl.f r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.Ee
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.Ee r0 = (com.inmobi.media.Ee) r0
            int r1 = r0.f24717c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24717c = r1
            goto L1a
        L13:
            com.inmobi.media.Ee r0 = new com.inmobi.media.Ee
            kotlin.coroutines.jvm.internal.d r9 = (kotlin.coroutines.jvm.internal.d) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.f24715a
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f24717c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            fl.s.b(r9)
            goto La7
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            fl.s.b(r9)
            goto L92
        L3b:
            fl.s.b(r9)
            com.inmobi.media.e1 r9 = r8.f24857d
            com.iab.omid.library.inmobi.adsession.AdSession r2 = r9.f26432c
            r5 = 0
            if (r2 != 0) goto L53
            com.inmobi.media.t9 r9 = r9.f26431b
            if (r9 == 0) goto L6a
            java.lang.String r2 = com.inmobi.media.AbstractC2926e1.f26429f
            com.inmobi.media.u9 r9 = (com.inmobi.media.C3348u9) r9
            java.lang.String r6 = "Failed to stopAdSession. adSession is null"
            r9.a(r2, r6)
            goto L6a
        L53:
            com.inmobi.media.t9 r2 = r9.f26431b
            if (r2 == 0) goto L60
            java.lang.String r6 = com.inmobi.media.AbstractC2926e1.f26429f
            com.inmobi.media.u9 r2 = (com.inmobi.media.C3348u9) r2
            java.lang.String r7 = "stopAdSession"
            r2.a(r6, r7)
        L60:
            em.o0 r2 = r9.f26430a
            com.inmobi.media.c1 r6 = new com.inmobi.media.c1
            r6.<init>(r9, r5)
            com.inmobi.media.T4.a(r2, r6)
        L6a:
            com.inmobi.media.Mc r9 = r8.f24860g
            fl.k r9 = r9.f25273g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.tc r9 = (com.inmobi.media.C3325tc) r9
            r0.f24717c = r4
            r9.getClass()
            em.i2 r2 = em.c1.c()
            com.inmobi.media.rc r4 = new com.inmobi.media.rc
            r4.<init>(r9, r5)
            java.lang.Object r9 = em.i.j(r2, r4, r0)
            java.lang.Object r2 = ll.b.f()
            if (r9 != r2) goto L8d
            goto L8f
        L8d:
            fl.g0 r9 = fl.g0.f38750a
        L8f:
            if (r9 != r1) goto L92
            goto La6
        L92:
            com.inmobi.media.H4 r9 = r8.f24858e
            r9.b()
            com.inmobi.media.Rc r9 = r8.f24861h
            com.inmobi.media.dd r2 = new com.inmobi.media.dd
            r2.<init>()
            r0.f24717c = r3
            java.lang.Object r9 = r9.a(r2, r8, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            fl.g0 r9 = fl.g0.f38750a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ge.a(kl.f):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
