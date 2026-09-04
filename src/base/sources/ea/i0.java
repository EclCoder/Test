package ea;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface i0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f37436c;

        public a(String str, int i10, byte[] bArr) {
            this.f37434a = str;
            this.f37435b = i10;
            this.f37436c = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f37439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f37440d;

        public b(int i10, String str, List list, byte[] bArr) {
            this.f37437a = i10;
            this.f37438b = str;
            this.f37439c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f37440d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        i0 a(int i10, b bVar);

        SparseArray createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f37442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f37443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f37445e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f37444d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f37444d;
            this.f37444d = i10 == Integer.MIN_VALUE ? this.f37442b : i10 + this.f37443c;
            this.f37445e = this.f37441a + this.f37444d;
        }

        public String b() {
            d();
            return this.f37445e;
        }

        public int c() {
            d();
            return this.f37444d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f37441a = str;
            this.f37442b = i11;
            this.f37443c = i12;
            this.f37444d = Integer.MIN_VALUE;
            this.f37445e = "";
        }
    }

    void a(n0 n0Var, u9.m mVar, d dVar);

    void b(ob.d0 d0Var, int i10);

    void seek();
}
