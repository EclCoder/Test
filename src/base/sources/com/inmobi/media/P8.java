package com.inmobi.media;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class P8 implements W5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R8 f25468a;

    public P8(R8 r10) {
        this.f25468a = r10;
    }

    public final void a(String expandInput, V5 inputType, float f10, boolean z10, long j10, C2988gb c2988gb) {
        String adType;
        String creativeId;
        String impressionId;
        U5 u10;
        kotlin.jvm.internal.s.h(expandInput, "expandInput");
        kotlin.jvm.internal.s.h(inputType, "inputType");
        R8 r10 = this.f25468a;
        Activity activity = (Activity) r10.f25614a.get();
        if (activity == null) {
            return;
        }
        if (r10.f25618e == null) {
            U5 u11 = new U5(activity);
            InterfaceC3322t9 interfaceC3322t9 = r10.f25621h;
            if (interfaceC3322t9 != null) {
                u11.setLogger(interfaceC3322t9);
            }
            u11.setId(65518);
            u11.setEmbeddedBrowserUpdateListener(r10.f25622i);
            r10.f25618e = u11;
        }
        C c10 = r10.f25615b;
        if ((c10 instanceof GestureDetectorOnGestureListenerC3228pi) && (u10 = r10.f25618e) != null) {
            u10.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3228pi) c10).getListener());
        }
        U5 u12 = r10.f25618e;
        if (u12 != null) {
            C c11 = r10.f25615b;
            if (c11 == null || (adType = ((GestureDetectorOnGestureListenerC3228pi) c11).getAdType()) == null) {
                adType = "banner";
            }
            String str = adType;
            C c12 = r10.f25615b;
            String str2 = (c12 == null || (impressionId = ((GestureDetectorOnGestureListenerC3228pi) c12).getImpressionId()) == null) ? "" : impressionId;
            C c13 = r10.f25615b;
            u12.a(expandInput, inputType, z10, j10, str, str2, (c13 == null || (creativeId = ((GestureDetectorOnGestureListenerC3228pi) c13).getCreativeId()) == null) ? "" : creativeId, c2988gb);
        }
        float f11 = 1 - f10;
        r10.f25620g = f11;
        C3372v7 c3372v7 = r10.f25616c;
        if (c3372v7 != null) {
            c3372v7.f27690c = f11;
            c3372v7.c();
        }
        r10.b();
    }
}
