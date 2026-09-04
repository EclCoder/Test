package qe;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.b0;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;

/* JADX INFO: renamed from: qe.h, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002!%B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b!\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b%\u0010-¨\u0006/"}, d2 = {"Lqe/h;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "f", "(Lqe/h;Lsm/d;Lrm/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "Ljava/lang/Integer;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@pm.k
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean sessionsEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double sessionSamplingRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sessionTimeoutSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cacheDurationSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long cacheUpdatedTimeSeconds;

    /* JADX INFO: renamed from: qe.h$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50682a;
        private static final rm.f descriptor;

        static {
            a aVar = new a();
            f50682a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            g2Var.p("sessionsEnabled", false);
            g2Var.p("sessionSamplingRate", false);
            g2Var.p("sessionTimeoutSeconds", false);
            g2Var.p("cacheDurationSeconds", false);
            g2Var.p("cacheUpdatedTimeSeconds", false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // pm.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionConfigs deserialize(sm.e decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            s.h(decoder, "decoder");
            rm.f fVar = descriptor;
            sm.c cVarB = decoder.b(fVar);
            Boolean bool2 = null;
            if (cVarB.l()) {
                Boolean bool3 = (Boolean) cVarB.e(fVar, 0, tm.i.f53507a, null);
                Double d11 = (Double) cVarB.e(fVar, 1, b0.f53441a, null);
                u0 u0Var = u0.f53588a;
                Integer num3 = (Integer) cVarB.e(fVar, 2, u0Var, null);
                bool = bool3;
                num2 = (Integer) cVarB.e(fVar, 3, u0Var, null);
                l10 = (Long) cVarB.e(fVar, 4, f1.f53474a, null);
                num = num3;
                d10 = d11;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d12 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l11 = null;
                while (z10) {
                    int iO = cVarB.o(fVar);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        bool2 = (Boolean) cVarB.e(fVar, 0, tm.i.f53507a, bool2);
                        i11 |= 1;
                    } else if (iO == 1) {
                        d12 = (Double) cVarB.e(fVar, 1, b0.f53441a, d12);
                        i11 |= 2;
                    } else if (iO == 2) {
                        num4 = (Integer) cVarB.e(fVar, 2, u0.f53588a, num4);
                        i11 |= 4;
                    } else if (iO == 3) {
                        num5 = (Integer) cVarB.e(fVar, 3, u0.f53588a, num5);
                        i11 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        l11 = (Long) cVarB.e(fVar, 4, f1.f53474a, l11);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                bool = bool2;
                d10 = d12;
                num = num4;
                num2 = num5;
                l10 = l11;
            }
            cVarB.d(fVar);
            return new SessionConfigs(i10, bool, d10, num, num2, l10, null);
        }

        @Override // pm.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(sm.f encoder, SessionConfigs value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f fVar = descriptor;
            sm.d dVarB = encoder.b(fVar);
            SessionConfigs.f(value, dVarB, fVar);
            dVarB.d(fVar);
        }

        @Override // tm.l0
        public final pm.d[] childSerializers() {
            pm.d dVarT = qm.a.t(tm.i.f53507a);
            pm.d dVarT2 = qm.a.t(b0.f53441a);
            u0 u0Var = u0.f53588a;
            return new pm.d[]{dVarT, dVarT2, qm.a.t(u0Var), qm.a.t(u0Var), qm.a.t(f1.f53474a)};
        }

        @Override // pm.d, pm.l, pm.c
        public final rm.f getDescriptor() {
            return descriptor;
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: qe.h$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        private Companion() {
        }

        public final pm.d serializer() {
            return a.f50682a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, q2 q2Var) {
        if (31 != (i10 & 31)) {
            b2.a(i10, 31, a.f50682a.getDescriptor());
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }

    public static final /* synthetic */ void f(SessionConfigs self, sm.d output, rm.f serialDesc) {
        output.w(serialDesc, 0, tm.i.f53507a, self.sessionsEnabled);
        output.w(serialDesc, 1, b0.f53441a, self.sessionSamplingRate);
        u0 u0Var = u0.f53588a;
        output.w(serialDesc, 2, u0Var, self.sessionTimeoutSeconds);
        output.w(serialDesc, 3, u0Var, self.cacheDurationSeconds);
        output.w(serialDesc, 4, f1.f53474a, self.cacheUpdatedTimeSeconds);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return s.c(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && s.c(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && s.c(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && s.c(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && s.c(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public SessionConfigs(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }
}
