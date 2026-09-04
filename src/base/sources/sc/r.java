package sc;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements q, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f52309a;

        @Override // sc.q
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f52309a.size(); i10++) {
                if (!((q) this.f52309a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f52309a.equals(((b) obj).f52309a);
            }
            return false;
        }

        public int hashCode() {
            return this.f52309a.hashCode() + 306654252;
        }

        public String toString() {
            return r.d("and", this.f52309a);
        }

        private b(List list) {
            this.f52309a = list;
        }
    }

    public static q b(q qVar, q qVar2) {
        return new b(c((q) p.o(qVar), (q) p.o(qVar2)));
    }

    private static List c(q qVar, q qVar2) {
        return Arrays.asList(qVar, qVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
