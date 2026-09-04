package ph;

import androidx.fragment.app.Fragment;
import oh.g2;
import oh.q4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends w4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.s.h(fragment, "fragment");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 2;
    }

    @Override // w4.a
    public Fragment h(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? new q4() : new g2();
        }
        return new q4();
    }
}
