package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class O9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nm.a f25404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25406d;

    public O9(kl.f fVar) {
        super(fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25405c = obj;
        this.f25406d |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this);
    }
}
