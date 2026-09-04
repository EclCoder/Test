package z4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f58633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f.b f58634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f58635e;

    public g(Object value, String tag, f.b verificationMode, e logger) {
        s.h(value, "value");
        s.h(tag, "tag");
        s.h(verificationMode, "verificationMode");
        s.h(logger, "logger");
        this.f58632b = value;
        this.f58633c = tag;
        this.f58634d = verificationMode;
        this.f58635e = logger;
    }

    @Override // z4.f
    public Object a() {
        return this.f58632b;
    }

    @Override // z4.f
    public f c(String message, Function1 condition) {
        s.h(message, "message");
        s.h(condition, "condition");
        return ((Boolean) condition.invoke(this.f58632b)).booleanValue() ? this : new d(this.f58632b, this.f58633c, message, this.f58635e, this.f58634d);
    }
}
