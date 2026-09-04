package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3006h3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V2 f26648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC3083k3 f26649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3006h3(V2 v10, HandlerC3083k3 handlerC3083k3, kl.f fVar) {
        super(2, fVar);
        this.f26648b = v10;
        this.f26649c = handlerC3083k3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3006h3(this.f26648b, this.f26649c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3006h3(this.f26648b, this.f26649c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r7.f26647a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            fl.s.b(r8)
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            fl.s.b(r8)
            goto L4e
        L1f:
            fl.s.b(r8)
            fl.k r8 = com.inmobi.media.A3.f24441b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.Z2 r8 = (com.inmobi.media.Z2) r8
            com.inmobi.media.V2 r1 = r7.f26648b
            int r1 = r1.f25869a
            r7.f26647a = r4
            com.inmobi.media.n9 r8 = r8.f26111a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r5 = "click"
            java.lang.String r6 = "id=?"
            java.lang.Object r8 = r8.a(r5, r6, r1, r7)
            java.lang.Object r1 = ll.b.f()
            if (r8 != r1) goto L49
            goto L4b
        L49:
            fl.g0 r8 = fl.g0.f38750a
        L4b:
            if (r8 != r0) goto L4e
            goto L6d
        L4e:
            java.util.List r8 = com.inmobi.media.A3.f24445f
            com.inmobi.media.V2 r1 = r7.f26648b
            r8.remove(r1)
            java.util.List r8 = com.inmobi.media.A3.f24445f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L98
            fl.k r8 = com.inmobi.media.A3.f24441b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.Z2 r8 = (com.inmobi.media.Z2) r8
            r7.f26647a = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            android.os.Message r8 = android.os.Message.obtain()
            r8.what = r4
            com.inmobi.media.k3 r0 = r7.f26649c
            boolean r8 = r0.sendMessage(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r8
        L87:
            com.inmobi.media.A3 r8 = com.inmobi.media.A3.f24440a
            java.lang.String r8 = "A3"
            java.lang.String r0 = "access$getTAG$p(...)"
            kotlin.jvm.internal.s.g(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.A3.f24446g
            r8.set(r2)
            fl.g0 r8 = fl.g0.f38750a
            return r8
        L98:
            com.inmobi.media.k3 r8 = r7.f26649c
            java.util.List r0 = com.inmobi.media.A3.f24445f
            java.lang.Object r0 = r0.get(r2)
            com.inmobi.media.V2 r0 = (com.inmobi.media.V2) r0
            int r1 = com.inmobi.media.HandlerC3083k3.f26835a
            android.os.Message r1 = android.os.Message.obtain()
            if (r0 == 0) goto Laf
            boolean r2 = r0.f25873e
            if (r2 != r4) goto Laf
            r3 = 3
        Laf:
            r1.what = r3
            r1.obj = r0
            r8.sendMessage(r1)
            fl.g0 r8 = fl.g0.f38750a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3006h3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
