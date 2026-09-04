package fl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String message) {
        super(message);
        kotlin.jvm.internal.s.h(message, "message");
    }

    public /* synthetic */ p(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
