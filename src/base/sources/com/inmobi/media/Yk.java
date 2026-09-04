package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Yk extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig f26092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yk(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, kl.f fVar) {
        super(1, fVar);
        this.f26092b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Yk(this.f26092b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Yk(this.f26092b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
