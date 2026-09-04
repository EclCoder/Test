package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.inmobi.media.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3287s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3287s0 f27423a = new C3287s0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Te te2, kotlin.coroutines.jvm.internal.d dVar) {
        C3236q0 c3236q0;
        InMobiAdRequestStatus.StatusCode statusCode;
        if (dVar instanceof C3236q0) {
            c3236q0 = (C3236q0) dVar;
            int i10 = c3236q0.f27300c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3236q0.f27300c = i10 - Integer.MIN_VALUE;
            } else {
                c3236q0 = new C3236q0(this, dVar);
            }
        } else {
            c3236q0 = new C3236q0(this, dVar);
        }
        Object objB = c3236q0.f27298a;
        Object objF = ll.b.f();
        int i11 = c3236q0.f27300c;
        if (i11 == 0) {
            fl.s.b(objB);
            c3236q0.f27300c = 1;
            objB = b(te2, c3236q0);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objB);
        }
        Ve ve2 = (Ve) objB;
        if (ve2.c() == 204) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new O6(ve2.c()));
        }
        int iC = ve2.c();
        C2880c6 c2880c6 = EnumC2931e6.f26451b;
        if (iC == 176) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new N6((short) 2369));
        }
        if (ve2.c() == 200) {
            return ve2;
        }
        int iC2 = ve2.c();
        if (iC2 == 192) {
            statusCode = InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED;
        } else if (iC2 == 0) {
            statusCode = InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE;
        } else if (iC2 == 504 || iC2 == 176) {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT;
        } else if (400 > iC2 || iC2 >= 500) {
            statusCode = (500 > iC2 || iC2 > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR;
        } else {
            statusCode = InMobiAdRequestStatus.StatusCode.REQUEST_INVALID;
        }
        throw new Y(new InMobiAdRequestStatus(statusCode), new O6(ve2.c()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Te te2, kotlin.coroutines.jvm.internal.d dVar) {
        C3261r0 c3261r0;
        if (dVar instanceof C3261r0) {
            c3261r0 = (C3261r0) dVar;
            int i10 = c3261r0.f27360c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3261r0.f27360c = i10 - Integer.MIN_VALUE;
            } else {
                c3261r0 = new C3261r0(this, dVar);
            }
        } else {
            c3261r0 = new C3261r0(this, dVar);
        }
        Object obj = c3261r0.f27358a;
        Object objF = ll.b.f();
        int i11 = c3261r0.f27360c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return obj;
            }
            fl.s.b(obj);
            B9 b10 = (B9) Pe.f25484a.getValue();
            c3261r0.f27360c = 1;
            Object objA = b10.f24525a.a(te2, c3261r0);
            return objA == objF ? objF : objA;
        } catch (CancellationException unused) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new N6((short) 2206));
        }
    }
}
