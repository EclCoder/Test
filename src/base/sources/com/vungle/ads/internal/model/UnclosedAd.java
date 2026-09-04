package com.vungle.ads.internal.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.v2;

/* JADX INFO: renamed from: com.vungle.ads.internal.model.n, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001bR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/model/n;", "", "", "eventId", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/n;Lsm/d;Lrm/f;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/n;", "toString", "Ljava/lang/String;", "getEventId", "getEventId$annotations", "()V", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "getSessionId$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class UnclosedAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String eventId;
    private String sessionId;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.n$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.UnclosedAd", aVar, 2);
            g2Var.p("107", false);
            g2Var.p(StatisticData.ERROR_CODE_IO_ERROR, true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            v2 v2Var = v2.f53598a;
            return new pm.d[]{v2Var, v2Var};
        }

        @Override // pm.c
        public UnclosedAd deserialize(sm.e decoder) {
            String strH;
            String strH2;
            int i10;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            q2 q2Var = null;
            if (cVarB.l()) {
                strH = cVarB.H(descriptor2, 0);
                strH2 = cVarB.H(descriptor2, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strH = null;
                String strH3 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        strH = cVarB.H(descriptor2, 0);
                        i11 |= 1;
                    } else {
                        if (iO != 1) {
                            throw new UnknownFieldException(iO);
                        }
                        strH3 = cVarB.H(descriptor2, 1);
                        i11 |= 2;
                    }
                }
                strH2 = strH3;
                i10 = i11;
            }
            cVarB.d(descriptor2);
            return new UnclosedAd(i10, strH, strH2, q2Var);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, UnclosedAd value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            UnclosedAd.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.n$b, reason: from kotlin metadata */
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

    public /* synthetic */ UnclosedAd(int i10, String str, String str2, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, a.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ UnclosedAd copy$default(UnclosedAd unclosedAd, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    public static final void write$Self(UnclosedAd self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        output.F(serialDesc, 0, self.eventId);
        if (!output.k(serialDesc, 1) && s.c(self.sessionId, "")) {
            return;
        }
        output.F(serialDesc, 1, self.sessionId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final UnclosedAd copy(String eventId, String sessionId) {
        s.h(eventId, "eventId");
        s.h(sessionId, "sessionId");
        return new UnclosedAd(eventId, sessionId);
    }

    public boolean equals(Object other) {
        if (other != null && s.c(UnclosedAd.class, other.getClass())) {
            UnclosedAd unclosedAd = (UnclosedAd) other;
            if (s.c(this.eventId, unclosedAd.eventId) && s.c(this.sessionId, unclosedAd.sessionId)) {
                return true;
            }
        }
        return false;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.eventId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public final void setSessionId(String str) {
        s.h(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }

    public UnclosedAd(String eventId, String sessionId) {
        s.h(eventId, "eventId");
        s.h(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ UnclosedAd(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }
}
