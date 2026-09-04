package com.inmobi.media;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f25262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb f25265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mb(Rb rb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25265d = rb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25264c = obj;
        this.f25266e |= Integer.MIN_VALUE;
        return this.f25265d.a((C3453yb) null, this);
    }
}
