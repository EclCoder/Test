package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3432xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3432xf f27854a = new C3432xf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f27855b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Af f27856c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        C3328tf c3328tf;
        AdConfig.OmidConfig omidConfig;
        Context context;
        if (dVar instanceof C3328tf) {
            c3328tf = (C3328tf) dVar;
            int i10 = c3328tf.f27551e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3328tf.f27551e = i10 - Integer.MIN_VALUE;
            } else {
                c3328tf = new C3328tf(this, dVar);
            }
        } else {
            c3328tf = new C3328tf(this, dVar);
        }
        Object obj = c3328tf.f27549c;
        Object objF = ll.b.f();
        int i11 = c3328tf.f27551e;
        if (i11 == 0) {
            fl.s.b(obj);
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
            AdConfig.OmidConfig omidConfig2 = ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getViewability().getOmidConfig();
            Context context2 = Xi.f26021a;
            if (context2 == null) {
                return fl.g0.f38750a;
            }
            c3328tf.f27547a = omidConfig2;
            c3328tf.f27548b = context2;
            c3328tf.f27551e = 1;
            Object objA = a(context2, omidConfig2, c3328tf);
            if (objA == objF) {
                return objF;
            }
            omidConfig = omidConfig2;
            obj = objA;
            context = context2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = c3328tf.f27548b;
            omidConfig = c3328tf.f27547a;
            fl.s.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return fl.g0.f38750a;
        }
        f27855b.set(2);
        em.k.d(H9.f24930c, null, null, new C3354uf(omidConfig, context, null), 3, null);
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, kotlin.coroutines.jvm.internal.d dVar) {
        C3406wf c3406wf;
        if (dVar instanceof C3406wf) {
            c3406wf = (C3406wf) dVar;
            int i10 = c3406wf.f27795c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3406wf.f27795c = i10 - Integer.MIN_VALUE;
            } else {
                c3406wf = new C3406wf(this, dVar);
            }
        } else {
            c3406wf = new C3406wf(this, dVar);
        }
        Object objJ = c3406wf.f27793a;
        Object objF = ll.b.f();
        int i11 = c3406wf.f27795c;
        boolean z10 = true;
        if (i11 == 0) {
            fl.s.b(objJ);
            AtomicInteger atomicInteger = f27855b;
            if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                Af af2 = f27856c;
                if (af2 == null) {
                    af2 = new Af(context);
                    f27856c = af2;
                }
                c3406wf.f27795c = 1;
                objJ = em.i.j(em.c1.b(), new C3457yf(af2, omidConfig, null), c3406wf);
                if (objJ == objF) {
                    return objF;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(objJ);
        if (((Boolean) objJ).booleanValue()) {
            z10 = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }
}
