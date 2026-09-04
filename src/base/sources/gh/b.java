package gh;

import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends androidx.recyclerview.widget.j.f {
    @Override // androidx.recyclerview.widget.j.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(FBLiveDestination oldItem, FBLiveDestination newItem) {
        s.h(oldItem, "oldItem");
        s.h(newItem, "newItem");
        return s.c(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.j.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(FBLiveDestination oldItem, FBLiveDestination newItem) {
        s.h(oldItem, "oldItem");
        s.h(newItem, "newItem");
        return s.c(oldItem.getId(), newItem.getId()) && oldItem.getType() == newItem.getType();
    }
}
