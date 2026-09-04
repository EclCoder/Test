package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3328tf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig.OmidConfig f27547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f27548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3432xf f27550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3328tf(C3432xf c3432xf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f27550d = c3432xf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f27549c = obj;
        this.f27551e |= Integer.MIN_VALUE;
        return this.f27550d.a(this);
    }
}
