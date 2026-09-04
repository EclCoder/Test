package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3354uf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f27625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f27626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3354uf(AdConfig.OmidConfig omidConfig, Context context, kl.f fVar) {
        super(2, fVar);
        this.f27625c = omidConfig;
        this.f27626d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3354uf c3354uf = new C3354uf(this.f27625c, this.f27626d, fVar);
        c3354uf.f27624b = obj;
        return c3354uf;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3354uf) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r15 == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r1 = ll.b.f()
            int r0 = r14.f27623a
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L24
            if (r0 == r5) goto L1d
            if (r0 != r4) goto L15
            fl.s.b(r15)
            goto Lb6
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            fl.s.b(r15)     // Catch: java.lang.Throwable -> L21
            goto L62
        L21:
            r0 = move-exception
            r15 = r0
            goto L69
        L24:
            fl.s.b(r15)
            java.lang.Object r15 = r14.f27624b
            em.o0 r15 = (em.o0) r15
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r15 = r14.f27625c
            fl.r$a r0 = fl.r.f38769b     // Catch: java.lang.Throwable -> L21
            r14.f27623a = r5     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = r15.getUrl()     // Catch: java.lang.Throwable -> L21
            int r0 = r15.getMaxRetries()     // Catch: java.lang.Throwable -> L21
            int r15 = r15.getRetryInterval()     // Catch: java.lang.Throwable -> L21
            yl.f r6 = com.inmobi.media.AbstractC2837af.f26214a     // Catch: java.lang.Throwable -> L21
            int r15 = r15 * 1000
            long r8 = (long) r15     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Re r6 = new com.inmobi.media.Re     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Ni r11 = new com.inmobi.media.Ni     // Catch: java.lang.Throwable -> L21
            r11.<init>(r0, r8, r3)     // Catch: java.lang.Throwable -> L21
            r12 = 0
            r13 = 46
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L21
            em.k0 r15 = em.c1.b()     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Bf r0 = new com.inmobi.media.Bf     // Catch: java.lang.Throwable -> L21
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r15 = em.i.j(r15, r0, r14)     // Catch: java.lang.Throwable -> L21
            if (r15 != r1) goto L62
            goto Lb5
        L62:
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L21
            java.lang.Object r15 = fl.r.b(r15)     // Catch: java.lang.Throwable -> L21
            goto L73
        L69:
            fl.r$a r0 = fl.r.f38769b
            java.lang.Object r15 = fl.s.a(r15)
            java.lang.Object r15 = fl.r.b(r15)
        L73:
            java.lang.Throwable r0 = fl.r.e(r15)
            if (r0 == 0) goto L7e
            java.util.concurrent.atomic.AtomicInteger r0 = com.inmobi.media.C3432xf.f27855b
            r0.set(r3)
        L7e:
            android.content.Context r0 = r14.f27626d
            boolean r3 = fl.r.i(r15)
            if (r3 == 0) goto Lb6
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.atomic.AtomicInteger r6 = com.inmobi.media.C3432xf.f27855b
            r6.set(r5)
            com.inmobi.media.Af r5 = com.inmobi.media.C3432xf.f27856c
            if (r5 != 0) goto L99
            com.inmobi.media.Af r5 = new com.inmobi.media.Af
            r5.<init>(r0)
            com.inmobi.media.C3432xf.f27856c = r5
        L99:
            r14.f27624b = r15
            r14.f27623a = r4
            em.k0 r15 = em.c1.b()
            com.inmobi.media.zf r0 = new com.inmobi.media.zf
            r0.<init>(r5, r3, r2)
            java.lang.Object r15 = em.i.j(r15, r0, r14)
            java.lang.Object r0 = ll.b.f()
            if (r15 != r0) goto Lb1
            goto Lb3
        Lb1:
            fl.g0 r15 = fl.g0.f38750a
        Lb3:
            if (r15 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            fl.g0 r15 = fl.g0.f38750a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3354uf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
