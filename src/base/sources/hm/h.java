package hm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class h {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f40527a;

        public a(Object obj) {
            this.f40527a = obj;
        }

        @Override // hm.e
        public Object collect(f fVar, kl.f fVar2) {
            Object objEmit = fVar.emit(this.f40527a, fVar2);
            return objEmit == ll.b.f() ? objEmit : fl.g0.f38750a;
        }
    }

    public static final e a(tl.o oVar) {
        return new b(oVar, null, 0, null, 14, null);
    }

    public static final e b(tl.o oVar) {
        return new c(oVar, null, 0, null, 14, null);
    }

    public static final e c(tl.o oVar) {
        return new y(oVar);
    }

    public static final e d(Object obj) {
        return new a(obj);
    }
}
