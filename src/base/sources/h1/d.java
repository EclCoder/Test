package h1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f40143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.emoji2.text.e.f f40144b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f40145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Reference f40146b;

        a(TextView textView, d dVar) {
            this.f40145a = new WeakReference(textView);
            this.f40146b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            CharSequence text;
            CharSequence charSequenceP;
            super.b();
            TextView textView = (TextView) this.f40145a.get();
            if (c(textView, (InputFilter) this.f40146b.get()) && textView.isAttachedToWindow() && text != (charSequenceP = androidx.emoji2.text.e.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceP);
                int selectionEnd = Selection.getSelectionEnd(charSequenceP);
                textView.setText(charSequenceP);
                if (charSequenceP instanceof Spannable) {
                    d.b((Spannable) charSequenceP, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f40143a = textView;
    }

    private androidx.emoji2.text.e.f a() {
        if (this.f40144b == null) {
            this.f40144b = new a(this.f40143a, this);
        }
        return this.f40144b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f40143a.isInEditMode()) {
            return charSequence;
        }
        int iE = androidx.emoji2.text.e.c().e();
        if (iE != 0) {
            if (iE == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f40143a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.e.c().q(charSequence, 0, charSequence.length());
            }
            if (iE != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.c().t(a());
        return charSequence;
    }
}
