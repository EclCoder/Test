package z0;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n implements i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f58434d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f58435e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f58436f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f58437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f58438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tl.a f58439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58440a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(File it) {
            kotlin.jvm.internal.s.h(it, "it");
            return u.a(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return n.f58435e;
        }

        public final Object b() {
            return n.f58436f;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f58441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f58441a = file;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m201invoke();
            return fl.g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m201invoke() {
            b bVar = n.f58434d;
            Object objB = bVar.b();
            File file = this.f58441a;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                fl.g0 g0Var = fl.g0.f38750a;
            }
        }
    }

    public n(d0 serializer, Function1 coordinatorProducer, tl.a produceFile) {
        kotlin.jvm.internal.s.h(serializer, "serializer");
        kotlin.jvm.internal.s.h(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.s.h(produceFile, "produceFile");
        this.f58437a = serializer;
        this.f58438b = coordinatorProducer;
        this.f58439c = produceFile;
    }

    @Override // z0.i0
    public j0 a() throws IOException {
        File file = ((File) this.f58439c.invoke()).getCanonicalFile();
        synchronized (f58436f) {
            String path = file.getAbsolutePath();
            Set set = f58435e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.s.g(path, "path");
            set.add(path);
        }
        kotlin.jvm.internal.s.g(file, "file");
        return new o(file, this.f58437a, (s) this.f58438b.invoke(file), new c(file));
    }

    public /* synthetic */ n(d0 d0Var, Function1 function1, tl.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, (i10 & 2) != 0 ? a.f58440a : function1, aVar);
    }
}
