package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f33953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f33954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f33955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f33956j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f33960d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f33964h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f33965i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f33966j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33957a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33958b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f33959c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f33961e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f33962f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f33963g = 604800000;

        public b a(int i10, p pVar) {
            this.f33959c = i10;
            this.f33960d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f33957a = 50;
                return this;
            }
            this.f33957a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f33958b = 15000;
                return this;
            }
            this.f33958b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f33962f = 50;
                return this;
            }
            this.f33962f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f33961e = 2;
                return this;
            }
            this.f33961e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f33963g = 604800000;
                return this;
            }
            this.f33963g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f33964h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f33965i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f33966j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f33964h) && com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f33965i) && com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f33960d) || y.b(this.f33960d.b())) && com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f33947a = bVar.f33957a;
        this.f33948b = bVar.f33958b;
        this.f33949c = bVar.f33959c;
        this.f33950d = bVar.f33961e;
        this.f33951e = bVar.f33962f;
        this.f33952f = bVar.f33963g;
        this.f33953g = bVar.f33960d;
        this.f33954h = bVar.f33964h;
        this.f33955i = bVar.f33965i;
        this.f33956j = bVar.f33966j;
    }
}
