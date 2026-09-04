package com.inmobi.media;

import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vl extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f25910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vl(Wl wl2, kl.f fVar, kotlin.jvm.internal.g0 g0Var, XmlPullParser xmlPullParser) {
        super(1, fVar);
        this.f25909b = xmlPullParser;
        this.f25910c = wl2;
        this.f25911d = g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Vl(this.f25910c, fVar, this.f25911d, this.f25909b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Vl) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r1.a((java.lang.String) r5, r4) == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, com.inmobi.media.Kl {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Vl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
