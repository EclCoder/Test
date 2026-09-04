package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.y;
import com.google.android.material.textfield.TextInputLayout;
import o0.p;
import sb.g;
import sb.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f21495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f21496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EditText f21497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0.a f21498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextWatcher f21499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f21500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f21501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21502h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n0.a {
        a() {
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            pVar.Y0(((EditText) view).getText());
            pVar.G0(ChipTextInputComboView.this.f21500f.getText());
            pVar.J0(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends y {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f21501g = chipTextInputComboView.d("00");
                return;
            }
            String strD = ChipTextInputComboView.this.d(editable);
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            if (TextUtils.isEmpty(strD)) {
                strD = ChipTextInputComboView.this.d("00");
            }
            chipTextInputComboView2.f21501g = strD;
        }

        /* synthetic */ b(ChipTextInputComboView chipTextInputComboView, a aVar) {
            this();
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void e() {
        this.f21497c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f21495a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f21495a.setChecked(z10);
        if (z10) {
            this.f21495a.setText("");
            this.f21495a.setImportantForAccessibility(2);
        } else {
            this.f21495a.setText(this.f21501g);
            this.f21495a.setImportantForAccessibility(1);
        }
        this.f21497c.setVisibility(z10 ? 0 : 4);
        if (isChecked()) {
            c0.p(this.f21497c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21495a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f21495a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f21495a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21501g = "";
        this.f21502h = false;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(i.f51823v, (ViewGroup) this, false);
        this.f21495a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(i.f51824w, (ViewGroup) this, false);
        this.f21496b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f21497c = editText;
        editText.setVisibility(4);
        b bVar = new b(this, null);
        this.f21499e = bVar;
        editText.addTextChangedListener(bVar);
        e();
        addView(chip);
        addView(textInputLayout);
        this.f21500f = (TextView) findViewById(g.f51777p);
        editText.setId(View.generateViewId());
        this.f21500f.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        this.f21498d = new a();
    }
}
