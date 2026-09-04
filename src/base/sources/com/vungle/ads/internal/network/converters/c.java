package com.vungle.ads.internal.network.converters;

import fl.g0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.k0;
import kotlinx.serialization.json.v;
import zl.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements com.vungle.ads.internal.network.converters.a {
    public static final b Companion = new b(null);
    private static final kotlinx.serialization.json.b json = v.b(null, a.INSTANCE, 1, null);
    private final l kType;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements Function1 {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e) obj);
            return g0.f38750a;
        }

        public final void invoke(e Json) {
            s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public c(l kType) {
        s.h(kType, "kType");
        this.kType = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.a
    public Object convert(gn.g0 g0Var) throws IOException {
        if (g0Var != null) {
            try {
                InputStream inputStreamByteStream = g0Var.byteStream();
                if (inputStreamByteStream != null) {
                    Object objA = k0.a(json, pm.t.b(kotlinx.serialization.json.b.f43628d.a(), this.kType), inputStreamByteStream);
                    ql.b.a(g0Var, null);
                    return objA;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(g0Var, th2);
                    throw th3;
                }
            }
        }
        ql.b.a(g0Var, null);
        return null;
    }
}
