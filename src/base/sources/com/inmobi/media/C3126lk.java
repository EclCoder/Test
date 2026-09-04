package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.lk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3126lk extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nm.a f26954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f26957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EnumC3281rk f26958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3126lk(String str, Map map, EnumC3281rk enumC3281rk, kl.f fVar) {
        super(2, fVar);
        this.f26956d = str;
        this.f26957e = map;
        this.f26958f = enumC3281rk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3126lk(this.f26956d, this.f26957e, this.f26958f, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3126lk) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        if (r13.a(r1, r12) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [nm.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [nm.a] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3126lk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
