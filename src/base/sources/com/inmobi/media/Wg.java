package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wg extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f25949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nm.a f25950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Xg f25952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wg(Xg xg2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25952d = xg2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25951c = obj;
        this.f25953e |= Integer.MIN_VALUE;
        return this.f25952d.a((JSONObject) null, this);
    }
}
