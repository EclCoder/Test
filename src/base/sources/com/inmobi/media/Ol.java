package com.inmobi.media;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ol extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f25434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wl f25435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ol(Wl wl2, kl.f fVar, kotlin.jvm.internal.g0 g0Var, XmlPullParser xmlPullParser) {
        super(1, fVar);
        this.f25433b = xmlPullParser;
        this.f25434c = g0Var;
        this.f25435d = wl2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        XmlPullParser xmlPullParser = this.f25433b;
        return new Ol(this.f25435d, fVar, this.f25434c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Ol) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException, Kl {
        Object objF = ll.b.f();
        int i10 = this.f25432a;
        if (i10 == 0) {
            fl.s.b(obj);
            String name = this.f25433b.getName();
            if (kotlin.jvm.internal.s.c(name, "InLine")) {
                kotlin.jvm.internal.g0 g0Var = this.f25434c;
                if (!g0Var.f43588a) {
                    g0Var.f43588a = true;
                    this.f25435d.g(this.f25433b);
                }
            } else if (kotlin.jvm.internal.s.c(name, "Wrapper")) {
                kotlin.jvm.internal.g0 g0Var2 = this.f25434c;
                if (!g0Var2.f43588a) {
                    g0Var2.f43588a = true;
                    Wl wl2 = this.f25435d;
                    XmlPullParser xmlPullParser = this.f25433b;
                    this.f25432a = 1;
                    if (Wl.c(wl2, xmlPullParser, this) == objF) {
                        return objF;
                    }
                }
            } else {
                Wl wl3 = this.f25435d;
                XmlPullParser xmlPullParser2 = this.f25433b;
                wl3.getClass();
                Wl.w(xmlPullParser2);
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
