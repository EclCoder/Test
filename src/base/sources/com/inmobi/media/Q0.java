package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Q0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdResponse f25520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f25521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f25524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R0 f25525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25526h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r10, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25525g = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25524f = obj;
        this.f25526h |= Integer.MIN_VALUE;
        return this.f25525g.a(null, null, this);
    }
}
