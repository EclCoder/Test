package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10269b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10271b;

        private a() {
        }

        public f a() {
            if (!this.f10270a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new f(true, this.f10271b);
        }

        public a b() {
            this.f10270a = true;
            return this;
        }
    }

    private f(boolean z10, boolean z11) {
        this.f10268a = z10;
        this.f10269b = z11;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f10268a;
    }

    boolean b() {
        return this.f10269b;
    }
}
