package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3348u9 f25576a;

    public R0(C3348u9 c3348u9) {
        this.f25576a = c3348u9;
    }

    public abstract fl.g0 a(AdResponse adResponse, Function1 function1);

    public abstract Object a(kl.f fVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function1 function1, kotlin.coroutines.jvm.internal.d dVar) {
        P0 p10;
        if (dVar instanceof P0) {
            p10 = (P0) dVar;
            int i10 = p10.f25451d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p10.f25451d = i10 - Integer.MIN_VALUE;
            } else {
                p10 = new P0(this, dVar);
            }
        } else {
            p10 = new P0(this, dVar);
        }
        Object objA = p10.f25449b;
        Object objF = ll.b.f();
        int i11 = p10.f25451d;
        if (i11 == 0) {
            fl.s.b(objA);
            function1.invoke(C3195ob.f27130a);
            p10.f25448a = function1;
            p10.f25451d = 1;
            objA = a(p10);
            if (objA != objF) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
            return objA;
        }
        function1 = p10.f25448a;
        fl.s.b(objA);
        p10.f25448a = null;
        p10.f25451d = 2;
        Object objA2 = a((String) objA, function1, p10);
        return objA2 == objF ? objF : objA2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (a(r0, r14) == r4) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c7 -> B:32:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c9 -> B:32:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00de -> B:32:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e0 -> B:32:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, kotlin.jvm.functions.Function1 r18, kotlin.coroutines.jvm.internal.d r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R0.a(java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
