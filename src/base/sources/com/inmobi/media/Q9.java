package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Q9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25545b;

    public Q9(kl.f fVar) {
        super(fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25544a = obj;
        this.f25545b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
    }
}
