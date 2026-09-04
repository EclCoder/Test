package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2895cl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f26356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nm.a f26357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2921dl f26359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895cl(C2921dl c2921dl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f26359d = c2921dl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f26358c = obj;
        this.f26360e |= Integer.MIN_VALUE;
        return this.f26359d.a(null, this);
    }
}
