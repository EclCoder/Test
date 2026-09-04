package u3;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface k0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f53904c;

        public a(String str, int i10, byte[] bArr) {
            this.f53902a = str;
            this.f53903b = i10;
            this.f53904c = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f53906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f53908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f53909e;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            this.f53905a = i10;
            this.f53906b = str;
            this.f53907c = i11;
            this.f53908d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f53909e = bArr;
        }

        public int a() {
            int i10 = this.f53907c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        k0 a(int i10, b bVar);

        SparseArray createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f53912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f53914e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f53913d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f53913d;
            this.f53913d = i10 == Integer.MIN_VALUE ? this.f53911b : i10 + this.f53912c;
            this.f53914e = this.f53910a + this.f53913d;
        }

        public String b() {
            d();
            return this.f53914e;
        }

        public int c() {
            d();
            return this.f53913d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f53910a = str;
            this.f53911b = i11;
            this.f53912c = i12;
            this.f53913d = Integer.MIN_VALUE;
            this.f53914e = "";
        }
    }

    void a(w1.z zVar, o2.r rVar, d dVar);

    void b(w1.u uVar, int i10);

    void seek();
}
