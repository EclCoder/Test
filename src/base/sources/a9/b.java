package a9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f155a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f155a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f155a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f155a.equals(((b) obj).f155a);
        }
        return false;
    }

    public int hashCode() {
        return this.f155a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f155a + "\"}";
    }
}
