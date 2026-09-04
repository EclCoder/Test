package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3055j1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3055j1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f26765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3107l1 f26766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3055j1(byte[] bArr, AbstractC3107l1 abstractC3107l1, kl.f fVar) {
        super(2, fVar);
        this.f26765b = bArr;
        this.f26766c = abstractC3107l1;
    }

    public static final fl.g0 a(AbstractC3107l1 abstractC3107l1, W w10) {
        AbstractC3107l1.a(abstractC3107l1, w10);
        return fl.g0.f38750a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3055j1(this.f26765b, this.f26766c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3055j1(this.f26765b, this.f26766c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26764a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                byte[] bArr = this.f26765b;
                AbstractC3107l1 abstractC3107l1 = this.f26766c;
                C2821a c2821a = new C2821a(bArr, abstractC3107l1.f26900l.f27659a, abstractC3107l1.f26897i);
                final AbstractC3107l1 abstractC3107l2 = this.f26766c;
                Function1 function1 = new Function1() { // from class: yh.y8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C3055j1.a(abstractC3107l2, (W) obj2);
                    }
                };
                this.f26764a = 1;
                obj = c2821a.a(function1, this);
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
            AbstractC3107l1 abstractC3107l3 = this.f26766c;
            C3348u9 c3348u9 = abstractC3107l3.f26897i;
            if (c3348u9 != null) {
                C3365v0 c3365v0 = abstractC3107l3.f26900l;
                AbstractC2900d0.a(c3365v0.f27663e, c3365v0.f27664f, adResponse, c3348u9);
            }
            this.f26766c.a(adResponse);
        } catch (Y e10) {
            AbstractC3107l1 abstractC3107l4 = this.f26766c;
            V v10 = e10.f26048b;
            if (v10 instanceof C2867bj) {
                abstractC3107l4.b(((C2867bj) v10).f26270a);
            }
            abstractC3107l4.b(e10.f26047a, true, (short) 0);
        } catch (Throwable th2) {
            C3348u9 c3348u10 = this.f26766c.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u10.a("l1", "doAdLoadWork: " + th2);
            }
            fl.k kVar = W9.f25935a;
            W9.a(new M2(th2));
            AbstractC3107l1 abstractC3107l5 = this.f26766c;
            abstractC3107l5.getClass();
            abstractC3107l5.b(gl.l0.m(fl.w.a("errorCode", (short) 2363)));
            abstractC3107l5.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return fl.g0.f38750a;
    }
}
