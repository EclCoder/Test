package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V6 f25813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(V6 v10, kl.f fVar) {
        super(2, fVar);
        this.f25813b = v10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new U6(this.f25813b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new U6(this.f25813b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25812a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                C2874c0 c2874c0 = this.f25813b.f26427f;
                c2874c0.getClass();
                c2874c0.f26289c = SystemClock.elapsedRealtime();
                Integer num = this.f25813b.f25884m.f27715d;
                long jIntValue = num != null ? num.intValue() : 15000;
                T6 t10 = new T6(this.f25813b, null);
                this.f25812a = 1;
                obj = em.z2.c(jIntValue, t10, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.f25813b.f26422a.getClass();
            V6 v10 = this.f25813b;
            AbstractC2900d0.a("native", v10.f26425d.f25697g, adResponse, v10.f26426e);
            C3348u9 c3348u9 = this.f25813b.f26426e;
            if (c3348u9 != null) {
                c3348u9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.f25813b.a(adResponse);
        } catch (Y e10) {
            C3348u9 c3348u10 = this.f25813b.f26426e;
            if (c3348u10 != null) {
                c3348u10.b("AUM-FetchingState", "AdResponse Parse Failure " + e10);
            }
            this.f25813b.a(e10);
        } catch (TimeoutCancellationException unused) {
            C3348u9 c3348u11 = this.f25813b.f26426e;
            if (c3348u11 != null) {
                c3348u11.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.f25813b.a(new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new N6((short) 2138)));
        }
        return fl.g0.f38750a;
    }
}
