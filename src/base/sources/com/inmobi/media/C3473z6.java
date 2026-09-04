package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3473z6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OmSdkInfo f27979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A6 f27981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3473z6(A6 a10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27981d = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27980c = obj;
        this.f27982e |= Integer.MIN_VALUE;
        return this.f27981d.a(null, this);
    }
}
