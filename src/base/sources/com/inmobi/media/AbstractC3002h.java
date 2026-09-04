package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import java.util.Objects;
import tn.xQIL.Saucuwx;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3002h extends AbstractC3410wj implements InterfaceC3133m1, InterfaceC3116la, InterfaceC2976g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3002h(em.o0 coroutineScope) {
        super(coroutineScope);
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
    }

    public final void a(byte[] bArr) {
        (bArr != null ? Integer.valueOf(bArr.length) : "null").toString();
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        AbstractC2879c5 abstractC2879c5 = interfaceC3332tj instanceof AbstractC2879c5 ? (AbstractC2879c5) interfaceC3332tj : null;
        if (abstractC2879c5 != null) {
            abstractC2879c5.a(bArr);
        }
    }

    public final void c() {
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        AbstractC2879c5 abstractC2879c5 = interfaceC3332tj instanceof AbstractC2879c5 ? (AbstractC2879c5) interfaceC3332tj : null;
        if (abstractC2879c5 == null) {
            Sb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C3348u9 c3348u9 = abstractC2879c5.f26426e;
        if (c3348u9 != null) {
            c3348u9.a("AUM-CreatedState", "fetch called");
        }
        C2874c0 c2874c0 = abstractC2879c5.f26427f;
        c2874c0.getClass();
        c2874c0.f26287a = SystemClock.elapsedRealtime();
        C3132m0 c3132m0 = abstractC2879c5.f26428g;
        em.k.d(c3132m0.f26967a, null, null, new C2951f0(c3132m0, null), 3, null);
        if (abstractC2879c5.b()) {
            C3348u9 c3348u10 = abstractC2879c5.f26426e;
            if (c3348u10 != null) {
                c3348u10.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3185o1 adManagerComponent = abstractC2879c5.f26301h;
        Ic stateMachine = abstractC2879c5.f26303j;
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        C3065jb adUnitTimeout = new C3065jb(adManagerComponent, stateMachine);
        C2861bd c2861bd = (C2861bd) abstractC2879c5;
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        C3348u9 c3348u11 = c2861bd.f26426e;
        if (c3348u11 != null) {
            c3348u11.a(Saucuwx.bfccpXsizFDrx, "transitionToFetchingState");
        }
        c2861bd.f26259m.a(new C3067jd(c2861bd.f26257k, adUnitTimeout, c2861bd.f26259m, c2861bd.f26258l), c2861bd);
    }

    @Override // com.inmobi.media.InterfaceC3116la
    public final void e() {
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        InterfaceC3116la interfaceC3116la = interfaceC3332tj instanceof InterfaceC3116la ? (InterfaceC3116la) interfaceC3332tj : null;
        if (interfaceC3116la != null) {
            interfaceC3116la.e();
        }
    }

    public final void g() {
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        Ei ei2 = interfaceC3332tj instanceof Ei ? (Ei) interfaceC3332tj : null;
        if (ei2 != null) {
            InterfaceC3322t9 interfaceC3322t9L = ei2.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("AUM-RenderedState", "onAdImpression");
            }
            T4.a(ei2.k(), new Ci(ei2, null));
        }
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        InterfaceC2976g interfaceC2976g = interfaceC3332tj instanceof InterfaceC2976g ? (InterfaceC2976g) interfaceC3332tj : null;
        if (interfaceC2976g != null) {
            interfaceC2976g.j();
        }
    }

    public final void a(InMobiAdRequestStatus status, short s10) {
        kotlin.jvm.internal.s.h(status, "status");
        Objects.toString(status);
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        AbstractC3272rb abstractC3272rb = interfaceC3332tj instanceof AbstractC3272rb ? (AbstractC3272rb) interfaceC3332tj : null;
        if (abstractC3272rb != null) {
            kotlin.jvm.internal.s.h(status, "status");
            InterfaceC3322t9 interfaceC3322t9L = abstractC3272rb.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC3272rb.a(status, s10);
        }
    }

    public final void a(Map params) {
        kotlin.jvm.internal.s.h(params, "params");
        Objects.toString(params);
        InterfaceC3332tj interfaceC3332tj = ((Ic) this).f25000c;
        Ei ei2 = interfaceC3332tj instanceof Ei ? (Ei) interfaceC3332tj : null;
        if (ei2 != null) {
            kotlin.jvm.internal.s.h(params, "params");
            InterfaceC3322t9 interfaceC3322t9L = ei2.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("AUM-RenderedState", "onAdClicked");
            }
            T4.a(ei2.k(), new Bi(ei2, params, null));
        }
    }
}
