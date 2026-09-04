package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.concurrent.ConcurrentHashMap;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class N1 extends C2824a2 {
    public final T1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(Context context, C3365v0 placement, W1 w10) {
        super(context, placement, w10);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placement, "placement");
        this.K = new T1();
    }

    @Override // com.inmobi.media.C2824a2
    public final boolean W() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            c3348u9.c("l1", "canProceedToLoad");
        }
        F();
        if (1 == this.f26890b || 2 == this.f26890b) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            Sb.a((byte) 1, "l1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u10.b("l1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == this.f26890b) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Sb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f26900l.f27659a);
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u11.b("l1", "Ad is active. ignore load");
            }
            return false;
        }
        if (this.f26890b == 4) {
            if (!A()) {
                C3348u9 c3348u12 = this.f26897i;
                if (c3348u12 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u12.c("l1", "signalCanShowForStateReady");
                }
                C3348u9 c3348u13 = this.f26897i;
                if (c3348u13 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u13.a("l1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC2978g1 abstractC2978g1N = n();
                if (abstractC2978g1N == null) {
                    Sb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    C3348u9 c3348u14 = this.f26897i;
                    if (c3348u14 != null) {
                        kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                        c3348u14.b("l1", "listener is null. load show callback missed");
                    }
                } else {
                    C3348u9 c3348u15 = this.f26897i;
                    if (c3348u15 != null) {
                        kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                        c3348u15.a("l1", "callback - onLoadSuccess");
                    }
                    d(abstractC2978g1N);
                }
                return false;
            }
            C3348u9 c3348u16 = this.f26897i;
            if (c3348u16 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u16.b("l1", "ad is expired, clearing");
            }
            d();
        }
        E();
        return true;
    }

    @Override // com.inmobi.media.C2824a2, com.inmobi.media.AbstractC3279ri
    public final void a(V1 audioStatusInternal) {
        kotlin.jvm.internal.s.h(audioStatusInternal, "audioStatusInternal");
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.a(audioStatusInternal);
        }
        T1 t10 = this.K;
        t10.getClass();
        kotlin.jvm.internal.s.h(audioStatusInternal, "audioStatusInternal");
        if (!t10.f25728a && audioStatusInternal == V1.f25866e) {
            t10.f25728a = true;
            Z8 z10 = Z8.f26132c;
            z10.f26525a = System.currentTimeMillis();
            z10.f26526b++;
        }
    }

    public final void d0() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            c3348u9.d("l1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        f((short) 2153);
    }

    public final void f(short s10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            c3348u9.c("l1", "onShowFailure");
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N == null) {
            Sb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u10.b("l1", "listener is null. show fail callback missed. ");
            }
        } else {
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u11.b("l1", "callback - onAdShowFailed");
            }
            abstractC2978g1N.b();
        }
        if (s10 != 0) {
            C3348u9 c3348u12 = this.f26897i;
            if (c3348u12 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u12.b("l1", "show failed - " + ((int) s10));
            }
            d(s10);
        }
    }

    @Override // com.inmobi.media.C2824a2, com.inmobi.media.AbstractC3107l1
    public final String m() {
        return MimeTypes.BASE_TYPE_AUDIO;
    }

    @Override // com.inmobi.media.C2824a2, com.inmobi.media.AbstractC3107l1, com.inmobi.media.AbstractC3279ri
    public final void i(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        AbstractC2978g1 abstractC2978g1N;
        kotlin.jvm.internal.s.h(gestureDetectorOnGestureListenerC3228pi, qnwOeeQSSWa.ktPOG);
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            c3348u9.c("l1", "onRenderViewVisible");
        }
        if (this.f26890b == 4 && (abstractC2978g1N = n()) != null) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u10.a("l1", "callback - onAdDisplayed");
            }
            a(abstractC2978g1N);
        }
        super.i(gestureDetectorOnGestureListenerC3228pi);
    }

    @Override // com.inmobi.media.C2824a2, com.inmobi.media.AbstractC3279ri
    public final void a(boolean z10) {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "audio_pref_file");
        kotlin.jvm.internal.s.h("user_mute_count", "key");
        int i10 = laA.f25198a.getInt("user_mute_count", 0);
        laA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }
}
