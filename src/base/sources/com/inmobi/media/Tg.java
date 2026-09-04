package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Tg extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25763a;

    public Tg(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Tg(fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Tg((kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25763a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                Xg xg2 = Xg.f26013a;
                xg2.getClass();
                Context context = Xi.f26021a;
                JSONObject jSONObject = null;
                if (context != null) {
                    if (Xg.f26016d == null) {
                        Xg.f26016d = new Ig(context, "pub_signals_store");
                    }
                    Ig ig2 = Xg.f26016d;
                    if (ig2 == null) {
                        kotlin.jvm.internal.s.w("prefDao");
                        ig2 = null;
                    }
                    String strA = ig2.a("saved_signals");
                    if (strA != null) {
                        jSONObject = new JSONObject(strA);
                    }
                }
                if (jSONObject == null) {
                    return fl.g0.f38750a;
                }
                SignalsConfig.PublisherConfig publisherConfigC = Xg.c();
                JSONObject jSONObjectA = Yg.a(Yg.a(Yg.a(jSONObject, "obj_", publisherConfigC.getObj().getExpiry()), "auto_", publisherConfigC.getAuto().getExpiry()), "dir_", publisherConfigC.getDirect().getExpiry());
                this.f25763a = 1;
                if (xg2.a(jSONObjectA, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
        return fl.g0.f38750a;
    }
}
