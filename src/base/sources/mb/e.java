package mb;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Locale;
import ob.r0;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f45421a;

    public e(Resources resources) {
        this.f45421a = (Resources) ob.a.e(resources);
    }

    private String b(v0 v0Var) {
        int i10 = v0Var.f18881y;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f45421a.getString(q.f45504q);
        }
        if (i10 == 2) {
            return this.f45421a.getString(q.f45513z);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f45421a.getString(q.B);
        }
        return i10 != 8 ? this.f45421a.getString(q.A) : this.f45421a.getString(q.C);
    }

    private String c(v0 v0Var) {
        int i10 = v0Var.f18864h;
        return i10 == -1 ? "" : this.f45421a.getString(q.f45503p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(v0 v0Var) {
        return TextUtils.isEmpty(v0Var.f18858b) ? "" : v0Var.f18858b;
    }

    private String e(v0 v0Var) {
        String strJ = j(f(v0Var), h(v0Var));
        return TextUtils.isEmpty(strJ) ? d(v0Var) : strJ;
    }

    private String f(v0 v0Var) {
        String str = v0Var.f18859c;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = r0.f48425a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeS = r0.S();
        String displayName = localeForLanguageTag.getDisplayName(localeS);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeS) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(v0 v0Var) {
        int i10 = v0Var.f18873q;
        int i11 = v0Var.f18874r;
        return (i10 == -1 || i11 == -1) ? "" : this.f45421a.getString(q.f45505r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(v0 v0Var) {
        String string = (v0Var.f18861e & 2) != 0 ? this.f45421a.getString(q.f45506s) : "";
        if ((v0Var.f18861e & 4) != 0) {
            string = j(string, this.f45421a.getString(q.f45509v));
        }
        if ((v0Var.f18861e & 8) != 0) {
            string = j(string, this.f45421a.getString(q.f45508u));
        }
        return (v0Var.f18861e & 1088) != 0 ? j(string, this.f45421a.getString(q.f45507t)) : string;
    }

    private static int i(v0 v0Var) {
        int iK = y.k(v0Var.f18868l);
        if (iK != -1) {
            return iK;
        }
        if (y.n(v0Var.f18865i) != null) {
            return 2;
        }
        if (y.c(v0Var.f18865i) != null) {
            return 1;
        }
        if (v0Var.f18873q == -1 && v0Var.f18874r == -1) {
            return (v0Var.f18881y == -1 && v0Var.f18882z == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f45421a.getString(q.f45502o, string, str);
            }
        }
        return string;
    }

    @Override // mb.w
    public String a(v0 v0Var) {
        String strJ;
        int i10 = i(v0Var);
        if (i10 == 2) {
            strJ = j(h(v0Var), g(v0Var), c(v0Var));
        } else {
            strJ = i10 == 1 ? j(e(v0Var), b(v0Var), c(v0Var)) : e(v0Var);
        }
        return strJ.length() == 0 ? this.f45421a.getString(q.D) : strJ;
    }
}
