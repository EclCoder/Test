package h1;

import android.text.Editable;
import androidx.emoji2.text.n;
import f8.Ygx.FuoITeVPeXAj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40138a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f40139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f40140c;

    public static Editable.Factory getInstance() {
        if (f40139b == null) {
            synchronized (f40138a) {
                try {
                    if (f40139b == null) {
                        f40139b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f40139b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f40140c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }

    private b() {
        try {
            f40140c = Class.forName(FuoITeVPeXAj.aweswfaC, false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }
}
