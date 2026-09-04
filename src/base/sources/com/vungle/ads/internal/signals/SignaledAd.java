package com.vungle.ads.internal.signals;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import pm.d;
import pm.k;
import rm.f;
import sm.e;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;

/* JADX INFO: renamed from: com.vungle.ads.internal.signals.c, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006BQ\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0005\u0010\u0011J!\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J&\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010\u001d\u001a\u0004\b-\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b1\u0010\u001d\u001a\u0004\b0\u0010!R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00102\u0012\u0004\b6\u0010\u001d\u001a\u0004\b3\u0010%\"\u0004\b4\u00105R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b8\u0010\u001d\u001a\u0004\b7\u0010!R*\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u00102\u0012\u0004\b;\u0010\u001d\u001a\u0004\b9\u0010%\"\u0004\b:\u00105R(\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010/\u0012\u0004\b?\u0010\u001d\u001a\u0004\b<\u0010!\"\u0004\b=\u0010>R(\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010@\u0012\u0004\bD\u0010\u001d\u001a\u0004\bA\u0010'\"\u0004\bB\u0010CR(\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bE\u0010/\u0012\u0004\bH\u0010\u001d\u001a\u0004\bF\u0010!\"\u0004\bG\u0010>R(\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010/\u0012\u0004\bL\u0010\u001d\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010>¨\u0006P"}, d2 = {"Lcom/vungle/ads/internal/signals/c;", "", "", "lastAdLoadTime", "loadAdTime", "<init>", "(Ljava/lang/Long;J)V", "", "seen1", "", "templateSignals", "timeSinceLastAdLoad", "eventId", "timeBetweenAdAvailabilityAndPlayAd", "screenOrientation", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;JILtm/q2;)V", "getTimeDifference", "(Ljava/lang/Long;J)J", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/signals/c;Lsm/d;Lrm/f;)V", "calculateTimeBetweenAdAvailabilityAndPlayAd", "()V", "component1", "()Ljava/lang/Long;", "component2", "()J", "copy", "(Ljava/lang/Long;J)Lcom/vungle/ads/internal/signals/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getLastAdLoadTime", "getLastAdLoadTime$annotations", "J", "getLoadAdTime", "getLoadAdTime$annotations", "Ljava/lang/String;", "getTemplateSignals", "setTemplateSignals", "(Ljava/lang/String;)V", "getTemplateSignals$annotations", "getTimeSinceLastAdLoad", "getTimeSinceLastAdLoad$annotations", "getEventId", "setEventId", "getEventId$annotations", "getTimeBetweenAdAvailabilityAndPlayAd", "setTimeBetweenAdAvailabilityAndPlayAd", "(J)V", "getTimeBetweenAdAvailabilityAndPlayAd$annotations", "I", "getScreenOrientation", "setScreenOrientation", "(I)V", "getScreenOrientation$annotations", "adAvailabilityCallbackTime", "getAdAvailabilityCallbackTime", "setAdAvailabilityCallbackTime", "getAdAvailabilityCallbackTime$annotations", "playAdTime", "getPlayAdTime", "setPlayAdTime", "getPlayAdTime$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@k
public final /* data */ class SignaledAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    /* JADX INFO: renamed from: com.vungle.ads.internal.signals.c$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.signals.SignaledAd", aVar, 5);
            g2Var.p("500", true);
            g2Var.p("109", false);
            g2Var.p("107", true);
            g2Var.p("110", true);
            g2Var.p("108", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public d[] childSerializers() {
            v2 v2Var = v2.f53598a;
            d dVarT = qm.a.t(v2Var);
            d dVarT2 = qm.a.t(v2Var);
            f1 f1Var = f1.f53474a;
            return new d[]{dVarT, f1Var, dVarT2, f1Var, u0.f53588a};
        }

        @Override // pm.c
        public SignaledAd deserialize(e decoder) {
            long jZ;
            long jZ2;
            int i10;
            Object objE;
            int iS;
            Object objE2;
            s.h(decoder, "decoder");
            f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            int i11 = 3;
            if (cVarB.l()) {
                v2 v2Var = v2.f53598a;
                objE = cVarB.e(descriptor2, 0, v2Var, null);
                long jZ3 = cVarB.z(descriptor2, 1);
                objE2 = cVarB.e(descriptor2, 2, v2Var, null);
                long jZ4 = cVarB.z(descriptor2, 3);
                i10 = 31;
                iS = cVarB.s(descriptor2, 4);
                jZ2 = jZ3;
                jZ = jZ4;
            } else {
                jZ = 0;
                boolean z10 = true;
                int iS2 = 0;
                Object objE3 = null;
                Object objE4 = null;
                jZ2 = 0;
                int i12 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objE3 = cVarB.e(descriptor2, 0, v2.f53598a, objE3);
                        i12 |= 1;
                    } else if (iO == 1) {
                        jZ2 = cVarB.z(descriptor2, 1);
                        i12 |= 2;
                    } else if (iO == 2) {
                        objE4 = cVarB.e(descriptor2, 2, v2.f53598a, objE4);
                        i12 |= 4;
                    } else if (iO == i11) {
                        jZ = cVarB.z(descriptor2, i11);
                        i12 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        iS2 = cVarB.s(descriptor2, 4);
                        i12 |= 16;
                    }
                    i11 = 3;
                }
                i10 = i12;
                objE = objE3;
                iS = iS2;
                objE2 = objE4;
            }
            cVarB.d(descriptor2);
            return new SignaledAd(i10, (String) objE, jZ2, (String) objE2, jZ, iS, null);
        }

        @Override // pm.d, pm.l, pm.c
        public f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, SignaledAd value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            SignaledAd.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.signals.c$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    public SignaledAd() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ SignaledAd copy$default(SignaledAd signaledAd, Long l10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = signaledAd.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j10 = signaledAd.loadAdTime;
        }
        return signaledAd.copy(l10, j10);
    }

    private final long getTimeDifference(Long lastAdLoadTime, long loadAdTime) {
        if (lastAdLoadTime == null) {
            return -1L;
        }
        long jLongValue = loadAdTime - lastAdLoadTime.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static final void write$Self(SignaledAd self, sm.d output, f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.templateSignals != null) {
            output.w(serialDesc, 0, v2.f53598a, self.templateSignals);
        }
        output.e(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.k(serialDesc, 2) || self.eventId != null) {
            output.w(serialDesc, 2, v2.f53598a, self.eventId);
        }
        if (output.k(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.e(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!output.k(serialDesc, 4) && self.screenOrientation == 0) {
            return;
        }
        output.i(serialDesc, 4, self.screenOrientation);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final SignaledAd copy(Long lastAdLoadTime, long loadAdTime) {
        return new SignaledAd(lastAdLoadTime, loadAdTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignaledAd)) {
            return false;
        }
        SignaledAd signaledAd = (SignaledAd) other;
        return s.c(this.lastAdLoadTime, signaledAd.lastAdLoadTime) && this.loadAdTime == signaledAd.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l10 = this.lastAdLoadTime;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + Long.hashCode(this.loadAdTime);
    }

    public final void setAdAvailabilityCallbackTime(long j10) {
        this.adAvailabilityCallbackTime = j10;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j10) {
        this.playAdTime = j10;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j10) {
        this.timeBetweenAdAvailabilityAndPlayAd = j10;
    }

    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    public /* synthetic */ SignaledAd(int i10, String str, long j10, String str2, long j11, int i11, q2 q2Var) {
        if (2 != (i10 & 2)) {
            b2.a(i10, 2, a.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j10;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j11;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public SignaledAd(Long l10, long j10) {
        this.lastAdLoadTime = l10;
        this.loadAdTime = j10;
        this.timeSinceLastAdLoad = getTimeDifference(l10, j10);
    }

    public /* synthetic */ SignaledAd(Long l10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? 0L : j10);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }
}
