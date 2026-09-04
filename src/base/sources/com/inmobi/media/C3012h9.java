package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.h9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3012h9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f26660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3167n9 f26662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3012h9(C3167n9 c3167n9, kl.f fVar) {
        super(fVar);
        this.f26662c = c3167n9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26661b = obj;
        this.f26663d |= Integer.MIN_VALUE;
        return this.f26662c.a((Function1) null, this);
    }
}
