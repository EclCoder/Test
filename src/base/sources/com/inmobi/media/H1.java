package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class H1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f24907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(I1 i10, kl.f fVar) {
        super(2, fVar);
        this.f24907a = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new H1(this.f24907a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new H1(this.f24907a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [fl.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        I1 i10;
        ll.b.f();
        fl.s.b(obj);
        boolean z10 = 0;
        z10 = 0;
        try {
            try {
                I1 i11 = this.f24907a;
                i11.f24976c = i11.f24974a.invoke();
                i10 = this.f24907a;
            } catch (Exception e10) {
                e10.getMessage();
                i10 = this.f24907a;
            }
            i10.f24977d.set(false);
            z10 = fl.g0.f38750a;
            return z10;
        } catch (Throwable th2) {
            this.f24907a.f24977d.set(z10);
            throw th2;
        }
    }
}
