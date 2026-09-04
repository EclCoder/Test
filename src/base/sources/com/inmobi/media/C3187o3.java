package com.inmobi.media;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3187o3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(V2 v10, kotlin.coroutines.jvm.internal.d dVar) {
        C3161n3 c3161n3;
        String str;
        Exception e10;
        V2 v11 = v10;
        if (dVar instanceof C3161n3) {
            c3161n3 = (C3161n3) dVar;
            int i10 = c3161n3.f27029d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3161n3.f27029d = i10 - Integer.MIN_VALUE;
            } else {
                c3161n3 = new C3161n3(this, dVar);
            }
        } else {
            c3161n3 = new C3161n3(this, dVar);
        }
        Object objA = c3161n3.f27027b;
        Object objF = ll.b.f();
        int i11 = c3161n3.f27029d;
        if (i11 == 0) {
            fl.s.b(objA);
            A3 a10 = A3.f24440a;
            kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
            int i12 = v11.f25869a;
            str = "access$getTAG$p(...)";
            Re re2 = new Re(v11.f25870b, A3.a(v11), new Gk(A3.c().getPingTimeout() * 1000, A3.c().getPingTimeout() * 1000, A3.c().getPingTimeout() * 1000), v11.f25871c, null, v11.f25872d, 16);
            try {
                B9 b10 = (B9) Pe.f25489f.getValue();
                c3161n3.f27026a = v11;
                c3161n3.f27029d = 1;
                objA = b10.f24525a.a(re2, c3161n3);
                if (objA == objF) {
                    return objF;
                }
            } catch (CancellationException unused) {
                A3 a11 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", str);
                return EnumC2931e6.f26463n;
            } catch (Exception e11) {
                e10 = e11;
                A3 a12 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", str);
                e10.getMessage();
                return EnumC2931e6.f26453d;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v11 = c3161n3.f27026a;
            try {
                fl.s.b(objA);
                str = "access$getTAG$p(...)";
            } catch (CancellationException unused2) {
                str = "access$getTAG$p(...)";
                A3 a13 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", str);
                return EnumC2931e6.f26463n;
            } catch (Exception e12) {
                e10 = e12;
                str = "access$getTAG$p(...)";
                A3 a14 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", str);
                e10.getMessage();
                return EnumC2931e6.f26453d;
            }
        }
        Ve ve2 = (Ve) objA;
        A3 a15 = A3.f24440a;
        if (AbstractC3438xl.a(ve2)) {
            return null;
        }
        int iC = ve2.c();
        if (200 <= iC && iC < 300) {
            return null;
        }
        if (!v11.f25872d) {
            C2880c6 c2880c6 = EnumC2931e6.f26451b;
            if (303 == iC || 302 == iC) {
                return null;
            }
        }
        EnumC2931e6.f26451b.getClass();
        return C2880c6.a(iC);
    }
}
