package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10253c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10255b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10256c = "";

        /* synthetic */ a(l5.v vVar) {
        }

        public c a() {
            c cVar = new c();
            cVar.f10251a = this.f10254a;
            cVar.f10252b = this.f10255b;
            cVar.f10253c = this.f10256c;
            return cVar;
        }

        public a b(String str) {
            this.f10256c = str;
            return this;
        }

        public a c(int i10) {
            this.f10255b = i10;
            return this;
        }

        public a d(int i10) {
            this.f10254a = i10;
            return this;
        }
    }

    public static a d() {
        return new a(null);
    }

    public String a() {
        return this.f10253c;
    }

    public int b() {
        return this.f10252b;
    }

    public int c() {
        return this.f10251a;
    }

    public String toString() {
        return "Response Code: " + zzc.zzk(this.f10251a) + ", Debug Message: " + this.f10253c;
    }
}
