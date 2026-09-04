package ph;

import androidx.fragment.app.Fragment;
import oh.b4;
import oh.t3;
import oh.y3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends w4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.s.h(fragment, "fragment");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 3;
    }

    @Override // w4.a
    public Fragment h(int i10) {
        if (i10 == 0) {
            return new b4();
        }
        if (i10 != 1) {
            return i10 != 2 ? new b4() : new t3();
        }
        return new y3();
    }
}
