package t5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53130a = new C0809a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f53131b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f53132c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f53133d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f53134e = new e();

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0809a extends a {
        C0809a() {
        }

        @Override // t5.a
        public boolean a() {
            return true;
        }

        @Override // t5.a
        public boolean b() {
            return true;
        }

        @Override // t5.a
        public boolean c(r5.a aVar) {
            return aVar == r5.a.REMOTE;
        }

        @Override // t5.a
        public boolean d(boolean z10, r5.a aVar, r5.c cVar) {
            return (aVar == r5.a.RESOURCE_DISK_CACHE || aVar == r5.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends a {
        b() {
        }

        @Override // t5.a
        public boolean a() {
            return false;
        }

        @Override // t5.a
        public boolean b() {
            return false;
        }

        @Override // t5.a
        public boolean c(r5.a aVar) {
            return false;
        }

        @Override // t5.a
        public boolean d(boolean z10, r5.a aVar, r5.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends a {
        c() {
        }

        @Override // t5.a
        public boolean a() {
            return true;
        }

        @Override // t5.a
        public boolean b() {
            return false;
        }

        @Override // t5.a
        public boolean c(r5.a aVar) {
            return (aVar == r5.a.DATA_DISK_CACHE || aVar == r5.a.MEMORY_CACHE) ? false : true;
        }

        @Override // t5.a
        public boolean d(boolean z10, r5.a aVar, r5.c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends a {
        d() {
        }

        @Override // t5.a
        public boolean a() {
            return false;
        }

        @Override // t5.a
        public boolean b() {
            return true;
        }

        @Override // t5.a
        public boolean c(r5.a aVar) {
            return false;
        }

        @Override // t5.a
        public boolean d(boolean z10, r5.a aVar, r5.c cVar) {
            return (aVar == r5.a.RESOURCE_DISK_CACHE || aVar == r5.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends a {
        e() {
        }

        @Override // t5.a
        public boolean a() {
            return true;
        }

        @Override // t5.a
        public boolean b() {
            return true;
        }

        @Override // t5.a
        public boolean c(r5.a aVar) {
            return aVar == r5.a.REMOTE;
        }

        @Override // t5.a
        public boolean d(boolean z10, r5.a aVar, r5.c cVar) {
            return ((z10 && aVar == r5.a.DATA_DISK_CACHE) || aVar == r5.a.LOCAL) && cVar == r5.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(r5.a aVar);

    public abstract boolean d(boolean z10, r5.a aVar, r5.c cVar);
}
