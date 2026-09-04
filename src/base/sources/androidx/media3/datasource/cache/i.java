package androidx.media3.datasource.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class i extends a2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f4857g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f4858h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f4859i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private i(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static i e(File file, long j10, long j11, f fVar) {
        String strI;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = j(file, fVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f4859i.matcher(name);
        if (!matcher.matches() || (strI = fVar.i(Integer.parseInt((String) w1.a.e(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file2.length();
        }
        long j12 = j10;
        if (j12 == 0) {
            return null;
        }
        return new i(strI, Long.parseLong((String) w1.a.e(matcher.group(2))), j12, j11 == C.TIME_UNSET ? Long.parseLong((String) w1.a.e(matcher.group(3))) : j11, file2);
    }

    public static i f(File file, long j10, f fVar) {
        return e(file, j10, C.TIME_UNSET, fVar);
    }

    public static i g(String str, long j10, long j11) {
        return new i(str, j10, j11, C.TIME_UNSET, null);
    }

    public static i h(String str, long j10) {
        return new i(str, j10, -1L, C.TIME_UNSET, null);
    }

    public static File i(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    private static File j(File file, f fVar) {
        String strB1;
        String name = file.getName();
        Matcher matcher = f4858h.matcher(name);
        if (matcher.matches()) {
            strB1 = c0.b1((String) w1.a.e(matcher.group(1)));
        } else {
            matcher = f4857g.matcher(name);
            strB1 = matcher.matches() ? (String) w1.a.e(matcher.group(1)) : null;
        }
        if (strB1 == null) {
            return null;
        }
        File fileI = i((File) w1.a.i(file.getParentFile()), fVar.e(strB1), Long.parseLong((String) w1.a.e(matcher.group(2))), Long.parseLong((String) w1.a.e(matcher.group(3))));
        if (file.renameTo(fileI)) {
            return fileI;
        }
        return null;
    }

    public i d(File file, long j10) {
        w1.a.g(this.f91d);
        return new i(this.f88a, this.f89b, this.f90c, j10, file);
    }
}
