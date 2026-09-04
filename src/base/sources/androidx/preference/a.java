package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f6346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f6347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f6348k = new RunnableC0070a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6349l = -1;

    /* JADX INFO: renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0070a implements Runnable {
        RunnableC0070a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.E();
        }
    }

    private EditTextPreference B() {
        return (EditTextPreference) t();
    }

    private boolean C() {
        long j10 = this.f6349l;
        return j10 != -1 && j10 + 1000 > SystemClock.currentThreadTimeMillis();
    }

    public static a D(String str) {
        a aVar = new a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    private void F(boolean z10) {
        this.f6349l = z10 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.f
    protected void A() {
        F(true);
        E();
    }

    void E() {
        if (C()) {
            EditText editText = this.f6346i;
            if (editText == null || !editText.isFocused()) {
                F(false);
            } else if (((InputMethodManager) this.f6346i.getContext().getSystemService("input_method")).showSoftInput(this.f6346i, 0)) {
                F(false);
            } else {
                this.f6346i.removeCallbacks(this.f6348k);
                this.f6346i.postDelayed(this.f6348k, 50L);
            }
        }
    }

    @Override // androidx.preference.f, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f6347j = B().V0();
        } else {
            this.f6347j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.f, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f6347j);
    }

    @Override // androidx.preference.f
    protected boolean u() {
        return true;
    }

    @Override // androidx.preference.f
    protected void v(View view) {
        super.v(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f6346i = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f6346i.setText(this.f6347j);
        EditText editText2 = this.f6346i;
        editText2.setSelection(editText2.getText().length());
        if (B().U0() != null) {
            B().U0().a(this.f6346i);
        }
    }

    @Override // androidx.preference.f
    public void x(boolean z10) {
        if (z10) {
            String string = this.f6346i.getText().toString();
            EditTextPreference editTextPreferenceB = B();
            if (editTextPreferenceB.c(string)) {
                editTextPreferenceB.X0(string);
            }
        }
    }
}
