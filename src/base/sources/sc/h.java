package sc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements g, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f52298a;

        public a(Object obj) {
            this.f52298a = obj;
        }

        @Override // sc.g
        public Object apply(Object obj) {
            return this.f52298a;
        }

        @Override // sc.g
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f52298a, ((a) obj).f52298a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f52298a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.f52298a + ")";
        }
    }

    public static g a(Object obj) {
        return new a(obj);
    }
}
