package ne;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.q2;

/* JADX INFO: renamed from: ne.w0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\"&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b\"\u0010%¨\u0006("}, d2 = {"Lne/w0;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "Ltm/q2;", "serializationConstructorMarker", "(IJJJLtm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Lne/w0;Lsm/d;Lrm/f;)V", "time", "Lcm/a;", "c", "(Lne/w0;)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getMs", "()J", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@pm.k
public final /* data */ class Time {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long us;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long seconds;

    /* JADX INFO: renamed from: ne.w0$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a implements tm.l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47307a;
        private static final rm.f descriptor;

        static {
            a aVar = new a();
            f47307a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.Time", aVar, 3);
            g2Var.p("ms", false);
            g2Var.p("us", true);
            g2Var.p("seconds", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // pm.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Time deserialize(sm.e decoder) {
            int i10;
            long jZ;
            long j10;
            long j11;
            kotlin.jvm.internal.s.h(decoder, "decoder");
            rm.f fVar = descriptor;
            sm.c cVarB = decoder.b(fVar);
            if (cVarB.l()) {
                long jZ2 = cVarB.z(fVar, 0);
                long jZ3 = cVarB.z(fVar, 1);
                jZ = cVarB.z(fVar, 2);
                i10 = 7;
                j10 = jZ2;
                j11 = jZ3;
            } else {
                long jZ4 = 0;
                boolean z10 = true;
                int i11 = 0;
                long jZ5 = 0;
                long jZ6 = 0;
                while (z10) {
                    int iO = cVarB.o(fVar);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        jZ5 = cVarB.z(fVar, 0);
                        i11 |= 1;
                    } else if (iO == 1) {
                        jZ6 = cVarB.z(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iO != 2) {
                            throw new UnknownFieldException(iO);
                        }
                        jZ4 = cVarB.z(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jZ = jZ4;
                j10 = jZ5;
                j11 = jZ6;
            }
            cVarB.d(fVar);
            return new Time(i10, j10, j11, jZ, null);
        }

        @Override // pm.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(sm.f encoder, Time value) {
            kotlin.jvm.internal.s.h(encoder, "encoder");
            kotlin.jvm.internal.s.h(value, "value");
            rm.f fVar = descriptor;
            sm.d dVarB = encoder.b(fVar);
            Time.d(value, dVarB, fVar);
            dVarB.d(fVar);
        }

        @Override // tm.l0
        public final pm.d[] childSerializers() {
            f1 f1Var = f1.f53474a;
            return new pm.d[]{f1Var, f1Var, f1Var};
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

    /* JADX INFO: renamed from: ne.w0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        private Companion() {
        }

        public final pm.d serializer() {
            return a.f47307a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Time(int i10, long j10, long j11, long j12, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, a.f47307a.getDescriptor());
        }
        this.ms = j10;
        this.us = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.seconds = j10 / ((long) 1000);
        } else {
            this.seconds = j12;
        }
    }

    public static final /* synthetic */ void d(Time self, sm.d output, rm.f serialDesc) {
        output.e(serialDesc, 0, self.ms);
        if (output.k(serialDesc, 1) || self.us != self.ms * ((long) 1000)) {
            output.e(serialDesc, 1, self.us);
        }
        if (!output.k(serialDesc, 2) && self.seconds == self.ms / ((long) 1000)) {
            return;
        }
        output.e(serialDesc, 2, self.seconds);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUs() {
        return this.us;
    }

    public final long c(Time time) {
        kotlin.jvm.internal.s.h(time, "time");
        cm.a.C0139a c0139a = cm.a.f10121b;
        return cm.c.t(this.ms - time.ms, cm.d.MILLISECONDS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Time) && this.ms == ((Time) other).ms;
    }

    public int hashCode() {
        return Long.hashCode(this.ms);
    }

    public String toString() {
        return "Time(ms=" + this.ms + ')';
    }

    public Time(long j10) {
        this.ms = j10;
        long j11 = 1000;
        this.us = j10 * j11;
        this.seconds = j10 / j11;
    }
}
