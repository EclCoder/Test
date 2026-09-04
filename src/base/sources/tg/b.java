package tg;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53415b;

    public b(String name, String str) {
        s.h(name, "name");
        this.f53414a = name;
        this.f53415b = str;
    }

    public final String a() {
        return this.f53414a;
    }

    public final String b() {
        return this.f53415b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.c(this.f53414a, bVar.f53414a) && s.c(this.f53415b, bVar.f53415b);
    }

    public int hashCode() {
        int iHashCode = this.f53414a.hashCode() * 31;
        String str = this.f53415b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LiveUser(name=" + this.f53414a + ", pictureUrl=" + this.f53415b + ')';
    }
}
