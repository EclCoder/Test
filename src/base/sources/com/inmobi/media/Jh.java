package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Jh extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f25073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Kh f25075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jh(Kh kh2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25075d = kh2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25074c = obj;
        this.f25076e |= Integer.MIN_VALUE;
        return this.f25075d.a((Ve) null, (List) null, this);
    }
}
