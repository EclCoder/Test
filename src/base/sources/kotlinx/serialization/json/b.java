package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import um.a1;
import um.d1;
import um.e1;
import um.h1;
import um.k1;
import um.m0;
import um.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements pm.w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43628d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f43629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vm.b f43630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final um.a0 f43631c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(new g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), vm.c.a(), null);
        }
    }

    public /* synthetic */ b(g gVar, vm.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, bVar);
    }

    @Override // pm.j
    public vm.b a() {
        return this.f43630b;
    }

    @Override // pm.w
    public final Object b(pm.c deserializer, String string) {
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        kotlin.jvm.internal.s.h(string, "string");
        d1 d1VarA = e1.a(this, string);
        Object objD = new a1(this, k1.OBJ, d1VarA, deserializer.getDescriptor(), null).D(deserializer);
        d1VarA.v();
        return objD;
    }

    @Override // pm.w
    public final String c(pm.l serializer, Object obj) {
        kotlin.jvm.internal.s.h(serializer, "serializer");
        n0 n0Var = new n0();
        try {
            m0.b(this, n0Var, serializer, obj);
            return n0Var.toString();
        } finally {
            n0Var.g();
        }
    }

    public final Object d(pm.c deserializer, i element) {
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        kotlin.jvm.internal.s.h(element, "element");
        return h1.a(this, element, deserializer);
    }

    public final g e() {
        return this.f43629a;
    }

    public final um.a0 f() {
        return this.f43631c;
    }

    private b(g gVar, vm.b bVar) {
        this.f43629a = gVar;
        this.f43630b = bVar;
        this.f43631c = new um.a0();
    }
}
