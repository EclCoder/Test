package y4;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f57378a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static x4.e[] a(InvocationHandler[] invocationHandlerArr) {
        x4.e[] eVarArr = new x4.e[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            eVarArr[i10] = new n(invocationHandlerArr[i10]);
        }
        return eVarArr;
    }

    public static x4.d b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        x4.e[] eVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!o.C.d()) {
            return new x4.d(webMessageBoundaryInterface.getData(), eVarArrA);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) jp.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new x4.d(webMessagePayloadBoundaryInterface.getAsString(), eVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new x4.d(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), eVarArrA);
    }
}
