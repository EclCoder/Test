package com.vungle.ads.internal.network;

import gn.f0;
import gn.g0;
import gn.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static final a Companion = new a(null);
    private final Object body;
    private final g0 errorBody;
    private final f0 rawResponse;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> f error(g0 g0Var, f0 rawResponse) {
            s.h(rawResponse, "rawResponse");
            if (rawResponse.i0()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new f(rawResponse, defaultConstructorMarker, g0Var, defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> f success(T t10, f0 rawResponse) {
            s.h(rawResponse, "rawResponse");
            if (rawResponse.i0()) {
                return new f(rawResponse, t10, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private a() {
        }
    }

    public /* synthetic */ f(f0 f0Var, Object obj, g0 g0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var, obj, g0Var);
    }

    public final Object body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.m();
    }

    public final g0 errorBody() {
        return this.errorBody;
    }

    public final x headers() {
        return this.rawResponse.d0();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.i0();
    }

    public final String message() {
        return this.rawResponse.m0();
    }

    public final f0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private f(f0 f0Var, Object obj, g0 g0Var) {
        this.rawResponse = f0Var;
        this.body = obj;
        this.errorBody = g0Var;
    }
}
