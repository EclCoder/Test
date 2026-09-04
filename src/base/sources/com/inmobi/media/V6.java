package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class V6 extends AbstractC2925e0 implements InterfaceC3332tj, InterfaceC3116la, InterfaceC2976g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3185o1 f25879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ic f25880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3288s1 f25881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Pc f25882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final em.o0 f25883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3377vc f25884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z f25885n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(C3185o1 adManagerComponent, AbstractC3288s1 adUnitTimeout, Ic stateMachine, Pc publisherCallbacks) {
        super(adManagerComponent);
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        this.f25879h = adManagerComponent;
        this.f25880i = stateMachine;
        this.f25881j = adUnitTimeout;
        this.f25882k = publisherCallbacks;
        this.f25883l = T4.a(this.f26423b);
        TimeoutConfigurations.MediationConfig mediationConfigX = this.f26424c.getTimeouts().X();
        String str = this.f26425d.f25697g;
        this.f26422a.getClass();
        C3377vc c3377vcA = AbstractC3351uc.a(mediationConfigX, str, "native", Yi.f26090b);
        this.f25884m = c3377vcA;
        this.f25885n = new Z(adManagerComponent, c3377vcA);
    }

    public final void a(Y y10) {
        V v10 = y10.f26048b;
        InMobiAdRequestStatus inMobiAdRequestStatus = y10.f26047a;
        Objects.toString(v10);
        Objects.toString(inMobiAdRequestStatus);
        V v11 = y10.f26048b;
        if (v11 instanceof C2919dj) {
            C3132m0 c3132m0 = this.f26428g;
            em.k.d(c3132m0.f26967a, null, null, new C3106l0(c3132m0, null), 3, null);
            a(y10.f26047a, ((C2919dj) y10.f26048b).f26415a);
            return;
        }
        if (v11 instanceof N6) {
            a(y10.f26047a, ((N6) v11).f25322a);
        } else if (v11 instanceof O6) {
            a(y10.f26047a, (short) ((O6) v11).f25401a);
        } else {
            if (!(v11 instanceof C2867bj)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((C2867bj) v11).f26270a, y10.f26047a);
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
        J3.a(this.f25883l);
    }

    @Override // com.inmobi.media.InterfaceC3116la
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        this.f25880i.a(new C3370v5(this.f25879h), this);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.a("AUM-FetchingState", "Initialize Called");
        }
        Qk.b();
        this.f25881j.b();
        em.k.d(this.f25883l, null, null, new U6(this, null), 3, null);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.f25880i.a(new Q6(map, inMobiAdRequestStatus, this.f25881j, this.f25879h, this.f25882k, this.f25880i), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        a(gl.l0.m(fl.w.a("errorCode", Short.valueOf(s10))), inMobiAdRequestStatus);
    }
}
