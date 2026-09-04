package t1;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f52552g = new e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52553h = w1.c0.s0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52554i = w1.c0.s0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52555j = w1.c0.s0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52556k = w1.c0.s0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52557l = w1.c0.s0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f52563f;

    /* JADX INFO: renamed from: t1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0806b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f52564a;

        private d(b bVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(bVar.f52558a).setFlags(bVar.f52559b).setUsage(bVar.f52560c);
            int i10 = w1.c0.f55769a;
            if (i10 >= 29) {
                C0806b.a(usage, bVar.f52561d);
            }
            if (i10 >= 32) {
                c.a(usage, bVar.f52562e);
            }
            this.f52564a = usage.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52565a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52566b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52567c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52568d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52569e = 0;

        public b a() {
            return new b(this.f52565a, this.f52566b, this.f52567c, this.f52568d, this.f52569e);
        }
    }

    public d a() {
        if (this.f52563f == null) {
            this.f52563f = new d();
        }
        return this.f52563f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f52558a == bVar.f52558a && this.f52559b == bVar.f52559b && this.f52560c == bVar.f52560c && this.f52561d == bVar.f52561d && this.f52562e == bVar.f52562e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f52558a) * 31) + this.f52559b) * 31) + this.f52560c) * 31) + this.f52561d) * 31) + this.f52562e;
    }

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f52558a = i10;
        this.f52559b = i11;
        this.f52560c = i12;
        this.f52561d = i13;
        this.f52562e = i14;
    }
}
