package com.android.installreferrer.api;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f10472a;

        private b(Context context) {
            this.f10472a = context;
        }

        public InstallReferrerClient a() {
            Context context = this.f10472a;
            if (context != null) {
                return new com.android.installreferrer.api.a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b c(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract ReferrerDetails b();

    public abstract void d(InstallReferrerStateListener installReferrerStateListener);
}
