package kn;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        o0 o0Var = o0.f43602a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        s.g(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Logger logger, a aVar, c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        o0 o0Var = o0.f43602a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        s.g(str2, "format(...)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.b());
        logger.fine(sb2.toString());
    }
}
