package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fh extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Kh f24786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f24789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f24790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gm.s f24791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(Kh kh2, String str, String str2, RootConfig rootConfig, List list, gm.s sVar, kl.f fVar) {
        super(2, fVar);
        this.f24786b = kh2;
        this.f24787c = str;
        this.f24788d = str2;
        this.f24789e = rootConfig;
        this.f24790f = list;
        this.f24791g = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Fh(this.f24786b, this.f24787c, this.f24788d, this.f24789e, this.f24790f, this.f24791g, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Fh) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24785a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                Kh kh2 = this.f24786b;
                String str = this.f24787c;
                String str2 = this.f24788d;
                RootConfig rootConfig = this.f24789e;
                List list = this.f24790f;
                gm.s sVar = this.f24791g;
                this.f24785a = 1;
                if (kh2.a(str, str2, rootConfig, list, sVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
        return fl.g0.f38750a;
    }
}
