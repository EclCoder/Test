package bp;

import fo.k;
import zn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f9238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qo.d f9239c;

    public e(a aVar, qo.d dVar, k kVar) {
        h.k(getClass());
        ip.a.h(aVar, "HTTP client request executor");
        ip.a.h(dVar, "HTTP route planner");
        ip.a.h(kVar, "HTTP redirect strategy");
        this.f9237a = aVar;
        this.f9239c = dVar;
        this.f9238b = kVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ef */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // bp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.c a(qo.b r5, io.o r6, ko.a r7, io.g r8) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.e.a(qo.b, io.o, ko.a, io.g):io.c");
    }
}
