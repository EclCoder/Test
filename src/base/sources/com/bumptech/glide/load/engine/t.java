package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class t implements r5.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final m6.h f11466j = new m6.h(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.b f11467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r5.e f11468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r5.e f11469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f11472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r5.g f11473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r5.k f11474i;

    t(u5.b bVar, r5.e eVar, r5.e eVar2, int i10, int i11, r5.k kVar, Class cls, r5.g gVar) {
        this.f11467b = bVar;
        this.f11468c = eVar;
        this.f11469d = eVar2;
        this.f11470e = i10;
        this.f11471f = i11;
        this.f11474i = kVar;
        this.f11472g = cls;
        this.f11473h = gVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private byte[] c() {
        m6.h hVar = f11466j;
        byte[] bArr = (byte[]) hVar.h(this.f11472g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f11472g.getName().getBytes(r5.e.f51095a);
        hVar.l(this.f11472g, bytes);
        return bytes;
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f11467b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f11470e).putInt(this.f11471f).array();
        this.f11469d.a(messageDigest);
        this.f11468c.a(messageDigest);
        messageDigest.update(bArr);
        r5.k kVar = this.f11474i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f11473h.a(messageDigest);
        messageDigest.update(c());
        this.f11467b.put(bArr);
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f11471f == tVar.f11471f && this.f11470e == tVar.f11470e && m6.l.d(this.f11474i, tVar.f11474i) && this.f11472g.equals(tVar.f11472g) && this.f11468c.equals(tVar.f11468c) && this.f11469d.equals(tVar.f11469d) && this.f11473h.equals(tVar.f11473h)) {
                return true;
            }
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        int iHashCode = (((((this.f11468c.hashCode() * 31) + this.f11469d.hashCode()) * 31) + this.f11470e) * 31) + this.f11471f;
        r5.k kVar = this.f11474i;
        if (kVar != null) {
            iHashCode = (iHashCode * 31) + kVar.hashCode();
        }
        return (((iHashCode * 31) + this.f11472g.hashCode()) * 31) + this.f11473h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f11468c + ", signature=" + this.f11469d + ", width=" + this.f11470e + ", height=" + this.f11471f + ", decodedResourceClass=" + this.f11472g + ", transformation='" + this.f11474i + "', options=" + this.f11473h + '}';
    }
}
