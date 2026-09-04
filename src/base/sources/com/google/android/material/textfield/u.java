package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f21456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f21457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f21458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f21459d;

    u(t tVar) {
        this.f21456a = tVar.f21426a;
        this.f21457b = tVar;
        this.f21458c = tVar.getContext();
        this.f21459d = tVar.t();
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    final void r() {
        this.f21457b.N(false);
    }

    boolean t() {
        return false;
    }

    void s() {
    }

    void u() {
    }

    void a(Editable editable) {
    }

    void n(EditText editText) {
    }

    void q(boolean z10) {
    }

    void o(View view, o0.p pVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
