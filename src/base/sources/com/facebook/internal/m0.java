package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15312c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String action, Bundle bundle) {
            kotlin.jvm.internal.s.h(action, "action");
            if (kotlin.jvm.internal.s.c(action, "oauth")) {
                return e1.g(x0.k(), "oauth/authorize", bundle);
            }
            return e1.g(x0.k(), com.facebook.h0.y() + "/dialog/" + action, bundle);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String action, Bundle bundle) {
        super(action, bundle);
        kotlin.jvm.internal.s.h(action, "action");
        b(f15312c.a(action, bundle == null ? new Bundle() : bundle));
    }
}
