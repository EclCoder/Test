package g4;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.ListenableFuture;
import em.v0;
import fl.g0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f38921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f38922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, v0 v0Var) {
            super(1);
            this.f38921a = aVar;
            this.f38922b = v0Var;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f38921a.c(this.f38922b.k());
            } else if (th2 instanceof CancellationException) {
                this.f38921a.d();
            } else {
                this.f38921a.f(th2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return g0.f38750a;
        }
    }

    public static final ListenableFuture b(final v0 v0Var, final Object obj) {
        s.h(v0Var, "<this>");
        ListenableFuture listenableFutureA = c.a(new c.InterfaceC0022c() { // from class: g4.a
            @Override // androidx.concurrent.futures.c.InterfaceC0022c
            public final Object attachCompleter(c.a aVar) {
                return b.d(v0Var, obj, aVar);
            }
        });
        s.g(listenableFutureA, "getFuture { completer ->…      }\n        tag\n    }");
        return listenableFutureA;
    }

    public static /* synthetic */ ListenableFuture c(v0 v0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(v0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(v0 this_asListenableFuture, Object obj, c.a completer) {
        s.h(this_asListenableFuture, "$this_asListenableFuture");
        s.h(completer, "completer");
        this_asListenableFuture.q(new a(completer, this_asListenableFuture));
        return obj;
    }
}
