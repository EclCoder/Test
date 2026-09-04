package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y2 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z2 f26053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V2 f26054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(int i10, Z2 z10, V2 v10, kl.f fVar) {
        super(2, fVar);
        this.f26052b = i10;
        this.f26053c = z10;
        this.f26054d = v10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Y2(this.f26052b, this.f26053c, this.f26054d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Y2) create((C3167n9) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r6.a(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_NATIVE_VIDEO_CLICK, r1, 5, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = ll.b.f()
            int r1 = r5.f26051a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            fl.s.b(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            fl.s.b(r6)
            goto L47
        L1e:
            fl.s.b(r6)
            int r6 = r5.f26052b
            int r6 = r6 - r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r6 = ";"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.inmobi.media.Z2 r1 = r5.f26053c
            com.inmobi.media.n9 r1 = r1.f26111a
            r5.f26051a = r3
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L47
            goto L5c
        L47:
            com.inmobi.media.Z2 r6 = r5.f26053c
            com.inmobi.media.n9 r6 = r6.f26111a
            com.inmobi.media.V2 r1 = r5.f26054d
            android.content.ContentValues r1 = com.inmobi.media.AbstractC2851b3.a(r1)
            r5.f26051a = r2
            java.lang.String r2 = "click"
            r3 = 5
            java.lang.Object r6 = r6.a(r2, r1, r3, r5)
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            fl.g0 r6 = fl.g0.f38750a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Y2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
