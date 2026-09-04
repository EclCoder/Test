package o5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements n5.d {
    @Override // n5.d
    public String a(StackTraceElement stackTraceElement) {
        return "";
    }

    @Override // n5.d
    public String b(StackTraceElement stackTraceElement, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackTraceElement.getClassName());
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            sb2.append(d());
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            sb2.append(e());
        } else {
            sb2.append("(");
            sb2.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
            }
            sb2.append(")");
        }
        if (z11) {
            sb2.append(c(stackTraceElement));
        }
        return sb2.toString();
    }

    @Override // n5.d
    public String c(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Class clsA = a.f48210b.a(className);
        if (clsA != null) {
            sb2.append(n5.a.m(n5.a.l(clsA), n5.a.q(a.f48209a, clsA, n5.a.n(className))));
        }
        return sb2.toString();
    }

    public String d() {
        return "(Native Method)";
    }

    public String e() {
        return "(Unknown Source)";
    }
}
