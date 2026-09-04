package nf;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f47596a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bm.o f47597b = new bm.o("\\s+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bm.o f47598c = new bm.o("\\[[^\\]]*]|\\([^)]*\\)|♪[^♪]*♪|♪+");

    private i0() {
    }

    private final boolean a(String str) {
        return bm.r.h0(f47598c.i(str, " "));
    }

    private static final void d(StringBuilder sb2, List list, kotlin.jvm.internal.h0 h0Var, double d10, kotlin.jvm.internal.h0 h0Var2) {
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        String string2 = bm.r.V0(string).toString();
        if (string2.length() > 0 && !f47596a.a(string2)) {
            list.add(new of.h(string2, yl.g.e((long) ((h0Var.f43589a + d10) * 1000.0d), 0L), yl.g.e((long) ((h0Var2.f43589a + d10) * 1000.0d), 0L), 1.0f));
        }
        sb2.setLength(0);
        h0Var.f43589a = -1.0d;
        h0Var2.f43589a = -1.0d;
    }

    public final List b(String text, double d10, double d11) {
        kotlin.jvm.internal.s.h(text, "text");
        int i10 = 0;
        List listJ = f47597b.j(bm.r.V0(f47598c.i(text, " ")).toString(), 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return gl.r.l();
        }
        double dB = yl.g.b(d11 - d10, 0.0d);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        while (i10 < size) {
            double d12 = size;
            int i11 = i10 + 1;
            arrayList2.add(new of.h((String) arrayList.get(i10), (long) ((d10 + ((((double) i10) / d12) * dB)) * 1000.0d), (long) ((d10 + ((((double) i11) / d12) * dB)) * 1000.0d), 1.0f));
            i10 = i11;
        }
        return arrayList2;
    }

    public final List c(String[] tokens, float[] timestamps, float[] durations, double d10) {
        kotlin.jvm.internal.s.h(tokens, "tokens");
        kotlin.jvm.internal.s.h(timestamps, "timestamps");
        kotlin.jvm.internal.s.h(durations, "durations");
        int length = tokens.length;
        if (length == 0 || timestamps.length != length || durations.length != length) {
            return gl.r.l();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f43589a = -1.0d;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f43589a = -1.0d;
        for (int i10 = 0; i10 < length; i10++) {
            String str = tokens[i10];
            if (str.length() != 0 && !bm.r.N(str, "<|", false, 2, null)) {
                if (bm.r.N(str, " ", false, 2, null) && sb2.length() > 0) {
                    d(sb2, arrayList, h0Var, d10, h0Var2);
                }
                if (h0Var.f43589a < 0.0d) {
                    h0Var.f43589a = timestamps[i10];
                }
                h0Var2.f43589a = timestamps[i10] + durations[i10];
                sb2.append(str);
            }
        }
        d(sb2, arrayList, h0Var, d10, h0Var2);
        return arrayList;
    }
}
