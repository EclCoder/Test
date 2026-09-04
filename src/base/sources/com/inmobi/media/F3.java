package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class F3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(long j10, Function1 function1, long j11, kl.f fVar) {
        super(2, fVar);
        this.f24748c = j10;
        this.f24749d = function1;
        this.f24750e = j11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        F3 f10 = new F3(this.f24748c, this.f24749d, this.f24750e, fVar);
        f10.f24747b = obj;
        return f10;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((F3) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f A[PHI: r1
      0x003f: PHI (r1v3 em.o0) = (r1v2 em.o0), (r1v4 em.o0), (r1v6 em.o0) binds: [B:15:0x003e, B:22:0x005c, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[PHI: r1
      0x0052: PHI (r1v4 em.o0) = (r1v3 em.o0), (r1v8 em.o0) binds: [B:19:0x004f, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r7.f24746a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f24747b
            em.o0 r1 = (em.o0) r1
            fl.s.b(r8)
            goto L52
        L22:
            java.lang.Object r1 = r7.f24747b
            em.o0 r1 = (em.o0) r1
            fl.s.b(r8)
            goto L3f
        L2a:
            fl.s.b(r8)
            java.lang.Object r8 = r7.f24747b
            em.o0 r8 = (em.o0) r8
            long r5 = r7.f24748c
            r7.f24747b = r8
            r7.f24746a = r4
            java.lang.Object r1 = em.y0.a(r5, r7)
            if (r1 != r0) goto L3e
            goto L5e
        L3e:
            r1 = r8
        L3f:
            boolean r8 = em.p0.f(r1)
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r7.f24749d
            r7.f24747b = r1
            r7.f24746a = r3
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r0) goto L52
            goto L5e
        L52:
            long r4 = r7.f24750e
            r7.f24747b = r1
            r7.f24746a = r2
            java.lang.Object r8 = em.y0.a(r4, r7)
            if (r8 != r0) goto L3f
        L5e:
            return r0
        L5f:
            fl.g0 r8 = fl.g0.f38750a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
