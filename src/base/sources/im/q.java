package im;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function3 f41542a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final /* synthetic */ class a extends kotlin.jvm.internal.p implements Function3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41543a = new a();

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hm.f fVar, Object obj, kl.f fVar2) {
            return fVar.emit(obj, fVar2);
        }

        a() {
            super(3, hm.f.class, PAFNPq.xyOpFmPN, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    static {
        a aVar = a.f41543a;
        kotlin.jvm.internal.s.f(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f41542a = (Function3) p0.e(aVar, 3);
    }
}
