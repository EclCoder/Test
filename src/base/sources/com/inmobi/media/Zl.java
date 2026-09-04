package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Zl f26154a = new Zl();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, C3416x c3416x, ArrayList arrayList, kotlin.coroutines.jvm.internal.d dVar) throws Kl {
        Yl yl2;
        El el2;
        Kl e10;
        El el3;
        if (dVar instanceof Yl) {
            yl2 = (Yl) dVar;
            int i10 = yl2.f26096d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yl2.f26096d = i10 - Integer.MIN_VALUE;
            } else {
                yl2 = new Yl(this, dVar);
            }
        } else {
            yl2 = new Yl(this, dVar);
        }
        Object obj = yl2.f26094b;
        Object objF = ll.b.f();
        int i11 = yl2.f26096d;
        if (i11 == 0) {
            fl.s.b(obj);
            G g10 = c3416x.f27823b;
            el2 = new El(g10);
            Wl wl2 = new Wl(c3416x.f27823b.f24811a.f27160b.getVastVideo(), el2, c3416x.f27822a.f27105c);
            try {
                Map mapA = AbstractC3487zk.a(g10);
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("VastParseStart", mapA, EnumC3281rk.SDK);
                yl2.f26093a = el2;
                try {
                    yl2.f26096d = 1;
                    Object objA = wl2.a(str, arrayList, yl2);
                    if (objA == objF) {
                        return objF;
                    }
                    obj = objA;
                    el3 = el2;
                } catch (Kl e11) {
                    e10 = e11;
                    short s10 = e10.f25135a;
                    Map mapA2 = AbstractC3487zk.a(el2.f24733a);
                    mapA2.put("errorCode", Short.valueOf(s10));
                    C3178nk c3178nk2 = C3178nk.f27064a;
                    C3178nk.b("VastParseFailure", mapA2, EnumC3281rk.SDK);
                    throw e10;
                }
            } catch (Kl e12) {
                e10 = e12;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            el3 = yl2.f26093a;
            try {
                fl.s.b(obj);
            } catch (Kl e13) {
                e10 = e13;
                el2 = el3;
                short s11 = e10.f25135a;
                Map mapA3 = AbstractC3487zk.a(el2.f24733a);
                mapA3.put("errorCode", Short.valueOf(s11));
                C3178nk c3178nk3 = C3178nk.f27064a;
                C3178nk.b("VastParseFailure", mapA3, EnumC3281rk.SDK);
                throw e10;
            }
        }
        Map mapA4 = AbstractC3487zk.a(el3.f24733a);
        C3178nk c3178nk4 = C3178nk.f27064a;
        C3178nk.b("VastParseSuccess", mapA4, EnumC3281rk.SDK);
        return obj;
    }
}
