package l0;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0.d f43718a = new C0664e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0.d f43719b = new C0664e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0.d f43720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0.d f43721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0.d f43722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0.d f43723f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f43724b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f43725a;

        private a(boolean z10) {
            this.f43725a = z10;
        }

        @Override // l0.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f43725a) {
                        return 1;
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f43725a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f43725a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f43726a = new b();

        private b() {
        }

        @Override // l0.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class d implements l0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f43727a;

        d(c cVar) {
            this.f43727a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f43727a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // l0.d
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f43727a == null ? a() : b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: renamed from: l0.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0664e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f43728b;

        C0664e(c cVar, boolean z10) {
            super(cVar);
            this.f43728b = z10;
        }

        @Override // l0.e.d
        protected boolean a() {
            return this.f43728b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f43729b = new f();

        f() {
            super(null);
        }

        @Override // l0.e.d
        protected boolean a() {
            return l0.f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f43726a;
        f43720c = new C0664e(bVar, false);
        f43721d = new C0664e(bVar, true);
        f43722e = new C0664e(a.f43724b, false);
        f43723f = f.f43729b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
