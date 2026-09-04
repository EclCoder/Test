package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vg extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f25900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f25902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.PublisherConfig f25903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vg(Map map, SignalsConfig.PublisherConfig publisherConfig, kl.f fVar) {
        super(2, fVar);
        this.f25902c = map;
        this.f25903d = publisherConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Vg(this.f25902c, this.f25903d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Vg(this.f25902c, this.f25903d, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0172, code lost:
    
        if (com.inmobi.media.Xg.b(r13, r2, r0, r12) == r1) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Vg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
