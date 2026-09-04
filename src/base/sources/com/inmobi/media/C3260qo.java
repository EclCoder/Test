package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.qo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3260qo extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Te f27350b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3260qo(Te networkRequest, C3348u9 c3348u9) {
        super(c3348u9);
        kotlin.jvm.internal.s.h(networkRequest, "networkRequest");
        this.f27350b = networkRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.R0
    public final Object a(kl.f fVar) {
        C3234po c3234po;
        if (fVar instanceof C3234po) {
            c3234po = (C3234po) fVar;
            int i10 = c3234po.f27288c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3234po.f27288c = i10 - Integer.MIN_VALUE;
            } else {
                c3234po = new C3234po(this, (kotlin.coroutines.jvm.internal.d) fVar);
            }
        } else {
            c3234po = new C3234po(this, (kotlin.coroutines.jvm.internal.d) fVar);
        }
        Object objA = c3234po.f27286a;
        Object objF = ll.b.f();
        int i11 = c3234po.f27288c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3287s0 c3287s0 = C3287s0.f27423a;
            Te te2 = this.f27350b;
            c3234po.f27288c = 1;
            objA = c3287s0.a(te2, c3234po);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Ve ve2 = (Ve) objA;
        yl.f fVar2 = AbstractC2837af.f26214a;
        kotlin.jvm.internal.s.h(ve2, "<this>");
        return ve2.d().F(bm.d.f9079b);
    }

    @Override // com.inmobi.media.R0
    public final fl.g0 a(AdResponse adResponse, Function1 function1) {
        Objects.toString(adResponse);
        V0.a(adResponse, this.f25576a, function1);
        return fl.g0.f38750a;
    }
}
