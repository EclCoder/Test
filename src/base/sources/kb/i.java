package kb;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.d0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f43158a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(d0 d0Var) {
        String strS;
        while (true) {
            String strS2 = d0Var.s();
            if (strS2 == null) {
                return null;
            }
            if (f43158a.matcher(strS2).matches()) {
                do {
                    strS = d0Var.s();
                    if (strS == null) {
                        break;
                    }
                } while (!strS.isEmpty());
            } else {
                Matcher matcher = f.f43132a.matcher(strS2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(d0 d0Var) {
        String strS = d0Var.s();
        return strS != null && strS.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrZ0 = r0.Z0(str, "\\.");
        long j10 = 0;
        for (String str2 : r0.Y0(strArrZ0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrZ0.length == 2) {
            j11 += Long.parseLong(strArrZ0[1]);
        }
        return j11 * 1000;
    }

    public static void e(d0 d0Var) throws ParserException {
        int iF = d0Var.f();
        if (b(d0Var)) {
            return;
        }
        d0Var.U(iF);
        throw ParserException.a("Expected WEBVTT. Got " + d0Var.s(), null);
    }
}
