package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3096kg extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3148mg f26860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3096kg(C3148mg c3148mg, String str, kl.f fVar) {
        super(2, fVar);
        this.f26860b = c3148mg;
        this.f26861c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3096kg(this.f26860b, this.f26861c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3096kg(this.f26860b, this.f26861c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26859a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3148mg c3148mg = this.f26860b;
            String str = this.f26861c;
            this.f26859a = 1;
            if (c3148mg.a(str, this) == objF) {
                return objF;
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
