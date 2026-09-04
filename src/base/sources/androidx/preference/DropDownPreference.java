package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Context f6295b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ArrayAdapter f6296c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Spinner f6297d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f6298e0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f6426c);
    }

    private int h1(String str) {
        CharSequence[] charSequenceArrX0 = X0();
        if (str == null || charSequenceArrX0 == null) {
            return -1;
        }
        for (int length = charSequenceArrX0.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArrX0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    private void i1() {
        this.f6296c0.clear();
        if (V0() != null) {
            for (CharSequence charSequence : V0()) {
                this.f6296c0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void M() {
        super.M();
        ArrayAdapter arrayAdapter = this.f6296c0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        Spinner spinner = (Spinner) lVar.itemView.findViewById(o.f6441e);
        this.f6297d0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f6296c0);
        this.f6297d0.setOnItemSelectedListener(this.f6298e0);
        this.f6297d0.setSelection(h1(Y0()));
        super.S(lVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void T() {
        this.f6297d0.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void b1(CharSequence[] charSequenceArr) {
        super.b1(charSequenceArr);
        i1();
    }

    protected ArrayAdapter g1() {
        return new ArrayAdapter(this.f6295b0, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6298e0 = new a();
        this.f6295b0 = context;
        this.f6296c0 = g1();
        i1();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.X0()[i10].toString();
                if (string.equals(DropDownPreference.this.Y0()) || !DropDownPreference.this.c(string)) {
                    return;
                }
                DropDownPreference.this.e1(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
