package ca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9689a;

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0132a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f9691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f9692d;

        public C0132a(int i10, long j10) {
            super(i10);
            this.f9690b = j10;
            this.f9691c = new ArrayList();
            this.f9692d = new ArrayList();
        }

        public void d(C0132a c0132a) {
            this.f9692d.add(c0132a);
        }

        public void e(b bVar) {
            this.f9691c.add(bVar);
        }

        public C0132a f(int i10) {
            int size = this.f9692d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0132a c0132a = (C0132a) this.f9692d.get(i11);
                if (c0132a.f9689a == i10) {
                    return c0132a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f9691c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f9691c.get(i11);
                if (bVar.f9689a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // ca.a
        public String toString() {
            return a.a(this.f9689a) + " leaves: " + Arrays.toString(this.f9691c.toArray()) + " containers: " + Arrays.toString(this.f9692d.toArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f9693b;

        public b(int i10, d0 d0Var) {
            super(i10);
            this.f9693b = d0Var;
        }
    }

    public a(int i10) {
        this.f9689a = i10;
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
        return a(this.f9689a);
    }
}
