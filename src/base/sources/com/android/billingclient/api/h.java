package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzca;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzca f10337a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private zzca f10338a;

        /* synthetic */ a(l5.c0 c0Var) {
        }

        public h a() {
            if (this.f10338a != null) {
                return new h(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.d())) {
                    hashSet.add(bVar.d());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f10338a = zzca.zzj(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10341c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f10344c;

            /* synthetic */ a(l5.c0 c0Var) {
            }

            public b a() {
                String str = this.f10344c;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f10343b == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f10343b = str;
                return this;
            }

            public a c(String str) {
                this.f10344c = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, l5.c0 c0Var) {
            this.f10340b = aVar.f10343b;
            this.f10341c = aVar.f10344c;
            this.f10339a = aVar.f10342a;
        }

        public static a b() {
            return new a(null);
        }

        public String a() {
            return this.f10339a;
        }

        public final String c() {
            return this.f10340b;
        }

        public final String d() {
            return this.f10341c;
        }
    }

    /* synthetic */ h(a aVar, l5.c0 c0Var) {
        this.f10337a = aVar.f10338a;
    }

    public static a a() {
        return new a(null);
    }

    public final zzca b() {
        return this.f10337a;
    }

    public final String c() {
        return ((b) this.f10337a.get(0)).d();
    }
}
