package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a V;
    private CharSequence W;
    private CharSequence X;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.c(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.P0(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.V = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Z0, i10, i11);
        S0(d0.k.m(typedArrayObtainStyledAttributes, s.f6476h1, s.f6455a1));
        R0(d0.k.m(typedArrayObtainStyledAttributes, s.f6473g1, s.f6458b1));
        W0(d0.k.m(typedArrayObtainStyledAttributes, s.f6482j1, s.f6464d1));
        V0(d0.k.m(typedArrayObtainStyledAttributes, s.f6479i1, s.f6467e1));
        Q0(d0.k.b(typedArrayObtainStyledAttributes, s.f6470f1, s.f6461c1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X0(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Q);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.W);
            switchCompat.setTextOff(this.X);
            switchCompat.setOnCheckedChangeListener(this.V);
        }
    }

    private void Y0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            X0(view.findViewById(o.f6442f));
            T0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        X0(lVar.b(o.f6442f));
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

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f6434k);
    }
}
