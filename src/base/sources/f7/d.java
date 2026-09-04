package f7;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import bm.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f38328a = new d();

    private d() {
    }

    private final boolean a(TextView textView) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            String strI = new o("\\s").i(f.k(textView), "");
            int length = strI.length();
            if (length >= 12 && length <= 19) {
                int i10 = 0;
                boolean z10 = false;
                for (int i11 = length - 1; -1 < i11; i11--) {
                    char cCharAt = strI.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iD = bm.a.d(cCharAt);
                    if (z10 && (iD = iD * 2) > 9) {
                        iD = (iD % 10) + 1;
                    }
                    i10 += iD;
                    z10 = !z10;
                }
                if (i10 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String strK = f.k(textView);
            if (strK != null && strK.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strK).matches();
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        if (x7.a.c(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = f38328a;
            return dVar.c((TextView) view) || dVar.a((TextView) view) || dVar.d((TextView) view) || dVar.f((TextView) view) || dVar.e((TextView) view) || dVar.b((TextView) view);
        } catch (Throwable th2) {
            x7.a.b(th2, d.class);
            return false;
        }
    }
}
