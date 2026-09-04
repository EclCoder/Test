package bm;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends s {
    private static final Function1 d(final String str) {
        return str.length() == 0 ? new Function1() { // from class: bm.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.e((String) obj);
            }
        } : new Function1() { // from class: bm.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String line) {
        kotlin.jvm.internal.s.h(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String line) {
        kotlin.jvm.internal.s.h(line, "line");
        return str + line;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!b.c(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    public static final String h(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(newIndent, "newIndent");
        List listO0 = f0.o0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO0) {
            if (!f0.h0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(Integer.valueOf(g((String) obj2)));
        }
        Integer num = (Integer) gl.r.q0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listO0.size());
        Function1 function1D = d(newIndent);
        int iN = gl.r.n(listO0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listO0) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                gl.r.u();
            }
            String str3 = (String) obj3;
            if ((i10 == 0 || i10 == iN) && f0.h0(str3)) {
                str3 = null;
            } else {
                String strY0 = h0.Y0(str3, iIntValue);
                if (strY0 != null && (str2 = (String) function1D.invoke(strY0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i12;
        }
        return ((StringBuilder) gl.b0.i0(arrayList3, new StringBuilder(length), (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : "\n", (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? "..." : null, (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(newIndent, "newIndent");
        kotlin.jvm.internal.s.h(marginPrefix, "marginPrefix");
        if (f0.h0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listO0 = f0.o0(str);
        int length = str.length() + (newIndent.length() * listO0.size());
        Function1 function1D = d(newIndent);
        int iN = gl.r.n(listO0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listO0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.r.u();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iN) && f0.h0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!b.c(str4.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (c0.M(str4, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        kotlin.jvm.internal.s.f(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) function1D.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) gl.b0.i0(arrayList, new StringBuilder(length), (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : "\n", (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? "..." : null, (Sdk$SDKError.b.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String marginPrefix) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(marginPrefix, "marginPrefix");
        return i(str, "", marginPrefix);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
