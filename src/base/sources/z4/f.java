package z4;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58627a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ f b(a aVar, Object obj, String str, b bVar, e eVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                bVar = c.f58618a.a();
            }
            if ((i10 & 4) != 0) {
                eVar = z4.a.f58613a;
            }
            return aVar.a(obj, str, bVar, eVar);
        }

        public final f a(Object obj, String tag, b verificationMode, e logger) {
            s.h(obj, "<this>");
            s.h(tag, "tag");
            s.h(verificationMode, "verificationMode");
            s.h(logger, "logger");
            return new g(obj, tag, verificationMode, logger);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    public abstract Object a();

    public abstract f c(String str, Function1 function1);

    protected final String b(Object obj, String message) {
        s.h(obj, QGbBllacZSmHKn.kiVOj);
        s.h(message, "message");
        return message + " value: " + obj;
    }
}
