package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7829a = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f7830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7831b;

        a(Uri uri, boolean z10) {
            this.f7830a = uri;
            this.f7831b = z10;
        }

        public Uri a() {
            return this.f7830a;
        }

        public boolean b() {
            return this.f7831b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7831b == aVar.f7831b && this.f7830a.equals(aVar.f7830a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f7830a.hashCode() * 31) + (this.f7831b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f7829a.add(new a(uri, z10));
    }

    public Set b() {
        return this.f7829a;
    }

    public int c() {
        return this.f7829a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f7829a.equals(((d) obj).f7829a);
    }

    public int hashCode() {
        return this.f7829a.hashCode();
    }
}
