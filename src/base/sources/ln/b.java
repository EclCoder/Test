package ln;

import java.net.Socket;
import xn.c0;
import xn.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements ln.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p0 f44704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xn.g f44705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xn.f f44706c;

        a(p0 p0Var) {
            this.f44704a = p0Var;
            this.f44705b = c0.c(p0Var.a());
            this.f44706c = c0.b(p0Var.b());
        }

        @Override // xn.p0
        public void cancel() {
            this.f44704a.cancel();
        }

        @Override // xn.p0
        public xn.g a() {
            return this.f44705b;
        }

        @Override // xn.p0
        public xn.f b() {
            return this.f44706c;
        }
    }

    public static final ln.a a(Socket socket) {
        kotlin.jvm.internal.s.h(socket, "<this>");
        return b(c0.g(socket));
    }

    public static final ln.a b(p0 p0Var) {
        kotlin.jvm.internal.s.h(p0Var, "<this>");
        return new a(p0Var);
    }
}
