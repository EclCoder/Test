package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;

/* JADX INFO: renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2879c5 extends AbstractC2925e0 implements InterfaceC3332tj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3185o1 f26301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Pc f26302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ic f26303j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2879c5(C3185o1 adManagerComponent, Pc publisherCallbacks, Ic stateMachine) {
        super(adManagerComponent);
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26301h = adManagerComponent;
        this.f26302i = publisherCallbacks;
        this.f26303j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
    }

    public final boolean b() {
        try {
            kotlin.jvm.internal.l0.b(Picasso.class).k();
            try {
                kotlin.jvm.internal.l0.b(androidx.browser.customtabs.c.class).k();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    public final void a(byte[] bArr) {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, bm.d.f9079b) : null));
        }
        C2874c0 c2874c0 = this.f26427f;
        c2874c0.getClass();
        c2874c0.f26287a = SystemClock.elapsedRealtime();
        C3132m0 c3132m0 = this.f26428g;
        em.k.d(c3132m0.f26967a, null, null, new C2951f0(c3132m0, null), 3, null);
        if (b()) {
            C3348u9 c3348u10 = this.f26426e;
            if (c3348u10 != null) {
                c3348u10.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3185o1 adManagerComponent = this.f26301h;
        Ic stateMachine = this.f26303j;
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        C3065jb adUnitTimeout = new C3065jb(adManagerComponent, stateMachine);
        C2861bd c2861bd = (C2861bd) this;
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        C3348u9 c3348u11 = c2861bd.f26426e;
        if (c3348u11 != null) {
            c3348u11.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        c2861bd.f26259m.a(new C3378vd(bArr, c2861bd.f26257k, adUnitTimeout, c2861bd.f26258l, c2861bd.f26259m), c2861bd);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            c3348u9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.f26303j.a(new C3117lb((short) 2007, inMobiAdRequestStatus, this.f26301h, this.f26302i, this.f26303j), this);
    }
}
