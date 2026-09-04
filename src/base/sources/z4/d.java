package z4;

import androidx.window.core.WindowStrictModeException;
import gl.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f58621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f58622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f58623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f.b f58624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WindowStrictModeException f58625g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58626a;

        static {
            int[] iArr = new int[f.b.values().length];
            iArr[f.b.STRICT.ordinal()] = 1;
            iArr[f.b.LOG.ordinal()] = 2;
            iArr[f.b.QUIET.ordinal()] = 3;
            f58626a = iArr;
        }
    }

    public d(Object value, String tag, String message, e logger, f.b verificationMode) {
        s.h(value, "value");
        s.h(tag, "tag");
        s.h(message, "message");
        s.h(logger, "logger");
        s.h(verificationMode, "verificationMode");
        this.f58620b = value;
        this.f58621c = tag;
        this.f58622d = message;
        this.f58623e = logger;
        this.f58624f = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        s.g(stackTrace, "stackTrace");
        Object[] array = j.R(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.f58625g = windowStrictModeException;
    }

    @Override // z4.f
    public Object a() throws WindowStrictModeException {
        int i10 = a.f58626a[this.f58624f.ordinal()];
        if (i10 == 1) {
            throw this.f58625g;
        }
        if (i10 == 2) {
            this.f58623e.a(this.f58621c, b(this.f58620b, this.f58622d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // z4.f
    public f c(String message, Function1 condition) {
        s.h(message, "message");
        s.h(condition, "condition");
        return this;
    }
}
