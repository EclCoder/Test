package com.facebook;

import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "Lcom/facebook/o0;", "graphResponse", "", "errorMessage", "<init>", "(Lcom/facebook/o0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "c", "Lcom/facebook/o0;", "getGraphResponse", "()Lcom/facebook/o0;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final o0 graphResponse;

    public FacebookGraphResponseException(o0 o0Var, String str) {
        super(str);
        this.graphResponse = o0Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        o0 o0Var = this.graphResponse;
        x xVarB = o0Var != null ? o0Var.b() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (xVarB != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(xVarB.g());
            sb2.append(", facebookErrorCode: ");
            sb2.append(xVarB.b());
            sb2.append(", facebookErrorType: ");
            sb2.append(xVarB.e());
            sb2.append(", message: ");
            sb2.append(xVarB.c());
            sb2.append(mDXVAtwcaFMHJ.BdhRgmiGDoGY);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "errorStringBuilder.toString()");
        return string;
    }
}
