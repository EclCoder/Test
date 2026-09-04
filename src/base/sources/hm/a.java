package hm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements e {

    /* JADX INFO: renamed from: hm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0613a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40468r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40469s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f40470t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f40472v;

        C0613a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40470t = obj;
            this.f40472v |= Integer.MIN_VALUE;
            return a.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hm.e
    public final Object collect(f fVar, kl.f fVar2) throws Throwable {
        C0613a c0613a;
        Throwable th2;
        im.p pVar;
        if (fVar2 instanceof C0613a) {
            c0613a = (C0613a) fVar2;
            int i10 = c0613a.f40472v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0613a.f40472v = i10 - Integer.MIN_VALUE;
            } else {
                c0613a = new C0613a(fVar2);
            }
        } else {
            c0613a = new C0613a(fVar2);
        }
        Object obj = c0613a.f40470t;
        Object objF = ll.b.f();
        int i11 = c0613a.f40472v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = (im.p) c0613a.f40469s;
            try {
                fl.s.b(obj);
                pVar.releaseIntercepted();
                return fl.g0.f38750a;
            } catch (Throwable th3) {
                th2 = th3;
                pVar.releaseIntercepted();
                throw th2;
            }
        }
        fl.s.b(obj);
        im.p pVar2 = new im.p(fVar, c0613a.getContext());
        try {
            c0613a.f40468r = kotlin.coroutines.jvm.internal.l.a(fVar);
            c0613a.f40469s = pVar2;
            c0613a.f40472v = 1;
            if (e(pVar2, c0613a) == objF) {
                return objF;
            }
            pVar = pVar2;
            pVar.releaseIntercepted();
            return fl.g0.f38750a;
        } catch (Throwable th4) {
            th2 = th4;
            pVar = pVar2;
            pVar.releaseIntercepted();
            throw th2;
        }
    }

    public abstract Object e(f fVar, kl.f fVar2);
}
