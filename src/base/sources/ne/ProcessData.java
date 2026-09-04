package ne;

import com.coremedia.iso.boxes.UserBox;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.g2;
import tm.q2;
import tm.v2;

/* JADX INFO: renamed from: ne.v, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001c\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0015¨\u0006!"}, d2 = {"Lne/v;", "", "", "pid", "", UserBox.TYPE, "<init>", "(ILjava/lang/String;)V", "seen0", "Ltm/q2;", "serializationConstructorMarker", "(IILjava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "c", "(Lne/v;Lsm/d;Lrm/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@pm.k
public final /* data */ class ProcessData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    /* JADX INFO: renamed from: ne.v$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a implements tm.l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47296a;
        private static final rm.f descriptor;

        static {
            a aVar = new a();
            f47296a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.ProcessData", aVar, 2);
            g2Var.p("pid", false);
            g2Var.p(UserBox.TYPE, false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // pm.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProcessData deserialize(sm.e decoder) {
            int iS;
            String strH;
            int i10;
            kotlin.jvm.internal.s.h(decoder, "decoder");
            rm.f fVar = descriptor;
            sm.c cVarB = decoder.b(fVar);
            q2 q2Var = null;
            if (cVarB.l()) {
                iS = cVarB.s(fVar, 0);
                strH = cVarB.H(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                iS = 0;
                int i11 = 0;
                String strH2 = null;
                while (z10) {
                    int iO = cVarB.o(fVar);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        iS = cVarB.s(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iO != 1) {
                            throw new UnknownFieldException(iO);
                        }
                        strH2 = cVarB.H(fVar, 1);
                        i11 |= 2;
                    }
                }
                strH = strH2;
                i10 = i11;
            }
            cVarB.d(fVar);
            return new ProcessData(i10, iS, strH, q2Var);
        }

        @Override // pm.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(sm.f encoder, ProcessData value) {
            kotlin.jvm.internal.s.h(encoder, "encoder");
            kotlin.jvm.internal.s.h(value, "value");
            rm.f fVar = descriptor;
            sm.d dVarB = encoder.b(fVar);
            ProcessData.c(value, dVarB, fVar);
            dVarB.d(fVar);
        }

        @Override // tm.l0
        public final pm.d[] childSerializers() {
            return new pm.d[]{tm.u0.f53588a, v2.f53598a};
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

    /* JADX INFO: renamed from: ne.v$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        private Companion() {
        }

        public final pm.d serializer() {
            return a.f47296a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProcessData(int i10, int i11, String str, q2 q2Var) {
        if (3 != (i10 & 3)) {
            b2.a(i10, 3, a.f47296a.getDescriptor());
        }
        this.pid = i11;
        this.uuid = str;
    }

    public static final /* synthetic */ void c(ProcessData self, sm.d output, rm.f serialDesc) {
        output.i(serialDesc, 0, self.pid);
        output.F(serialDesc, 1, self.uuid);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) other;
        return this.pid == processData.pid && kotlin.jvm.internal.s.c(this.uuid, processData.uuid);
    }

    public int hashCode() {
        return (Integer.hashCode(this.pid) * 31) + this.uuid.hashCode();
    }

    public String toString() {
        return "ProcessData(pid=" + this.pid + ", uuid=" + this.uuid + ')';
    }

    public ProcessData(int i10, String uuid) {
        kotlin.jvm.internal.s.h(uuid, "uuid");
        this.pid = i10;
        this.uuid = uuid;
    }
}
