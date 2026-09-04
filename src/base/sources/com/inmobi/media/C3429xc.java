package com.inmobi.media;

import android.content.Context;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3429xc extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3454yc f27842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3429xc(C3454yc c3454yc, kl.f fVar) {
        super(2, fVar);
        this.f27842b = c3454yc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3429xc(this.f27842b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3429xc(this.f27842b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objF = ll.b.f();
        int i10 = this.f27841a;
        String key = QGbBllacZSmHKn.kiskZDpiyEqrctb;
        if (i10 == 0) {
            fl.s.b(obj);
            C3454yc c3454yc = this.f27842b;
            String str = c3454yc.f27937a;
            int i11 = c3454yc.f27938b;
            int i12 = c3454yc.f27939c;
            yl.f fVar = AbstractC2837af.f26214a;
            c3454yc.f27943g = new Re(str, null, null, null, new Ni(i11, i12 * 1000, 0), false, 46);
            C3454yc c3454yc2 = this.f27842b;
            Re re2 = c3454yc2.f27943g;
            Context context = Xi.f26021a;
            if (context != null) {
                kotlin.jvm.internal.s.h(context, "context");
                kotlin.jvm.internal.s.h("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "mraid_js_store");
                kotlin.jvm.internal.s.h(key, "key");
                if ((System.currentTimeMillis() / ((long) 1000)) - laA.f25198a.getLong(key, 0L) > c3454yc2.f27940d && re2 != null) {
                    B9 b10 = (B9) Pe.f25486c.getValue();
                    this.f27841a = 1;
                    objA = b10.f24525a.a(re2, this);
                    if (objA == objF) {
                        return objF;
                    }
                }
            }
            return fl.g0.f38750a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(obj);
        objA = obj;
        Ve ve2 = (Ve) objA;
        Context context2 = Xi.f26021a;
        if (!AbstractC3438xl.a(ve2)) {
            C3454yc c3454yc3 = this.f27842b;
            InterfaceC3322t9 interfaceC3322t9 = c3454yc3.f27941e;
            if (interfaceC3322t9 != null) {
                String str2 = c3454yc3.f27942f;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str2, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            kotlin.jvm.internal.s.h(context2, "context");
            kotlin.jvm.internal.s.h("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = La.f25197b;
            La laA2 = Ka.a(context2, "mraid_js_store");
            yl.f fVar2 = AbstractC2837af.f26214a;
            kotlin.jvm.internal.s.h(ve2, "<this>");
            String value = ve2.d().F(bm.d.f9079b);
            kotlin.jvm.internal.s.h("mraid_js_string", "key");
            kotlin.jvm.internal.s.h(value, "value");
            laA2.a("mraid_js_string", value, false);
            laA2.a(key, System.currentTimeMillis() / ((long) 1000), false);
        }
        return fl.g0.f38750a;
    }
}
