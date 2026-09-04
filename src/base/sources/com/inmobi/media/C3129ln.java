package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3129ln implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hm.f f26966a;

    public C3129ln(hm.f fVar) {
        this.f26966a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        C3103kn c3103kn;
        if (fVar instanceof C3103kn) {
            c3103kn = (C3103kn) fVar;
            int i10 = c3103kn.f26873b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3103kn.f26873b = i10 - Integer.MIN_VALUE;
            } else {
                c3103kn = new C3103kn(this, fVar);
            }
        } else {
            c3103kn = new C3103kn(this, fVar);
        }
        Object obj2 = c3103kn.f26872a;
        Object objF = ll.b.f();
        int i11 = c3103kn.f26873b;
        if (i11 == 0) {
            fl.s.b(obj2);
            hm.f fVar2 = this.f26966a;
            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((EnumC2949eo) obj) == EnumC2949eo.VISIBLE);
            c3103kn.f26873b = 1;
            if (fVar2.emit(boolA, c3103kn) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj2);
        }
        return fl.g0.f38750a;
    }
}
