package hm;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tl.o f40494e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40495r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f40496s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f40498u;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40496s = obj;
            this.f40498u |= Integer.MIN_VALUE;
            return b.this.h(null, this);
        }
    }

    public b(tl.o oVar, kl.j jVar, int i10, gm.a aVar) {
        super(oVar, jVar, i10, aVar);
        this.f40494e = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.c, im.d
    protected Object h(gm.s sVar, kl.f fVar) {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f40498u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f40498u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f40496s;
        Object objF = ll.b.f();
        int i11 = aVar.f40498u;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar.f40495r = sVar;
            aVar.f40498u = 1;
            if (super.h(sVar, aVar) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (gm.s) aVar.f40495r;
            fl.s.b(obj);
        }
        if (sVar.y()) {
            return fl.g0.f38750a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // hm.c, im.d
    protected im.d i(kl.j jVar, int i10, gm.a aVar) {
        return new b(this.f40494e, jVar, i10, aVar);
    }

    public /* synthetic */ b(tl.o oVar, kl.j jVar, int i10, gm.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i11 & 2) != 0 ? kl.k.f43531a : jVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? gm.a.SUSPEND : aVar);
    }
}
