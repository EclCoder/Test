package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class d implements e.InterfaceC0037e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f3835b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f3836a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f3836a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f3835b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0037e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return e0.c.a(this.f3836a, sbB.toString());
    }
}
