package com.inmobi.media;

import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ll extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f25223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f25225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Wl f25227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ll(Wl wl2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f25227e = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f25226d = obj;
        this.f25228f |= Integer.MIN_VALUE;
        return this.f25227e.a((XmlPullParser) null, (String) null, (Function1) null, this);
    }
}
