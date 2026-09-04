package i3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40821a;

    /* JADX INFO: renamed from: i3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0621a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f40823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f40824d;

        public C0621a(int i10, long j10) {
            super(i10);
            this.f40822b = j10;
            this.f40823c = new ArrayList();
            this.f40824d = new ArrayList();
        }

        public void d(C0621a c0621a) {
            this.f40824d.add(c0621a);
        }

        public void e(b bVar) {
            this.f40823c.add(bVar);
        }

        public C0621a f(int i10) {
            int size = this.f40824d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0621a c0621a = (C0621a) this.f40824d.get(i11);
                if (c0621a.f40821a == i10) {
                    return c0621a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f40823c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f40823c.get(i11);
                if (bVar.f40821a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // i3.a
        public String toString() {
            return a.a(this.f40821a) + " leaves: " + Arrays.toString(this.f40823c.toArray()) + " containers: " + Arrays.toString(this.f40824d.toArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w1.u f40825b;

        public b(int i10, w1.u uVar) {
            super(i10);
            this.f40825b = uVar;
        }
    }

    public a(int i10) {
        this.f40821a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f40821a);
    }
}
