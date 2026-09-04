package com.inmobi.media;

import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ql extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wl f25569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ql(Wl wl2, kl.f fVar, kotlin.jvm.internal.g0 g0Var, XmlPullParser xmlPullParser) {
        super(1, fVar);
        this.f25567b = xmlPullParser;
        this.f25568c = g0Var;
        this.f25569d = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        XmlPullParser xmlPullParser = this.f25567b;
        return new Ql(this.f25569d, fVar, this.f25568c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Ql) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25566a;
        if (i10 == 0) {
            fl.s.b(obj);
            if (kotlin.jvm.internal.s.c(this.f25567b.getName(), "VAST")) {
                this.f25568c.f43588a = true;
                Wl wl2 = this.f25569d;
                XmlPullParser xmlPullParser = this.f25567b;
                this.f25566a = 1;
                if (Wl.b(wl2, xmlPullParser, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
