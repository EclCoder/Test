package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean Y;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, d0.k.a(context, m.f6430g, R.attr.preferenceScreenStyle));
        this.Y = true;
    }

    @Override // androidx.preference.Preference
    protected void T() {
        j.b bVarG;
        if (p() != null || n() != null || U0() == 0 || (bVarG = A().g()) == null) {
            return;
        }
        bVarG.i(this);
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean V0() {
        return false;
    }

    public boolean c1() {
        return this.Y;
    }
}
