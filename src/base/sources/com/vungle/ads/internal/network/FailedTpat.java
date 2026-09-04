package com.vungle.ads.internal.network;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;
import tm.z0;

/* JADX INFO: renamed from: com.vungle.ads.internal.network.c, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB_\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!\"\u0004\b4\u00105R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00102\u001a\u0004\b6\u0010!\"\u0004\b7\u00105R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/vungle/ads/internal/network/c;", "", "Lcom/vungle/ads/internal/network/d;", "method", "", "", "headers", TtmlNode.TAG_BODY, "", "retryAttempt", "retryCount", "tpatKey", "<init>", "(Lcom/vungle/ads/internal/network/d;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/network/d;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/network/c;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/network/d;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/lang/String;", "component4", "()I", "component5", "component6", "copy", "(Lcom/vungle/ads/internal/network/d;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)Lcom/vungle/ads/internal/network/c;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/network/d;", "getMethod", "Ljava/util/Map;", "getHeaders", "Ljava/lang/String;", "getBody", "I", "getRetryAttempt", "setRetryAttempt", "(I)V", "getRetryCount", "setRetryCount", "getTpatKey", "setTpatKey", "(Ljava/lang/String;)V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class FailedTpat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String body;
    private final Map<String, String> headers;
    private final d method;
    private int retryAttempt;
    private int retryCount;
    private String tpatKey;

    /* JADX INFO: renamed from: com.vungle.ads.internal.network.c$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.network.FailedTpat", aVar, 6);
            g2Var.p("method", true);
            g2Var.p("headers", true);
            g2Var.p(TtmlNode.TAG_BODY, true);
            g2Var.p("retryAttempt", true);
            g2Var.p("retryCount", false);
            g2Var.p("tpatKey", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            v2 v2Var = v2.f53598a;
            pm.d dVarT = qm.a.t(new z0(v2Var, v2Var));
            pm.d dVarT2 = qm.a.t(v2Var);
            pm.d dVarT3 = qm.a.t(v2Var);
            u0 u0Var = u0.f53588a;
            return new pm.d[]{d.a.INSTANCE, dVarT, dVarT2, u0Var, u0Var, dVarT3};
        }

        @Override // pm.c
        public FailedTpat deserialize(sm.e decoder) {
            int i10;
            Object objE;
            Object objE2;
            Object objE3;
            int i11;
            int i12;
            Object objN;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            int i13 = 5;
            if (cVarB.l()) {
                objN = cVarB.n(descriptor2, 0, d.a.INSTANCE, null);
                v2 v2Var = v2.f53598a;
                objE = cVarB.e(descriptor2, 1, new z0(v2Var, v2Var), null);
                objE2 = cVarB.e(descriptor2, 2, v2Var, null);
                int iS = cVarB.s(descriptor2, 3);
                int iS2 = cVarB.s(descriptor2, 4);
                objE3 = cVarB.e(descriptor2, 5, v2Var, null);
                i12 = iS;
                i11 = iS2;
                i10 = 63;
            } else {
                boolean z10 = true;
                int iS3 = 0;
                int i14 = 0;
                Object objN2 = null;
                Object objE4 = null;
                Object objE5 = null;
                Object objE6 = null;
                int iS4 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            objN2 = cVarB.n(descriptor2, 0, d.a.INSTANCE, objN2);
                            i14 |= 1;
                            i13 = 5;
                            continue;
                        case 1:
                            v2 v2Var2 = v2.f53598a;
                            objE4 = cVarB.e(descriptor2, 1, new z0(v2Var2, v2Var2), objE4);
                            i14 |= 2;
                            i13 = 5;
                            break;
                        case 2:
                            objE5 = cVarB.e(descriptor2, 2, v2.f53598a, objE5);
                            i14 |= 4;
                            break;
                        case 3:
                            iS3 = cVarB.s(descriptor2, 3);
                            i14 |= 8;
                            break;
                        case 4:
                            iS4 = cVarB.s(descriptor2, 4);
                            i14 |= 16;
                            break;
                        case 5:
                            objE6 = cVarB.e(descriptor2, i13, v2.f53598a, objE6);
                            i14 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = i14;
                objE = objE4;
                objE2 = objE5;
                objE3 = objE6;
                i11 = iS4;
                i12 = iS3;
                objN = objN2;
            }
            cVarB.d(descriptor2);
            return new FailedTpat(i10, (d) objN, (Map) objE, (String) objE2, i12, i11, (String) objE3, (q2) null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, FailedTpat value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            FailedTpat.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.network.c$b, reason: from kotlin metadata */
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

    public /* synthetic */ FailedTpat(int i10, d dVar, Map map, String str, int i11, int i12, String str2, q2 q2Var) {
        if (16 != (i10 & 16)) {
            b2.a(i10, 16, a.INSTANCE.getDescriptor());
        }
        this.method = (i10 & 1) == 0 ? d.GET : dVar;
        if ((i10 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i10 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i10 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i11;
        }
        this.retryCount = i12;
        if ((i10 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedTpat copy$default(FailedTpat failedTpat, d dVar, Map map, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dVar = failedTpat.method;
        }
        if ((i12 & 2) != 0) {
            map = failedTpat.headers;
        }
        if ((i12 & 4) != 0) {
            str = failedTpat.body;
        }
        if ((i12 & 8) != 0) {
            i10 = failedTpat.retryAttempt;
        }
        if ((i12 & 16) != 0) {
            i11 = failedTpat.retryCount;
        }
        if ((i12 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        int i13 = i11;
        String str3 = str2;
        return failedTpat.copy(dVar, map, str, i10, i13, str3);
    }

    public static final void write$Self(FailedTpat self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.method != d.GET) {
            output.A(serialDesc, 0, d.a.INSTANCE, self.method);
        }
        if (output.k(serialDesc, 1) || self.headers != null) {
            v2 v2Var = v2.f53598a;
            output.w(serialDesc, 1, new z0(v2Var, v2Var), self.headers);
        }
        if (output.k(serialDesc, 2) || self.body != null) {
            output.w(serialDesc, 2, v2.f53598a, self.body);
        }
        if (output.k(serialDesc, 3) || self.retryAttempt != 0) {
            output.i(serialDesc, 3, self.retryAttempt);
        }
        output.i(serialDesc, 4, self.retryCount);
        if (!output.k(serialDesc, 5) && self.tpatKey == null) {
            return;
        }
        output.w(serialDesc, 5, v2.f53598a, self.tpatKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final d getMethod() {
        return this.method;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final FailedTpat copy(d method, Map<String, String> headers, String body, int retryAttempt, int retryCount, String tpatKey) {
        s.h(method, "method");
        return new FailedTpat(method, headers, body, retryAttempt, retryCount, tpatKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedTpat)) {
            return false;
        }
        FailedTpat failedTpat = (FailedTpat) other;
        return this.method == failedTpat.method && s.c(this.headers, failedTpat.headers) && s.c(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && s.c(this.tpatKey, failedTpat.tpatKey);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final d getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.retryAttempt)) * 31) + Integer.hashCode(this.retryCount)) * 31;
        String str2 = this.tpatKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRetryAttempt(int i10) {
        this.retryAttempt = i10;
    }

    public final void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public final void setTpatKey(String str) {
        this.tpatKey = str;
    }

    public String toString() {
        return "FailedTpat(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", retryAttempt=" + this.retryAttempt + ", retryCount=" + this.retryCount + ", tpatKey=" + this.tpatKey + ')';
    }

    public FailedTpat(d method, Map<String, String> map, String str, int i10, int i11, String str2) {
        s.h(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i10;
        this.retryCount = i11;
        this.tpatKey = str2;
    }

    public /* synthetic */ FailedTpat(d dVar, Map map, String str, int i10, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? d.GET : dVar, (i12 & 2) != 0 ? null : map, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? 0 : i10, i11, (i12 & 32) != 0 ? null : str2);
    }
}
