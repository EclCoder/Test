package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f11722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f11723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f11724c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0160a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f11726b = b.f11728a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f11727c;

        public final C0160a a() {
            this.f11725a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0160a a(b bVar) {
            if (bVar == null) {
                bVar = b.f11728a;
            }
            this.f11726b = bVar;
            return this;
        }
    }

    /* synthetic */ a(C0160a c0160a, byte b10) {
        this(c0160a);
    }

    public final b a() {
        return this.f11724c;
    }

    private a(C0160a c0160a) {
        this.f11722a = c0160a.f11725a;
        this.f11724c = c0160a.f11726b;
        this.f11723b = c0160a.f11727c;
    }
}
