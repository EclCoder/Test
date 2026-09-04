package em;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface n extends m2 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f38033a;

        public a(Function1 function1) {
            this.f38033a = function1;
        }

        @Override // em.n
        public void a(Throwable th2) {
            this.f38033a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + s0.a(this.f38033a) + '@' + s0.b(this) + ']';
        }
    }

    void a(Throwable th2);
}
