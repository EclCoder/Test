package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.Pc;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Pc extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2839ah f25479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3093kd f25480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f25481c;

    public Pc(InMobiNative inMobiNative, C2839ah publisherListenersModel, C3093kd nativeFlowManagerNotifier) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        kotlin.jvm.internal.s.h(publisherListenersModel, "publisherListenersModel");
        kotlin.jvm.internal.s.h(nativeFlowManagerNotifier, "nativeFlowManagerNotifier");
        this.f25479a = publisherListenersModel;
        this.f25480b = nativeFlowManagerNotifier;
        this.f25481c = new WeakReference(inMobiNative);
    }

    public static final fl.g0 b(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 c(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 d(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 e(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = pc2.f25479a.f26220b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 f(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = pc2.f25479a.f26220b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 g(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = pc2.f25479a.f26220b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 h(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = pc2.f25479a.f26220b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public final void a(Function1 function1) {
        InMobiNative inMobiNative = (InMobiNative) this.f25481c.get();
        if (inMobiNative == null) {
            Sb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            function1.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map params) {
        kotlin.jvm.internal.s.h(params, "params");
        a(new Function1() { // from class: yh.g3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.a(this.f57728a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new Function1() { // from class: yh.z2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.b(this.f58035a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        a(new Function1() { // from class: yh.x2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.c(this.f57998a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        onAdLoadFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        a(new Function1() { // from class: yh.w2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.a(this.f57983a, info, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final C3437xk c3437xk) {
        a(new Function1() { // from class: yh.f3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.a(this.f57704a, c3437xk, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        a(new Function1() { // from class: yh.c3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.a(this.f57637a, status, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z10) {
        a(new Function1() { // from class: yh.b3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.a(z10, this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new Function1() { // from class: yh.e3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.d(this.f57685a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new Function1() { // from class: yh.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.e(this.f57655a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new Function1() { // from class: yh.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.f(this.f57594a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new Function1() { // from class: yh.h3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.g(this.f57748a, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new Function1() { // from class: yh.y2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.h(this.f58016a, (InMobiNative) obj);
            }
        });
    }

    public static final fl.g0 a(Pc pc2, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        Ic ic2 = pc2.f25480b.f26855a.f26942d.f25414b;
        ic2.getClass();
        InterfaceC3332tj interfaceC3332tj = ic2.f25000c;
        S6 s10 = interfaceC3332tj instanceof S6 ? (S6) interfaceC3332tj : null;
        if (s10 != null) {
            InterfaceC3322t9 interfaceC3322t9L = s10.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("AUM-FetchedState", "Inflate Called");
            }
            C2990gd c2990gd = (C2990gd) s10;
            InterfaceC3322t9 interfaceC3322t9L2 = c2990gd.l();
            if (interfaceC3322t9L2 != null) {
                ((C3348u9) interfaceC3322t9L2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            c2990gd.f26611j.a(new Kd(c2990gd.f26607f, c2990gd.f26608g, c2990gd.f26609h, c2990gd.f26610i, c2990gd.f26611j), c2990gd);
        }
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return fl.g0.f38750a;
    }

    public final void a(final C3068je pubData, final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(pubData, "pubData");
        kotlin.jvm.internal.s.h(info, "info");
        a(new Function1() { // from class: yh.v2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Pc.a(this.f57966a, pubData, info, (InMobiNative) obj);
            }
        });
    }

    public static final fl.g0 a(Pc pc2, C3068je pubData, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        C3093kd c3093kd = pc2.f25480b;
        c3093kd.getClass();
        kotlin.jvm.internal.s.h(pubData, "pubData");
        c3093kd.f26855a.f26943e = pubData;
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(Pc pc2, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = pc2.f25479a.f26221c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(boolean z10, Pc pc2, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = pc2.f25479a.f26220b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z10);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(Pc pc2, C3437xk c3437xk, InMobiNative inMobiNative) {
        kotlin.jvm.internal.s.h(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = pc2.f25479a.f26219a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (c3437xk != null) {
            c3437xk.c();
        }
        return fl.g0.f38750a;
    }
}
