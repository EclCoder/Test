package i4;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.f;
import com.google.common.util.concurrent.ListenableFuture;
import em.c1;
import em.k;
import em.o0;
import em.p0;
import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41002a = new b(null);

    /* JADX INFO: renamed from: i4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0623a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f41003b;

        /* JADX INFO: renamed from: i4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0624a extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f41004r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f41006t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0624a(androidx.privacysandbox.ads.adservices.topics.a aVar, kl.f fVar) {
                super(2, fVar);
                this.f41006t = aVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((C0624a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0623a.this.new C0624a(this.f41006t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f41004r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                f fVar = C0623a.this.f41003b;
                androidx.privacysandbox.ads.adservices.topics.a aVar = this.f41006t;
                this.f41004r = 1;
                Object objA = fVar.a(aVar, this);
                return objA == objF ? objF : objA;
            }
        }

        public C0623a(f mTopicsManager) {
            kotlin.jvm.internal.s.h(mTopicsManager, "mTopicsManager");
            this.f41003b = mTopicsManager;
        }

        @Override // i4.a
        public ListenableFuture b(androidx.privacysandbox.ads.adservices.topics.a request) {
            kotlin.jvm.internal.s.h(request, "request");
            return g4.b.c(k.b(p0.a(c1.c()), null, null, new C0624a(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            f fVarA = f.f6529a.a(context);
            if (fVarA != null) {
                return new C0623a(fVarA);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f41002a.a(context);
    }

    public abstract ListenableFuture b(androidx.privacysandbox.ads.adservices.topics.a aVar);
}
