package y4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j implements x4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f57374a;

    private j(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f57374a = scriptHandlerBoundaryInterface;
    }

    public static j a(InvocationHandler invocationHandler) {
        return new j((ScriptHandlerBoundaryInterface) jp.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
