package ll;

import kl.f;
import kl.k;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends j {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f44645r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o f44646s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f44647t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, o oVar, Object obj) {
            super(fVar);
            this.f44646s = oVar;
            this.f44647t = obj;
            s.f(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f44645r;
            if (i10 == 0) {
                this.f44645r = 1;
                fl.s.b(obj);
                s.f(this.f44646s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((o) p0.e(this.f44646s, 2)).invoke(this.f44647t, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f44645r = 2;
            fl.s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f44648r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ o f44649s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f44650t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, kl.j jVar, o oVar, Object obj) {
            super(fVar, jVar);
            this.f44649s = oVar;
            this.f44650t = obj;
            s.f(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f44648r;
            if (i10 == 0) {
                this.f44648r = 1;
                fl.s.b(obj);
                s.f(this.f44649s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((o) p0.e(this.f44649s, 2)).invoke(this.f44650t, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f44648r = 2;
            fl.s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: ll.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0680c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0680c(f fVar) {
            super(fVar);
            s.f(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            fl.s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f fVar, kl.j jVar) {
            super(fVar, jVar);
            s.f(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            fl.s.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(o oVar, Object obj, f completion) {
        s.h(oVar, "<this>");
        s.h(completion, "completion");
        f fVarA = h.a(completion);
        if (oVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) oVar).create(obj, fVarA);
        }
        kl.j context = fVarA.getContext();
        return context == k.f43531a ? new a(fVarA, oVar, obj) : new b(fVarA, context, oVar, obj);
    }

    private static final f b(f fVar) {
        kl.j context = fVar.getContext();
        return context == k.f43531a ? new C0680c(fVar) : new d(fVar, context);
    }

    public static f c(f fVar) {
        f fVarIntercepted;
        s.h(fVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = fVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) fVar : null;
        return (dVar == null || (fVarIntercepted = dVar.intercepted()) == null) ? fVar : fVarIntercepted;
    }

    public static Object d(Function3 function3, Object obj, Object obj2, f completion) {
        s.h(function3, "<this>");
        s.h(completion, "completion");
        return ((Function3) p0.e(function3, 3)).invoke(obj, obj2, b(h.a(completion)));
    }

    public static Object e(o oVar, Object obj, f completion) {
        s.h(oVar, "<this>");
        s.h(completion, "completion");
        return ((o) p0.e(oVar, 2)).invoke(obj, b(h.a(completion)));
    }
}
