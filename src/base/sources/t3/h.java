package t3;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f53126a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(u uVar) {
        String strR = uVar.r();
        return strR != null && strR.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] strArrV0 = c0.V0(str, "\\.");
        long j10 = 0;
        for (String str2 : c0.U0(strArrV0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrV0.length == 2) {
            j11 += Long.parseLong(strArrV0[1]);
        }
        return j11 * 1000;
    }

    public static void d(u uVar) throws ParserException {
        int iF = uVar.f();
        if (a(uVar)) {
            return;
        }
        uVar.T(iF);
        throw ParserException.a("Expected WEBVTT. Got " + uVar.r(), null);
    }
}
