package gh;

import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f39187a;

    public c(Function1 clickListener) {
        s.h(clickListener, "clickListener");
        this.f39187a = clickListener;
    }

    public final void a(FBLiveDestination destination) {
        s.h(destination, "destination");
        this.f39187a.invoke(destination);
    }
}
