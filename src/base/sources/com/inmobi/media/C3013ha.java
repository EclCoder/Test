package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3013ha extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3064ja f26665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3013ha(C3064ja c3064ja, kl.f fVar) {
        super(2, fVar);
        this.f26665b = c3064ja;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3013ha(this.f26665b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3013ha(this.f26665b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26664a;
        if (i10 == 0) {
            fl.s.b(obj);
            Fb fb2 = (Fb) Gb.f24849a.getValue();
            String str = this.f26665b.f26798a.f26402c.f27931a;
            this.f26664a = 1;
            if (fb2.a(str, this) == objF) {
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
