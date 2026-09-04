package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class z extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f21493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f21494g;

    z(t tVar, int i10) {
        super(tVar);
        this.f21492e = sb.f.f51734a;
        this.f21494g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.v(this.f21491a, view);
            }
        };
        if (i10 != 0) {
            this.f21492e = i10;
        }
    }

    public static /* synthetic */ void v(z zVar, View view) {
        EditText editText = zVar.f21493f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (zVar.w()) {
            zVar.f21493f.setTransformationMethod(null);
        } else {
            zVar.f21493f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            zVar.f21493f.setSelection(selectionEnd);
        }
        zVar.r();
    }

    private boolean w() {
        EditText editText = this.f21493f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.u
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.u
    int c() {
        return sb.k.X;
    }

    @Override // com.google.android.material.textfield.u
    int d() {
        return this.f21492e;
    }

    @Override // com.google.android.material.textfield.u
    View.OnClickListener f() {
        return this.f21494g;
    }

    @Override // com.google.android.material.textfield.u
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.u
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.u
    void n(EditText editText) {
        this.f21493f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.u
    void s() {
        if (x(this.f21493f)) {
            this.f21493f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.u
    void u() {
        EditText editText = this.f21493f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
