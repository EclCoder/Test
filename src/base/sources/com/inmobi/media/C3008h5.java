package com.inmobi.media;

import android.os.Bundle;

/* JADX INFO: renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3008h5 extends androidx.browser.customtabs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3034i5 f26653a;

    public C3008h5(C3034i5 c3034i5) {
        this.f26653a = c3034i5;
    }

    @Override // androidx.browser.customtabs.b
    public final void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle extras) {
        kotlin.jvm.internal.s.h(extras, "extras");
        super.onActivityLayout(i10, i11, i12, i13, i14, extras);
        kotlin.jvm.internal.s.g("i5", "access$getLOG_TAG$cp(...)");
        U2 u10 = this.f26653a.f26723c;
        if (u10 != null) {
            u10.a(i10, i11, i12, i13, i14);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        super.onNavigationEvent(i10, bundle);
        kotlin.jvm.internal.s.g("i5", "access$getLOG_TAG$cp(...)");
        U2 u10 = this.f26653a.f26723c;
        if (u10 != null) {
            C3059j5 c3059j5 = u10.f25800g;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6 && c3059j5.f26777c == null) {
                            if (c3059j5.f26778d == 4) {
                                c3059j5.f26777c = Boolean.TRUE;
                            } else {
                                c3059j5.f26777c = Boolean.FALSE;
                            }
                            if (kotlin.jvm.internal.s.c(c3059j5.f26777c, Boolean.TRUE)) {
                                C2840ai c2840ai = (C2840ai) c3059j5.f26779e.get();
                                if (c2840ai != null) {
                                    Ua landingPageFunnelState = Ua.LPCompleteSuccess;
                                    C2988gb c2988gb = c3059j5.f26775a;
                                    kotlin.jvm.internal.s.h(landingPageFunnelState, "landingPageFunnelState");
                                    c2840ai.f26222a.getLandingPageHandler().a(landingPageFunnelState, c2988gb, (Integer) 8003);
                                }
                                C2840ai c2840ai2 = (C2840ai) c3059j5.f26779e.get();
                                if (c2840ai2 != null) {
                                    InterfaceC3322t9 interfaceC3322t9 = c2840ai2.f26222a.f27233i;
                                    if (interfaceC3322t9 != null) {
                                        String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                                        kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
                                        ((C3348u9) interfaceC3322t9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    c2840ai2.f26222a.D();
                                }
                            } else {
                                C2840ai c2840ai3 = (C2840ai) c3059j5.f26779e.get();
                                if (c2840ai3 != null) {
                                    Ua landingPageFunnelState2 = Ua.LPCompleteFailed;
                                    C2988gb c2988gb2 = c3059j5.f26775a;
                                    kotlin.jvm.internal.s.h(landingPageFunnelState2, "landingPageFunnelState");
                                    c2840ai3.f26222a.getLandingPageHandler().a(landingPageFunnelState2, c2988gb2, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c3059j5.f26777c == null) {
                        c3059j5.f26777c = Boolean.FALSE;
                        C2840ai c2840ai4 = (C2840ai) c3059j5.f26779e.get();
                        if (c2840ai4 != null) {
                            Ua landingPageFunnelState3 = Ua.LPCompleteFailed;
                            C2988gb c2988gb3 = c3059j5.f26775a;
                            kotlin.jvm.internal.s.h(landingPageFunnelState3, "landingPageFunnelState");
                            c2840ai4.f26222a.getLandingPageHandler().a(landingPageFunnelState3, c2988gb3, (Integer) 8004);
                        }
                    }
                } else if (c3059j5.f26777c == null) {
                    c3059j5.f26777c = Boolean.TRUE;
                    C2840ai c2840ai5 = (C2840ai) c3059j5.f26779e.get();
                    if (c2840ai5 != null) {
                        K2.a(c2840ai5, Ua.LPCompleteSuccess, c3059j5.f26775a);
                    }
                    C2840ai c2840ai6 = (C2840ai) c3059j5.f26779e.get();
                    if (c2840ai6 != null) {
                        InterfaceC3322t9 interfaceC3322t10 = c2840ai6.f26222a.f27233i;
                        if (interfaceC3322t10 != null) {
                            String str2 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                            kotlin.jvm.internal.s.g(str2, "access$getTAG$cp(...)");
                            ((C3348u9) interfaceC3322t10).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        c2840ai6.f26222a.D();
                    }
                }
            } else if (!c3059j5.f26776b) {
                c3059j5.f26776b = true;
                C2840ai c2840ai7 = (C2840ai) c3059j5.f26779e.get();
                if (c2840ai7 != null) {
                    K2.a(c2840ai7, Ua.LPPageStart, c3059j5.f26775a);
                }
            }
            c3059j5.f26778d = i10;
            if (i10 == 1) {
                C2840ai c2840ai8 = (C2840ai) u10.f25802i.get();
                if (c2840ai8 != null) {
                    GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                    c2840ai8.a(Vh.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i10 == 4) {
                C2840ai c2840ai9 = (C2840ai) u10.f25802i.get();
                if (c2840ai9 != null) {
                    GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                    c2840ai9.a(Vh.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i10 == 5) {
                C2840ai c2840ai10 = (C2840ai) u10.f25802i.get();
                if (c2840ai10 != null) {
                    GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                    c2840ai10.a(Vh.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                C2840ai c2840ai11 = (C2840ai) u10.f25802i.get();
                if (c2840ai11 != null) {
                    InterfaceC3322t9 interfaceC3322t11 = c2840ai11.f26222a.f27233i;
                    if (interfaceC3322t11 != null) {
                        String str3 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                        kotlin.jvm.internal.s.g(str3, "access$getTAG$cp(...)");
                        ((C3348u9) interfaceC3322t11).a(str3, "onCCTScreenDisplayed");
                    }
                    c2840ai11.f26222a.getListener().f(c2840ai11.f26222a);
                    c2840ai11.f26222a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i10 != 6) {
                return;
            }
            C2840ai c2840ai12 = (C2840ai) u10.f25802i.get();
            if (c2840ai12 != null) {
                GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                c2840ai12.a(Vh.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            C2840ai c2840ai13 = (C2840ai) u10.f25802i.get();
            if (c2840ai13 != null) {
                InterfaceC3322t9 interfaceC3322t12 = c2840ai13.f26222a.f27233i;
                if (interfaceC3322t12 != null) {
                    String str4 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$cp(...)");
                    ((C3348u9) interfaceC3322t12).a(str4, "onCCTScreenDismissed");
                }
                c2840ai13.f26222a.W();
            }
        }
    }
}
