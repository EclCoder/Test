package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean I() {
        return false;
    }

    @Override // androidx.preference.Preference
    public boolean J0() {
        return !super.I();
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        if (Build.VERSION.SDK_INT >= 28) {
            lVar.itemView.setAccessibilityHeading(true);
        }
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6428e, R.attr.preferenceCategoryStyle));
    }
}
