package h1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f40154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.e.f f40156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40157d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40158e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40159f = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f40160a;

        a(EditText editText) {
            this.f40160a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            super.b();
            g.b((EditText) this.f40160a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f40154a = editText;
        this.f40155b = z10;
    }

    private androidx.emoji2.text.e.f a() {
        if (this.f40156c == null) {
            this.f40156c = new a(this.f40154a);
        }
        return this.f40156c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f40159f) {
            return (this.f40155b || androidx.emoji2.text.e.i()) ? false : true;
        }
        return true;
    }

    public void c(boolean z10) {
        if (this.f40159f != z10) {
            if (this.f40156c != null) {
                androidx.emoji2.text.e.c().u(this.f40156c);
            }
            this.f40159f = z10;
            if (z10) {
                b(this.f40154a, androidx.emoji2.text.e.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f40154a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.e.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.e.c().s((Spannable) charSequence, i10, i10 + i12, this.f40157d, this.f40158e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
