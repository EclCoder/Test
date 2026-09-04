package z0;

import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58422r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f58423s;

        a(kl.f fVar) {
            super(3, fVar);
        }

        public final Object a(b0 b0Var, boolean z10, kl.f fVar) {
            a aVar = new a(fVar);
            aVar.f58423s = b0Var;
            return aVar.invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((b0) obj, ((Boolean) obj2).booleanValue(), (kl.f) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f58422r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                return obj;
            }
            fl.s.b(obj);
            b0 b0Var = (b0) this.f58423s;
            this.f58422r = 1;
            Object objB = b0Var.b(this);
            return objB == objF ? objF : objB;
        }
    }

    public static final Object a(j0 j0Var, kl.f fVar) {
        return j0Var.d(new a(null), fVar);
    }
}
