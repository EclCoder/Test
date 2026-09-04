package ff;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends androidx.appcompat.app.d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.k1 z0(View v10, n0.k1 insets) {
        kotlin.jvm.internal.s.h(v10, "v");
        kotlin.jvm.internal.s.h(insets, "insets");
        e0.b bVarG = insets.g(n0.k1.s.g());
        kotlin.jvm.internal.s.g(bVarG, "getInsets(...)");
        v10.setPadding(bVarG.f37000a, bVarG.f37001b, bVarG.f37002c, bVarG.f37003d);
        return insets;
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n0.e1.b(getWindow(), false);
    }

    protected final void y0(View root) {
        kotlin.jvm.internal.s.h(root, "root");
        n0.q0.w0(root, new n0.b0() { // from class: ff.a
            @Override // n0.b0
            public final n0.k1 a(View view, n0.k1 k1Var) {
                return b.z0(view, k1Var);
            }
        });
    }
}
