package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3247qb extends AbstractC2925e0 implements InterfaceC3332tj, InterfaceC3116la, InterfaceC2976g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f27328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3185o1 f27329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3288s1 f27330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Pc f27331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ic f27332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final X f27333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final em.o0 f27334n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3247qb(byte[] bArr, C3185o1 adManagerComponent, AbstractC3288s1 adUnitTimeout, Pc publisherCallbacks, Ic stateMachine) {
        super(adManagerComponent);
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f27328h = bArr;
        this.f27329i = adManagerComponent;
        this.f27330j = adUnitTimeout;
        this.f27331k = publisherCallbacks;
        this.f27332l = stateMachine;
        this.f27333m = new X(this.f26427f, this.f26428g);
        this.f27334n = T4.a(this.f26423b);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.f27328h;
        if (bArr != null && bArr.length != 0) {
            C2821a c2821a = new C2821a(bArr, this.f26425d.f25691a, this.f26426e);
            this.f27330j.d();
            em.k.d(this.f27334n, null, null, new C3221pb(c2821a, this, null), 3, null);
        } else {
            C3348u9 c3348u10 = this.f26426e;
            if (c3348u10 != null) {
                c3348u10.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
        J3.a(this.f27334n);
    }

    @Override // com.inmobi.media.InterfaceC3116la
    public final void e() {
        a(gl.l0.m(fl.w.a("errorCode", (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.f27332l.a(new C3370v5(null, this.f27330j, this.f27329i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.f27332l.a(new Q6(map, inMobiAdRequestStatus, this.f27330j, this.f27329i, this.f27331k, this.f27332l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.f27332l.a(new C3117lb((short) 2143, inMobiAdRequestStatus, this.f27329i, this.f27331k, this.f27332l), this);
    }
}
