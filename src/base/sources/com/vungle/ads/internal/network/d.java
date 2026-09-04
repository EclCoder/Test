package com.vungle.ads.internal.network;

import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r7.pgx.XTkUEXuiK;
import tm.f0;
import tm.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/network/d;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, HttpMethods.GET, HttpMethods.POST, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public enum d {
    GET,
    POST;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements l0 {
        public static final a INSTANCE = new a();
        public static final /* synthetic */ rm.f descriptor;

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            return new pm.d[0];
        }

        @Override // pm.c
        public d deserialize(sm.e decoder) {
            s.h(decoder, "decoder");
            return d.values()[decoder.G(getDescriptor())];
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, d value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            encoder.E(getDescriptor(), value.ordinal());
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }

        static {
            f0 f0Var = new f0("com.vungle.ads.internal.network.HttpMethod", 2);
            f0Var.p(HttpMethods.GET, false);
            f0Var.p(XTkUEXuiK.kkUGdQUW, false);
            descriptor = f0Var;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.network.d$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pm.d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }
}
