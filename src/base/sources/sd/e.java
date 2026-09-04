package sd;

import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f52371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f52372d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f52369a = str;
        this.f52370b = str2;
        this.f52371c = stackTraceElementArr;
        this.f52372d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
