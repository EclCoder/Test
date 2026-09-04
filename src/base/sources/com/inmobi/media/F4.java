package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class F4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G4 f24752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2828a6 f24753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(G4 g10, C2828a6 c2828a6, long j10, int i10, kl.f fVar) {
        super(2, fVar);
        this.f24752b = g10;
        this.f24753c = c2828a6;
        this.f24754d = j10;
        this.f24755e = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new F4(this.f24752b, this.f24753c, this.f24754d, this.f24755e, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((F4) create((C3167n9) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
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
            int r1 = r7.f24751a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fl.s.b(r8)
            goto L7e
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            fl.s.b(r8)
            goto L4f
        L1e:
            fl.s.b(r8)
            com.inmobi.media.G4 r8 = r7.f24752b
            com.inmobi.media.n9 r8 = r8.f24838a
            com.inmobi.media.a6 r1 = r7.f24753c
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.s.h(r1, r4)
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = "e_data"
            java.lang.String r6 = r1.f26169a
            r4.put(r5, r6)
            long r5 = r1.f26170b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "timestamp"
            r4.put(r5, r1)
            r7.f24751a = r3
            r1 = 4
            java.lang.String r3 = "c_data"
            java.lang.Object r8 = r8.a(r3, r4, r1, r7)
            if (r8 != r0) goto L4f
            goto L7d
        L4f:
            long r3 = r7.f24754d
            int r8 = r7.f24755e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " ORDER BY timestamp DESC LIMIT "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = ") foo);"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.inmobi.media.G4 r1 = r7.f24752b
            com.inmobi.media.n9 r1 = r1.f24838a
            r7.f24751a = r2
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L7e
        L7d:
            return r0
        L7e:
            fl.g0 r8 = fl.g0.f38750a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
