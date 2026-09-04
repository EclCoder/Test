package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class BillingClient {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile f f10168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f10169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile l5.l f10170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f10171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f10172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private volatile boolean f10173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile boolean f10174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f10175h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f10176i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f10177j;

        /* synthetic */ Builder(Context context, l5.o oVar) {
            this.f10169b = context;
        }

        private final boolean d() {
            try {
                Context context = this.f10169b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        public BillingClient a() {
            Context context = this.f10169b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f10170c == null) {
                if (this.f10176i) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling user choice billing or billing choice.");
                }
                if (this.f10171d || this.f10172e || this.f10173f || this.f10174g || this.f10175h) {
                    return d() ? new t0(null, context, null, null, this) : new a(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f10168a == null || !this.f10168a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f10170c == null) {
                f fVar = this.f10168a;
                return d() ? new t0((String) null, fVar, context, (l5.y) null, (v0) null, (ExecutorService) null, this) : new a((String) null, fVar, context, (l5.y) null, (v0) null, (ExecutorService) null, this);
            }
            f fVar2 = this.f10168a;
            l5.l lVar = this.f10170c;
            return d() ? new t0((String) null, fVar2, context, lVar, (v0) null, (ExecutorService) null, this) : new a((String) null, fVar2, context, lVar, (v0) null, (ExecutorService) null, this);
        }

        public Builder b(f fVar) {
            this.f10168a = fVar;
            return this;
        }

        public Builder c(l5.l lVar) {
            this.f10170c = lVar;
            return this;
        }
    }

    public static Builder e(Context context) {
        return new Builder(context, null);
    }

    public abstract void a(l5.a aVar, l5.b bVar);

    public abstract void b(l5.d dVar, l5.e eVar);

    public abstract void c();

    public abstract c d(Activity activity, b bVar);

    public abstract void f(h hVar, l5.i iVar);

    public abstract void g(l5.m mVar, l5.k kVar);

    public abstract c h(Activity activity, d dVar, l5.h hVar);

    public abstract void i(l5.c cVar);
}
