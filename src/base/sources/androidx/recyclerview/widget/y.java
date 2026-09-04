package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
interface y {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f7062a = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.y$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0081a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.collection.l f7063a = new androidx.collection.l();

            C0081a() {
            }

            @Override // androidx.recyclerview.widget.y.d
            public long a(long j10) {
                Long lValueOf = (Long) this.f7063a.e(j10);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(a.this.b());
                    this.f7063a.i(j10, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.y
        public d a() {
            return new C0081a();
        }

        long b() {
            long j10 = this.f7062a;
            this.f7062a = 1 + j10;
            return j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f7065a = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.y.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.y
        public d a() {
            return this.f7065a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        long a(long j10);
    }

    d a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f7067a = new a();

        @Override // androidx.recyclerview.widget.y
        public d a() {
            return this.f7067a;
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.y.d
            public long a(long j10) {
                return j10;
            }
        }
    }
}
