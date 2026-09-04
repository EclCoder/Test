package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28913g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f28914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f28915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f28916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f28917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f28918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f28919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28920g;

        public b() {
            this(null);
        }

        public b(d dVar) {
            this.f28914a = 20000L;
            this.f28915b = 10L;
            this.f28916c = 20000L;
            this.f28917d = 20000L;
            this.f28918e = 64;
            this.f28919f = 20;
            this.f28920g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVar)) {
                this.f28916c = dVar.c();
                this.f28914a = dVar.a();
                this.f28918e = dVar.f();
                this.f28917d = dVar.d();
                this.f28919f = dVar.g();
                this.f28915b = dVar.b();
                this.f28920g = dVar.e();
            }
        }

        public d a() {
            return new d(this);
        }

        public b a(int i10) {
            this.f28920g = i10;
            return this;
        }
    }

    public long a() {
        return this.f28907a;
    }

    public long b() {
        return this.f28908b;
    }

    public long c() {
        return this.f28909c;
    }

    public long d() {
        return this.f28910d;
    }

    public int e() {
        return this.f28913g;
    }

    public int f() {
        return this.f28911e;
    }

    public int g() {
        return this.f28912f;
    }

    private d(b bVar) {
        this.f28907a = bVar.f28914a;
        this.f28909c = bVar.f28916c;
        this.f28910d = bVar.f28917d;
        this.f28911e = bVar.f28918e;
        this.f28912f = bVar.f28919f;
        this.f28908b = bVar.f28915b;
        this.f28913g = bVar.f28920g;
    }
}
