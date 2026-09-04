package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import m0.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocusId f3334b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }

        static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public c(String str) {
        this.f3333a = (String) g.j(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3334b = a.a(str);
        } else {
            this.f3334b = null;
        }
    }

    private String a() {
        return this.f3333a.length() + "_chars";
    }

    public static c c(LocusId locusId) {
        g.h(locusId, "locusId cannot be null");
        return new c((String) g.j(a.b(locusId), "id cannot be empty"));
    }

    public LocusId b() {
        return this.f3334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f3333a;
        if (str == null) {
            return cVar.f3333a == null;
        }
        return str.equals(cVar.f3333a);
    }

    public int hashCode() {
        String str = this.f3333a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }
}
