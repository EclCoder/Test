package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class q implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3926a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f3927b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof l0.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.q.b
        boolean a(CharSequence charSequence) {
            return r.a(charSequence) || (charSequence instanceof l0.c);
        }
    }

    q(Spannable spannable) {
        this.f3927b = spannable;
    }

    private void a() {
        Spannable spannable = this.f3927b;
        if (!this.f3926a && c().a(spannable)) {
            this.f3927b = new SpannableString(spannable);
        }
        this.f3926a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f3927b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3927b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f3927b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f3927b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3927b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3927b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3927b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f3927b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3927b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3927b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f3927b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f3927b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3927b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3927b.toString();
    }

    q(CharSequence charSequence) {
        this.f3927b = new SpannableString(charSequence);
    }
}
