package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a V;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.c(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.P0(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void V0(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.V);
        }
    }

    private void W0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            V0(view.findViewById(R.id.checkbox));
            T0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        V0(lVar.b(R.id.checkbox));
        U0(lVar);
    }

    @Override // androidx.preference.Preference
    protected void f0(View view) {
        super.f0(view);
        W0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.V = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f6459c, i10, i11);
        S0(d0.k.m(typedArrayObtainStyledAttributes, s.f6477i, s.f6462d));
        R0(d0.k.m(typedArrayObtainStyledAttributes, s.f6474h, s.f6465e));
        Q0(d0.k.b(typedArrayObtainStyledAttributes, s.f6471g, s.f6468f, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6424a, R.attr.checkBoxPreferenceStyle));
    }
}
