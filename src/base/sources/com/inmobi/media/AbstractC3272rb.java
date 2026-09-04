package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import o4.Wz.OGoz;

/* JADX INFO: renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3272rb extends AbstractC3441y implements InterfaceC3332tj, InterfaceC3116la, InterfaceC2976g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3416x f27385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3288s1 f27386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pc f27387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ic f27388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3272rb(C3416x adComponent, AbstractC3288s1 adUnitTimeout, Pc publisherCallbacks, Ic stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f27385b = adComponent;
        this.f27386c = adUnitTimeout;
        this.f27387d = publisherCallbacks;
        this.f27388e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-LoadingState", "Initialize Called");
        }
        this.f27386c.getClass();
        InterfaceC3332tj interfaceC3332tj = ((Kd) this).f25118j.f25344b.f25635c;
        C2887cd c2887cd = interfaceC3332tj instanceof C2887cd ? (C2887cd) interfaceC3332tj : null;
        if (c2887cd != null) {
            C3348u9 c3348u9 = c2887cd.f26326a.f25267a.f27822a.f27105c;
            if (c3348u9 != null) {
                c3348u9.a("NativeCreatedState", "Inflate Called");
            }
            c2887cd.f26327b.a(new Ld(c2887cd.f26326a, c2887cd.f26327b), c2887cd);
        }
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3116la
    public final void e() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), Ze.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a(OGoz.BFVxXDNfa, "onDestroy");
        }
        this.f27388e.a(new C3370v5(((Kd) this).f25118j, this.f27386c, this.f27385b), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s10));
        }
        this.f27388e.a(new C3169nb(gl.l0.m(fl.w.a("errorCode", Short.valueOf(s10))), inMobiAdRequestStatus, this.f27386c, this.f27385b, this.f27387d, this.f27388e), this);
    }
}
