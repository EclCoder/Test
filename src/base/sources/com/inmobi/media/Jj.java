package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Jj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f25079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f25080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Nj f25082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jj(Nj nj2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25082e = nj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25081d = obj;
        this.f25083f |= Integer.MIN_VALUE;
        return this.f25082e.a((List) null, (ImageView) null, this);
    }
}
