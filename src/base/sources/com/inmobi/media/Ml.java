package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ml extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f25288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(Wl wl2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25288c = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25287b = obj;
        this.f25289d |= Integer.MIN_VALUE;
        return this.f25288c.a((String) null, (ArrayList) null, this);
    }
}
