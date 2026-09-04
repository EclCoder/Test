package ne;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.q2;
import tm.v2;

/* JADX INFO: renamed from: ne.i0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u001f!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lne/i0;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "seen0", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IJLtm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "e", "(Lne/i0;Lsm/d;Lrm/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "J", "()J", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@pm.k
public final /* data */ class SessionDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstSessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sessionIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long sessionStartTimestampUs;

    /* JADX INFO: renamed from: ne.i0$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a implements tm.l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47175a;
        private static final rm.f descriptor;

        static {
            a aVar = new a();
            f47175a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.SessionDetails", aVar, 4);
            g2Var.p("sessionId", false);
            g2Var.p("firstSessionId", false);
            g2Var.p("sessionIndex", false);
            g2Var.p("sessionStartTimestampUs", false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // pm.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionDetails deserialize(sm.e decoder) {
            String strH;
            int i10;
            int iS;
            String str;
            long jZ;
            kotlin.jvm.internal.s.h(decoder, "decoder");
            rm.f fVar = descriptor;
            sm.c cVarB = decoder.b(fVar);
            if (cVarB.l()) {
                strH = cVarB.H(fVar, 0);
                String strH2 = cVarB.H(fVar, 1);
                i10 = 15;
                iS = cVarB.s(fVar, 2);
                str = strH2;
                jZ = cVarB.z(fVar, 3);
            } else {
                strH = null;
                String strH3 = null;
                boolean z10 = true;
                long jZ2 = 0;
                int i11 = 0;
                int iS2 = 0;
                while (z10) {
                    int iO = cVarB.o(fVar);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        strH = cVarB.H(fVar, 0);
                        i11 |= 1;
                    } else if (iO == 1) {
                        strH3 = cVarB.H(fVar, 1);
                        i11 |= 2;
                    } else if (iO == 2) {
                        iS2 = cVarB.s(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iO != 3) {
                            throw new UnknownFieldException(iO);
                        }
                        jZ2 = cVarB.z(fVar, 3);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                iS = iS2;
                str = strH3;
                jZ = jZ2;
            }
            String str2 = strH;
            cVarB.d(fVar);
            return new SessionDetails(i10, str2, str, iS, jZ, null);
        }

        @Override // pm.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(sm.f encoder, SessionDetails value) {
            kotlin.jvm.internal.s.h(encoder, "encoder");
            kotlin.jvm.internal.s.h(value, "value");
            rm.f fVar = descriptor;
            sm.d dVarB = encoder.b(fVar);
            SessionDetails.e(value, dVarB, fVar);
            dVarB.d(fVar);
        }

        @Override // tm.l0
        public final pm.d[] childSerializers() {
            v2 v2Var = v2.f53598a;
            return new pm.d[]{v2Var, v2Var, tm.u0.f53588a, f1.f53474a};
        }

        @Override // pm.d, pm.l, pm.c
        public final rm.f getDescriptor() {
            return descriptor;
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return tm.l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: ne.i0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        private Companion() {
        }

        public final pm.d serializer() {
            return a.f47175a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionDetails(int i10, String str, String str2, int i11, long j10, q2 q2Var) {
        if (15 != (i10 & 15)) {
            b2.a(i10, 15, a.f47175a.getDescriptor());
        }
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i11;
        this.sessionStartTimestampUs = j10;
    }

    public static final /* synthetic */ void e(SessionDetails self, sm.d output, rm.f serialDesc) {
        output.F(serialDesc, 0, self.sessionId);
        output.F(serialDesc, 1, self.firstSessionId);
        output.i(serialDesc, 2, self.sessionIndex);
        output.e(serialDesc, 3, self.sessionStartTimestampUs);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) other;
        return kotlin.jvm.internal.s.c(this.sessionId, sessionDetails.sessionId) && kotlin.jvm.internal.s.c(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    public int hashCode() {
        return (((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.sessionStartTimestampUs);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }

    public SessionDetails(String sessionId, String firstSessionId, int i10, long j10) {
        kotlin.jvm.internal.s.h(sessionId, "sessionId");
        kotlin.jvm.internal.s.h(firstSessionId, "firstSessionId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.sessionStartTimestampUs = j10;
    }
}
