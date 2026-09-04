package ql;

import bm.r;
import java.io.File;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class g {
    private static final int a(String str) {
        int iE0;
        char c10 = File.separatorChar;
        int iE1 = r.e0(str, c10, 0, false, 4, null);
        if (iE1 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iE0 = r.e0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iE2 = r.e0(str, c10, iE0 + 1, false, 4, null);
            return iE2 >= 0 ? iE2 + 1 : str.length();
        }
        if (iE1 > 0 && str.charAt(iE1 - 1) == ':') {
            return iE1 + 1;
        }
        if (iE1 == -1 && r.W(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        s.h(file, "<this>");
        String path = file.getPath();
        s.g(path, "getPath(...)");
        return a(path) > 0;
    }
}
