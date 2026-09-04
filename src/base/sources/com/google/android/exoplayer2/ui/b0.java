package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class b0 {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof fb.b);
    }

    public static void c(bb.b.C0112b c0112b) {
        c0112b.b();
        if (c0112b.e() instanceof Spanned) {
            if (!(c0112b.e() instanceof Spannable)) {
                c0112b.o(SpannableString.valueOf(c0112b.e()));
            }
            e((Spannable) ob.a.e(c0112b.e()), new sc.q() { // from class: com.google.android.exoplayer2.ui.z
                @Override // sc.q
                public final boolean apply(Object obj) {
                    return b0.b(obj);
                }
            });
        }
        d(c0112b);
    }

    public static void d(bb.b.C0112b c0112b) {
        c0112b.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0112b.e() instanceof Spanned) {
            if (!(c0112b.e() instanceof Spannable)) {
                c0112b.o(SpannableString.valueOf(c0112b.e()));
            }
            e((Spannable) ob.a.e(c0112b.e()), new sc.q() { // from class: com.google.android.exoplayer2.ui.a0
                @Override // sc.q
                public final boolean apply(Object obj) {
                    return b0.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, sc.q qVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (qVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
