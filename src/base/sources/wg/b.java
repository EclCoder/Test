package wg;

import androidx.lifecycle.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f56267a;

    public b(Function1 onEventUnHandledContent) {
        s.h(onEventUnHandledContent, "onEventUnHandledContent");
        this.f56267a = onEventUnHandledContent;
    }

    @Override // androidx.lifecycle.q0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(a event) {
        s.h(event, "event");
        Object objA = event.a();
        if (objA != null) {
            this.f56267a.invoke(objA);
        }
    }
}
