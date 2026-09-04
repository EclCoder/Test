package com.inmobi.media;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Sl extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wl f25712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sl(XmlPullParser xmlPullParser, Wl wl2, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, kl.f fVar) {
        super(1, fVar);
        this.f25711b = xmlPullParser;
        this.f25712c = wl2;
        this.f25713d = g0Var;
        this.f25714e = g0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Sl(this.f25711b, this.f25712c, this.f25713d, this.f25714e, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Sl) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
        boolean z10;
        Object objF = ll.b.f();
        int i10 = this.f25710a;
        if (i10 == 0) {
            fl.s.b(obj);
            String name = this.f25711b.getName();
            if (kotlin.jvm.internal.s.c(name, "Error")) {
                De deA = this.f25712c.a("error", this.f25711b);
                if (deA != null) {
                    this.f25712c.f25968h.add(deA);
                }
            } else if (kotlin.jvm.internal.s.c(name, "Ad")) {
                Wl wl2 = this.f25712c;
                XmlPullParser xmlPullParser = this.f25711b;
                wl2.getClass();
                try {
                    z10 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f25713d.f43588a = true;
                    Wl wl3 = this.f25712c;
                    XmlPullParser xmlPullParser2 = this.f25711b;
                    wl3.getClass();
                    Wl.w(xmlPullParser2);
                    return fl.g0.f38750a;
                }
                kotlin.jvm.internal.g0 g0Var = this.f25714e;
                if (g0Var.f43588a) {
                    Wl wl4 = this.f25712c;
                    XmlPullParser xmlPullParser3 = this.f25711b;
                    wl4.getClass();
                    Wl.w(xmlPullParser3);
                    return fl.g0.f38750a;
                }
                g0Var.f43588a = true;
                Wl wl5 = this.f25712c;
                XmlPullParser xmlPullParser4 = this.f25711b;
                this.f25710a = 1;
                if (Wl.a(wl5, xmlPullParser4, this) == objF) {
                    return objF;
                }
            } else {
                Wl wl6 = this.f25712c;
                XmlPullParser xmlPullParser5 = this.f25711b;
                wl6.getClass();
                Wl.w(xmlPullParser5);
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
