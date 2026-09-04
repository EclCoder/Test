package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class b extends a.AbstractC0659a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43431a;

    b(String str) {
        if (str == null) {
            throw new NullPointerException("Null stringValue");
        }
        this.f43431a = str;
    }

    @Override // kk.a.AbstractC0659a
    String c() {
        return this.f43431a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.AbstractC0659a) {
            return this.f43431a.equals(((a.AbstractC0659a) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f43431a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueString{stringValue=" + this.f43431a + "}";
    }
}
