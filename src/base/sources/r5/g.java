package r5;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a f51101b = new m6.b();

    private static void g(f fVar, Object obj, MessageDigest messageDigest) {
        fVar.g(obj, messageDigest);
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f51101b.size(); i10++) {
            g((f) this.f51101b.i(i10), this.f51101b.m(i10), messageDigest);
        }
    }

    public Object c(f fVar) {
        return this.f51101b.containsKey(fVar) ? this.f51101b.get(fVar) : fVar.c();
    }

    public void d(g gVar) {
        this.f51101b.j(gVar.f51101b);
    }

    public g e(f fVar) {
        this.f51101b.remove(fVar);
        return this;
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f51101b.equals(((g) obj).f51101b);
        }
        return false;
    }

    public g f(f fVar, Object obj) {
        this.f51101b.put(fVar, obj);
        return this;
    }

    @Override // r5.e
    public int hashCode() {
        return this.f51101b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f51101b + '}';
    }
}
