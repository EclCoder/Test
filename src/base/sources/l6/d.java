package l6;

import java.security.MessageDigest;
import m6.k;
import r5.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f43927b;

    public d(Object obj) {
        this.f43927b = k.e(obj);
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f43927b.toString().getBytes(e.f51095a));
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f43927b.equals(((d) obj).f43927b);
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        return this.f43927b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f43927b + '}';
    }
}
