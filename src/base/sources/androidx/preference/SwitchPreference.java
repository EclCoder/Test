package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a V;
    private CharSequence W;
    private CharSequence X;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.c(Boolean.valueOf(z10))) {
                SwitchPreference.this.P0(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.V = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.O0, i10, i11);
        S0(d0.k.m(typedArrayObtainStyledAttributes, s.W0, s.P0));
        R0(d0.k.m(typedArrayObtainStyledAttributes, s.V0, s.Q0));
        W0(d0.k.m(typedArrayObtainStyledAttributes, s.Y0, s.S0));
        V0(d0.k.m(typedArrayObtainStyledAttributes, s.X0, s.T0));
        Q0(d0.k.b(typedArrayObtainStyledAttributes, s.U0, s.R0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X0(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z10) {
            Switch r10 = (Switch) view;
            r10.setTextOn(this.W);
            r10.setTextOff(this.X);
            r10.setOnCheckedChangeListener(this.V);
        }
    }

    private void Y0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            X0(view.findViewById(R.id.switch_widget));
            T0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        X0(lVar.b(R.id.switch_widget));
        U0(lVar);
    }

    public void V0(CharSequence charSequence) {
        this.X = charSequence;
        M();
    }

    public void W0(CharSequence charSequence) {
        this.W = charSequence;
        M();
    }

    @Override // androidx.preference.Preference
    protected void f0(View view) {
        super.f0(view);
        Y0(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6435l, R.attr.switchPreferenceStyle));
    }
}
